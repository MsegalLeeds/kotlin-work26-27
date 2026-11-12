// Task 4.6.2: Pebble template inheritance

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
            call.respondTemplate("form.peb", emptyMap())
        }

        get("/roll") {
            val roll = DiceRoll(call.numDice, call.dieSides)
            val context = mapOf("roll" to roll, "reroll_uri" to call.uri)
            call.respondTemplate("result.peb", context)
        }
    }
}
