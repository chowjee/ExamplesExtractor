package numberTypes3

import org.junit.Assert
import org.junit.Test

class TestNumberTypes3 {
    private fun checkFahrenheitToCelsius(C: Double, F: Int) {
        Assert.assertEquals("$F F should be $C C",
                C, convertFahrenheitToCelsius(F), 0.0001)
    }

    private fun checkCelsiusToFahrenheit(F: Double, C: Int) {
        Assert.assertEquals("$C C should be $F F",
                F, convertCelsiusToFahrenheit(C), 0.0001)
    }

    @Test fun testFahrenheitToCelsius1() = checkFahrenheitToCelsius(-15.0, 5)

    @Test fun testFahrenheitToCelsius2() = checkFahrenheitToCelsius(37.7778, 100)

    @Test fun testCelsiusToFahrenheit1() = checkCelsiusToFahrenheit(5.0, -15)

    @Test fun testCelsiusToFahrenheit2() = checkCelsiusToFahrenheit(68.0, 20)
}
