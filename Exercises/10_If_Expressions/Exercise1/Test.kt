package ifExpressions1

import org.junit.Assert
import org.junit.Test

class TestIfExpressions1 {
    private fun checkFunction(number: Int, sign: String) {
        Assert.assertEquals("""checkSign($number) should return "$sign"""",
                sign, checkSign(number))
    }

    @Test fun testPositive() = checkFunction(10, "positive")

    @Test fun testZero() = checkFunction(0, "zero")

    @Test fun testNegative() = checkFunction(-10, "negative")
}
