// Task 5.2.1: main program

fun main(args: Array<String>){
    if (args.size != 1){
        println("Error: Expected 1 input")
        return
    }
    System.out.printf("Circle area is %.4f\n", circleArea(args[0].toDouble()))
    System.out.printf("Circle perimeter is %.4f\n", circlePerimeter(args[0].toDouble()))
}