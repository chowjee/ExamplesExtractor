package stringTemplates2

fun findMax(first: Int, second: Int) = /*<taskWindow>*/
        if (first > second) first else second/*</taskWindow>*/

fun main(args: Array<String>) {
    val first = 17
    val second = 31
    /*<taskWindow>*/
    val max = findMax(first, second)
    println("The maximum between $first and $second is $max.")/*</taskWindow>*/
}
/* Expected output:
The maximum between 17 and 31 is 31.
*/