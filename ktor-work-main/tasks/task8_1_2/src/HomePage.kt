// Task 8.1.2: generating HTML with a DSL

import io.ktor.server.html.respondHtmlTemplate
import io.ktor.server.routing.RoutingCall
import kotlinx.html.*

suspend fun RoutingCall.homePage() {
    respondHtmlTemplate(LayoutTemplate()) {
        titleText { +"Dice Roller" }
        content {
            h1 { +"Dice Roller" }
            form(action = "/roll", method = FormMethod.get) {
                label {
                    htmlFor = "num_dice_field"
                    +"Number of Dice"
                    numberInput {
                        id = "num_dice_field"
                        name = "num_dice"
                        min = "1"
                        value = "1"
                        required = true
                    }
                }

                label {
                    htmlFor = "die_selector"
                    +"Die to Roll"
                    select {
                        id = "die_selector"
                        name = "die_sides"
                        required = true
                        DiceRoll.VALID_DIE_SIDES.forEach {
                            option {
                                value = it.toString()
                                if (it == 6) {
                                    selected = true
                                }
                                +"d$it"
                            }
                        }
                    }
                }

                button { +"Roll Dice" }
            }
        }
    }
}
