package com.sushkoolesua.kotlincourse.lesson21

class ListHolder <T> (var elem: MutableList <T>) {
    fun addElement(element: T) {
        elem.add(element)
    }

    fun getElements(): List<T> {
        return elem
    }
}