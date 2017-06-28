package chapters

import settings.Settings
import java.io.File

fun getInterestingChapters(): List<File> {
    val chapter = File(Settings.chaptersPath).listFiles()
    return chapter.filter(File::isInteresting)
}

fun getExerciseFiles(): List<File> {
    return File(Settings.exercisesPath).listFiles().filter(File::isInteresting)
}

private fun File.isInteresting(): Boolean =
        (name.substringBefore("_").toIntOrNull() ?: 0) in (Settings.firstAtom)..(Settings.lastAtom)