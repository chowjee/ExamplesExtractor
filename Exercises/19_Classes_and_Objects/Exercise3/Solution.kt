package classesAndObjects3

//TODO: subtask
fun isPalindrome(s: String): Boolean = /*<taskWindow>*/s.reversed() == s/*</taskWindow>*/
fun isPalIgnoreCase(s: String): Boolean =
        /*<taskWindow>*/s.reversed().toLowerCase() == s.toLowerCase()/*</taskWindow>*/


fun isPalIgnoreSpecial(s: String): Boolean {
    /*<taskWindow>*/var onlyLetters = ""
    for (c in s) {
        if (c in 'a'..'z' || c in 'A'..'Z') {
            onlyLetters += c
        }
    }
    return isPalIgnoreCase(onlyLetters)/*</taskWindow>*/
}
