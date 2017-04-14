package numberTypes4

fun convertTime(hours: Int, minutes: Int, seconds: Int): Long =
        /*<taskWindow>*/(((hours * 60L + minutes) * 60) + seconds) * 1000/*</taskWindow>*/

fun main(args: Array<String>) {
    println(convertTime(1, 30, 0))
}