package Medium

object KataSolution {
    fun multiplicationTable(size: Int) = Array<IntArray>(size) { i ->
        (1..size).map { it * (i + 1) }.toIntArray()
    }
}

fun main() {
    KataSolution.multiplicationTable(3)
}