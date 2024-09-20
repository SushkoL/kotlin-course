package com.sushkoolesua.kotlincourse.lesson5

import com.sun.jdi.Value

// Оператор Элвиса

//Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной
// интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.

//Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после
// затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания
// неизвестен, использовать стандартное значение 0.5.

fun main () {
    printIntensitySound(startIntensiv = 0.75, coefAttentuation = null)
    printIntensitySound(startIntensiv = 0.75, coefAttentuation = 1.5)

    printFinalShippingСost(deliveryCost = 2000.0, cargoCost = 1000.0)
    printFinalShippingСost(deliveryCost = 1000.0, cargoCost = null)

    printDimension(atmPressure = 28)
    printDimension(atmPressure = null)
}

    fun printIntensitySound(startIntensiv: Double, coefAttentuation: Double?) {
    var volumeIntens = startIntensiv * (coefAttentuation ?: 0.5)
    println(volumeIntens)
}

//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет
// 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50

//Задача: Рассчитать полную стоимость доставки.

fun printFinalShippingСost(cargoCost: Double?, deliveryCost: Double, insurance: Double = 0.005) {
    val defoltCargoCost  = 50.0
    var finalInsurance = (cargoCost ?: defoltCargoCost) * insurance
    var finalCost = deliveryCost + finalInsurance
    println(finalCost)
}


//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое
// должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.

// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun printDimension (atmPressure: Int?) {
    println(atmPressure ?: throw Exception ("No pressure!"))
}