package colorblend

import paintcolors.Color
import paintcolors.Color.*

fun blend(a: Color, b: Color) = when {
  a == b -> a
  a == brown || b == brown -> brown
  else -> when (a to b) {
    red to blue, blue to red -> purple
    red to yellow, yellow to red -> orange
    blue to yellow, yellow to blue -> green
    else -> {
      // Interesting, not accurate:
      val values = Color.values()
      values[(a.ordinal + b.ordinal) % values.size]
    }
  }
}