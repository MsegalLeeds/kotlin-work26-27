// Task 6.5: populating database tables using Exposed's SQL DSL

import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    transaction(MusicDatabase.db) {
        // Start from empty tables

        SchemaUtils.drop(ArtistTable, AlbumTable)
        SchemaUtils.create(ArtistTable, AlbumTable)

        // Add at least three artists
        val pearlJam = ArtistTable.insertAndGetId {
            it[artistName] = "Pearl Jam"
            it[isSolo] = false
            it[info] = "https://pearljam.com"
        }

        val ledZeppelin = ArtistTable.insertAndGetId {
            it[artistName] = "Led Zeppelin"
            it[isSolo] = false
            it[info] = "https://stairway.ledzeppelin.com/"
        }

        val theBeatles = ArtistTable.insertAndGetId {
            it[artistName] = "The Beatles"
            it[isSolo] = false
            it[info] = "https://www.thebeatles.com/"
        }

        // Add at least four albums

        AlbumTable.insert {
            it[title] = "Ten"
            it[artist] = pearlJam
            it[year] = 1991
        }

        AlbumTable.insert {
            it[title] = "Rubber Soul"
            it[artist] = theBeatles
            it[year] = 1965
        }

        AlbumTable.insert {
            it[title] = "Abbey Road"
            it[artist] = theBeatles
            it[year] = 1969
        }

        AlbumTable.insert {
            it[title] = "Houses of the Holy"
            it[artist] = ledZeppelin
            it[year] = 1973
        }


    }
}
