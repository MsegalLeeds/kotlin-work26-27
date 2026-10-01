// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3){
        println("Error: Expected 3 results")
        exitProcess(1)
    }
    val a = args[0].toInt()
    val b = args[1].toInt()
    val c = args[2].toInt()
    val avg = (a + b + c) / 3
    val grade = when (avg) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Error: Invalid grade"
    }
    println("The average is $avg and the grade is $grade")
}