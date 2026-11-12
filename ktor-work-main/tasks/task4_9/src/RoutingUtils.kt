// Task 4.9: error handling

import io.ktor.server.request.*
import io.ktor.server.routing.*

val RoutingCall.numDice get() = queryParameters["num_dice"]?.toInt() ?: 1
val RoutingCall.dieSides get() = queryParameters["die_sides"]?.toInt() ?: 6
val RoutingCall.uri get() = request.path() + "?" + request.queryString()
