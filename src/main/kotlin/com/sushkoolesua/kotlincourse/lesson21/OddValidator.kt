package com.sushkoolesua.kotlincourse.lesson21

class OddValidator : Validator<Int> {
    override fun validate(value: Int): Boolean {
        return value % 2 == 0
    }
}