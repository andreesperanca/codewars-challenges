package Easy

// No Kotlin coder would ever use Arrays if they could avoid it,
// even in a challenge called "Ultimate Array Reverser."
// To paraphrase a man in a cave,
// "It's dangerous to go alone, take this [List]"
fun reverse(a: List<String>): List<String> {
    var contentsReversed = a.joinToString("").reversed()
    val output = mutableListOf<String>()
    for (word in a) {
        val newWord = contentsReversed.take(word.length)
        contentsReversed = contentsReversed.drop(word.length)
        output.add(newWord)
    }
    return output
}

/**
 Testes :

 import kotlin.test.assertEquals
 import org.junit.Test
 class ExampleTest {
 @Test
 fun fixedTest1() {
 assertEquals(listOf("!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"),
 reverse(listOf("I", "like", "big", "butts", "and", "I", "cannot", "lie!")))
 }
 @Test
 fun fixedTest2() {
 assertEquals(
 listOf("How", "many", "shrimp", "do", "you", "have", "to", "eat","before", "your", "skin", "starts", "to", "turn", "pink?"),
 reverse(listOf("?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH")))
 }
 }

 */