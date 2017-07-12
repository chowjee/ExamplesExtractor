package lists

fun getList(): List<Int> {
  return mutableListOf(1, 2, 3)
}

fun main(args: Array<String>) {
  // can't change a List:
  val list = getList()
//  list += 3
}