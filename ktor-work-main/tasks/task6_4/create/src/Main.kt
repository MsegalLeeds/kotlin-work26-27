// Task 6.4: creating database tables

import org.jetbrains.exposed.v1.jdbc.SchemaUtils
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    transaction(MusicDatabase.db) {
        SchemaUtils.drop(ArtistTable, AlbumTable)
        SchemaUtils.create(ArtistTable, AlbumTable)
    }
}
