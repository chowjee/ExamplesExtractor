package edu

import atomInfo.AtomInfo
import atomInfo.Atoms
import java.io.File

fun main(args: Array<String>) {
    val atoms = Atoms()
    val lessons = atoms.atomInfoList.map(::generateLesson)
    val course = Course(lessons.filterNotNull() + getLessonWithUtilFunctions(),
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
    val taskForExercises = atomInfo.exercisesMap.map {
        (_, exerciseInfo) ->

        val taskName = "Exercise " + exerciseInfo.dir.name.substringAfter("Exercise")

        val taskFiles = mapOf("Task.kt" to generateTaskFile(exerciseInfo.solutionInfo.file))

        val testOrOutputText = exerciseInfo.testOrOutputFile.readText()
        val testsMap = if (exerciseInfo.testOutput) {
            mapOf("output.txt" to testOrOutputText)
        }
        else {
            mapOf("Tests.kt" to testOrOutputText.removePackageDeclarations())
        }
        val tasksMap = mapOf("task" to exerciseInfo.taskDescription.readText())

        GeneralTask(taskName, 0, taskFiles, testsMap, tasksMap,
                if (exerciseInfo.testOutput) "output" else "pycharm")
    }
    return Lesson(0, atomInfo.title.removeCodeFormatting(),
            arrayListOf<Task>() + generateTaskForExamples(atomInfo) + taskForExercises)
}

fun getLessonWithUtilFunctions(): Lesson {
    val atomicTest = File("AtomicTest/AtomicTest.kt").readText()
    val testFiles = mapOf("util/src/AtomicKotlin.kt" to atomicTest)
    val task = GeneralTask("PyCharm additional materials", 0,
            emptyMap(), testFiles, emptyMap())
    return Lesson(0, "PyCharm additional materials", listOf(task))
}

fun generateTaskForExamples(atomInfo: AtomInfo): Task {
    val taskFiles = atomInfo.examplesMap.map {
        (exampleName, exampleInfo) ->
        TaskFile(exampleName, exampleInfo.file.readText().trimEnd(), listOf())
    }.associateBy {
        it.name
    }
    val tasksMap = mapOf("task" to examplesTask(atomInfo))
    return TheoryTask("Examples", 0, taskFiles, tasksMap)
}

fun generateTaskFile(solutionFile: File): TaskFile {
    val solutionText = solutionFile.readText().uncommentTags().removePackageDeclarations().trimEnd()
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
