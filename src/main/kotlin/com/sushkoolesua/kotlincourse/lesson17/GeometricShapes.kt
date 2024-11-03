package com.sushkoolesua.kotlincourse.lesson17

open class GeometricShapes (
    val area: Int,
    val perimeter: Int
)

open class Polygon (
    area: Int,
    perimeter: Int,
    val numberAngles: Int
) : GeometricShapes(area, perimeter)


class Quadrangle (
    area: Int,
    perimeter: Int,
    numberAngles: Int,
    val degreeAngle: Int
) : Polygon (area,perimeter,4)

open class Circle (
    area: Int,
    perimeter: Int,
    val radius: Int
) : GeometricShapes (area, perimeter)
