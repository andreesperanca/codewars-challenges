package Easy

class CheckForFactor {
    fun checkForFactor(base: Int, factor: Int): Boolean {
        var rDiv = 0
        try {
            rDiv = base%factor
        } catch (e : Exception) {
            println(e)
        }
        return rDiv == 0
    }
}
/**
 Best response = fun checkForFactor(base: Int, factor: Int) = base % factor == 0

 Testes:

 import kotlin.test.assertEquals
 import org.junit.Test

 class TestKata {
 @Test
 fun basicTests() {
 assertEquals(true, checkForFactor(10, 2))
 assertEquals(true, checkForFactor(63, 7))
 assertEquals(true, checkForFactor(2450, 5))
 assertEquals(true, checkForFactor(24612, 3))
 assertEquals(false, checkForFactor(9, 2))
 assertEquals(false, checkForFactor(653, 7))
 assertEquals(false, checkForFactor(2453, 5))
 assertEquals(false, checkForFactor(24617, 3))
 }
 }

 */

