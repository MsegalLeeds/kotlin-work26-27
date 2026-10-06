// Task 5.1.2: main program

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: Expected 1 input")
        return
    }
    println(rollDie(args[0].toInt()))
}