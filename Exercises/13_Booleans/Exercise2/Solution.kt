package exercises.booleans2

fun and(b1: Boolean, b2: Boolean): Boolean =
        /*<taskWindow>*/if (b1) b2 else false/*</taskWindow>*/

fun or(b1: Boolean, b2: Boolean): Boolean =
        /*<taskWindow>*/if (b1) true else b2/*</taskWindow>*/

fun main(args: Array<String>) {
    println(and(true, true)) // true
    println(or(true, false)) // true
}
