import atoms.buildAtomInfoList
import atoms.toPackageName
import java.io.File

fun main(args: Array<String>) {
    val atomInfoList = buildAtomInfoList()
    val examples = File("/Users/svtk/AtomicKotlin/Examples/examples")
    examples.deleteRecursively()
    examples.mkdir()
    for (atomInfo in atomInfoList) {
        val packageName = atomInfo.name.toPackageName()
        if (atomInfo.examplesMap.isEmpty()) continue

        val packageDir = File(examples.path + "/$packageName")
        packageDir.mkdir()
        for (example in atomInfo.examplesMap.values) {
            val text = example.readText()
            val newExampleFile = File(packageDir.path + "/${example.name}")
            newExampleFile.writeText(text)
        }
    }
}
