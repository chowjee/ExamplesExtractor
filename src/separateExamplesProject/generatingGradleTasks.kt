package separateExamplesProject

import atomInfo.Atoms
import settings.Settings
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

fun generateGradleTasks() {
    val tasksGradle = File(Settings.gradleScript)
    tasksGradle.writeText(generateGradleTasksScript())
}

private fun generateGradleTasksScript() = buildString {
    appendln(header.trim())

    val exampleInfoList = Atoms().atomInfoList.flatMap { it.examplesMap.values }
    for (exampleInfo in exampleInfoList) {
        if (!exampleInfo.file.readText().contains("fun main")) continue

        append(generateTask(exampleInfo.name.lowerCaseFirstLetter(), exampleInfo.qualifiedName))
    }
}