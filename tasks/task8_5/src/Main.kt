// Task 8.5: example of using a higher-order function

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expected 1 argugment")
    }
    val text = args[0]
    val vowelCount = text.howMany { it.lowercase() in "aeiou" }
    println("$vowelCount vowels found")
}
