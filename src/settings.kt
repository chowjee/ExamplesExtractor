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

    private operator fun Properties.getValue(thisRef: Any?, property: KProperty<*>): String =
            getProperty(property.name) ?: throw IllegalStateException("No value for '${property.name}' property in $propertiesFile")

    val atomsPath by properties
    val exercisesPath by properties
    val examplesDir by properties
    val exercisesDir by properties
}