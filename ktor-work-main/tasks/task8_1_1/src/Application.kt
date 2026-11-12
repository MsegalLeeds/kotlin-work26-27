// Task 8.1.1: generating HTML with a DSL

import io.ktor.server.application.*

fun Application.module() {
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
