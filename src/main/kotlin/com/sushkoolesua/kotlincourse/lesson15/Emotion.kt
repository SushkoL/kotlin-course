package com.sushkoolesua.kotlincourse.lesson15

//Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String)
// и intensity (Int). Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.

    class Emotion (
        var type : String,
        var intensity : Int
    ) {
        fun express() {
            val description = when (intensity) {
            in 1..3 -> "слабая"
            in 4..6 -> "средняя"
            in 7..10 -> "сильная"
            else -> "за пределами значений"
        }
        println("Эмоция: $type, Интенсивность: $description")
    }
}