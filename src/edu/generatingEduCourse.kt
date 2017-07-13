package edu

import atoms.AtomInfo
import atoms.Atoms
import util.subFile
import java.io.File

fun main(args: Array<String>) {
    val atoms = Atoms()
    val lessons = atoms.atomInfoList.map(::generateLesson)
    val course = Course(lessons.filterNotNull(),
            "The examples and exercises accompanying the AtomicKotlin book",
            "AtomicKotlin",
            "kotlin")
    File("edu").mkdir()
    writeJson(course, File("edu/course.json"))
}

fun generateLesson(atomInfo: AtomInfo): Lesson? {
    if (atomInfo.examplesMap.isEmpty() && atomInfo.exercisesMap.isEmpty()) {
        return null
    }
    val atomicTest = File("AtomicTest/AtomicTest.kt").readText()
    val taskForExercises = atomInfo.exercisesMap.map {
        (_, exerciseDir) ->

        val taskName = "Exercise " + exerciseDir.name.substringAfter("Exercise")

        val taskFiles = mapOf("Task.kt" to generateTaskFile(exerciseDir.subFile("Solution.kt")))
        val testsMap = mapOf("Test.kt" to exerciseDir.subFile("Test.kt").readText())
        val tasksMap = mapOf("task" to exerciseDir.subFile("task.md").readText())

        Task(taskName, 0, taskFiles, testsMap, tasksMap)
    }
    return Lesson(0, atomInfo.title,
            arrayListOf<Task>() + generateTaskForExamples(atomInfo, atomicTest) + taskForExercises)
}

fun generateTaskForExamples(atomInfo: AtomInfo, atomicTest: String): Task {
    val taskFiles = atomInfo.examplesMap.map {
        (exampleName, exampleFile) ->
        TaskFile(exampleName, exampleFile.readText(), listOf())
    }.associateBy {
        it.name
    }
    val allFiles = if (taskFiles.values.any { it.text.contains("import com.atomickotlin.test.eq") }) {
        val atomicFile = TaskFile("AtomicTest.kt", atomicTest, listOf())
        taskFiles + (atomicFile.name to atomicFile)
    }
    else {
        taskFiles
    }
    return Task("Examples", 0, allFiles, emptyMap(), emptyMap())
}

fun generateTaskFile(solutionFile: File): TaskFile {
    val solutionText = solutionFile.readText().uncommentTags()
    val taskText = solutionText.removeSolutions().removeTaskWindowTags()
    val solutions = solutionText.getSolutionsInTaskWindows()
    if (solutions.isEmpty()) {
        throw IllegalArgumentException("Can't find solutions for ${solutionFile.path}")
    }

    val todo = "TODO()"
    val offsets = getOffsets(taskText)

    if (offsets.size != solutions.size) {
        throw IllegalArgumentException("Can't calculate offsets for ${solutionFile.path}. " +
                "Every placeholder should be equal 'TODO()'")
    }
    val placeholders = solutions.zip(offsets).map {
        (solution, offset) ->
        val subTaskInfo = SubTaskInfo(listOf(), solution, todo, true, false)
        Placeholder(offset, todo.length, mapOf("0" to subTaskInfo))
    }
    return TaskFile("Task.kt", taskText, placeholders)
}

fun getOffsets(text: String): List<Int> {
    val todo = "TODO()"
    val offsets = arrayListOf<Int>()
    var prevOffset = -todo.length
    while (prevOffset != -1) {
        val offset = text.indexOf(todo, prevOffset + todo.length)
        prevOffset = offset
        if (offset != -1) {
            offsets += offset
        }
    }
    return offsets
}
