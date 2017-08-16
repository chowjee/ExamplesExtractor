package settings

import java.io.File
import java.lang.IllegalArgumentException

fun checkAtomicKotlinPropertyIsSet() =
        checkPath(Settings.atomicKotlinPath, "AtomicKotlin", listOf(
                File(Settings.atomsPath) to true,
                File(Settings.exercisesPath) to true,
                File(Settings.statusPath) to false))

fun checkExamplesPathPropertyIsSet() =
        checkPath(Settings.examplesProject, "Examples", listOf(
                File(Settings.examplesAsSeparateProject) to true,
                File(Settings.gradleScript) to false
        ))

private fun checkPath(path: String, projectName: String, content: List<Pair<File, Boolean>>) {
    val atomicKotlinPath = File(path)
    if (!atomicKotlinPath.exists() && !atomicKotlinPath.isDirectory) {
        throw IllegalArgumentException("Please specify the path to $projectName project in settings.properties")
    }
    for ((file, isDirectory) in content) {
        if (!file.exists() && file.isDirectory != isDirectory) {
            throw IllegalArgumentException("Can't find ${if (isDirectory) "directory" else "file"} $file")
        }
    }
}
