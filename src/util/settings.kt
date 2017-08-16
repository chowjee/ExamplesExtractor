package util

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

    private val atomicKotlinPath = properties.getProperty("atomicKotlinPath")

    val atomsPath = atomicKotlinPath + "/Markdown"
    val exercisesPath = atomicKotlinPath + "/Exercises"
    val statusPath = atomicKotlinPath + "/STATUS.md"

    val examplesDir = "Examples"
    val exercisesDir = "Exercises"

    private val examplesPath = properties.getProperty("examplesPath")

    val examplesAsSeparateProject = examplesPath + "/examples"
    val gradleScript = examplesPath + "/gradle/tasks.gradle"
}
