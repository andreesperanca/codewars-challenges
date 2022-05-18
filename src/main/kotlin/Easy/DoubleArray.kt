package Easy

class DoubleArray {

    fun maps(x: IntArray): IntArray = x.map {it * 2}.toIntArray()

}

/**
 Testes :

 import org.junit.Test
 import org.junit.Assert.*;

 class TestExample {
 @Test
 fun `Basic Tests`() {
 assertArrayEquals(intArrayOf(2, 4, 6), maps(intArrayOf(1, 2, 3)))
 assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), maps(intArrayOf(4, 1, 1, 1, 4)))
 assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), maps(intArrayOf(2, 2, 2, 2, 2, 2)))
 }
 }
wR
 */