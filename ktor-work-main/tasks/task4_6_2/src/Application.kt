// Task 4.6.2: Pebble template inheritance

import io.ktor.server.application.Application

fun Application.module() {
    configureTemplates()
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
