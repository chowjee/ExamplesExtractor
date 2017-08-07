package atoms

import examplesExtractor.extractCodeExamples
import generatingTests.AuxiliaryFiles
import settings.Settings
import util.subFile
import java.io.File

fun getAtomFiles(): List<File> = File(Settings.atomsPath).listFiles().toList()

fun getExerciseFiles(atomRanges: List<IntRange>): List<File> {
    return File(Settings.exercisesPath).listFiles().filter { it.isInteresting(atomRanges) }
}

private fun File.isInteresting(atoms: List<IntRange>): Boolean =
        atoms.any { range ->
            (name.substringBefore("_").toIntOrNull() ?: 0) in range
        }

fun getExamplesForAtom(atom: File): List<File> {
    val atomName = atom.nameWithoutExtension
    val examples = File(Settings.examplesDir).subFile(atomName).subFile("Examples")
    return extractCodeExamples(atom)?.examples?.map {
        examples.subFile(it.name)
    } ?: listOf()
}

fun getAuxiliaryFilesForExercises(): List<AuxiliaryFiles> {
    val allExercises = File(Settings.exercisesDir).listFiles().filter { it.isDirectory }.flatMap {
        it.listFiles().filter { it.isDirectory }
    }
    val outputExercises = allExercises.filter {
        it.subFile("output.txt").exists()
    }
    return outputExercises.map {
        AuxiliaryFiles(it.subFile("Solution.kt"), it.subFile("output.txt"), true)
    }
}
//
//fun main(args: Array<String>) {
//    for ((e, o) in getExercises()) {
//        println("$e - $o")
//    }
//}
