// Task 6.7

import org.jetbrains.exposed.v1.dao.IntEntity
import org.jetbrains.exposed.v1.dao.IntEntityClass
import org.jetbrains.exposed.v1.core.dao.id.EntityID

class Album(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Album>(AlbumTable)

    var artist by Artist referencedOn AlbumTable.artist
    var title by AlbumTable.title
    var year by AlbumTable.year
    var spotify by AlbumTable.spotify
}
