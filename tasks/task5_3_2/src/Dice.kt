// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(numDice: Int = 1, sides: Int = 6) {
    if (numDice in 1..10 && sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling $numDice d$sides...")
        for (i in 1..numDice) {
            val result = Random.nextInt(1, sides + 1)
            println("Die $i: $result")
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}