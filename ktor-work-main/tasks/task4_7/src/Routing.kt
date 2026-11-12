// Task 4.7

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondTemplate("form.peb", emptyMap())
        }

        // Add route to handle POST requests containing form data

        // Add route to handle GET requests for URLs like /roll/3d8
    }
}
