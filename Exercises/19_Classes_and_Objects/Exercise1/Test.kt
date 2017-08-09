package classesAndObjects1

import org.junit.Assert
import org.junit.Test

class TestClassesAndObjects1 {

    private fun checkPalindrome(s: String, expected: Boolean) {
        Assert.assertEquals("""isPalindrome("$s") should return $expected""", expected, isPalindrome(s))
    }

    @Test fun testPalindrome1() = checkPalindrome("mom", true)

    @Test fun testPalindrome2() = checkPalindrome("dad", true)

    @Test fun testPalindrome3() = checkPalindrome("street", false)

    @Test fun testPalindrome4() = checkPalindrome("qwertyuiopoiuytrewq", true)

    @Test fun testPalindrome5() = checkPalindrome("brr", false)

    @Test fun testPalindrome6() = checkPalindrome("A", true)

    @Test fun testPalindrome7() = checkPalindrome("rr", true)
}
