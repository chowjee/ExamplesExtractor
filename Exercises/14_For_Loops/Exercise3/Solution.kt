package forLoops3

fun sumOfEven(n: Int): Int {
    /*<taskWindow>*/var result = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            result += i
        }
    }
    return result/*</taskWindow>*/
}