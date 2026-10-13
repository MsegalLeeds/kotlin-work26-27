// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val data: List<Record> = fetchData(args[0])
        .map{line ->
            val parts = line.split(",")
            parts[0].trim() to parts[1].trim().toDouble()
        }

    val avg = data.map {it.second}.average()
    println("Average temp is $avg")
    println("Temp range is ${rangeTemp(data)}")

}
