package Easy

class InvertValues {
    fun invert(arr: IntArray): IntArray {
        val iLArray = arrayListOf<Int>()
        for (element in arr) {
            iLArray.add(element *-1)
        }
        val iArray : IntArray = iLArray.toIntArray()
        return iArray
    }
}
/**
Best response:

fun invert(arr: IntArray): IntArray {
return arr.map {it * -1}.toIntArray()
}

 Testes:
fun invert(arr: IntArray): IntArray {
// code here
return arr.map {it * -1}.toIntArray()
}

import org.junit.Assert.*;
import org.junit.Test

class TestExample {
@Test
fun testFixed() {
assertArrayEquals(intArrayOf(-1,-2,-3,-4,-5), invert(intArrayOf(1,2,3,4,5)))
assertArrayEquals(intArrayOf(-1,2,-3,4,-5), invert(intArrayOf(1,-2,3,-4,5)))
assertArrayEquals(intArrayOf(), invert(intArrayOf()))
assertArrayEquals(intArrayOf(0), invert(intArrayOf(0)))
}
}
 */
