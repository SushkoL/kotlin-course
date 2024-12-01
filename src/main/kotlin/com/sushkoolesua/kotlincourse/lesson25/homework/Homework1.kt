package com.sushkoolesua.kotlincourse.lesson25.homework

/*
Задание 1. Создай константу в файле с текстом. Создай функцию, которая ничего не принимает и не возвращает и печатает
в консоль текст константы.
Создай аналогичную анонимную функцию.
Создай аналогичное лямбда выражение с указанием типа.
Создай лямбда выражение без указания типа.
Проверь как функция работает
*/

const val CONST = "This is constanta for task1"

fun main () {

    fun task() {
        println(CONST)
    }

    val task1 = fun() {
        println(CONST)
    }

    val task11: () -> Unit = {
        println(CONST)
    }

    val task111 = {
        println(CONST)
    }

    task()
    task1()
    task11()
    task111()
}