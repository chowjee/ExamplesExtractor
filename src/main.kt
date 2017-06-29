package examplesExtractor

import generatingTests.generateExampleTests

val exampleRanges = listOf(6..35, 37..46, 48..51, 53..53, 55..59, 61..63, 65..65, 67..69)
val exerciseRanges = listOf(6..16)

fun main(args: Array<String>) {
    generateExamples(exampleRanges)
    generateExercises(exerciseRanges)
    generateExampleTests(exampleRanges)
}