package Easy

object GrassHopper {

    fun summation(n:Int):Int {
        var sum : Int = 0
        for (i in 0..n) {
            sum += i
        }
        return sum
    }
}

/**
 Testes:

 import java.util.Random
 import org.junit.Assert.assertEquals
 import org.junit.Test

 class GrassHopperTest {
 @Test
 fun test1() {
 assertEquals(1, Easy.GrassHopper.summation(1))
 }
 @Test
 fun test2() {
 assertEquals(36, Easy.GrassHopper.summation(8))
 }
 }

 */

