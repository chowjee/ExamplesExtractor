package repetitionWithWhile1

fun sum(number: Int): Int {
    /*<taskWindow>*/var sum = 0
    var i = 0
    while (i <= number) {
        sum += i
        i++
    }
    return sum/*</taskWindow>*/
}
