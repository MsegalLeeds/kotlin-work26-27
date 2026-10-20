// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    try{
        println("Your datas varience is ${variance(readData(args[0]))}")
    }
    catch (error: IllegalArgumentException) {
        throw IllegalArgumentException("Error: file invalid")
    }
    catch (error : ArrayIndexOutOfBoundsException) {
        throw ArrayIndexOutOfBoundsException("No file submitted")
    }
}
