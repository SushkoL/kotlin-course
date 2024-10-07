package com.sushkoolesua.kotlincourse.lesson10

fun main () {


//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val number = arrayOf(1, 2, 3, 4, 5)
    println(number.toList())

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.

    val emptyArray = Array(10) { "" }
    println(emptyArray.toList())

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val arrayDouble = Array(5) { 0.0 }
    for (i in arrayDouble.indices) {
        arrayDouble[i] = i*2.0
    }
    println(arrayDouble.toList())

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его
// индексу, умноженному на 3.

    val array4 = Array(5) {0}
    for (i in array4.indices) {
        array4[i] = i*3
    }
    println(array4.toList())

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val emptyNullableArray: Array<String?> = arrayOfNulls(3)
    emptyNullableArray[0] = null
    emptyNullableArray[1] = "privet"
    emptyNullableArray[2] = "poka"
    println(emptyNullableArray.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val array6 = arrayOf(10, 20, 30, 40, 50)
    val newArray6 = Array(5) { 0 }
    for (i in array6.indices) {
        newArray6[i] = array6[i]
    }
    println(newArray6.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val array7 = arrayOf(100, 200, 300)
    val newArray7 = arrayOf(50, 100, 200)
    val resultArray = Array(3) { 0 }
    for (i in array7.indices) {
        resultArray[i] = array7[i] - newArray7[i]
    }
    println(resultArray.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
//Реши задачу через цикл while.

    val array8 = arrayOf(1,2,3,4,5,6)
    var i = 0
    while (i < array8.lastIndex) {
        if (array8[i] == 5) {
            println(array8[i])
        } else {
            println(-1)
        }
        i++
    }

//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив
// каждого элемента должно быть написано “чётное” или “нечётное”.

    val array9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in array9.indices) {
        if (array9[i] % 2 == 0)
            println("${array9[i]} - чётное")
        else {
            println("${array9[i]} - нечётное")
        }
    }

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в
// котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
    val array10 = arrayOf("раз","два","три","четыре","пять","шесть")
    println(task10(array10, "два"))
    println(task10(array10, "блииин"))

}

fun task10(array: Array<String>, search: String): String {
    for (i in array) {
        if (i.contains(search)) return i
    }
    return ("Не найдено")
}
