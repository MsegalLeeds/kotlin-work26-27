// Task 6.5: querying a database using Exposed's SQL DSL

import org.jetbrains.exposed.v1.core.*
import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    // Count numbers of artists & albums in database

    val numArtists = transaction(MusicDatabase.db) {
        ArtistTable.selectAll().count()
    }
    println("Number of artists: $numArtists")

    val numAlbums = transaction {
        AlbumTable.selectAll().count()
    }
    println("Number of albums: $numAlbums")

    transaction {
        // Find & display all the bands in the database

        // Find & display details of all albums recorded after a specific year

    }
}
