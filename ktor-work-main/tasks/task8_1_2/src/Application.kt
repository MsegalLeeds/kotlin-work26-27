// Task 8.1.2: generating HTML with a DSL

import io.ktor.server.application.Application

fun Application.module() {
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
