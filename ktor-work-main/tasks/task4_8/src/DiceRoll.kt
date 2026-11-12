// Task 4.8: organizing routes

import kotlin.random.Random

class DiceRoll(val numDice: Int = 1, val dieSides: Int = 6) {
    companion object {
        val VALID_DIE_SIDES = setOf(4, 6, 8, 10, 12, 20)
    }

    private val results = mutableListOf<Int>()

    init {
        require(numDice > 0) { "Invalid number of dice: $numDice" }
        require(dieSides in VALID_DIE_SIDES) { "Invalid sides: $dieSides" }
        repeat(numDice) {
            results.add(Random.nextInt(dieSides) + 1)
        }
    }

    val name get() = "${numDice}d${dieSides}"

    val total get() = results.sum()

    val dieValues get() = results.toList().sorted()

    operator fun get(index: Int) = results[index]

    override fun toString() = "$name: $results"
}
