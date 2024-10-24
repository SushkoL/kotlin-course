package com.sushkoolesua.kotlincourse.lesson15

fun main () {

    // Про вечеринку

    val party = Party ("Думская 1", 134)
    party.details()

    //Про эмоции

    val emotion = Emotion ("Сметение", 10)
    emotion.express()

    //Про луну

    Moon.isVisible = false
    Moon.showPhase()

    //Про концерт

    val concert = Concert ("Звери", "Ледовый дворец", 12000, 15000, 15000)
    concert.aboutConcert()
    concert.buyTicket()

}