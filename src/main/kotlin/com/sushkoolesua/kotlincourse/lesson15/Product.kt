package com.sushkoolesua.kotlincourse.lesson15

//Покупка: Продукт Создайте дата класс для продукта, который будет представлять продукт в магазине. У него должны быть
// свойства “название”, “цена”, “количество”.

    data class Product(val name: String, val cost: Double, val quantity: Int)