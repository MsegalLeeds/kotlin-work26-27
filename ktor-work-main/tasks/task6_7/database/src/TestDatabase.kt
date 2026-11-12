// Task 6.7

import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

object TestDatabase {
    const val URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;"
    const val DRIVER = "org.h2.Driver"

    val db by lazy {
        Database.connect(URL, DRIVER)
    }

    fun create() {
        transaction(db) {
            SchemaUtils.drop(ArtistTable, AlbumTable)
            SchemaUtils.create(ArtistTable, AlbumTable)

            val band = ArtistTable.insertAndGetId {
                it[artistName] = "A Band"
            }

            val soloArtist = ArtistTable.insertAndGetId {
                it[artistName] = "Doe, John"
                it[isSolo] = true
            }

            AlbumTable.insert {
                it[title] = "An Album"
                it[artist] = band
                it[year] = 2025
            }

            AlbumTable.insert {
                it[title] = "First Album"
                it[artist] = soloArtist
                it[year] = 2015
            }

            AlbumTable.insert {
                it[title] = "Second Album"
                it[artist] = soloArtist
                it[year] = 2023
            }
        }
    }
}
