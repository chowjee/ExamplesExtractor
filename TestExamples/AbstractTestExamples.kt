import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.util.function.Consumer

abstract class AbstractTestExamples {
    open fun testExample(fileName: String, main: Consumer<Array<String>>) {
        val exampleCode = File(fileName).readText()
        if (exampleCode.contains("/* Output:")) {
            testOutput(exampleCode, main)
        } else {
            main.accept(arrayOf())
        }
    }

    private fun extractOutput(exampleCode: String) =
            exampleCode.substringAfter("/* Output:").substringBefore("*/")

    private fun testOutput(exampleCode: String, main: Consumer<Array<String>>) {
        val out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))
        main.accept(arrayOf())
        Assert.assertEquals(extractOutput(exampleCode).trimLines(), out.toString().trimLines())
    }

    private fun String.trimLines() = trim().lines().map { it.trim() }.joinToString("\n")
}
