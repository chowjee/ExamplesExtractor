package separateExamplesProject

import atomInfo.Atoms
import atomInfo.createExampleInfo
import util.Settings
import util.lowerCaseFirstLetter
import java.io.File

val header = """
configurations {
    kotlinRuntime
}

dependencies {
    kotlinRuntime "org.jetbrains.kotlin:kotlin-runtime:${'$'}kotlin_version"
}

def kotlinClassPath = configurations.kotlinRuntime + sourceSets.main.runtimeClasspath
"""

fun generateTask(taskName: String, filePath: String) = """
task $taskName(type: JavaExec) {
    classpath kotlinClassPath
    main = '$filePath'
}
"""

fun main(args: Array<String>) {
    val tasksGradle = File(Settings.gradleScript)
    tasksGradle.writeText(generateGradleTasks())
}

fun generateGradleTasks() = buildString {
    appendln(header.trim())

    val sourceFiles = Atoms().atomInfoList.flatMap { it.examplesMap.values }
    for (code in sourceFiles) {
        if (!code.readText().contains("fun main")) continue

        val exampleInfo = createExampleInfo(code)

        append(generateTask(exampleInfo.name.lowerCaseFirstLetter(), exampleInfo.qualifiedName))
    }
}