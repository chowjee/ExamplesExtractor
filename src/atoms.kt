package atoms

import examplesExtractor.extractCodeExamples
import settings.Settings
import util.subFile
import java.io.File

fun getAtomFiles(atomRanges: List<IntRange>): List<File> {
    val chapter = File(Settings.atomsPath).listFiles()
    return chapter.filter { it.isInteresting(atomRanges) }
}

fun getExerciseFiles(atomRanges: List<IntRange>): List<File> {
    return File(Settings.exercisesPath).listFiles().filter { it.isInteresting(atomRanges) }
}

private fun File.isInteresting(atoms: List<IntRange>): Boolean =
        atoms.any {
            range ->
            (name.substringBefore("_").toIntOrNull() ?: 0) in range
        }

fun getExamplesForAtom(atom: File): List<File> {
    val atomName = atom.nameWithoutExtension
    val examples = File(Settings.examplesDir).subFile(atomName).subFile("Examples")
    return extractCodeExamples(atom).examples.map {
        examples.subFile(it.name)
    }
}