package com.sushkoolesua.kotlincourse.lesson25.homework


/*
Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
Создай аналогичную анонимную функцию.
Создай аналогичное лямбда выражение с указанием типа.
Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

 */

fun List<Number>.task5(): List<Number> {
    return this.distinct()
}

fun main() {

    val task55 = fun List<Number>.(): List<Number> {
        return this.distinct()
    }

    val task555: List<Number>.() -> List<Number> = {
        this.distinct()
    }

    println(task55(listOf(1,2,3,4,5,6,1,3,34,4,5,66)))
    println(task555(listOf(10,20,30,40,100,242,20,13,10)))
}