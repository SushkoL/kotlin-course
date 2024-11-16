package com.sushkoolesua.kotlincourse.lesson21

class ListValidator<T: Number> : Validator <List<Number?>>{
    override fun validate(value: List<Number?>): Boolean {
        return value.all { it != null && it.toDouble() != 0.0 }
    }
}