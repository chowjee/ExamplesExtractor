package ifExpressions2

import org.junit.Assert
import org.junit.Test

class TestIfExpressions2 {
    private fun checkFunction(first: Int, second: Int) {
        val max = if (first > second) first else second
        Assert.assertEquals("findMax($first, $second) should return $max",
                max, findMax(first, second))
    }

    @Test fun testMax1() = checkFunction(1, 2)

    @Test fun testMax2() = checkFunction(-1001, 22)

    @Test fun testMax3() = checkFunction(-3, -3)
}
