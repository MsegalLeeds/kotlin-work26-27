// Task 6.5: populating database tables using Exposed's SQL DSL

import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    transaction(MusicDatabase.db) {
        // Start from empty tables

        SchemaUtils.drop(ArtistTable, AlbumTable)
        SchemaUtils.create(ArtistTable, AlbumTable)

        // Add at least three artists

        // Add at least four albums

    }
}
