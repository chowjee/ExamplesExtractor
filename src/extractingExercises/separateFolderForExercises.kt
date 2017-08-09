package separateFileForExercises

import atoms.getAtomFiles
import examplesExtractor.Task
import examplesExtractor.divideIntoTasks
import settings.Settings
import util.subFile
import java.io.File

fun main(args: Array<String>) {
    val exercisesDir = File(Settings.exercisesPath)
    buildString {
        for (chapter in getAtomFiles()) {
            val exercisesText = generateTasksForChapter(chapter)
            val exercisesForChapterFile = exercisesDir.subFile(chapter.name)
            exercisesForChapterFile.writeText(exercisesText)
        }
    }
}

fun generateTasksForChapter(chapterFile: File): String {
    if (!chapterFile.exists()) {
        println("File ${chapterFile.name} not found")
        return ""
    }

    val tasks = extractTasksFromChapter(chapterFile)
    return buildString {
        val chapterName = chapterFile.readLines().first()
        appendln(chapterName)
        appendln("-".repeat(chapterName.length))
        appendln()
        for (task in tasks) {
            appendln("# ${task.index}")
            appendln(task.text)
            appendln()
        }
    }
}


@Deprecated("Was used when exercises were contained in the chapter text")
fun extractTasksFromChapter(chapter: File): List<Task> {
    val lines = chapter.readLines()
    if (lines.none { "Exercises" !in it }) return emptyList()

    val exercisesIndex = lines.indexOfFirst { "Exercises" !in it }
    lines.subList(exercisesIndex, lines.lastIndex + 1)

    val text = chapter.readText()
    if ("Exercises" !in text) return emptyList()
    val exercisesText = text.substringAfter("Exercises").substringAfter("AtomicKotlin.com).").trimStart()
    val tasks = divideIntoTasks(exercisesText)

    val chapterName = chapter.name.substringAfter("_").substringBefore(".md").replace("_", "")
    return tasks.mapIndexed { index, s -> Task(chapterName, chapter.name,index + 1, s) }
}
