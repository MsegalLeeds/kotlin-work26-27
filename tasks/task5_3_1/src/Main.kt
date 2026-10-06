// Task 5.1.2: main program

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Will roll a six-sided die")
        println(rollDie(6))
    }
    else{
        println(rollDie(args[0].toInt()))
    }
}