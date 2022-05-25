import kotlin.math.roundToInt

class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {
    /**
     * returns the number of items within the entire collection
     */
    val itemCount: Int
        get() {
            return collection.size
        }

    /**
     * returns the number of pages
     */
    val pageCount: Int
        get() {
            return Math.ceil(collection.size.toDouble() / itemsPerPage).toInt()
        }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int {
        val pArr = ArrayList<Int>()
        var cSize = collection.size

        if (pageIndex < 0 || pageIndex > collection.size / itemsPerPage) {
            return -1
        } else {
            for (element in collection.indices) {
                if (cSize >= itemsPerPage) {
                    pArr.add(itemsPerPage)
                    cSize -= itemsPerPage
                } else {
                    pArr.add(cSize)
                }
            }
            return pArr[pageIndex]
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        if (itemIndex > this.itemCount - 1 || itemIndex < 0) {
            return -1
        }
        return Math.round(itemIndex.toDouble() / itemsPerPage).toInt()
    }
}

fun main() {
    val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f'), 1)
    println(helper.pageCount) //should == 2
    println(helper.itemCount) //should == 6
    println(helper.pageItemCount(1))
    println(Math.ceil(10.6))
    println(Math.round(10.5))
}

/**
Best Response:

class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {

val itemCount: Int
get() = collection.size

val pageCount: Int
get() = Math.ceil(itemCount.toDouble()/itemsPerPage).toInt()

fun pageItemCount(pageIndex: Int): Int {
if(pageIndex !in (0..pageCount-1)) return -1
val diff = Math.abs(itemCount - pageIndex * itemsPerPage)
return if(diff>itemsPerPage) itemsPerPage else diff
}

fun pageIndex(itemIndex: Int): Int {
if(itemIndex !in (0..itemCount-1)) return -1
return (itemIndex+1)/itemsPerPage
}
}




Testes:

import kotlin.test.assertEquals
import org.junit.Test

class PaginationHelperTest {

@Test
fun testItemCount() {
val helper = PaginationHelper<Int>(listOf(1,2,3,4,5,6,7,8,9,10,11), 3)
assertEquals(11, helper.itemCount, "itemCount is returning incorrect value")
}

@Test
fun testPageCount() {
val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f'), 4)
assertEquals(2, helper.pageCount, "pageCount is returning incorrect value")
}
}

 */
