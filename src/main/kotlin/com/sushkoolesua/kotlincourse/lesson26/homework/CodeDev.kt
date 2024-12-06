package com.sushkoolesua.kotlincourse.lesson26.homework

//Задания на разработку кода

//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
//удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат
//фильтрации исходного списка строк.

fun filterStrings(
    list: List<String>,
    filter: (String) -> Boolean
): List<String> {
    return list.filter(filter)
}

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию, преобразующую каждое число в другое число
//(те-есть принимающая число и возвращающая число). Функция должна вернуть результат преобразования исходного списка чисел.

fun applyToNumbers(
    num: List<Number>,
    transform: (Number) -> Number
): List<Number> {
    return num.map(transform)
}

//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию, определяющую условие для включения числа
//в сумму. Функция должна вернуть сумму чисел, прошедших проверку.

fun sumByCondition(
    number: List<Number>,
    chek: (Number) -> Boolean
): Double {
    return number.filter(chek).sumOf { it.toDouble() }
}

//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа и функцию для их объединения и
//преобразования в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)

/*
fun <A,B> combineAndTransform (
    firstCollection: Collection<A>,
    secondCollection: Collection<A>,
    transCollections: (A,A) -> B
): Collection<B> {
    val final = firstCollection+secondCollection
    return transCollections(final)
}
не пойму почему не принимаются такие коллекции
*/


fun main (){

    val list1 = listOf("What", "the", "dich", "write", "here")
    println(filterStrings(list1) { it.length > 4 })
    println(filterStrings(list1) { it.contains("d") })

    val list2 = listOf(24, 3454365F, 224353452L, 5658.87, 0)
    println(applyToNumbers(list2) { it.toInt() * 2.0 })
    println(applyToNumbers(list2) { it.toInt() * it.toInt() })

    val list3 = listOf(24235, 2424, 10, 2.0, 567568, 155, 1)
    println(sumByCondition(list3) { it.toDouble() % 2.0 == 0.0 })
    println(sumByCondition(list3) { it.toDouble() > 100.0 })

}