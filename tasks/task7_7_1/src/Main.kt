// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: Expected 1 input")
        return
    }
    println(median(readData(args[0])))
}