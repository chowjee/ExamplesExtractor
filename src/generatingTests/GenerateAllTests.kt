package generatingTests

import atoms.getAtomFiles
import atoms.getExamplesForAtom
import java.io.File

fun main(args: Array<String>) {
    generateExampleTests()
}

fun generateExampleTests() {
    val sourceFiles = getAllExamples()
    val tests = generateTests(sourceFiles, "TestExamples")
    File("TestExamples/TestExamples.java").writeText(tests)
}

fun getAllExamples(): List<File> {
    val atomFiles = getAtomFiles()
    return atomFiles.flatMap { getExamplesForAtom(it) }
}

fun generateTests(files: List<File>, className: String): String {
    val namesFrequency = mutableMapOf<String, Int>()
    val tests = mutableListOf<String>()
    for (example in files) {
        if (!example.readText().contains("fun main")) continue

        val name = example.nameWithoutExtension
        val classForFileName = name + "Kt"

        val index = if (classForFileName in namesFrequency) {
            val frequency = namesFrequency.getValue(classForFileName)
            namesFrequency[classForFileName] = frequency + 1
            "$frequency"
        }
        else {
            namesFrequency[classForFileName] = 1
            ""
        }
        val packageName = example.readLines().find { it.startsWith("package ") }?.substringAfter("package ")?.trim()
                ?: name.lowerCaseFirstLetter()
        tests += """
            @Test
            public void test${name.upperCaseFirstLetter()}$index() {
                $packageName.$classForFileName.main(args);
            }""".replaceIndent("    ")
    }

    return buildString {
        appendln("import org.junit.Test;")
        appendln()
        appendln("""
                public class $className {
                    private final String[] args = new String[] {};
                """.trimIndent())
        for (test in tests) {
            appendln()
            appendln(test)
        }
        append("}")
    }
}

fun String.lowerCaseFirstLetter() = this[0].toLowerCase() + substring(1)
fun String.upperCaseFirstLetter() = this[0].toUpperCase() + substring(1)
