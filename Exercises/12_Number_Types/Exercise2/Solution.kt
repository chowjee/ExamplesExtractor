package numberTypes2

fun main(args: Array<String>) {
    /*<taskWindow>*/
    val million: Int = 1_000_000
    val billion: Int = 1_000_000_000

    val trillion: Long = 1_000_000_000_000
    val quintillion: Long = 1_000_000_000_000_000_000

    // only in Double
    val centillion: Double = Math.pow(10.0, 303.0)

    println("Int: $million")
    println("Int: $billion")
    println("Long: $trillion")
    println("Long: $quintillion")
    println("Double: $centillion")/*</taskWindow>*/
}
