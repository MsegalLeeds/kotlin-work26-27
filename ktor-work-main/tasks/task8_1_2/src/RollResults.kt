// Task 8.1.2: generating HTML with a DSL

import io.ktor.server.html.respondHtmlTemplate
import io.ktor.server.routing.RoutingCall
import kotlinx.html.*

suspend fun RoutingCall.rollResults() {
    val roll = DiceRoll(numDice, dieSides)

    respondHtmlTemplate(LayoutTemplate()) {
        titleText { +"Dice Roll Result" }
        content {
            h1 { +"Result of Roll" }
            section {
                p {
                    +"You rolled "
                    strong { +roll.name }
                }
                if (roll.numDice > 1) {
                    p {
                        +"The dice values are "
                        strong { +roll.dieValues.toString() }
                    }
                    p {
                        +"The total is "
                        strong { +roll.total.toString() }
                    }
                }
                else {
                    p {
                        +"The result is "
                        strong { +roll.total.toString() }
                    }
                }
            }

            section {
                a(href = repeat_uri) {
                    role = "button"
                    +"Repeat"
                }

                entity(Entities.nbsp)

                a(href = "/") {
                    role = "button"
                    +"New Roll"
                }
            }
        }
    }
}
