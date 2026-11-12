// Task 6.6

import io.ktor.server.pebble.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.v1.jdbc.transactions.suspendTransaction

suspend fun RoutingCall.homePage() {
    suspendTransaction {
        val context = mapOf(
            "num_artists" to Artist.count(),
            "num_albums" to Album.count()
        )
        respondTemplate("home.peb", context)
    }
}
