// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val center: Point, val r: Double) {
    init{
        require(r > 0) {"Raduis must be greater than 0"}
    }
    fun area() = (PI * (r * r))
    fun perimeter() = (PI * 2.0 * r)
    fun contains(point: Point): Boolean{
        if (point.distanceTo(center) > r){
            return false
        }
        else {
            return true
        }
    }

}