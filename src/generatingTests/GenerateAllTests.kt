package generatingTests

import atomInfo.*
import util.upperCaseFirstLetter
import java.io.File

fun main(args: Array<String>) {
    generateExampleTests()
}

fun generateExampleTests() {
    val atomInfoList = Atoms().atomInfoList
    val sourceFiles = atomInfoList.flatMap { it.examplesMap.values }
    val exercisesWithOutput = atomInfoList.flatMap { it.exercisesMap.values }.filter { it.testOutput }
    val auxiliaryFiles = sourceFiles + exercisesWithOutput
    val tests = generateTests(auxiliaryFiles)
    File("TestExamples/TestExamples.java").writeText(tests)
}

fun generateTests(infoFiles: List<ExampleOrExerciseInfo>): String {
    val namesFrequency = mutableMapOf<String, Int>()
    val tests = mutableListOf<String>()
    for (infoFile in infoFiles) {
        val (code, output, isExercise) = when (infoFile) {
            is ExampleInfo -> Triple(infoFile.file, infoFile.file, false)
            is ExerciseInfo -> Triple(infoFile.solutionInfo.file, infoFile.testOrOutputFile, true)
        }
        if (!code.readText().contains("fun main")) continue
        val exampleInfo = when (infoFile) {
            is ExampleInfo -> infoFile
            is ExerciseInfo -> infoFile.solutionInfo
        }

        val exampleName = if (!isExercise) {
            val classForFileName = exampleInfo.classForFileName
            val index = if (classForFileName in namesFrequency) {
                val frequency = namesFrequency.getValue(classForFileName)
                namesFrequency[classForFileName] = frequency + 1
                "$frequency"
            } else {
                namesFrequency[classForFileName] = 1
                ""
            }
            """test${exampleInfo.name.upperCaseFirstLetter()}$index"""
        } else {
            if (exampleInfo.packageName == null) throw AssertionError("No package for exercise: ${code.path}")
            "testExercise${exampleInfo.packageName.substringAfter(".").upperCaseFirstLetter()}"
        }

        val testFunction = if (isExercise) "testExercise" else "testExample"

        tests += """
            @Test
            public void $exampleName() {
                $testFunction("${output.path}", ${exampleInfo.qualifiedName}::main);
            }""".replaceIndent("    ")
    }

    return buildString {
        appendln("import org.junit.Test;")
        appendln()
        appendln("""
                public class TestExamples extends AbstractTestExamples {
                """.trimIndent())
        for (test in tests) {
            appendln()
            appendln(test)
        }
        append("}")
    }
}
