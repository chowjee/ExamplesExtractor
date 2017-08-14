/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in a script or App, include:
import com.atomickotlin.test._
*/
package com.atomickotlin.test

import org.junit.Assert
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

// Log everything to "_AtomicTestErrors.txt" instead?

infix fun <T : Any> T.eq(value: String) {
  println(this)
  assertEquals(value, this.toString())
}

infix fun <T> T.eq(value: T) {
  println(this)
  assertEquals(value, this)
}

infix fun Double.eq(value: Double) {
  println(this)
  Assert.assertEquals(this, value, 0.0000001)
}

infix fun <T> Array<T>.eq(value: Array<T>) {
  println(this)
  assertTrue(Arrays.equals(this, value))
}

infix fun <T> T.neq(value: T) {
  println(this)
  assertTrue(this != value)
}