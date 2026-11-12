// Task 6.5: populating & querying tables using Exposed's SQL DSL

import org.jetbrains.exposed.v1.jdbc.Database

object MusicDatabase {
    const val URL = "jdbc:h2:./music"
    const val DRIVER = "org.h2.Driver"

    val db by lazy {
        Database.connect(URL, DRIVER)
    }
}
