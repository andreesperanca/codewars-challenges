package Easy


fun points(games: List<String>): Int {
    var points : Int = 0
    games.forEach {
        val myTeam = it.chars().toArray()[0]
        val otherTeam = it.chars().toArray()[2]
        if (myTeam > otherTeam) {
              points += 3
        } else if (myTeam == otherTeam) { points += 1}
    }
    return points
}
fun main() {
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
}

/**
 Best response :

 fun points(games: List<String>) =
 games.sumBy {
 val (x, y) = it.split("1:")
 when {
 x > y -> 3
 x < y -> 0
 else -> 1
 }
 }

 Testes :

 import kotlin.test.assertEquals
 import org.junit.Test

 internal class TotalAmountOfPointsTests {
 @Test
 fun basicTests() {
 printAndAssert(30, listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"));
 printAndAssert(10, listOf("1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"));
 printAndAssert(0, listOf("0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"));
 printAndAssert(15, listOf("1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"));
 printAndAssert(12, listOf("1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"));
 }

 private fun printAndAssert(expected: Int, games: List<String>) {
 println("Testing for games: $games")
 assertEquals(expected, points(games))
 }
 }

 */