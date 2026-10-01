// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: Expected 1 input")
        exitProcess(1)
    }
    val userLimit = args[0].toInt()
    var sum = 0
    for (i in (1..userLimit) step 2){
        sum += i
    }
    println("Sum = $sum")
}
