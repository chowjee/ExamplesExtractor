package ranges2

fun sumOfEven(n: Int): Int {
    /*<taskWindow>*/var result = 0
    for (i in 0..n step 2) {
        result += i
    }
    return result/*</taskWindow>*/
}