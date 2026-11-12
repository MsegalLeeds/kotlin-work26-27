// Task 8.2.2: single-page applications

import io.ktor.server.application.Application

fun Application.module() {
    configureTemplates()
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
