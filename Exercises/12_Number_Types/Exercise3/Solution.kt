package numberTypes3

fun convertFahrenheitToCelsius(f: Int): Double =
        /*<taskWindow>*/(f - 32) * (5.0 / 9)/*</taskWindow>*/

fun convertCelsiusToFahrenheit(c: Int): Double =
        /*<taskWindow>*/c * (9.0 / 5) + 32/*</taskWindow>*/

fun main(args: Array<String>) {
    println(convertFahrenheitToCelsius(68)) // 20.0
    println(convertCelsiusToFahrenheit(20)) // 68.0
}