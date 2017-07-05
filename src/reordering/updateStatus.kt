package reordering

import settings.Settings
import java.io.File

fun main(args: Array<String>) {
    reorderAtomsInStatusFile()
}

typealias AtomName = String

data class AtomStatus(
        val name: AtomName,
        val firstDraftReady: Boolean,
        val rewritten: Boolean,
        val techChecked: Boolean,
        val notes: String
) {

    fun prettyPrint() = buildString {
        fun appendProperty(value: Boolean, name: String) {
            appendln("+ [${if (value) 'X' else ' '}] $name")
        }
        appendln("#### $name")
        appendProperty(firstDraftReady, "First Draft Ready")
        appendProperty(rewritten, "Rewritten")
        appendProperty(techChecked, "Tech Checked")
        appendln("+ Notes:$notes")
    }
}

val AtomName.withoutIndex: String
    get() = substringAfter("_")

fun reorderAtomsInStatusFile() {
    val atomsDir = File(Settings.atomsPath)
    val statusFile = File(Settings.statusPath)


    val atomStatusList = readStatus(statusFile)
    val currentStatuses = atomStatusList.associateBy { it.name.withoutIndex }
    println(currentStatuses.keys)
    println(atomsDir.listFiles().map { it.name.withoutIndex })

    val atoms = atomsDir.listFiles().map { atom ->
        val currentStatus = currentStatuses[atom.name.withoutIndex]
        if (currentStatus != null) {
            currentStatus.copy(name = atom.name)
        } else {
            AtomStatus(atom.name, false, false, false, "")
        }
    }
    statusFile.writeText(atoms.joinToString(separator = "") { it.prettyPrint() })
}

fun readStatus(statusFile: File): List<AtomStatus> {
    fun extractPropertyValue(line: String) = "X" == line.substringAfter("[").substringBefore("]")

    return statusFile.readText().split("#### ").filter {
        val isAtom = it.lines().size >= 4
        if (!isAtom && it.isNotBlank()) {
            throw IllegalArgumentException("Can't read status of:\n$it")
        }
        isAtom
    }.map {
        val lines = it.lines()
        AtomStatus(
                lines[0],
                extractPropertyValue(lines[1]),
                extractPropertyValue(lines[2]),
                extractPropertyValue(lines[3]),
                lines[4].substringAfter("+ Notes:"))
    }
}
