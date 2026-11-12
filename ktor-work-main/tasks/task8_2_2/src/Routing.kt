// Task 8.2.2: single-page applications

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val context = mapOf("valid_sides" to DiceRoll.VALID_DIE_SIDES)
            call.respondTemplate("home.peb", context)
        }

        post("/") {
            val (numDice, dieSides) = call.diceParameters()
            val context = mapOf("roll" to DiceRoll(numDice, dieSides))
            call.respondTemplate("results.peb", context)
        }
    }
}

suspend fun RoutingCall.diceParameters(): Pair<Int,Int> {
    val params = receiveParameters()
    val numDice = params["num_dice"]?.toInt() ?: 1
    val dieSides = params["die_sides"]?.toInt() ?: 6
    return numDice to dieSides
}
