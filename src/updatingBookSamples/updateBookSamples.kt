package updatingBookSamples

import atoms.*
import java.io.File

fun main(args: Array<String>) {
    val atomInfoList = buildAtomInfoList()
    for (atomInfo in atomInfoList) {
        var atomText = atomInfo.markdownFile.readText()
        val examples = getExamplesForAtom(atomInfo.markdownFile)
        val packageName = atomInfo.name.toPackageName()
        for (example in examples) {
            atomText = replaceSample(atomText, packageName, example)
        }
        atomInfo.markdownFile.writeText(atomText)
    }
}

fun replaceSample(atomText: String, packageName: String, example: File): String {
    val fileNameComment = "// $packageName/${example.name}"
    val openingTag = "```kotlin"
    val closingTag = "```"

    val before = atomText.substringBefore(fileNameComment)
    val after = atomText.substringAfter(fileNameComment)

    return buildString {
        append(before.substringBeforeLast(openingTag))
        appendln(openingTag)
        appendln(fileNameComment)
        appendln(example.readText().dropPackageIfDefault(packageName))
        append(closingTag)
        append(after.substringAfter(closingTag))
    }
}

fun String.dropPackageIfDefault(packageName: String): String {
    val lines = lines()
    val packageLine = lines.first { it.startsWith("package") }
    val withoutPackage = if (packageLine == "package $packageName")
        lines.drop(2)
    else
        lines
    return withoutPackage.joinToString("\n").trimEnd()
}
