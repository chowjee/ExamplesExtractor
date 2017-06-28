package chapters

import settings.Settings
import java.io.File

fun getInterestingChapters(atoms: List<IntRange>): List<File> {
    val chapter = File(Settings.chaptersPath).listFiles()
    return chapter.filter { it.isInteresting(atoms) }
}

fun getExerciseFiles(atoms: List<IntRange>): List<File> {
    return File(Settings.exercisesPath).listFiles().filter { it.isInteresting(atoms) }
}

private fun File.isInteresting(atoms: List<IntRange>): Boolean =
        atoms.any {
            range ->
            (name.substringBefore("_").toIntOrNull() ?: 0) in range
        }