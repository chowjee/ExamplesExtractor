package settings

import java.io.FileInputStream
import java.util.*

object Settings {
    private val propertiesFile = "settings.properties"

    private val properties = Properties().also {
        properties ->
        with(FileInputStream(propertiesFile)) {
            properties.load(this)
            close()
        }
    }

    val atomicKotlinPath = properties.getProperty("atomicKotlinPath")

    val atomsPath = atomicKotlinPath + "/Markdown"
    val exercisesPath = atomicKotlinPath + "/Exercises"
    val statusPath = atomicKotlinPath + "/STATUS.md"

    val examplesDir = "Examples"
    val exercisesDir = "Exercises"

    val examplesProject = properties.getProperty("examplesPath")

    val examplesAsSeparateProject = examplesProject + "/examples"
    val gradleScript = examplesProject + "/gradle/tasks.gradle"
}
