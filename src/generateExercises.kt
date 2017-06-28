package examplesExtractor

import chapters.getExerciseFiles
import chapters.getInterestingChapters
import manifestUtil.manifestForExercise
import manifestUtil.manifestForExercisesFolder
import manifestUtil.manifestForTopLevelExercisesFolder
import settings.Settings
import util.manifest
import util.subDir
import util.subFile
import java.io.File

fun generateExercises(atoms: List<IntRange>) {
    val parentDir = File(Settings.exercisesDir)
    parentDir.mkdir()

    generateDirStructure(parentDir, atoms)

    for (chapter in getExerciseFiles(atoms)) {
        generateTasksForChapter(chapter, parentDir)
    }
}

fun generateDirStructure(exercisesDir: File, atoms: List<IntRange>) {
    val chapters = getExerciseFiles(atoms)
    for (chapter in chapters) {
        val chapterDir = exercisesDir.subDir(chapter.nameWithoutExtension)

        val tasks = extractTasks(chapter)
        for (index in tasks.indices) {
            chapterDir.subDir("Exercise" + (index + 1))
        }
        val manifest = chapterDir.manifest()
        manifest.writeText(manifestForExercisesFolder(1..tasks.size))
    }
    val manifest = exercisesDir.manifest()
    manifest.writeText(manifestForTopLevelExercisesFolder(chapters.map { it.nameWithoutExtension }))
}

fun generateTasksForChapter(chapterFile: File, parentDir: File) {
    if (!chapterFile.exists()) {
        println("File ${chapterFile.name} not found")
        return
    }

    val tasks = extractTasks(chapterFile)

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