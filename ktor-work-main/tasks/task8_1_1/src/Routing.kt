// Task 8.1.1: generating HTML with a DSL

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.http.HttpStatusCode
import io.ktor.server.html.respondHtml
import kotlinx.html.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondHtml(HttpStatusCode.OK) {
                head {
                    title { +"Hello" }
                }
                body {
                    h1 { +"Hello World!" }
                    p { +"This page was created by kotlinx.html." }
                    p { +"kotlinx.html provides a DSL to generate HTML elements." }
                }
            }
        }
    }
}
