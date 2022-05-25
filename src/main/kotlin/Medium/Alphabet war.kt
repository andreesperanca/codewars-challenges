package Medium

fun alphabetWar(fight: String): String {
    var left = 0
    var right = 0
    val fArr = fight.toCharArray()

    for (element in fArr) {
        when (element) {
            'w' -> left += 4
            'p' -> left += 3
            'b' -> left += 2
            's' -> left += 1
            'm' -> right += 4
            'q' -> right += 3
            'd' -> right += 2
            'z' -> right += 1
            else -> right += 0
        }
    }
    if (right > left) {
        return "Right side wins!"
    } else if (left > right) {
        return "Left side wins!"
    } else {
        return "Let's fight again!"
    }
}

fun main() {
    println(alphabetWar("wwwwww"))

}

/**
 Best response :

 fun alphabetWar(fight: String): String {
 val forces = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1, 'm' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
 val result = fight.sumBy { forces.getOrDefault(it, 0) }
 return when {
 result > 0 -> "Left side wins!"
 result < 0 -> "Right side wins!"
 else -> "Let's fight again!"
 }
 }

 Testes:

 import kotlin.test.assertEquals
 import org.junit.Test

 class TestExample {
 @Test
 fun testFixed() {
 assertEquals("Right side wins!", alphabetWar("z"))
 assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
 assertEquals("Right side wins!", alphabetWar("zzzzs"))
 assertEquals("Left side wins!", alphabetWar("wwwwww"))
 }
 }

 */