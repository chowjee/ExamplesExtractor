package whilerepetition2

fun condition(i: Int) = i < 10

fun main(args: Array<String>) {
  var i = 0
  do {
    print(".")
    i++
  } while (condition(i))
}
/* Output:
..........
*/
