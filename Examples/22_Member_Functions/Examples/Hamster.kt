package memberfunctions

class Hamster {
  fun speak(): String = "squeak! "
  fun exercise(): String =
      this.speak() + speak() +
          "Running on wheel"
}

fun main(args: Array<String>) {
  val hamster = Hamster()
  println(hamster.exercise())
}
/* Output:
squeak! squeak! Running on wheel
*/
