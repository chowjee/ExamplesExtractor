package separateExamplesProject

import atomInfo.buildAtomInfoList
import atomInfo.toPackageName
import util.Settings
import java.io.File

fun main(args: Array<String>) {
    val atomInfoList = buildAtomInfoList()
    val examples = File(Settings.examplesAsSeparateProject)
    examples.deleteRecursively()
    examples.mkdir()
    for (atomInfo in atomInfoList) {
        val packageName = atomInfo.name.toPackageName()
        if (atomInfo.examplesMap.isEmpty()) continue

        val packageDir = File(examples.path + "/$packageName")
        packageDir.mkdir()
        for (example in atomInfo.examplesMap.values) {
            val text = example.file.readText()
            val newExampleFile = File(packageDir.path + "/${example.file.name}")
            newExampleFile.writeText(text)
        }
    }
}
