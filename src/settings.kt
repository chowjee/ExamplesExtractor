package settings

import java.io.FileInputStream
import java.util.*
import kotlin.reflect.KProperty

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
    val examplesDir = "Examples"
    val exercisesDir = "Exercises"
}
