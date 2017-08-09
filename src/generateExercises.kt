package examplesExtractor

import atoms.getExerciseFiles
import atoms.toPackageName
import manifestUtil.manifestForExercise
import manifestUtil.manifestForExercisesFolder
import manifestUtil.manifestForTopLevelExercisesFolder
import settings.Settings
import util.manifest
import util.subDir
import util.subFile
import util.upperCaseFirstLetter
import java.io.File

fun generateExercises(atoms: List<IntRange>) {
    val parentDir = File(Settings.exercisesDir)
    parentDir.mkdir()

    generateDirStructure(parentDir, atoms)

    for (chapter in getExerciseFiles(atoms)) {
        generateTasksForAtom(chapter, parentDir)
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

fun generateTasksForAtom(chapterFile: File, parentDir: File) {
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
            val packageName = "${task.atomName.toPackageName()}${task.index}"
            val newText = oldFile.readText()
                    .replace("package _name_", "package $packageName")
                    .replace("Test_name_", "Test${packageName.upperCaseFirstLetter()}")
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
        if (!taskDir.subFile("output.txt").exists()) {
            transform("Test.kt")
        }

        val manifestFile = taskDir.manifest()
        manifestFile.writeText(manifestForExercise())
    }
}

fun String.extractFunctionNameIfMentioned(): String? {
    val markerTexts = listOf("Create a function `", "Implement a function `")
    for (markerText in markerTexts) {
        val createIndex = indexOf(markerText)
        val startIndex = createIndex + markerText.length
        val endIndex = indexOf("`", startIndex)
        if (createIndex != -1 && endIndex != -1) {
            return substring(startIndex, endIndex)
        }
    }
    return null
}
