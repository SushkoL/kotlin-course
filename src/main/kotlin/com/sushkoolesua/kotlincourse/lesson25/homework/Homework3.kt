package com.sushkoolesua.kotlincourse.lesson25.homework

/*
Задание 3. Создай функцию, которая принимает список строк и число, а возвращает список из строк, длина которых больше
или равна заданному числу. Если список пуст, нужно выкинуть исключение.
По аналогии с предыдущим заданием выполни трансформации и проверки
*/

fun task3(list: List<String>, num: Int): List<String> {
    require(list.isNotEmpty()) { throw Exception("List is empty") }
    return list.filter { it.length >= num }
}

fun main () {

    val task33 = fun(list: List<String>, num: Int): List<String> {
        require(list.isNotEmpty()) { throw Exception("List is empty") }
        return list.filter { it.length >= num }
    }

    val task333: (List<String>,Int) -> List<String> = { list, num ->
        require(list.isNotEmpty()) { throw Exception ("List is empty") }
        list.filter { it.length >= num }
    }

    val task3333 = { list: List<String>, num: Int ->
        require(list.isNotEmpty()) { throw Exception ("List is empty") }
        list.filter { it.length >= num }
    }


    println(task333(listOf("sffd", "sfdggf", "ffbfb", "sfewgvg"), 3))
    println(task33(listOf("sdsf","wfs"), 4))
    println(task3333(listOf(),2))

}