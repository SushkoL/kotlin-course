package com.sushkoolesua.kotlincourse.lesson27.homework

fun main() {

//Задание 2: Использование apply для инициализации объекта Employee
//Создайте объект Employee и используйте apply для инициализации его полей email и department.

    val employee = Employee("Lesua", 30, "mamavdekrete)))").apply {
        email = "zenitlesik@list.ru"
        department = "brn"
    }

//Задание 3: Использование also для логирования
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном
// виде.
//Создайте объект Person и используйте also для печати данных в консоль с помощью метода который только что создали.

    fun krasivo(obj: Person): String {
        return "This is ${obj.name}, she is ${obj.age} years old and this is her mail ${obj.email}"
    }

    val person = Person("Olesua", 30).also {
        it.email = "zenitlesik@list.ru"
        println(krasivo(it))
    }

//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно
// должность. Возвращаемым значением должен быть новый объект Employee.

    val person4 = with(Person("Denis", 31)) {
        Employee(name,age,"construktor")
    }

//Задание 5: Использование run для преобразования и инициализации Employee
//Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee, добавить ему email и
// department с помощью apply, вернуть инициализированный объект.

    val person5 = Person("Kompot",5).run {
        Employee(name,age,"cat")
    }.apply {
        email = "vkusnuashki@da"
        department = "naglikh kotov"
    }

//Задание 6: Использование let для безопасного преобразования Person в Employee
//Создайте функцию, которая принимает объект класса Person?, который может быть null. В функции используйте функцию
// let для создания Employee, только если объект Person не null. В противном случае возвращается null

    val person6: Person? = null
    val person61: Person? = Person("Misha",0)

    fun task6 (pers: Person?) : Employee?{
    return pers?.let {
        Employee(
            it.name,
            it.age,
            "baby"
        ).apply {
            email = "notfound@mail.ru"
            department = "infants"
        }
    }
    }

}