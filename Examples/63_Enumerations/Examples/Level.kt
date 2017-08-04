package enumerations

import com.atomickotlin.test.eq

enum class Level {
  Overflow, High, Medium, Low, Empty
}

fun main(args: Array<String>) {
  Level.Medium eq "Medium"
}
