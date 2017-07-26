package memberfunctions

class Cat {
  fun meow(): String = "mew!"
}

fun main(args: Array<String>) {
  val cat = Cat()
  val m1 = cat.meow()
  println(m1)
}
/* Output:
mew!
*/
