package forAndRanges4

import org.junit.Assert
import org.junit.Test

class TestExercise4 {
    private fun checkBalanced(s: String, expected: Boolean) {
        Assert.assertEquals("isBalanced($s) should return $expected", isBalanced(s), expected)
    }

    @Test fun testBalanced1() = checkBalanced("()", true)

    @Test fun testBalanced2() = checkBalanced("(())()", true)

    @Test fun testBalanced3() = checkBalanced("(())((()))", true)

    @Test fun testBalanced4() = checkBalanced("()", true)

    @Test fun testUnbalanced1() = checkBalanced("((", false)

    @Test fun testUnbalanced2() = checkBalanced("))", false)

    @Test fun testUnbalanced3() = checkBalanced(")(", false)

    @Test fun testUnbalanced4() = checkBalanced("(()(())))()", false)
}
