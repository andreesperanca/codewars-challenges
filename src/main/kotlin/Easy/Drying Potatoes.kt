package Medium

fun potatoes(p0: Int, w0: Int, p1: Int): Int = Math.floor((w0 * (100-p0) / (100-p1)).toDouble()).toInt()


fun main() {
    println(potatoes(99,100,98))
}

/**

fun potatoes(p0: Int, w0: Int, p1: Int) = w0 * (100 - p0) / (100 - p1)

Testes:

package potatoes

import org.junit.Assert.*
import org.junit.Test
import java.util.Random

class PotatoesTest {
@Test
fun test() {
dotest(82, 127, 80, 114)
dotest(93, 129, 91, 100)
dotest(82, 134, 77, 104)

}
companion object {
private fun dotest(p0:Int, w0:Int, p1:Int, expected:Int) {
assertEquals(expected, potatoes(p0, w0, p1))
}
}
}

 */