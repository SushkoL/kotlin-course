package com.sushkoolesua.kotlincourse.lesson30.homework

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).
//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class TestStatus {
    PASS,
    BROKEN,
    FAILURE;
}

enum class TypesOfResidentialRealEstate(val names: String) {
    ROOM("Комната"),
    APARTMENTS("Квартира"),
    HOUSE("Дом");
}

enum class Planets(val distanceToSun: Double, val weightOfPlanet: Double) {
    MERCURY(0.39, 0.33),
    VENUS(0.72, 4.87),
    EARTH(1.0, 5.97),
    MARS(1.52, 0.642),
    JUPITER(5.2, 1898.0),
    SATURN(9.54, 568.0),
    URANUS(19.6, 86.8),
    NEPTUNE(30.06, 102.0);
}
//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке возрастания длины
//названия enum.

fun printTypesRealEstate() {
    TypesOfResidentialRealEstate.entries
        .sortedBy { it.names.length }
        .forEach { println(it.names) }
}


//Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает Enum со статусом
//прохождения теста в зависимости от того как выполнится принятая лямбда. Если без исключений - pass, если будет
//AssertionError - failure, прочие исключения  - broken.

fun printStatusTests(test: () -> Unit): TestStatus {
    return try {
        test()
        TestStatus.PASS
    } catch (e: AssertionError) {
        TestStatus.FAILURE
    } catch (e: Exception) {
        TestStatus.BROKEN
    }
}


//Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать планету и возвращать булево
//значение. Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо
//признаку (расстояние или вес). Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если
//список пустой.

fun printPlanet(filter: (Planets) -> Boolean): Planets {
    return Planets.entries.firstOrNull(filter)
        ?: throw Exception("Not found")
}


fun main () {
    println(printTypesRealEstate())
    val task3 = printStatusTests { throw AssertionError ("EROR")  }
    println(task3)
    val task4 = printPlanet { it.weightOfPlanet > 1000.0 }
    println(task4)

}