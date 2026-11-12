// Task 4.4: serving JSON data

import io.ktor.server.application.Application

fun Application.module() {
    configureSerialization()
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
