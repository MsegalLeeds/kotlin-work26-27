// Task 5.1.1: main program

fun main(args: Array<String>) {
    if (args.size != 2){
        println("Error: Expecting 2 inputs")
        return
    }
    println(anagrams(args[0], args[1]))
}