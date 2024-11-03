package com.sushkoolesua.kotlincourse.lesson17

open class Furniture (
    val cost: Double,
    val material: String,
    val weight: Int
)

open class HomeFurniture (
    cost: Double,
    material: String,
    weight: Int,
    val forRoom: String
) : Furniture (cost, material, weight)

class KitchenSet (
    cost: Double,
    material: String,
    weight: Int,
    forRoom: String,
    val numberShelves: Int
) : HomeFurniture (cost, material, weight, forRoom)