package examplesExtractor

import java.io.File

val LINE_SEPARATOR = System.getProperty("line.separator")

data class Task(val chapter: String, val index: Int, val text: String) {
    val name get() = "Exercise" + index
    val heading get() = "## $chapter (#$index)"
}

fun extractTasks(chapter: File): List<Task> {
    val tasks = divideIntoTasks(chapter.readText())
    val chapterName = chapter.readLines().first()
    return tasks.mapIndexed { index, exercise ->
        Task(chapterName, index + 1, exercise)
    }
}

fun divideIntoTasks(exercisesText: String): List<String> {
    val tasks = mutableListOf<String>()

    var currentTask = 0
    var task = StringBuilder()
    for (line in exercisesText.split(LINE_SEPARATOR)) {
        val prefix = "# ${currentTask + 1}"
        if (line.startsWith(prefix)) {
            if (currentTask > 0) {
                tasks += task.toString().trim()
                task = StringBuilder()
            }
            currentTask++
        }
        if (currentTask > 0) {
            if (!line.startsWith(prefix)) {
                task.appendln(line)
            }
        }
    }
    if (task.trim().isNotEmpty()) {
        tasks += task.toString().trim()
    }
    return tasks
}