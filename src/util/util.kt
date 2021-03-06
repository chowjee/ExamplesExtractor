package util

import java.io.File

fun File.subFile(name: String) = File("$path/$name")

fun File.manifest() = subFile("manifest.json")

fun File.subDir(name: String) = subFile(name).apply { mkdir() }

fun String.addBlankLine() = if (endsWith("\n")) this else this + "\n"

fun String.lowerCaseFirstLetter() = this[0].toLowerCase() + substring(1)
fun String.upperCaseFirstLetter() = this[0].toUpperCase() + substring(1)
