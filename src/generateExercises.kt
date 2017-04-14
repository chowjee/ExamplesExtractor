package examplesExtractor

import chapters.getInterestingChapters
import manifestUtil.manifestForExercise
import manifestUtil.manifestForExercisesFolder
import settings.Settings
import util.manifest
import util.subDir
import util.subFile
import java.io.File

fun generateExercises() {
    val parentDir = File(Settings.exercisesDir)
    parentDir.mkdir()

    generateDirStructure(parentDir)

    for (chapter in getInterestingChapters()) {
        generateTasksForChapter(chapter, parentDir)
    }
}

fun generateDirStructure(exercisesDir: File) {
    for (chapter in getInterestingChapters()) {
        val chapterDir = exercisesDir.subDir(chapter.nameWithoutExtension)

        val tasks = extractTasksFromChapter(chapter)
        for (index in tasks.indices) {
            chapterDir.subDir("Exercise" + (index + 1))
        }
        val manifest = chapterDir.manifest()
        manifest.writeText(manifestForExercisesFolder(1..tasks.size))
    }
}

fun generateTasksForChapter(chapterFile: File, parentDir: File) {
    if (!chapterFile.exists()) {
        println("File ${chapterFile.name} not found")
        return
    }

    val tasks = extractTasksFromChapter(chapterFile)

    val targetDir = parentDir.subDir(chapterFile.nameWithoutExtension)

    for (task in tasks) {
        val taskDir = targetDir.subDir(task.name)

        val taskFile = taskDir.subFile("task.md")
        taskFile.writeText(task.heading + "\n\n" + task.text)

        fun transform(file: String, transform: String.() -> String = { this }) {
            val newFile = taskDir.subFile(file)
            if (newFile.exists()) return

            val oldFile = File("task/$file")
            val newText = oldFile.readText()
                    .replace("package _name_", "package ${task.name.decapitalize()}")
                    .replace("Test_name_", "Test${task.name}")
                    .transform()

            newFile.writeText(newText)
        }

        transform("Solution.kt") {
            val functionName = task.text.extractFunctionNameIfMentioned()
            if (functionName != null)
                replace("fun _funName_", "fun $functionName")
            else
                this
        }
        transform("Test.kt")

        val manifestFile = taskDir.manifest()
        manifestFile.writeText(manifestForExercise())
    }
}

fun String.extractFunctionNameIfMentioned(): String? {
    val markerText = "Create a function `"
    val createIndex = indexOf(markerText)
    if (createIndex == -1) return null

    val startIndex = createIndex + markerText.length
    val endIndex = indexOf("`", startIndex)
    if (endIndex == -1) return null

    return substring(startIndex, endIndex)
}