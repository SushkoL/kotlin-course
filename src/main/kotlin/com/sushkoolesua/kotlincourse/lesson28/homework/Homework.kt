package com.sushkoolesua.kotlincourse.lesson28.homework

import java.io.File

//Задача 1
//Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.
fun main () {

    val file1 = File("workspace/task1/example.txt")
    file1.parentFile.mkdirs()
    file1.createNewFile()
    file1.writeText("Hello, Kotlin!")
    if (file1.exists()) {
        println(
            "Файл существует"
        )
    } else {
        println("Файл не существует")
    }


//Задача 2
//Создайте директорию workspace/task2/testDir
//проверьте, является ли она директорией, и выведите её абсолютный путь.

    val directory2 = File("workspace/task2/testDir")
    directory2.mkdirs()
    if (directory2.isDirectory) {
        println(directory2.absolutePath)
} else {
    println("This is not directory")
}


//Задача 3
//Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2. Проверьте, что
//myDir действительно содержит эти поддиректории.

    val directory3 = File("workspace/task3/structure")
    directory3.mkdirs()
    val myDir = File(directory2, "myDir")
    myDir.mkdir()
    val subDir1 = File(myDir, "subDir1")
    val subDir2 = File(myDir, "subDir2")
    subDir1.mkdir()
    subDir2.mkdir()
    val subDirs = myDir.listFiles()
    subDirs?.forEach { file ->
        println(file.name)
    }

//Задача 4
//Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий. Удалите директорию workspace/task4 со всем
//содержимым

    val directory4 = File("workspace/task4/temp")
    directory4.mkdirs()
    val fileForDelete = File(directory4, "fileForDelete.txt")
    fileForDelete.createNewFile()
    val fileForDelete1 = File(directory4, "fileForDelete1.txt")
    fileForDelete1.createNewFile()
    val directoryForDelete = File(directory4, "directoryForDelete")
    directoryForDelete.mkdirs()
    val directoryForDelete1 = File(directory4, "directoryForDelete1")
    directoryForDelete1.mkdirs()
    directory4.deleteRecursively()



//Задача 5
//Создайте файл workspace/task5/config/config.txt
//запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.

    val file5 = File("workspace/task5/config/config.txt")
    file5.parentFile.mkdirs()
    file5.createNewFile()
    val list = listOf("one" to "two", "two" to "three", "three" to "four")
    file5.writeText(list.joinToString("\n"))
    val values = file5.readLines().mapNotNull { it.split("=").getOrNull(1) }
    values.forEach { println(it) }


//Задача 6
//Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов



//Задача 7
//Создайте директорию workspace/task9/docs.
//Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст "This is a README file."
//
//
////Задача 8
//Создайте файлы
//workspace/task10/data/1/4/prod/data14.mysql
//workspace/task10/data/2/3/prod/data23.mysql
//workspace/task10/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data сохраняя структуру
//директорий. Для копирования используй метод copyTo

}