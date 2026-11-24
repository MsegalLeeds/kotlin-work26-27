// Task 6.6

import io.ktor.server.pebble.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.v1.jdbc.transactions.suspendTransaction

suspend fun RoutingCall.artistsPage() {
    suspendTransaction(db = MusicDatabase.db) {
        // Write code here that acquires details of all the artists,
        // sorted by name, and then passes these details in a map
        // to respondTemplate()
        val artists = Artist.all().sortedBy { it.name }
        respondTemplate("artists.peb", emptyMap())
    }
}
