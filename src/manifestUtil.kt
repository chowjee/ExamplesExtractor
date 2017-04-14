package manifestUtil

fun manifestForExercisesFolder(range: IntRange) =
"""{
    "sequential": false,
    "examples": [
        ${range.map { "Exercise$it" }.asStringsInJson()}
    ]
}"""

fun manifestForExercise() =
"""{
    "confType": "junit"
}"""

fun manifestForExamples(name: String, examples: List<String>) =
"""{
    "name" : "$name",
    "files" : [ ${examples.joinToString(transform = ::fileInfo)} ],
    "args" : "",
    "searchForMain": false,
    "confType" : "java"
}"""

private fun fileInfo(name: String) =
"""{
        "filename" : "$name",
        "modifiable" : "true"
    }"""


fun topLevelManifest(chapters: List<String>) =
"""{
    "folders": [
        ${chapters.asStringsInJson()}
    ]
}"""

fun manifestForExamplesFolder(name: String) =
"""{
    "name" : "$name",
    "folder" : "$name",
    "examples" : [ "Examples" ]
}"""

private fun List<String>.asStringsInJson() = joinToString(",\n        ") { "\"$it\"" }