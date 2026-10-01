// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.rendering.TextColors.Companion.rgb


fun main(args: Array<String>) {
    val t = Terminal()
    var tempCelcuis = 0.0
    while (tempCelcuis < 100) {
        val tempFahrenheit = (tempCelcuis * 1.8) + 32
        t.println(table {
            borderStyle = rgb("#4b25b9")
            header {
                style = bold + brightBlue
                row("Celsius", "Fahrenheit")
            }
            body {
                style = brightGreen
                row(tempCelcuis, tempFahrenheit)
            }
        })
        //println("%5.1f %6.1f".format(tempCelcuis, tempFahrenheit))
        tempCelcuis += 3
    }
}
