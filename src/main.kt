package examplesExtractor

import generatingTests.generateExampleTests

fun main(args: Array<String>) {
    generateExamples()
    generateExampleTests()
    generateExercises(listOf(6..17, 19..19))
}
