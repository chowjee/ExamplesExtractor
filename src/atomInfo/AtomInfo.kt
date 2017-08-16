package atomInfo

import generatingExamples.extractCodeExamples
import generatingExamples.getPathAndFileNames
import settings.Settings
import util.lowerCaseFirstLetter
import util.subFile
import util.upperCaseFirstLetter
import java.io.File

class Atoms {
    val atomInfoList = buildAtomInfoList()

    private val associateByName = atomInfoList.associateBy { it.name.withoutIndex }

    fun getAtomByName(name: String) =
            associateByName[name.toAtomName().withoutIndex]

    fun getAtomsByRanges(ranges: List<IntRange>) =
            atomInfoList.filter { atom ->
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
        val examplesMap: Map<String, ExampleInfo>,
        val exercisesMap: Map<String, ExerciseInfo>
) {
    val path: String?
        get() = examplesMap.values.firstOrNull()?.path
}

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
        val exampleMap = codeExamples?.examples
                ?.associate { it.name to ExampleInfo.create(examples.subFile(it.name)) }
                ?: emptyMap()

        val exercises = File("Exercises").subFile(name)
        val exerciseMap = if (exercises.exists() && exercises.isDirectory) {
            exercises.listFiles()
                    .filter { it.isDirectory }
                    .associateBy { it.name }
                    .mapValues { ExerciseInfo.create(it.value) }
        } else {
            emptyMap()
        }

        AtomInfo(name, atomTitle, index, atomFile, exercisesFile, exampleMap, exerciseMap)
    }
}

sealed class ExampleOrExerciseInfo

data class ExampleInfo(
        val file: File,
        val name: String,
        val packageName: String?,
        val text: String,
        val path: String?
): ExampleOrExerciseInfo() {
    val classForFileName: String
        get() = name + "Kt"

    val qualifiedName: String
        get() = if (packageName != null) "$packageName.$classForFileName" else classForFileName

    companion object {
        fun create(file: File): ExampleInfo {
            val name = file.nameWithoutExtension
            val lines = file.readLines()
            val packageName = lines.find { it.startsWith("package ") }?.substringAfter("package ")?.trim()
            val path = lines.find { it.startsWith("// ") }?.let {
                lineWithComment ->
                getPathAndFileNames(lineWithComment).first
            }
            return ExampleInfo(file, name, packageName, file.readText(), path)
        }
    }
}

data class ExerciseInfo(
        val dir: File,
        val solutionInfo: ExampleInfo,
        val taskDescription: File,
        val testOrOutputFile: File,
        val testOutput: Boolean
): ExampleOrExerciseInfo() {
    companion object {
        fun create(dir: File): ExerciseInfo {
            val output = dir.subFile("output.txt")
            val test = dir.subFile("Test.kt")
            val isOutput = output.exists()
            if (!isOutput && !test.exists()) {
                throw AssertionError("'Test.kt' and 'output.txt' not found for ${dir.path}")
            }
            return ExerciseInfo(dir, ExampleInfo.create(dir.subFile("Solution.kt")), dir.subFile("task.md"),
                    if (isOutput) output else test, isOutput)
        }
    }
}