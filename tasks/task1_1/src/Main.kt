
fun main(){
    try {
        (-3..10).step {
            howOldAmI(it)
        }
    } catch (exception: Throwable) {
        "You can't be less then 0"
    }
}


fun howOldAmI(age: Int): String {
    if (age < 0) throw excpetion

    return when (age) {
            1 -> "one"
            else -> "other"
    }
}


