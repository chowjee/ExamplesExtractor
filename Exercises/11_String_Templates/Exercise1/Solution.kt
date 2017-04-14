package stringTemplates1

fun checkSign(number: Int) = /*<taskWindow>*/
        if (number > 0)
            "positive"
        else if (number == 0)
            "zero"
        else
            "negative"/*</taskWindow>*/

fun main(args: Array<String>) {
    val n = 17
    /*<taskWindow>*/println("The number $n is ${checkSign(n)}.")/*</taskWindow>*/
}
/* Expected output:
The number 17 is positive.
*/