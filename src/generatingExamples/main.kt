package generatingExamples

import generatingTests.generateExampleTests
import settings.checkAtomicKotlinPropertyIsSet

fun main(args: Array<String>) {
    checkAtomicKotlinPropertyIsSet()
    println("Update started")
    generateExamples()
    println("Examples updated")
    generateExercises(listOf(6..17, 19..19))
    println("Exercises updated")
    generateExampleTests()
    println("Tests regenerated")
}
