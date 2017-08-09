package generatingExamples

import java.io.File

val LINE_SEPARATOR = System.getProperty("line.separator")

data class Task(val atomTitle: String, val atomName: String, val index: Int, val text: String) {
    val name get() = "Exercise" + index
    val heading get() = "## $atomTitle (#$index)"
}

fun extractTasks(atom: File): List<Task> {
    val tasks = divideIntoTasks(atom.readText())
    val atomTitle = atom.readLines().first()
    return tasks.mapIndexed { index, exercise ->
        Task(atomTitle, atom.nameWithoutExtension, index + 1, exercise)
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
