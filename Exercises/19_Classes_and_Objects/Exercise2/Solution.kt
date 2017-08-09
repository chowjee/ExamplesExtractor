package classesAndObjects2

fun isPalindrome(s: String): Boolean = /*<taskWindow>*/s.reversed() == s/*</taskWindow>*/
fun isPalIgnoreCase(s: String): Boolean =
    /*<taskWindow>*/isPalindrome(s.toLowerCase())/*</taskWindow>*/
