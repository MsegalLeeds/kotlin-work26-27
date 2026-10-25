// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
){
    init{
        require(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            "Invalid Triangle"
        }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() =  perimeter / 2

    val area: Double
        get()  {
            val s = semiPerimeter
            return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        }

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}
