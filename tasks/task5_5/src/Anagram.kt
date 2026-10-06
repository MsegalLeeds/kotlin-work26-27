// Task 5.1.1: anagrams() function

infix fun String.anagramOf(str: String): Boolean {
    if (this.length != str.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = str.lowercase().toList().sorted()
    return firstChars == secondChars
}