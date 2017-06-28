package forandwhile6

fun condition() = Math.random() < 0.99

fun main(args: Array<String>) {
    while (condition()) {
        print(".")
    }
}
/* Sample output:
..................................
*/