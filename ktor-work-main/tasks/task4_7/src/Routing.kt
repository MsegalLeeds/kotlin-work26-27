// Task 4.7

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

val RoutingCall.numDice get() = queryParameters["num_dice"]?.toInt() ?: 1
val RoutingCall.dieSides get() = queryParameters["die_sides"]?.toInt() ?: 6
val RoutingCall.uri get() = request.path() + "?" + request.queryString()

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondTemplate("form.peb", emptyMap())
        }

        get("/roll") {
            val roll = DiceRoll(call.numDice, call.dieSides)
            val context = mapOf("roll" to roll, "reroll_uri" to call.uri)
            call.respondTemplate("result.peb", context)
        }

        post("/roll") {
            val parameters = call.receiveParameters()
            val numDice = parameters["num_dice"]?.toIntOrNull() ?: 1
            val dieSides = parameters["die_sides"]?.toIntOrNull() ?: 6

            val roll = DiceRoll(numDice, dieSides)
            val context = mapOf(
                "roll" to roll,
                "reroll_uri" to "/roll?num_dice=$numDice&die_sides=$dieSides"
            )

            call.respondTemplate("result.peb", context)
        }
    }
}
