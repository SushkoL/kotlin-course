package com.sushkoolesua.kotlincourse.lesson12


//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

    fun sig1() {}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

    fun sig2(a: Int, b: Int) = a + b

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

    fun sig3(a:String) {}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

    fun sig4(a: List<Int>): Double {
    var result = 0.0
    for (i in a.indices) {
        result += i.toDouble()
    }
        return result/a.size
    }
//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

    fun sig5 (str: String?) : Int? = str?.length

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

    fun sig6 () : Float? {
        return null
    }


//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

    fun sig7 (a: List<Int>?) {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

    fun sig8 (a: Int) : String? {
        return null
    }

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

    fun sig9 () : List<String>? {
        return null
    }

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево
// значение.

    fun sig10 (a: String? , b: Int?) : Boolean? {
        return null
    }


fun main (){
    println(multiplyByTwo(2))
    println(isEven(5))
    println(printNumbersUntil(2))
    println(findFirstNegative(listOf(1,3,4,-5,10)))
    println(processList(listOf("arg","stop","null", "grung")))
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
//

    fun multiplyByTwo (n: Int) = n * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
//

    fun isEven(n: Int): Boolean {
    return n % 2 == 0
    }

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n
// меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
//

    fun printNumbersUntil (n: Int) {
        if (n < 1) {
            return
        }
        for (i in 1..n) {
                println(i)
            }
    }

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в
// списке. Если отрицательных чисел нет, функция должна вернуть null.
//

    fun findFirstNegative (n: List<Int>) : Int? {
        for (i in n) {
            if (i <0) return i
        }
        return null
    }


//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую
// строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList (str: List<String?>) {
    for (i in str)
        if (i != null) {
            println(i)
        } else return
    }


fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

// Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}