// Task 4.5.1: Ktor application testing

import io.ktor.server.application.Application

fun Application.module() {
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
