package atomInfo

import generatingExamples.extractCodeExamples
import util.Settings
import util.lowerCaseFirstLetter
import util.subFile
import util.upperCaseFirstLetter
import java.io.File

class Atoms {
    val atomInfoList = buildAtomInfoList()

    private val associateByName = atomInfoList.associateBy { it.name }

    fun getAtomByName(name: String) =
            associateByName[name.toAtomName()] ?:
                    associateByName[name.toAtomName().withoutIndex]

    fun getAtomsByRanges(ranges: List<IntRange>) =
            atomInfoList.filter {
                atom ->
                ranges.any { range ->
                    atom.index in range
                }
            }
}

typealias AtomName = String

val AtomName.withoutIndex: String
    get() {
        return if (substringBefore("_").toIntOrNull() != null)
            substringAfter("_")
        else this
    }

fun AtomName.toPackageName(): String {
    val words = withoutIndex.split("_")
    return words.joinToString("") { it.upperCaseFirstLetter() }.lowerCaseFirstLetter()
}

fun String.toAtomName(): AtomName = if (endsWith(".md")) substringBeforeLast(".") else this

data class AtomInfo(
        val name: AtomName,
        val title: String,
        val index: Int,
        val markdownFile: File,
        val exercisesFile: File?,
        val examplesMap: Map<String, File>,
        val exercisesMap: Map<String, File>
)

fun buildAtomInfoList(): List<AtomInfo> {
    val atomsDir = File(Settings.atomsPath)
    val exercisesDir = File(Settings.exercisesPath)

    val atomsByFileName = atomsDir.listFiles().associateBy { it.nameWithoutExtension }
    val exercisesByFileName = exercisesDir.listFiles().associateBy { it.nameWithoutExtension }

    return atomsDir.listFiles().map {
        val name = it.nameWithoutExtension
        val index = it.name.substringBefore("_").toInt()
        val atomTitle = it.readLines().first()
        val atomFile = atomsByFileName.getValue(name)
        val exercisesFile = exercisesByFileName[name]

        val codeExamples = extractCodeExamples(atomFile)
        val examples = File("Examples").subFile(name).subFile("Examples")
        val exampleMap = codeExamples?.examples?.associate { it.name to examples.subFile(it.name) } ?: emptyMap()

        val exercises = File("Exercises").subFile(name)
        val exerciseMap = if (exercises.exists() && exercises.isDirectory) {
            exercises.listFiles().filter { it.isDirectory }.associateBy { it.name }
        } else {
            emptyMap()
        }

        AtomInfo(name, atomTitle, index, atomFile, exercisesFile, exampleMap, exerciseMap)
    }
}
