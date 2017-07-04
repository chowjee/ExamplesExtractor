package updatingBookSamples

import atoms.getAtomFiles
import atoms.getExamplesForAtom
import examplesExtractor.exampleRanges
import java.io.File

fun main(args: Array<String>) {
//    val atoms = getAtomFiles(listOf(6..6))
    val atoms = getAtomFiles(exampleRanges)
    for (atom in atoms) {
        var atomText = atom.readText()
        val examples = getExamplesForAtom(atom)
        for (example in examples) {
            atomText = replaceSample(atomText, example)
        }
        atom.writeText(atomText)
    }
}

fun replaceSample(atomText: String, example: File): String {
    val fileNameComment = "// ${example.name}"
    val openingTag = "```kotlin"
    val closingTag = "```"

    val before = atomText.substringBefore(fileNameComment)
    val after = atomText.substringAfter(fileNameComment)

    return buildString {
        append(before.substringBeforeLast(openingTag))
        appendln(openingTag)
        appendln(fileNameComment)
        appendln(example.readText().trimEnd())
        append(closingTag)
        append(after.substringAfter(closingTag))
    }
}
