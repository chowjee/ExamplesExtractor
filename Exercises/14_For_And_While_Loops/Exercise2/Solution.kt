package forLoops2

fun factorial(n: Long): Long {
    // copy the implementation of 'factorial' here
    /*<taskWindow>*/var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result/*</taskWindow>*/
}

fun sumOfFactorials(n: Long): Long {
    /*<taskWindow>*/var result = 0L
    for (i in 1..n) {
        result += factorial(i)
    }
    return result/*</taskWindow>*/
}