// Set up session cookies

import io.ktor.server.application.*
import io.ktor.server.sessions.*
import kotlin.io.path.*
import kotlinx.serialization.Serializable

const val KEYS_FILENAME = "session_keys.txt"

@Serializable
data class UserSession(val username: String, val count: Int)

fun Application.configureSessions() {
    val (encryptKey, signKey) = readKeys(KEYS_FILENAME)   // OK for demos
    install(Sessions) {
        cookie<UserSession>("user_session") {
            cookie.path = "/"
            cookie.maxAgeInSeconds = 60
            transform(SessionTransportTransformerEncrypt(encryptKey, signKey))
        }
    }
}

fun readKeys(filename: String): Pair<ByteArray,ByteArray> {
    val lines = Path(filename).readLines()
    val encryptKey = lines[0].hexToByteArray()
    val signKey = lines[1].hexToByteArray()
    return Pair(encryptKey, signKey)
}
