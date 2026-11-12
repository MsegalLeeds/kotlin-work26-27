// Task 6.7

import io.ktor.server.pebble.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.v1.jdbc.transactions.suspendTransaction

suspend fun RoutingCall.artistsPage() {
    suspendTransaction {
        // Write code here that acquires details of all the artists,
        // sorted by name, and then passes these details in a map
        // to respondTemplate()
        respondTemplate("artists.peb", emptyMap())
    }
}
