// Task 4.9: error handling

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

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
