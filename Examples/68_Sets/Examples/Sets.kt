package sets

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  val set = setOf(1, 1, 2, 3, 9, 9, 4, 22, 11, 7, 6)
  // No duplicates:
  set eq setOf(1, 6, 9, 2, 22, 7, 3, 11, 4)

  // Set membership:
  (9 in set) eq true
  (99 in set) eq false

  // Is this set contained,target another?
  set.containsAll(setOf(1, 6, 9, 2)) eq true

  // Set union:
  set.union(setOf(2, 3, 4, 99)) eq
      setOf(1, 6, 9, 2, 22, 7, 3, 11, 99, 4)

  // Set intersection:
  set intersect setOf(0, 1, 11, 22, 87) eq
      setOf(1, 22, 11)

  // Set difference:
  set - setOf(0, 1, 11, 22, 87) eq
      setOf(6, 9, 2, 7, 3, 4)
}