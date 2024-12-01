package com.sushkoolesua.kotlincourse.lesson25.homework

/*
Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
По аналогии с предыдущим заданием выполни трансформации и проверки.
Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()
 */

fun task4(num: Long): Int {
    return num.toString().sumOf { it.digitToInt() }
}

fun main() {

    val task44 = fun(num: Long): Int {
        return num.toString().sumOf { it.digitToInt() }
    }

    val task444: (Long) -> Int = { num ->
        num.toString().sumOf { it.digitToInt() }
    }

    val task4444 = { num: Long ->
        num.toString().sumOf { it.digitToInt() }
    }

    println(task44(1323244335454L))
    println(task444(2424343543654765L))
    println(task4444(234223353L))

}