package Easy

class SumMixedArray {
    fun sum(mixed: List<Any>): Int {
        var r = 0
        for (element in mixed) {
            r += element.toString().toInt()
        }
        return r
    }
}

/**
 Best response:
 fun invert(arr: IntArray) = arr.map { -it }.toIntArray()

 public class MixedSum {
 public fun sum(mixed: List<Any>) = mixed.sumBy { it.toString().toInt() }
 }

 import kotlin.test.assertEquals
 import org.junit.Test

 public class SolutionTest {

 private val mixedSum = MixedSum();

 @Test
 public fun test_1() {
 assertEquals(10, mixedSum.sum(listOf(5,"5")));
 }

 @Test
 public fun test_2() {
 assertEquals(22, mixedSum.sum(listOf(9, 3, "7", "3")));
 }

 @Test
 public fun test_3() {
 assertEquals(42, mixedSum.sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)));
 }

 @Test
 public fun test_4() {
 assertEquals(41, mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
 }

 @Test
 public fun test_5() {
 assertEquals(45, mixedSum.sum(listOf("1", "5", "8", 8, 9, 9, 2, "3")));
 }

 @Test
 public fun test_6() {
 assertEquals(41, mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
 }

 @Test
 public fun test_7() {
 assertEquals(61, mixedSum.sum(listOf(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
 }
 }
 */
