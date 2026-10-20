// Task 9.6: variance() function
fun variance(data: List<Double>): Double {
    require(data.size > 1) { "Not enough data!" }
    val mean = data.average()
    val sumSquaredDev = data.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (data.size - 1)
}