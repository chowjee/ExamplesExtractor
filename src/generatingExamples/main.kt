package generatingExamples

import generatingTests.generateExampleTests

fun main(args: Array<String>) {
    println("Update started")
    generateExamples()
    println("Examples updated")
    generateExercises(listOf(6..17, 19..19))
    println("Exercises updated")
    generateExampleTests()
    println("Tests regenerated")
}
