package examplesExtractor

val exampleRanges = listOf(6..38, 40..41, 46..46, 48..53, 65..65, 67..68, 70..71)
val exerciseRanges = listOf(6..16)

fun main(args: Array<String>) {
    generateExamples(exampleRanges)
    generateExercises(exerciseRanges)
}