// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    val database = createDatabase()
    database.load(CSV_FILENAME)

    print("Enter a name: ")
    val name = readln().trim()

    val number = database[name]
    if (number != null) {
        println("$name's phone number is $number")
    }
    else {
        println("No phone number found for $name")
        println("Enter a phone number for $name")
        val newNumber = readln().trim()
        database[name] = newNumber
        database.save(CSV_FILENAME)
        println("Added $name with number as: $number")
    }
}