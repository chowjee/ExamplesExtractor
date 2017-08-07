import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.util.function.Consumer

abstract class AbstractTestExamples {
    protected fun testExample(fileName: String, main: Consumer<Array<String>>) {
        val exampleCode = File(fileName).readText()
        if (exampleCode.contains("/* Output:")) {
            val output = extractOutput(exampleCode).trimLines()
            testOutput(output, main, trimLines = true)
        } else {
            main.accept(arrayOf())
        }
    }

    protected fun testExercise(outputFileName: String, main: Consumer<Array<String>>) {
        val output = File(outputFileName).readText()
        testOutput(output, main, trimLines = false)
    }

    private fun extractOutput(exampleCode: String) =
            exampleCode.substringAfter("/* Output:").substringBefore("*/")

    private fun testOutput(output: String, main: Consumer<Array<String>>, trimLines: Boolean) {
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))
        main.accept(arrayOf())
        val result = out.toString().let {
            if (trimLines) it.trimLines() else it
        }
        Assert.assertEquals(output, result)
    }

    private fun String.trimLines() = trim().lines().map { it.trim() }.joinToString("\n")
}
