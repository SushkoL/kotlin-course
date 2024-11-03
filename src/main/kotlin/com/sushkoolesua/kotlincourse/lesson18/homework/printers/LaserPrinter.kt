package com.sushkoolesua.kotlincourse.lesson18.homework.printers

import com.sushkoolesua.kotlincourse.lesson18.homework.Background
import com.sushkoolesua.kotlincourse.lesson18.homework.Colors
import com.sushkoolesua.kotlincourse.lesson18.homework.printColored

class LaserPrinter() : Printer() {
    override fun print(text: String) {
            printColored(text, Colors.BLACK, Background.WHITE)
        }
    }