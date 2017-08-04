package extensionsForNullableTypes

import com.atomickotlin.test.eq

fun String?.isNullOrEmpty(): Boolean =
    this == null || this.isEmpty()

fun main(args: Array<String>) {
  "".isNullOrEmpty() eq true
}
