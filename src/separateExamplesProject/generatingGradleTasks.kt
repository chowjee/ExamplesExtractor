package separateExamplesProject

import atomInfo.Atoms
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
    val tasksGradle = File("/Users/svtk/AtomicKotlin/Examples/gradle/tasks.gradle")
    tasksGradle.writeText(generateGradleTasks())
}

fun generateGradleTasks() = buildString {
    appendln(header.trim())

    val sourceFiles = Atoms().atomInfoList.flatMap { it.examplesMap.values }
    for (code in sourceFiles) {
        if (!code.readText().contains("fun main")) continue

        //todo extract package name to ExampleInfo
        val name = code.nameWithoutExtension

        val classForFileName = name + "Kt"

        val packageName = code.readLines().find { it.startsWith("package ") }?.substringAfter("package ")?.trim()
                ?: name.lowerCaseFirstLetter()
        append(generateTask(name.lowerCaseFirstLetter(), "$packageName.$classForFileName"))
    }
}