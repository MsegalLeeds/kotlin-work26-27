// Task 6.5: populating & querying tables using Exposed's SQL DSL

import org.jetbrains.exposed.v1.core.ReferenceOption
import org.jetbrains.exposed.v1.core.dao.id.IntIdTable

object AlbumTable : IntIdTable() {
    val artist = reference("artist_id", ArtistTable, ReferenceOption.CASCADE)
    val title = varchar("title", MAX_VARCHAR_LENGTH)
    val year = integer("year")
    val spotify = varchar("spotify_url", MAX_VARCHAR_LENGTH).nullable()
}
