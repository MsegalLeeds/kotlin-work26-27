// Task 8.1.2: generating HTML with a DSL

import io.ktor.server.request.*
import io.ktor.server.routing.*

val RoutingCall.numDice get() = queryParameters["num_dice"]?.toInt() ?: 1
val RoutingCall.dieSides get() = queryParameters["die_sides"]?.toInt() ?: 6
val RoutingCall.repeat_uri get() = request.path() + "?" + request.queryString()
