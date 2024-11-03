package com.sushkoolesua.kotlincourse.lesson18.homework.animals

import com.sushkoolesua.kotlincourse.lesson18.homework.Colors
import com.sushkoolesua.kotlincourse.lesson18.homework.printColored

class Bird() : Animal() {
    override fun makeSound() {
       printColored("Tweet", Colors.GREEN)
    }
}