package com.sushkoolesua.kotlincourse.lesson18.homework.shapes

import kotlin.math.sin

class Triangle(
    val sideFirst: Double,
    val sidesSecond: Double,
    val angle: Double

) :Shape() {
    override fun area(): Double {
        return (sideFirst * sidesSecond)/2 * sin(angle)
    }
}