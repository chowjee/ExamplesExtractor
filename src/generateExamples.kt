package examplesExtractor

import chapters.getInterestingChapters
import examplesExtractor.ExampleBuilder.Status.*
import manifestUtil.manifestForExamples
import manifestUtil.manifestForExamplesFolder
import settings.Settings
import util.manifest
import util.subDir
import util.subFile
import java.io.File

fun generateExamples() {
    val chapters = getInterestingChapters().map { extractCodeExamples(it.readLines(), it.nameWithoutExtension) }

    val examplesDir = File(Settings.examplesDir)
    if (examplesDir.exists()) {
        examplesDir.deleteRecursively()
    }
    examplesDir.mkdir()

    for (chapterExamples in chapters) {
        val outerDir = examplesDir.subFile(chapterExamples.name)
        outerDir.mkdir()
        val outerManifest = outerDir.manifest()
        outerManifest.writeText(manifestForExamplesFolder(chapterExamples.name))

        val chapterDir = outerDir.subDir("Examples")
        for (chapter in chapterExamples.examples) {
            val exampleFile = chapterDir.subFile(chapter.name)
            exampleFile.writeText(chapter.text)
        }
        val manifestFile = chapterDir.manifest()
        manifestFile.writeText(manifestForExamples("Examples", chapterExamples.examples.map { it.name }))
    }
    val topLevelManifest = examplesDir.manifest()
    topLevelManifest.writeText(manifestUtil.topLevelManifest(chapters.map { it.name }))
}

data class ChapterExamples(val name: String, val examples: List<Example>)

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

fun extractCodeExamples(chapterLines: List<String>, chapterName: String): ChapterExamples {
    val result = mutableListOf<Example>()
    val exampleBuilder = ExampleBuilder()
    for (line in chapterLines) {
        when (line.trim()) {
            "```kotlin" -> exampleBuilder.startExample()
            "```" -> {
                exampleBuilder.endExample()?.let { result += it }
            }
            else -> exampleBuilder.addLine(line)
        }
    }
    return ChapterExamples(chapterName, result)
}