package com.sushkoolesua.kotlincourse.lesson18.homework.shapes

class Square(
    val side : Double
) : Shape() {
    override fun area(): Double {
        return side * side
    }
}