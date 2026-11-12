// Task 6.6

import org.jetbrains.exposed.v1.dao.IntEntity
import org.jetbrains.exposed.v1.dao.IntEntityClass
import org.jetbrains.exposed.v1.core.dao.id.EntityID

class Artist(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Artist>(ArtistTable)

    var name by ArtistTable.artistName
    var isSolo by ArtistTable.isSolo
    var info by ArtistTable.info
    val albums by Album referrersOn AlbumTable.artist
}
