/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in a script or App, include:
import com.atomickotlin.test.*
*/
package com.atomickotlin.test
import kotlin.system.exitProcess
import java.util.*

// Log everything to "_AtomicTestErrors.txt" instead?

private fun err(msg: String) {
  println("Error: $msg")
  exitProcess(1)
}

private fun <L, R> equals(lval: L, rval: R) {
  if (lval != rval)
    err("$lval != $rval")
}

infix fun <T: Any> T.eq(value: String) {
  println(this)
  equals(value, this.toString())
}

infix fun <T> T.eq(value: T) {
  println(this)
  equals(value, this)
}

infix fun Double.eq(value: Double) {
  println(this)
  var diff = this - value
  if(diff < 0) diff = diff * -1.0
  if(diff > 0.0000001)
    err("$this not equal to $value")
}

infix fun <T> Array<T>.eq(value: Array<T>) {
  println(this)
  equals(Arrays.equals(this, value), true)
}

infix fun <T> T.neq(value: T) {
  println(this)
  equals((this != value), true)
}
