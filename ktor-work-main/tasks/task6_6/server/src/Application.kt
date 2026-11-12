// Task 6.6

import io.ktor.server.application.Application
import org.jetbrains.exposed.v1.jdbc.transactions.TransactionManager

fun Application.module() {
    TransactionManager.defaultDatabase = MusicDatabase.db
    configureTemplates()
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
