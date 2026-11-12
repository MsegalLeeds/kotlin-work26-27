// Task 6.5: populating & querying tables using Exposed's SQL DSL

import org.jetbrains.exposed.v1.core.dao.id.IntIdTable

const val MAX_VARCHAR_LENGTH = 256

object ArtistTable : IntIdTable() {
    val artistName = varchar("name", MAX_VARCHAR_LENGTH).uniqueIndex()
    val isSolo = bool("is_solo").default(false)
    val info = varchar("info_url", MAX_VARCHAR_LENGTH).nullable()
}
