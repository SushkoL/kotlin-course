package com.sushkoolesua.kotlincourse.lesson18.homework.printers

import com.sushkoolesua.kotlincourse.lesson18.homework.Background
import com.sushkoolesua.kotlincourse.lesson18.homework.Colors
import com.sushkoolesua.kotlincourse.lesson18.homework.printColored

class InkjetPrinter () : Printer () {
    val colorPairs = listOf(
        Colors.YELLOW to Background.RED,
        Colors.RED to Background.BLUE,
        Colors.BLUE to Background.GREEN,
        Colors.PURPLE to Background.WHITE,
        Colors.CYAN to Background.YELLOW,
        Colors.BLACK to Background.RESET,
        Colors.RESET to Background.CYAN
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var colorIndex = 0
        for (w in words) {
            val (textColor, backgroundColor) = colorPairs[colorIndex % colorPairs.size]
            printColored(w, textColor, backgroundColor)
            colorIndex++
        }
    }
}