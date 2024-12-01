package com.sushkoolesua.kotlincourse.lesson25.homework

/*
Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
С помощью require проверь, что список не пустой.
Создай аналогичную анонимную функцию.
Создай аналогичное лямбда выражение с указанием типа.
Создай лямбда выражение без указания типа.
Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).
*/

fun task2(list: List<Int>): Double{
    require(list.isNotEmpty())
    return list.average()
}

fun main () {

    val task22 = fun (list: List<Int>): Double {
        require(list.isNotEmpty())
        return list.average()
    }

    val task222: (List<Int>) -> Double = {
        require(it.isNotEmpty())
        it.average()
    }

    val task2222 = { list: List<Int> ->
        require(list.isNotEmpty())
        list.average()
    }

    println(task22(listOf(1,3,4,5,6,7,8)))
    //println(task222(listOf()))
    println(task2222(listOf(10,20,30,40,50,60)))
}