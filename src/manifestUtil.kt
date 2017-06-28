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

private fun List<String>.asStringsInJson() = joinToString(",\n    ") { "\"$it\"" }

fun manifestForTopLevelExercisesFolder(chapters: List<String>) =
        """{
  "taskFolder": true,
  "levels": [
    {
      "projectsNeeded": 30,
      "color": "#409BCB"
    },
    {
      "projectsNeeded": 40,
      "color": "#6A855B"
    },
    {
      "projectsNeeded": 60,
      "color": "#FDC474"
    },
    {
      "projectsNeeded": 80,
      "color": "#C9783A"
    },
    {
      "projectsNeeded": 100,
      "color": "#9976A9"
    }
  ],
  "folders": [
    ${chapters.asStringsInJson()}
  ]
}"""