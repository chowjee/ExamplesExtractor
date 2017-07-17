package extensionfunctions

import com.atomickotlin.test.eq

data class Book(val title: String)

fun Book.categorize(category: String) =
    "$this, category: $category"

fun main(args: Array<String>) {
  Book("Dracula").categorize("Vampire") eq
      "Book(title=Dracula), category: Vampire"
}