package com.sushkoolesua.kotlincourse.lesson19.homework

/*
Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов
(аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

Поля:
цвет
модель
включен
ОС загружена
список доступных игр
наличие джойстика
баланс вырученных средств
владелец
телефон поддержки.

Методы:
включить
выключить
загрузить ОС
завершить работу ОС
показать список игр
включить игру
оплатить игровой сеанс
открыть сейф и выдать наличные
выплатить выигрыш
 */

class SlotMachine(

    val color: String,

    val model: String,

    private var isOn: Boolean,

    private var isOSLoaded: Boolean,

    val listOfGames: List<String>,

    val joystick: Boolean,

    private var balance: Float,

    var owner: String,

    val supportPhone: String
) {

    fun powerOn() {
        shutdownOS()
        isOn = true
    }

    fun powerOff() {
        shutdownOS()
        isOn = false
    }

    private fun loadOS() {}

    private fun shutdownOS() {}

    fun showListOfGames() {}

    fun turnOnGames () {}

    fun payForSession() {}

    protected fun openSafeAndDispenseCash() {}

    protected fun payoutWinnings() {}
}
