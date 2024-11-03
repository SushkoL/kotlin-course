package com.sushkoolesua.kotlincourse.lesson18.homework.printers

abstract class Printer () {
    abstract fun print(text: String)
    protected fun splitText(text: String): List<String> {
        return text.split(" ")
    }
}