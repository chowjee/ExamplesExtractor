package generatingExamples

import atomInfo.Atoms
import java.io.File

fun copyAtomicTest() {
  val atoms = Atoms()

  val atomInfo = atoms.getAtomByName("Appendix_A_AtomicTest") ?:
      throw AssertionError("Atom Appendix_A_AtomicTest wasn't found")
  val atomicTest = atomInfo.examplesMap["AtomicTest.kt"] ?:
      throw AssertionError("AtomicTest.kt is not found in Appendix_A_AtomicTest")
  File("AtomicTest/AtomicTest.kt").writeText(atomicTest.readText())
}