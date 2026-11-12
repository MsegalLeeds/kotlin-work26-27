// Task 4.9: error handling

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.request.*

fun Application.configureErrorHandling() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, status ->
            call.respondTemplate("not-found.peb", mapOf(
                "status" to status,
                "path" to call.request.path()
            ))
        }

        exception<Throwable> { call, error ->
            call.respondTemplate("error.peb", mapOf("error" to error))
        }
    }
}
