package generatingTests

import atoms.getAtomFiles
import atoms.getExamplesForAtom
import examplesExtractor.exampleRanges
import java.io.File

fun main(args: Array<String>) {
    generateExampleTests(exampleRanges)
}

fun generateExampleTests(atoms: List<IntRange>) {
    val sourceFiles = getAllExamples(atoms)
    val tests = generateTests(sourceFiles, "TestExamples")
    File("TestExamples/TestExamples.java").writeText(tests)
}

fun getAllExamples(atoms: List<IntRange>): List<File> {
    val atomFiles = getAtomFiles(atoms)
    return atomFiles.flatMap { getExamplesForAtom(it) }
}

fun generateTests(files: List<File>, className: String): String {
    val imports = mutableListOf<String>()
    val tests = mutableListOf<String>()
    for (example in files) {
        val name = example.nameWithoutExtension
        val classForFileName = name + "Kt"
        val packageName = example.readLines().find { it.startsWith("package ") }?.substringAfter("package ")?.trim()
                ?: name.lowerCaseFirstLetter()
        if (example.readText().contains("fun main")) {
            imports += "import $packageName.$classForFileName;"
            tests += """
                @Test
                public void test${name.upperCaseFirstLetter()}() {
                    $classForFileName.main(args);
                }""".replaceIndent("    ")
        }
    }

    return buildString {
        appendln("import org.junit.Test;")
        for (import in imports) {
            appendln(import)
        }
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