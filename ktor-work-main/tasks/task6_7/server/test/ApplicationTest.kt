// Task 6.7

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import org.jsoup.Jsoup

@Suppress("unused")
class ApplicationTest : FreeSpec({
    "Application serves HTML for home page" {
        testApplication {
            application { testModule() }
            val response = client.get("/")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/html")
        }
    }

    "Home page reports artist & album counts correctly" {
        testApplication {
            application { testModule() }
            val response = client.get("/")
            val html = Jsoup.parse(response.bodyAsText())
            val h1 = html.select("body h1")
            h1.size shouldBe 1
            h1[0].text() shouldBe "Music Database"
            val pars = html.select("body p")
            pars.size shouldBe 1
            pars[0].text() shouldContain "2 artists"
            pars[0].text() shouldContain "3 albums"
        }
    }

    "Artists page lists artists properly" {
        testApplication {
            application { testModule() }
            val response = client.get("/artists")
            val html = Jsoup.parse(response.bodyAsText())
            val h1 = html.select("body h1")
            h1.size shouldBe 1
            h1[0].text() shouldBe "Artists"
            val li = html.select("body ul > li")
            li.size shouldBe 2
            li[0].text() shouldBe "A Band"
            li[1].text() shouldBe "Doe, John"
        }
    }
    "Albums page lists albums sorted by artist and year" {
        testApplication {
            application { testModule() }
            val response = client.get("/albums")
            val html = Jsoup.parse(response.bodyAsText())

            html.select("body h1").eachText() shouldBe listOf("Albums")

            val table = html.select("body table").single()
            table.select("th").size shouldBe 3

            val rows = table.select("tr").filter { it.select("td").isNotEmpty() }
            rows.map { it.select("td").eachText() } shouldBe listOf(
                listOf("A Band", "An Album", "2025"),
                listOf("Doe, John", "First Album", "2015"),
                listOf("Doe, John", "Second Album", "2023")
            )
        }
    }
})
