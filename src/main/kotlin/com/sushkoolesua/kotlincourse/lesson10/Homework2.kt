package com.sushkoolesua.kotlincourse.lesson10

fun main (){

//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел

    val list1 = listOf<Int>()
    println(list1)

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val list2 = listOf("Hello", "World", "Kotlin")
    println(list2)

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    println(list3)

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    val list4 = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)
    println(list4)

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val list5 = mutableListOf("Hello", "World")
    list5.remove("World")
    println(list5)

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    val list6 = listOf(10, 20, 30, 40, 50)
    for (i in list6) {
        println(i)
    }


//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7 = listOf("if", "else", "while")
    println(list7[1])

//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на
// позиции 2 на новое значение).

    val list8 = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 8
    println(list8)

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
// Реши задачу с помощью циклов.

    val list9 = mutableListOf("one", "two", "three", "four", "five")
    val newList = mutableListOf("four", "five", "six", "seven", "eight")
    var resultList = mutableListOf<String>()
    for (i in list9) {
        resultList.add(i)
    }
    for (i in newList) {
        resultList.add(i)
    }
    println(resultList)

//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

    val list10 = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var min = 0
    var max = 0
    for (i in list10) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    println("Max Value: $max")
    println("Min Value: $min")

//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.

    val list11 = listOf(1,2,3,4,5,6,7,8,9,10)
    val freshList = mutableListOf<Int>()
    for (i in list11) {
        if (i % 2 == 0) freshList.add(i)
    }
    println(freshList)

}