package chapterLength

import atoms.Atoms

fun main(args: Array<String>) {
  val atomSizes = Atoms().atomInfoList.associate { it.name to it.markdownFile.readLines().size }
  println("average: " + atomSizes.values.toList().average())
  println(atomSizes)
}
