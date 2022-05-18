package Easy

class StringRepeat {
        fun repeatStr(r: Int, str: String) : String =
            StringBuffer(str).repeat(r)
}

/**
 Best response = fun repeatStr(r: Int, str: String) : String = str.repeat(r)

 Testes:
 import kotlin.test.assertEquals
 import org.junit.Test

 class TestExample {
 @Test fun test4a() {
 assertEquals("aaaa", repeatStr(4, "a"))
 }
 @Test fun test3Hello() {
 assertEquals("HelloHelloHello", repeatStr(3, "Hello"))
 }
 @Test fun test5empty() {
 assertEquals("", repeatStr(5, ""))
 }
 @Test fun test0kata() {
 assertEquals("", repeatStr(0, "kata"))
 }
 }
 */

