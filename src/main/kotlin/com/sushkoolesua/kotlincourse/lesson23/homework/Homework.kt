package com.sushkoolesua.kotlincourse.lesson23.homework

fun main () {

    val type = "dsdf"
    analyzeDataType(type)
    val arg = listOf(1,2,3,4,5)
    println(safeCastToList(arg))
    val arg2 = "String"
    println(getStringLengthOrZero(arg2))
    val date = "5"
    println(square(date))
    val elem = listOf(1, 10, 3.0, "string", 40.0, null)
    println(sumIntOrDoubleValues(elem))
    val param = listOf("sfdf", "sfdsfs", null, 100.0)
    tryCastToListAndPrint(param)

}


//Задача 1
//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести
// соответствующее сообщение:
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun analyzeDataType(type: Any?) {
    when(type) {
        is String -> println("Это строка: $type")
        is Int -> println("Это целое число: $type")
        is List<*> -> println("Это список, количество элементов: ${type.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${type.size}")
        else -> println("Неизвестный тип данных")
    }
}

//Задача 2
//Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка, если аргумент можно
// безопасно привести к типу List. В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.

fun safeCastToList(arg: Any): Int {
    return (arg as? List<*>)?.size ?: -1
}

//Задача 3
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки, если аргумент
// можно привести к типу String. В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.

fun  getStringLengthOrZero(arg2: Any?): Int {
    return (arg2 as? String)?.length ?:0
}

//Задача 4
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”) и должна вернуть квадрат
// этого числа. Если придёт число, его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать в число
// через функцию toDouble() и возвести в квадрат.

fun square(date: Any?): Double {
    return when (date) {
        is Number -> date.toDouble() * date.toDouble()
        is String -> date.toDouble() * date.toDouble()
        else -> 0.0
    }
}

//Задача 5
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех
// целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(elem: List<Any?>): Double {
    var sum = 0.0
    for (i in elem) {
        if (i is Int) {
            sum += i.toDouble()
        } else if (i is Double) {
            sum += i
        }
    }
    return sum
}

//Задача 6
//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
// Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то вывести
// предупреждение об этом. Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение
// программы.

fun tryCastToListAndPrint(param: Any?) {
    val list = param as? List<*>
    if (list != null) {
        for (i in list) {
            if (i is String) {
                println(i)
            } else {
                println("Элемент $i не является строкой")
            }
        }
    } else {
        println("Неудачно")
    }
}