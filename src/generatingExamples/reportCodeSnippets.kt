package generatingExamples

import atomInfo.Atoms

fun main(args: Array<String>) {
    val allExamples = Atoms().atomInfoList.mapNotNull { extractCodeExamples(it.markdownFile) }
    println("Code snippets:")
    for (atomExamples in allExamples) {
        reportCodeSnippets(atomExamples)
    }
}

private fun reportCodeSnippets(atomExamples: AtomExamples) {
    if (atomExamples.snippets.isNotEmpty()) {
        println(atomExamples.name)
        for (snippet in atomExamples.snippets) {
            println("---------")
            println(snippet.text)
        }
        println("=========")
    }
}
