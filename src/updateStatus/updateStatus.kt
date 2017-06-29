package updateStatus

import settings.Settings
import java.io.File

// TODO: update status on reordering

fun main(args: Array<String>) {
    val statusFile = File("/Users/svtk/AtomicKotlin/AtomicKotlin/STATUS.md")
    statusFile.writeText(buildString {
        File(Settings.atomsPath).listFiles().forEach {
            atom ->
            append(atomStatus(atom, atom.isNew()))
        }
    })
}

fun File.isNew() = readLines().size < 5

fun atomStatus(atom: File, isNew: Boolean) = """#### ${atom.name}
+ [ ] ${if (isNew) "First draft ready" else "Examples Replaced"}
+ [ ] Rewritten
+ [ ] Tech Checked
+ Notes:
"""