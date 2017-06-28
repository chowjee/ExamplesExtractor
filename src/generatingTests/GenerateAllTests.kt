package generatingTests

import atoms.getExamplesForAtom
import atoms.getAtomFiles
import examplesExtractor.exampleRanges
import java.io.File

fun main(args: Array<String>) {
    generateExampleTests(exampleRanges)
}

fun generateExampleTests(atoms: List<IntRange>) {
    val sourceFiles = getAllExamples(atoms)
    val tests = generateTests(sourceFiles, "TestAll")
    File("TestExamples/TestExamples.kt").writeText(tests)
}

fun getAllExamples(atoms: List<IntRange>): List<File> {
    val atomFiles = getAtomFiles(atoms)
    return atomFiles.flatMap { getExamplesForAtom(it.nameWithoutExtension) }
}

fun generateTests(files: List<File>, className: String) = buildString {
    appendln("""
                package test

                import org.junit.Test

                class $className {
                    private val args = arrayOf<String>()
                """.trimIndent())
    for (example in files) {
        val name = example.nameWithoutExtension
        val packageName =
                example.readLines().find { it.startsWith("package ") }?.substringAfter("package ")?.trim()
                        ?: name.lowerCaseFirstLetter()
        if (example.readText().contains("fun main")) {
            appendln()
            if (name == "AtomicTest") continue
            appendln("""
                @Test
                fun test${packageName.upperCaseFirstLetter()}() = $packageName.main(args)
                """.replaceIndent("    "))
        }
    }
    append("}")
}

fun String.lowerCaseFirstLetter() = this[0].toLowerCase() + substring(1)
fun String.upperCaseFirstLetter() = this[0].toUpperCase() + substring(1)