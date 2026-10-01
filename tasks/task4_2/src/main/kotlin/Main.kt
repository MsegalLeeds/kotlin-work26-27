// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU\n" +
            "\n" +
            "(a) Margherita\n" +
            "(b) Quattro Stagioni\n" +
            "(c) Seafood\n" +
            "(d) Hawaiian\n" +
            "\n" +
            "Choose your pizza (a-d):"
    )
    val userAnswer = readln().lowercase()
    if (userAnswer in "a".."d"){
        println("Order accepted")
    }
    else {
        println("Invalid choice!")
    }
}
