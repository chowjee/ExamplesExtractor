package ranges2

/*<taskWindow>*/
fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun isUpperCase(ch: Char): Boolean = ch in 'A'..'Z'

fun isLetterOrUnderscore(ch: Char): Boolean = ch == '_' || isLowerCase(ch) || isUpperCase(ch)

fun isDigit(ch: Char): Boolean = ch in '0'..'9'
/*</taskWindow>*/

fun isValidIdentifier(s: String): Boolean {
    /*<taskWindow>*/
    if (s.isEmpty() || !isLetterOrUnderscore(s[0])) return false
    for (ch in s) {
        if (!isLetterOrUnderscore(ch) && !isDigit(ch)) return false
    }
    return true
    /*</taskWindow>*/
}