package com.sushkoolesua.kotlincourse.lesson18.homework

import com.sushkoolesua.kotlincourse.lesson18.homework.animals.Bird
import com.sushkoolesua.kotlincourse.lesson18.homework.animals.Cat
import com.sushkoolesua.kotlincourse.lesson18.homework.animals.Dog
import com.sushkoolesua.kotlincourse.lesson18.homework.printers.InkjetPrinter
import com.sushkoolesua.kotlincourse.lesson18.homework.printers.LaserPrinter
import com.sushkoolesua.kotlincourse.lesson18.homework.shapes.Circle
import com.sushkoolesua.kotlincourse.lesson18.homework.shapes.Square
import com.sushkoolesua.kotlincourse.lesson18.homework.shapes.Triangle

fun main () {

    val animals = listOf(Bird(),Dog(),Cat())
    for (i in animals.indices) {
        animals[i].makeSound()
    }
   // animals.forEach { println(it.makeSound()) } тоже работает, но выдает юнит через один цикл??

    val shapes = listOf(Circle(3.5), Square(2.0), Triangle(5.0,6.0,34.0))
    shapes.forEach {println(it.area())}


    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()
    val text = "Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными " +
            "буквами на цветном фоне. Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона и " +
            "проходить циклически по этому списку при выводе текста. Проверить работу на длинном тексте."
    laserPrinter.print(text)
    inkjetPrinter.print(text)









}