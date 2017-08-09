package classesAndObjects4

fun isPalindrome(s: SimpleString): Boolean {
    /*<taskWindow>*/for (i in 0..s.length - 1) {
        if (s.get(i) != s.get(s.length - 1 - i)) return false
    }
    return true/*</taskWindow>*/
}
