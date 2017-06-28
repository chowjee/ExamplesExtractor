package chapters

import settings.Settings
import java.io.File

fun getInterestingChapters(atoms: Array<out IntRange>): List<File> {
    val chapter = File(Settings.chaptersPath).listFiles()
    return chapter.filter { it.isInteresting(atoms) }
}

fun getExerciseFiles(atoms: Array<out IntRange>): List<File> {
    return File(Settings.exercisesPath).listFiles().filter { it.isInteresting(atoms) }
}

private fun File.isInteresting(atoms: Array<out IntRange>): Boolean =
        atoms.any {
            range ->
            (name.substringBefore("_").toIntOrNull() ?: 0) in range
        }