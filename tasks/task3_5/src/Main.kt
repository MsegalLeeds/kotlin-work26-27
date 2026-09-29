// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("test.txt")
    filePath.writeText("Hello")
    filePath.appendText("Goodbye")
    val contents = filePath.readText()
    println(contents)
}
