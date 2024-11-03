package com.sushkoolesua.kotlincourse.lesson18.homework.shapes

import kotlin.math.PI

class Circle(
    val radius : Double
) : Shape() {
    override fun area(): Double {
        return  PI * (radius * radius)
    }
}