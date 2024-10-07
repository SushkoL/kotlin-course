package com.sushkoolesua.kotlincourse.lesson10

import javax.print.attribute.SetOfIntegerSyntax

fun main (){

//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.

    val set1 = setOf<Int>()
    println(set1)

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val set2 = setOf(1, 2, 3)
    println(set2)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
    println(set3)

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    val set4 = mutableSetOf("Kotlin", "Java", "Scala")
    set4.add("Swift")
    set4.add("Go")
    println(set4)

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    val set5 = mutableSetOf(1, 2, 3, 4, 5)
    set5.remove(2)

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val set6 = setOf(10, 20, 30, 40, 50)
    for (i in set6) {
        println(i)
    }

 //Задание 7: Проверка Наличия Элемента в Множестве
 //Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

    val set7 = setOf("One", "Two", "Three", "Four", "Five")
    println(task7(set7, searchString = "One"))
    println(task7(set7, searchString = "Ten"))


 //Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
// Реши задачу с помощью циклов.

    val set8 = setOf("One", "Two", "Three", "Four", "Five")
    val newSet8 = setOf("Four", "Five", "Six", "Seven", "Eight")
    val resultSet8 = mutableSetOf<String>()
    for (i in set8) {
        resultSet8.add(i)
    }
    for (i in newSet8) {
        resultSet8.add(i)
    }
    println(resultSet8)

//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.

    val set9 = setOf(1,2,3,4,5,6,7)
    val secondSet9 = setOf(6,7,8,9,10)
    val searchSet9 = mutableSetOf<Int>()
    for (i in set9) {
        if (secondSet9.contains(i)) {
            searchSet9.add(i)
        }
    }
    println(searchSet9)


//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в
// первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.

    val set10 = mutableSetOf("One", "Two", "Three", "Four", "Five")
    val secondSet10 = mutableSetOf("Four", "Five", "Six", "Seven", "Eight")
    val newSet10 = mutableSetOf<String>()
    for (item in set10){

    }
    for (i in secondSet10) {

    }


//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.

    val setTask11 = mutableSetOf("Iron man", "Hulk", "Capitan America")
    val task11List = mutableListOf<String>()
    for (i in setTask11) {
        task11List.add(i)
    }
println(task11List)

}

fun task7(set:Set<String>, searchString: String) :Boolean {
    for (i in set) {
        if (i.contains(searchString)) {
            return true
        }
    }
    return false
}