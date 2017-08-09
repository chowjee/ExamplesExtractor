package forAndRanges4

fun isBalanced(s: String): Boolean {
    /*<taskWindow>*/var leftUnmatched = 0
    for (c in s) {
        if (c == '(') {
            leftUnmatched++
        }
        else {
            leftUnmatched--
        }
        if (leftUnmatched < 0) {
            return false
        }
    }
    return leftUnmatched == 0/*</taskWindow>*/
}
