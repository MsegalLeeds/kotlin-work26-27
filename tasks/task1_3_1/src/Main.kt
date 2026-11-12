// Task 1.3.1

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.terminal.Terminal

fun main() {
    val term = Terminal(AnsiLevel.TRUECOLOR)

    val helloStyle = italic + underline + yellow
    term.println(helloStyle("HELLO WORLD!"))

    val date = today()
    val dateStyle = bold + green
    term.println(dateStyle("Today is $date"))
}


fun printTime(time: Time) {
    val time = time.now()
    return if (time < NOON) {
        "Good morning Julia $time"
    } else {
        "Good afternoon Juia $time"
    }
}

//
JUNIt

@Test
fun testMorning() {
    val mockTime: Time = mock()
    whenever(mockTime.now()).thenReturn("10:00")

    val actual printTime(mockTime)

    assertEquals("Good morning Julia 10:00", actual)
}

@Test
fun testAfternoon() {
    val mockTime: Time = mock()
    whenever(mockTime.now()).thenReturn("14:00")

    val actual printTime(mockTime)

    assertEquals("Good morning Julia 14:00", actual)
}