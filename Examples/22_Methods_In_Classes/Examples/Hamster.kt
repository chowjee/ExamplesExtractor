package methodsinclasses

class Hamster {
  fun speak(): String = "squeak!"
  fun exercise(): String =
      speak() + " Running on wheel"
}

fun main(args: Array<String>) {
  val hamster = Hamster()
  println(hamster.exercise())
}
/* Output:
squeak! Running on wheel
*/