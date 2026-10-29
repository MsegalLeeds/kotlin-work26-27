// Task 12.8.1: demo program for Day enum class
fun main(){
    println("Enter a day of the week: ")
    val day = readln()
    println(Day.valueOf(day))
}