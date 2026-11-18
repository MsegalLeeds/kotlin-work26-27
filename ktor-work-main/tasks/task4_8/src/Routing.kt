// Task 4.8: organizing routes

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

// Extension properties to simplify request handling

val RoutingCall.numDice get() = queryParameters["num_dice"]?.toInt() ?: 1
val RoutingCall.dieSides get() = queryParameters["die_sides"]?.toInt() ?: 6
val RoutingCall.uri get() = request.path() + "?" + request.queryString()

// Routing configuration


fun Application.configureRouting() {
    routing {
        get("/") {
            call.diceForm()
        }
        get("/roll") {
            call.rollResult()
        }
    }
}

suspend fun RoutingCall.diceForm() {
    respondTemplate("form.peb", emptyMap())
}

suspend fun RoutingCall.rollResult() {
    val roll = DiceRoll(numDice, dieSides)
    val context = mapOf("roll" to roll, "reroll_uri" to uri)
    respondTemplate("result.peb", context)
}

