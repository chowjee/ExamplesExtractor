package enumerations

import com.atomickotlin.test.eq
import enumerations.Level.*

enum class Level {
  Overflow, High, Medium, Low, Empty
}

fun main(args: Array<String>) {
  Level.Medium eq "Medium"     // [1]

  Medium eq "Medium"           // [2]

  Level.values().toList() eq   // [3]
      listOf(Overflow, High,
          Medium, Low, Empty)

  checkLevel(Low) eq "Level Low OK"
  checkLevel(Empty) eq "Alert: Empty"
  checkLevel(Overflow) eq ">>> Overflow!"

  Level.values().map { "${it.ordinal} - $it" } eq
      listOf("0 - Overflow", "1 - High", "2 - Medium", "3 - Low", "4 - Empty")

}

fun checkLevel(level: Level) = when (level) {
  Overflow -> ">>> Overflow!"
  Empty -> "Alert: Empty"
  else -> "Level $level OK"
}
