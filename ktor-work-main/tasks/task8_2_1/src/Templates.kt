// Task 8.2.1: single-page applications

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.pebbletemplates.pebble.loader.ClasspathLoader

fun Application.configureTemplates() {
    install(Pebble) {
        loader(ClasspathLoader().apply {
            prefix = "templates"
        })
    }
}
