package reordering

import util.Settings
import util.subFile
import java.io.File

data class AtomInfo(
        val atomName: String,
        val mdFile: File,
        val exercisesFile: File?
)

val AtomInfo.fileName: String
    get() = mdFile.name

val AtomInfo.nameWithoutExtension: String
    get() = mdFile.nameWithoutExtension

val AtomInfo.index: Int
    get() = nameWithoutExtension.substringBefore("_").toInt()

val File.nameWithoutIndex: String
    get() = nameWithoutExtension.substringAfter("_")

fun main(args: Array<String>) {
    val atomsDir = File(Settings.atomsPath)
    val exercisesDir = File(Settings.exercisesPath)

    val exercisesByFileName = exercisesDir.listFiles().associateBy {
        it.nameWithoutIndex
    }
    val exercisesByAtomName = exercisesDir.listFiles().associateBy {
        it.readLines().first()
    }

    val atoms = atomsDir.listFiles().map {
        val atomName = it.readLines().first()
        val exercisesFile = exercisesByFileName[it.nameWithoutIndex]
                ?: exercisesByAtomName[atomName]
        AtomInfo(atomName, it, exercisesFile)
    }
    atoms.forEachIndexed { index, atom ->
        val newFileName = atom.fileName.replace("${atom.index}", "$index")
        if (atom.index != index) {
            atomsDir.subFile(newFileName).writeText(atom.mdFile.readText())
            atom.mdFile.delete()
        }
        val newExercisesFile = exercisesDir.subFile(newFileName)
        if (!newExercisesFile.exists() && index != 0) {
            if (atom.exercisesFile != null) {
                newExercisesFile.writeText(atom.exercisesFile.readText())
            } else {
                newExercisesFile.writeText(placeholderExercisesFile(atom))
            }
            if (atom.exercisesFile?.absolutePath != newExercisesFile.absolutePath) {
                atom.exercisesFile?.delete()
            }
        }
    }
    reorderAtomsInStatusFile()
}

fun placeholderExercisesFile(atom: AtomInfo) = buildString {
    appendln(atom.atomName)
    appendln("-".repeat(atom.atomName.length))
    appendln()
}
