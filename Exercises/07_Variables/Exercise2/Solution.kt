package exercises.variables2

fun main(args: Array<String>) {
    var x = 1
    var y = 2
    /*<taskWindow>*/
    var tmp = x
    x = y
    y = tmp/*</taskWindow>*/
    println(x)
    println(y)
}
