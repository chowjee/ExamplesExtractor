package classesAndObjects5

fun isPalIgnoreCase(s: SimpleString): Boolean {
    /*<taskWindow>*/for (i in 0..s.length - 1) {
        val first = s.get(i).toLowerCase()
        val second = s.get(s.length - 1 - i).toLowerCase()
        if (first != second) return false
    }
    return true/*</taskWindow>*/
}
