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

    private val intProperties = object {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Int =
                properties.getValue(thisRef, property).toInt()
    }

    val firstAtom by intProperties
    val lastAtom by intProperties
    val chaptersPath by properties
    val exercisesPath by properties
    val examplesDir by properties
    val exercisesDir by properties
}