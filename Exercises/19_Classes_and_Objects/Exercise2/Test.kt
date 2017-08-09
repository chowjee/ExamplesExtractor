package classesAndObjects2

import org.junit.Assert
import org.junit.Test

class TestClassesAndObjects2 {

    private fun checkPalindrome(s: String, expected: Boolean) {
        Assert.assertEquals("""isPalindrome("$s") should return $expected""", expected, isPalIgnoreCase(s))
    }

    @Test fun testPalindrome1() = checkPalindrome("Bob", true)

    @Test fun testPalindrome2() = checkPalindrome("wwW", true)

    @Test fun testPalindrome3() = checkPalindrome("wWw", true)

    @Test fun testPalindrome4() = checkPalindrome("no palindrome", false)

    @Test fun testPalindrome5() = checkPalindrome("brr", false)

    @Test fun testPalindrome6() = checkPalindrome("A", true)

    @Test fun testPalindrome7() = checkPalindrome("rR", true)

    @Test fun testPalindrome8() = checkPalindrome("a.", false)
}
