package com.sushkoolesua.kotlincourse.lesson21

interface Validator<T> {

    fun validate(value: T): Boolean
}