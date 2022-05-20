package Easy

fun reverseLetter(str: String): String {
    var arr = mutableListOf<Char>()
    str.reversed().toCharArray().forEach {
        if (it.isLetter()) {
            arr.add(it)
        }
    }

    return arr.joinToString("")
}


/**
 BEST RESPONSE:

 fun reverseLetter(str: String): String {
 return str.filter(Char::isLetter).reversed()
 }

 TESTES:

 import kotlin.test.assertEquals
 import org.junit.Test

 class TestReverseLetter {
 @Test
 fun `Basic Tests` () {
 val str = "krishan"
 assertEquals("nahsirk", reverseLetter("krishan"))
 assertEquals("nortlu", reverseLetter("ultr53o?n"))
 assertEquals("cba", reverseLetter("ab23c"))
 assertEquals("nahsirk", reverseLetter("krish21an"))
 }
 }


 */