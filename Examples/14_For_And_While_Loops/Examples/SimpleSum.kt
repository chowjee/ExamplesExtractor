package forandwhile

fun main(args: Array<String>) {
  var sum = 0
  for (n in 10..100) {
    sum += n
  }
  println("sum = $sum")  // sum = 5005
}