// Set up application routing & request handling

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.util.getOrFail

fun Application.configureRouting() {
    routing {
        get("/") { call.homePage() }
        get("/register") { call.registrationPage() }
        post("/register") { call.registerUser() }
        get("/login") { call.loginPage() }
        authenticate("auth-form") {
            post("/login") { call.login() }
        }
        authenticate("auth-session") {
            get("/private") { call.privatePage() }
            get("/logout") { call.logout() }
        }
    }
}

suspend fun RoutingCall.homePage() {
    respondTemplate("home.peb", model = mapOf("users" to UserDatabase.size))
}

suspend fun RoutingCall.registrationPage() {
    respondTemplate("register.peb", model = emptyMap())
}

suspend fun RoutingCall.registerUser() {
    val credentials = getCredentials()
    val result = runCatching {
        UserDatabase.addUser(credentials)
    }
    if (result.isSuccess) {
        application.log.info("User ${credentials.name} registered")
        respondRedirect("/")
    }
    else {
        val error = result.exceptionOrNull()?.message ?: ""
        respondTemplate("register.peb", model = mapOf("error" to error))
    }
}

suspend fun RoutingCall.getCredentials(): UserPasswordCredential {
    val formParams = receiveParameters()
    val username = formParams.getOrFail("username")
    val password = formParams.getOrFail("password")
    return UserPasswordCredential(username, password)
}

suspend fun RoutingCall.loginPage() {
    respondTemplate("login.peb", model = emptyMap())
}

suspend fun RoutingCall.login() {
    val username = principal<UserIdPrincipal>()?.name.toString()
    application.log.info("User $username logged in")
    sessions.set(UserSession(username, 1))
    respondRedirect("/private")
}

suspend fun RoutingCall.privatePage() {
    val session = principal<UserSession>()
    // Increment visit count & update session cookie
    sessions.set(session?.copy(count = session.count + 1))

    respondTemplate("private.peb", model = mapOf(
        "username" to session?.username.toString(),
        "visits" to (session?.count ?: 0),
    ))
}

suspend fun RoutingCall.logout() {
    val username = principal<UserSession>()?.username.toString()
    application.log.info("User $username logged out")
    sessions.clear<UserSession>()
    respondRedirect("/")
}
