package Medium

import java.nio.CharBuffer
import kotlin.concurrent.fixedRateTimer

fun accum(s: String): String {
    val arrC = s.toCharArray()
    var rStr = arrayListOf<String>()
    for (i in arrC.indices) {

        rStr.add(arrC[i].toUpperCase()+StringBuffer(arrC[i].toString()).repeat((i)).toLowerCase())
    }
    return  rStr.joinToString("-")
}

fun main() {
    println(accum("ZpglnRxqenU"))
}

/**
 Best Response :

 fun accum(s:String):String =s.mapIndexed { index, char ->
 char.toUpperCase() + char.toString().toLowerCase().repeat(index)
 }.joinToString("-")

 Testes:

 package accum

 import org.junit.Assert.*
 import org.junit.Test
 class AccumulTest {
 private fun testing(actual:String, expected:String) {
 assertEquals(expected, actual)
 }
 @Test
 fun test() {
 println("Fixed Tests accum")
 testing(accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
 testing(accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")

 }

 }

 */