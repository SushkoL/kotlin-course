package com.sushkoolesua.kotlincourse.lesson21

class StringValidator : Validator<String?> {
    override fun validate(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}