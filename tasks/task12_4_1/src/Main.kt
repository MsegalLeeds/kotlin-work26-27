// Task 12.4.1: main program
fun main(){
    var center = Point(3.0, 4.0)
    var circle = Circle(center, 4.0)
    println(circle.area())
    println(circle.perimeter())
    var point = Point(4.0, 12.0)
    println(circle.contains(point))
}