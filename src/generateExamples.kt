package examplesExtractor

import atoms.getAtomFiles
import examplesExtractor.ExampleBuilder.Status.*
import manifestUtil.manifestForExamples
import manifestUtil.manifestForExamplesFolder
import settings.Settings
import util.manifest
import util.subDir
import util.subFile
import java.io.File

fun generateExamples() {
    val allExamples: List<AtomExamples> = getAtomFiles().mapNotNull { extractCodeExamples(it) }

    val examplesDir = File(Settings.examplesDir)
    if (examplesDir.exists()) {
        examplesDir.deleteRecursively()
    }
    examplesDir.mkdir()

    for (atomExamples in allExamples) {
        val outerDir = examplesDir.subFile(atomExamples.name)
        outerDir.mkdir()
        val outerManifest = outerDir.manifest()
        outerManifest.writeText(manifestForExamplesFolder(atomExamples.name))

        val chapterDir = outerDir.subDir("Examples")
        for (chapter in atomExamples.examples) {
            val exampleFile = chapterDir.subFile(chapter.name)
            exampleFile.writeText(chapter.text)
        }
        val manifestFile = chapterDir.manifest()
        manifestFile.writeText(manifestForExamples("Examples", atomExamples.examples.map { it.name }))
    }
    val topLevelManifest = examplesDir.manifest()
    topLevelManifest.writeText(manifestUtil.topLevelManifest(allExamples.map { it.name }))
}

data class AtomExamples(val name: String, val examples: List<Example>)

data class Example(val name: String, val text: String)

class ExampleBuilder {
    private var status = TEXT;
    private var text: StringBuilder = StringBuilder()
    private var name: String = ""

    enum class Status {
        NAME, EXAMPLE, TEXT
    }

    fun startExample() {
        status = NAME
        text = StringBuilder()
        name = ""
    }

    fun endExample(): Example? {
        if (status == EXAMPLE) {
            status = TEXT
            return Example(name, text.toString().trim())
        }
        return null
    }

    fun addLine(line: String) {
        when (status) {
            NAME -> {
                if (line.startsWith("// ")) {
                    name = line.removePrefix("// ")
                    status = EXAMPLE
                } else {
                    status = TEXT
                }
            }
            EXAMPLE -> {
                text.appendln(line)
            }
            TEXT -> {
            }
        }
    }
}

fun extractCodeExamples(atom: File): AtomExamples? {
    val result = mutableListOf<Example>()
    val exampleBuilder = ExampleBuilder()
    for (line in atom.readLines()) {
        when (line.trim()) {
            "```kotlin" -> exampleBuilder.startExample()
            "```" -> {
                exampleBuilder.endExample()?.let { result += it }
            }
            else -> exampleBuilder.addLine(line)
        }
    }
    if (result.isEmpty()) return null

    // scala check
    val scalaKeywords = setOf("def", "trait", "new")
    if (result.any { example ->
        scalaKeywords.any { keyword -> example.text.contains("$keyword ") }
    }) return null

    return AtomExamples(atom.nameWithoutExtension, result)
}
