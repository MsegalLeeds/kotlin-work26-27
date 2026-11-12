// Task 4.5.2: testing HTML responses

import io.ktor.server.application.Application

fun Application.module() {
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
