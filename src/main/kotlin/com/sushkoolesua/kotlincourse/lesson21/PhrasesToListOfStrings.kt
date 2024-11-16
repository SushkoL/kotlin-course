package com.sushkoolesua.kotlincourse.lesson21

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun mapper(element: String): List<String> {
        return element.split(" ")
    }

    override fun mapperList(element: List<String>): List<List<String>> {
        return element.map { it.split(" ") }
    }
}