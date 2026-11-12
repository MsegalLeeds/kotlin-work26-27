// Task 6.7

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") { call.homePage() }
        get("/artists") { call.artistsPage() }
        get("/albums") { call.albumsPage() }
    }
}
