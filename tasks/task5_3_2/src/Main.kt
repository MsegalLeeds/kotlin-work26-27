// Task 5.1.2: main program

fun main(args: Array<String>) {
    val delimiter = "d"
    val input = args[0]
    val Dice = input.substringBefore(delimiter)
    val Sides = input.substringAfter(delimiter)
    if (Dice.isEmpty() && Sides.isEmpty()){
        println("Will roll 1 6 sided die")
        println(rollDice())
    }
    else if (Dice.isEmpty()){
        println("Will roll 1 ${Sides.toInt()} sided die")
        println(rollDice(1, Sides.toInt()))
    }
    else if (Sides.isEmpty()){
        println("Will roll ${Dice} 6 sided dice")
        println(rollDice(Dice.toInt(), 6))
    }
    else{
        println(rollDice(Dice.toInt(), Sides.toInt()))
    }
}