// Task 6.7

import io.ktor.server.pebble.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.v1.jdbc.transactions.suspendTransaction

suspend fun RoutingCall.albumsPage() {
    suspendTransaction {
        // Write code here that acquires details of all the albums,
        // sorted by artist name and then year, and then passes these
        // details in a map to respondTemplate()
        val comparator = compareBy<Album> { it.artist.name }.thenBy { it.year }
        val albums = Album.all().sortedWith(comparator)
        respondTemplate("albums.peb", mapOf("albums" to albums))
    }
}
