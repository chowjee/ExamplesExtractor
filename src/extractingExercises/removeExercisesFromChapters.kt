package removeExercises

import chapters.getInterestingChapters

fun main(args: Array<String>) {
    for (chapter in getInterestingChapters(listOf())) {
        val text = chapter.readText()
        val exercisesText = "\nExercises\n---------"
        if (text.contains(exercisesText)) {
            val newText = text.substringBefore(exercisesText)
            chapter.writeText(newText)
        }
    }
}