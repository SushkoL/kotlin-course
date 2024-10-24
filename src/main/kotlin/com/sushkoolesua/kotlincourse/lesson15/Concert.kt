package com.sushkoolesua.kotlincourse.lesson15


//Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”, “место проведения”,
// “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию
// о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.

    class Concert(
        val group: String,
        val place: String,
        var price: Int,
        val hallCapacity: Int,
        private var ticketsSold: Int
) {
        fun aboutConcert (){
            println("Выступает группа $group, по адресу $place. Цена билета $price рублей.")
        }

        fun buyTicket () {
            if(ticketsSold < hallCapacity ) {
                ticketsSold++
            } else {
                println("Надо было раньше покупать, всё продано")
            }
        }
}