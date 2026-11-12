// Task 7.1: password authentication

import kotlin.system.exitProcess

fun usage() {
    println("Error: invalid command line!")
    println("Provide username and password to simulate a login")
    println("Precede those args with --register to register a user")
    exitProcess(1)
}

fun main(args: Array<String>) {
   when (args.size) {
       3 if args[0] == "--register" -> register(args[1], args[2])
       2 -> login(args[0], args[1])
       else -> usage()
   }
}
