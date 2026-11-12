// Task 4.5.2: testing HTML responses

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import org.jsoup.Jsoup

@Suppress("Unused")
class ApplicationTest : FreeSpec({
    "Application serves HTML" {
        testApplication {
            configure()
            val response = client.get("/")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/html")
        }
    }

    "Valid title present" {
        testApplication {
            configure()
            val response = client.get("/")
            val body = response.bodyAsText()
            val titles = Jsoup.parse(body).select("head > title")
            titles shouldHaveSize 1
            titles[0].text() shouldBe "My Document"
        }
    }
})
