package ranges4

import org.junit.Assert
import org.junit.Test

class TestValidIdentifier {

    private fun checkValidIdentifier(s: String) {
        Assert.assertTrue("'$s' is a valid identifier", isValidIdentifier(s))
    }

    private fun checkInvalidIdentifier(s: String) {
        Assert.assertFalse("'$s' is not a valid identifier", isValidIdentifier(s))
    }

    @Test fun testSimple() = checkValidIdentifier("name")

    @Test fun testStartsWithUnderscore() = checkValidIdentifier("_name")

    @Test fun testUnderscore() = checkValidIdentifier("_")

    @Test fun testContainsDigits() = checkValidIdentifier("n01")

    @Test fun testUpperCase() = checkValidIdentifier("NNN")

    @Test fun testValid() = checkValidIdentifier("_N01")

    @Test fun testStartsWithDigit() = checkInvalidIdentifier("1_")

    @Test fun testContainsIllegalCharacters() = checkInvalidIdentifier("&%$")
}
