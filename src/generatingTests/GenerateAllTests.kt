package generatingTests

import atomInfo.Atoms
import atomInfo.ExampleInfo
import atomInfo.createExampleInfo
import util.Settings
import util.lowerCaseFirstLetter
import util.subFile
import util.upperCaseFirstLetter
import java.io.File

fun main(args: Array<String>) {
    generateExampleTests()
}

fun generateExampleTests() {
    val sourceFiles = Atoms().atomInfoList.flatMap { it.examplesMap.values }
    val auxiliaryFiles = sourceFiles.map { AuxiliaryFiles(it, it, false) } +
            getAuxiliaryFilesForExercises()
    val tests = generateTests(auxiliaryFiles)
    File("TestExamples/TestExamples.java").writeText(tests)
}

data class AuxiliaryFiles(val code: File, val output: File, val isExercise: Boolean)

fun getAuxiliaryFilesForExercises(): List<AuxiliaryFiles> {
    val allExercises = File(Settings.exercisesDir).listFiles().filter { it.isDirectory }.flatMap {
        it.listFiles().filter { it.isDirectory }
    }
    val outputExercises = allExercises.filter {
        it.subFile("output.txt").exists()
    }
    return outputExercises.map {
        AuxiliaryFiles(it.subFile("Solution.kt"), it.subFile("output.txt"), true)
    }
}

fun generateTests(files: List<AuxiliaryFiles>): String {
    val namesFrequency = mutableMapOf<String, Int>()
    val tests = mutableListOf<String>()
    for ((code, output, isExercise) in files) {
        if (!code.readText().contains("fun main")) continue
        val exampleInfo = createExampleInfo(code)

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
