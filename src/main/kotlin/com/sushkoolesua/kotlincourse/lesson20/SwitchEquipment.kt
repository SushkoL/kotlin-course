package com.sushkoolesua.kotlincourse.lesson20

abstract class SwitchEquipment : Powerable {
    private var isOn = false
    override fun powerOn() {
        isOn = true
        println("On")
    }

    override fun powerOff() {
        isOn = false
        println("Off")
    }
}