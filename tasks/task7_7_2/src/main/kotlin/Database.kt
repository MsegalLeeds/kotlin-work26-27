// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    Path(filename).forEachLine { Line ->
        val (name, number) = Line.split(",", limit = 2)
        this[name.trim()] = number.trim()
    }
}

fun Database.save(filename: String) {
    Path(filename).writer().use{ writer ->
        for ((name,number) in this) {
            writer.write("$name,$number\n")
        }
    }
}
