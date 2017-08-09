package chapterLength

import atoms.Atoms

fun main(args: Array<String>) {
  val atomSizes = Atoms().atomInfoList.associate { it.name.substring(0, 2).toInt() to it.markdownFile.readLines().size }
  println(atomSizes)
  println("average: " + atomSizes.values.toList().average())
  val range = 6..17
  println("average for $range: " + range.map { atomSizes.getValue(it) }.toList().average())
}
