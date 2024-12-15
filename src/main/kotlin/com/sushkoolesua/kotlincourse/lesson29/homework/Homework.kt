package com.sushkoolesua.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main () {
//Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)

    val time1 = Instant.now()
    println(time1)

//Создай дату своего дня рождения.

    val myBirthday = LocalDate.of(1994,1, 14)
    println(myBirthday)


//Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.

    val period = Period.between(myBirthday, LocalDate.now())
    println(period.years)

//Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того, содержит ли
// аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени. В форматированном значении
// нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте. Обработай в методе все
// типы дат, которые знаешь. Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.
// Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше. Не используй в
// них метод now()

    val localDateTime = LocalDateTime.of(2024, 12, 15, 19, 3, 10)
    println(formattedTime(myBirthday))
    println(formattedTime(localDateTime))



//Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
// определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
// и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один из этих
// диапазонов, функция должна возвращать "Не определено". Для сравнения дат используй методы isAfter(otherDate) и
// isBefore(otherDate). Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.



//Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в
// месяц и день.Выведи первую отформатированную дату, прибавив к ней 10 дней.Выведи вторую отформатированную дату,
// прибавив к ней 10 дней.

    val firstDate = LocalDate.of(2023, 2, 25)
    val secondDate = LocalDate.of(2024, 2, 25)

    val formatter = DateTimeFormatter.ofPattern("MM-dd")

    val plus10first = firstDate.plusDays(10)
    val plus10second = secondDate.plusDays(10)

    println(plus10second.format(formatter))
    println(plus10first.format(formatter))

}

fun formattedTime(type: Temporal) {
    when (type) {
        is LocalDate -> type.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        is LocalTime -> type.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> type.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        is ZonedDateTime -> type.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        is OffsetDateTime -> type.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ"))
        else -> "Don't know this type of time"
    }.also { println(it) }
}

fun formatTimelISO(type: Temporal) {
    when (type) {
        is LocalDate -> type.format(DateTimeFormatter.ISO_DATE)
        is LocalTime -> type.format(DateTimeFormatter.ISO_TIME)
        is LocalDateTime -> type.format(DateTimeFormatter.ISO_DATE_TIME)
        is ZonedDateTime -> type.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> type.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> "Don't know this type of time"
    }.also { println(it) }
}
