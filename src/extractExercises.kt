package examplesExtractor

import java.io.File

val LINE_SEPARATOR = System.getProperty("line.separator")

data class Task(val chapter: String, val index: Int, val text: String) {
    val name get() = "Exercise" + index
    val heading get() = "## ${chapter.toHeading()} (#$index)"
}

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
    return tasks.mapIndexed { index, s -> Task(chapterName, index + 1, s) }
}

fun divideIntoTasks(exercisesText: String): List<String> {
    val tasks = mutableListOf<String>()

    var currentTask = 0
    var task = StringBuilder()
    for (line in exercisesText.split(LINE_SEPARATOR)) {
        if (line.startsWith("${currentTask + 1}.")) {
            if (currentTask > 0) {
                tasks += task.toString().trim()
            }
            task = StringBuilder()
            currentTask++
        }
        if (currentTask > 0) {
            val prefix = "$currentTask."
            val withoutIndent =
                    if (line.startsWith(prefix)) line.removePrefix(prefix).trim() else line.removePrefix("    ")
            task.appendln(withoutIndent)
        }
    }
    if (task.trim().isNotEmpty()) {
        tasks += task.toString().trim()
    }
    return tasks
}

fun String.toHeading(): String =
    this.mapIndexed { index, c ->
        if (index > 0 && c.isUpperCase()) " $c" else "$c"
    }.joinToString("")