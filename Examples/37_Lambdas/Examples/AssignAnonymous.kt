package lambdas7

fun main(args: Array<String>) {
  val later1 = { -> println("now") }
  var later2 = { println("now") }

  later1()
  later2()
}