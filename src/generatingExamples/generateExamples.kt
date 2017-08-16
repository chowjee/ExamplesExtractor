package generatingExamples

import atomInfo.Atoms
import generatingExamples.ExampleBuilder.Status.*
import settings.Settings
import util.addBlankLine
import util.manifest
import util.subDir
import util.subFile
import java.io.File

fun generateExamples() {
    val allExamples = Atoms().atomInfoList.mapNotNull { extractCodeExamples(it.markdownFile) }

    val examplesDir = File(Settings.examplesDir)
    if (examplesDir.exists()) {
        examplesDir.deleteRecursively()
    }
    examplesDir.mkdir()

    for (atomExamples in allExamples) {
        if (atomExamples.hasOnlySnippets()) continue

        val outerDir = examplesDir.subFile(atomExamples.name)
        outerDir.mkdir()
        val outerManifest = outerDir.manifest()
        outerManifest.writeText(manifestForExamplesFolder(atomExamples.name))

        val chapterDir = outerDir.subDir("Examples")
        for (chapter in atomExamples.examples) {
            val exampleFile = chapterDir.subFile(chapter.name)
            exampleFile.writeText(chapter.getFullText())
        }
        val manifestFile = chapterDir.manifest()
        manifestFile.writeText(manifestForExamples("Examples", atomExamples.examples.map { it.name }))
    }
    val topLevelManifest = examplesDir.manifest()
    topLevelManifest.writeText(topLevelManifest(
            allExamples.filter { !it.hasOnlySnippets() }.map { it.name }))
}

data class AtomExamples(val name: String, val examples: List<Example>, val snippets: List<Example>) {
    fun hasOnlySnippets() = examples.isEmpty() && snippets.isNotEmpty()
}

data class Example(val name: String, val text: String, val packageName: String) {
    fun getFullText(): String = text.addBlankLine()
}

class ExampleBuilder {
    private var status = TEXT
    private var text: StringBuilder = StringBuilder()
    private var name: String = ""
    private var packageName: String = ""

    enum class Status {
        NAME, EXAMPLE, SNIPPET, TEXT
    }

    fun startExample() {
        status = NAME
        text = StringBuilder()
        name = ""
    }

    fun endExample(): Example? {
        if (status == EXAMPLE || status == SNIPPET) {
            status = TEXT
            return Example(name, text.toString().trim(), packageName)
        }
        return null
    }

    fun addLine(line: String) {
        when (status) {
            NAME -> {
                if (line.startsWith("// ")) {
                    val (path, fileName) = getPathAndFileNames(line)
                    packageName = path.replace("/", ".")
                    name = fileName
                    status = EXAMPLE
                } else {
                    status = SNIPPET
                }
                text.appendln(line)
            }
            EXAMPLE, SNIPPET -> {
                text.appendln(line)
            }
            TEXT -> {
            }
        }
    }
}

fun getPathAndFileNames(comment: String): Pair<String, String> {
    if (!comment.startsWith("// ")) {
        throw IllegalArgumentException("Expected file name comment: $comment")
    }
    val path = comment.removePrefix("// ")
    return Pair(
            path.substringBeforeLast("/"),
            path.substringAfterLast("/"))
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

    val (examples, snippets) = result.partition { it.name != "" }
    return AtomExamples(atom.nameWithoutExtension, examples, snippets)
}
