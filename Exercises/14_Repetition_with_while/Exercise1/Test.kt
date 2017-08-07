package repetitionWithWhile1

import org.junit.Assert
import org.junit.Test

class TestRepetitionWithWhile {
    private fun checkSum(i: Int) {
        val expectedSum = (1..i).sum()
        Assert.assertEquals("sum($i) should be $expectedSum", expectedSum, sum(i))
    }

    @Test fun testSum1() = checkSum(1)

    @Test fun testSum2() = checkSum(2)

    @Test fun testSum5() = checkSum(5)

    @Test fun testSum10() = checkSum(10)

    @Test fun testSum100() = checkSum(100)
}
