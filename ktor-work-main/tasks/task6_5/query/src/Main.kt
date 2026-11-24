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
        // Find & display all the bands
        ArtistTable.selectAll()
            .where { ArtistTable.isSolo eq false }
            .forEach { row ->
                println(row[ArtistTable.artistName])
            }

        // Find & display albums recorded after 1970
        val cutoffYear = 1970

        (AlbumTable innerJoin ArtistTable)
            .selectAll()
            .where { AlbumTable.year greater cutoffYear }
            .forEach { row ->
                val artist = row[ArtistTable.artistName]
                val title = row[AlbumTable.title]
                val year = row[AlbumTable.year]
                println("$artist - $title ($year)")
            }
    }
}
