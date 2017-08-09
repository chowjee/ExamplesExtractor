package classesAndObjects3

import org.junit.Assert
import org.junit.Test

class TestClassesAndObjects3 {
    private fun checkPalindrome(s: String, expected: Boolean) {
        Assert.assertEquals("""isPalIgnoreSpecial("$s") should return $expected""", expected, isPalIgnoreSpecial(s))
    }

    @Test fun testPalindrome0() = checkPalindrome("AAA!", true)

    @Test fun testPalindrome1() = checkPalindrome("Was It A Rat I Saw? ...", true)

    @Test fun testPalindrome2() = checkPalindrome("A Man, A Plan, A Canal-Panama!", true)

    @Test fun testPalindrome3() = checkPalindrome("Madam In Eden, I'm Adam", true)

    @Test fun testPalindrome4() = checkPalindrome("Mr. Owl Ate My Metal Worm", true)

    @Test fun testPalindrome5() = checkPalindrome("A Santa Lived As a Devil At NASA", true)

    @Test fun testPalindrome6() = checkPalindrome("Dammit, I'm Mad! ...", true)

    @Test fun testPalindrome7() = checkPalindrome("Do Geese See God?", true)

    @Test fun testPalindrome8() = checkPalindrome("Not a palindrome!", false)
}
