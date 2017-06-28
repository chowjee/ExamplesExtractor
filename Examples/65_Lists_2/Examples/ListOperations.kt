package lists2

import com.atomickotlin.test.eq

fun testList() {
  val l = listOf(1, 7, 22, 11, 17)
  // Is there anything inside?
  l.isEmpty() eq false
  // How many elements inside?
  l.size eq 5

  // Get the first element:
  l.first() eq 1
  // Get the last element:
  l.last() eq 17
  // Get all elements after the 3rd:
  l.drop(3) eq listOf(11, 17)
  // Get all elements except last 3:
  l.dropLast(3) eq listOf(1, 7)
  // Get first 3 elements:
  l.take(3) eq listOf(1, 7, 22)
  // Get final 3 elements:
  l.takeLast(3) eq listOf(22, 11, 17)
  // Section from indices 2 up to 5:
  l.subList(2, 5) eq listOf(22, 11, 17)
  // Get the last several elements:
  l.takeLast(4) eq listOf(7, 22, 11, 17)

  // Get value at location 3:
  l[3] eq 11
  // See if it contains a value:
  l.contains(22) eq true
  l.indexOf(22) eq 2

  // Reverse the order:
  l.reversed() eq listOf(17, 11, 22, 7, 1)
  // Find the common elements:
  val l2 = listOf(1, 99, 17, 98)
  l.intersect(l2) eq setOf(1, 17)

  // Smallest and largest values:
  l.min() eq 1
  l.max() eq 22
  // Total all the values:
  l.sum() eq 58
  // "Set" forces unique values:
  l.toSet() eq setOf(1, 17, 22, 7, 11)

  // sort the values
  listOf(1, 5, 2).sorted() eq listOf(1, 2, 5)
  // Find the unique values and sort them:
  listOf(2, 2, 1).toSet().sorted() eq listOf(1, 2)
}

fun main(args: Array<String>) {
  testList()
}