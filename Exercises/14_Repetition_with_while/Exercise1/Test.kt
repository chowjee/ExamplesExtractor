package exercise1

import org.junit.Assert
import org.junit.Test

class TestExercise1 {
    private fun assertSum(i: Int) {
        val expectedSum = (1..i).sum()
        Assert.assertEquals("sum($i) should be $expectedSum", expectedSum, sum(i))
    }

    @Test fun testSum1() = assertSum(1)

    @Test fun testSum5() = assertSum(5)

    @Test fun testSum10() = assertSum(10)

    @Test fun testSum100() = assertSum(100)
}
