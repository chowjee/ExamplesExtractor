package separateExamplesProject

import atomInfo.buildAtomInfoList
import settings.Settings
import settings.checkExamplesPathPropertyIsSet
import java.io.File

fun main(args: Array<String>) {
    checkExamplesPathPropertyIsSet()
    generateSeparateExamplesProject()
    generateGradleTasks()
}

private fun generateSeparateExamplesProject() {
    val atomInfoList = buildAtomInfoList()
    val examples = File(Settings.examplesAsSeparateProject)
    examples.deleteRecursively()
    examples.mkdir()
    for (atomInfo in atomInfoList) {
        if (atomInfo.examplesMap.isEmpty()) continue

        val path = atomInfo.path
        val packageDir = File(examples.path + "/$path")
        packageDir.mkdir()
        for (example in atomInfo.examplesMap.values) {
            val text = example.file.readText()
            val newExampleFile = File(packageDir.path + "/${example.file.name}")
            newExampleFile.writeText(text)
        }
    }
}
