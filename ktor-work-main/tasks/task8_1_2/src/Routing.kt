// Task 8.1.2: generating HTML with a DSL

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") { call.homePage() }
        get("/roll") { call.rollResults() }
    }
}
