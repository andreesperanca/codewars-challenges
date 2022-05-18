package Easy

fun getAge(yearsOld: String): Int {
    val listChars = yearsOld.toCharArray()
    return listChars[0].toString().toInt()
}

/**
 * Testes:
package basic
import kotlin.test.assertEquals
import org.junit.Test


class TestAge {

@Test
fun basicTests() {

assertEquals(4, ParseIntCharProblem().Easy.getAge("4 years old"));
assertEquals(5, ParseIntCharProblem().Easy.getAge("5 years old"));
assertEquals(7, ParseIntCharProblem().Easy.getAge("7 years old"));

}
}
 */

