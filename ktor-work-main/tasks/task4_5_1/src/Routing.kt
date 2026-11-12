// Task 4.5.1: Ktor application testing

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/hello/{name}") {
            val name = call.parameters["name"]
            call.respondText("Hello $name!")
        }
    }
}
