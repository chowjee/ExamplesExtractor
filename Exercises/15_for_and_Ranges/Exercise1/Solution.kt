package forLoops1

fun factorial(n: Long): Long {
    /*<taskWindow>*/var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result/*</taskWindow>*/
}