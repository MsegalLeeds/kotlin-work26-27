// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>){
    val file = args[0]
    var lineNumber = 0
    var longestLineNumber = 0
    var longestLength = 0
    for (line in Path(file).readLines()){
        lineNumber++
        if (line.length > longestLength){
            longestLength = line.length
            longestLineNumber = lineNumber
        }
    }
    println("Line $longestLineNumber is the longest (length = $longestLength)")

}
