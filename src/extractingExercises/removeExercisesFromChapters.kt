package removeExercises

import atoms.getAtomFiles

fun main(args: Array<String>) {
    for (atom in getAtomFiles(listOf())) {
        val text = atom.readText()
        val exercisesText = "\nExercises\n---------"
        if (text.contains(exercisesText)) {
            val newText = text.substringBefore(exercisesText)
            atom.writeText(newText)
        }
    }
}