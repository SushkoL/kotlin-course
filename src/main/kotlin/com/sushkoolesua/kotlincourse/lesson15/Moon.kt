package com.sushkoolesua.kotlincourse.lesson15

//Природное явление: Луна Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible (Boolean),
// чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны (например,
// "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full moon"

    fun showPhase () {
        if (isVisible == false) {
            phase = "New Moon"
        }
        println(phase)
    }
}