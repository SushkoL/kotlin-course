package com.sushkoolesua.kotlincourse.lesson14

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.

fun main(){

//1.Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время
// выполнения теста.

    val autoTests = mapOf("Первый" to 15.132, "Второй" to 260.243, "Третий" to 10.2434)
    println(autoTests.values.average())

//2.Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка
// с метаданными. Выведите список всех тестовых методов.

    val metaTests = mapOf("Первый" to "Метаданные1", "Второй" to "Метаданные2", "Третий" to "Метаданные3")
    println(metaTests.map { it.key })

//3.В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val testsResult = mutableMapOf("Первый" to "Passed", "Второй" to "Failed", "Третий" to "Failed")
    testsResult["Четвертый"] = "Skipped"
    println(testsResult)

//4.Посчитайте количество успешных тестов в словаре с результатами.

    println(testsResult.count{it.value == "Passed"})


//5.Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val bugTracking = mutableMapOf("bug1" to "Fixed", "bug2" to "In work", "Bug3" to "Review")
    bugTracking.remove("bug1")
    println(bugTracking)


//6.Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите
// сообщение о странице и статусе её проверки.

    val testingWeb = mapOf("https://docs" to 200, "https://text" to 404, "https://tests" to "503" )
    testingWeb.forEach{ println ("${it.key} status ${it.value}") }

//7.Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

    val servicesTest = mapOf("portfolio" to 2334.23, "position-keeping" to 1323.23, "multimarkets" to 200.24)
    println(servicesTest.filterValues { it > 500.00 })


//8.В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке). Для указанного
// endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

    val apiTest = mapOf("/docs" to 200, "/text" to 500, "/tests" to 400 )
    println(apiTest.getOrDefault("/docs","Not testing"))
    println(apiTest.getOrDefault("/text", "Not testing"))
    println(apiTest.getOrDefault("/tests","Not testing"))
    println(apiTest.getOrDefault("/doefds","Not testing"))

//9.Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение
// для "browserType". Ответ не может быть null.

    val config = mapOf("dfd" to "config1", "fdsfd" to "config2", "browserType" to "config3")
    println(config.getOrElse("browserType") {println ("not null")})

//10.Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

    val versionPo = mapOf(123 to 232, 2344 to 2434, 2342432 to 335)
    val newVersionPo = versionPo + (1324 to 35466)
    println(newVersionPo)

//11.Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства), получите
// настройки для конкретной модели или верните настройки по умолчанию.

    val settingsTest = mapOf("samsung" to "settings1", "xiaomi" to "settings2", "huawei" to "settings3")
    println(settingsTest.getOrDefault("samsung", "default settings"))


//12.Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

    val mapBugs = mapOf(404 to "fdfdg", 403 to "ewrt4", 500 to "wrfxvx")
    println(mapBugs.containsKey(502))


//13.Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения
// — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
// идентификаторы которых соответствуют определённой версии тестов.

    val testStatus = mapOf("TestID_Version1" to "Skipped", "TestID_Version2" to "Passed", "TestID_Version3" to "Failed")
    println(testStatus.filterKeys { it == "TestID_Version2" })


//14.У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их
// тестирования. Проверьте, есть ли модули с неудачным тестированием.

    val moduleStatus = mapOf("Module1" to "Skipped", "Module1" to "Passed", "Module1" to "Failed")
    println(moduleStatus.filterValues { it == "Failed" })

//15.Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val firstMap = mutableMapOf(1 to "settings1", 2 to "settings2", 4 to "settings3")
    val secondMap = mapOf( 4 to "settings4", 5 to "settings5", 6 to "settings6")
    firstMap.putAll(secondMap)
    println(firstMap)

//16.Объедините два неизменяемых словаря с данными о багах.

    val mapBugs1 = mapOf("bug1" to "Fixed", "bug2" to "In work", "Bug3" to "Review")
    val mapBugs2 = mapOf("bug4" to "Fixed", "bug5" to "In work", "Bug6" to "Review")
    val newMaps = mapBugs1 + mapBugs2
    println(newMaps)

//17.Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val autoResult = mutableMapOf("tes1" to "Passed", "test2" to "Failed", "test3" to "Failed")
    autoResult.clear()
    println(autoResult)


//18.Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

    val reportTests = mapOf("tes1" to "Passed", "test2" to "Failed", "test3" to "Skipped")
    println(reportTests.filterNot { it.value == "Skipped" })


//19.Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

    val configs = mutableMapOf("dfd" to "oldconfig1", "fdsfd" to "config2", "browserType" to "config3")
    configs.remove("dfd")
    println(configs)

//20.Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста,
// значение — результат) в список строк формата "Test ID: результат".

    val reportResults = mapOf("1" to "Skipped", "2" to "Failed", "3" to "Passed", "4" to "Skipped")
    println(reportResults.map {"Test ID: ${it.key} результат: ${it.value}"})


//21.Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    println(reportResults.toMap())


//22.Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на
// их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))

    //val mapIdTests = mapOf(2323 to "10.01.2025", 2434 to "14.05.2024")
    //println(mapIdTests.mapKeys { не совсем поняла про фейковый метод

//23.Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть
// новые условия тестирования.

    val efficiency = mapOf(1234 to 14, 2435 to 30, 3435 to 40, 2434 to 60)
    println(efficiency.mapValues { it.value * 1.1 })


//24.Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val compiMap = mapOf(1 to 404, 2 to 503)
    println(compiMap.isEmpty())

//25.Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadMap = mapOf(1 to 3, 4 to 5)
    println(loadMap.isNotEmpty())

//26.Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    val reportResultedAuto = mapOf("1" to "Skipped", "2" to "Failed", "3" to "Passed", "4" to "Skipped")
    println(reportResultedAuto.all { it.value == "Passed"})


//27.Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    val reportResulted = mapOf("1" to "Skipped", "2" to "Failed", "3" to "Passed", "4" to "Skipped")
    println(reportResulted.any{it.value == "Passed" })

//28.Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и
// содержат в названии “optional”.

    val reportServices = mapOf("1" to "Skipped", "2" to "Failed", "Optional" to "Passed", "4" to "Skipped")
    println(reportServices.filter { it.value == "Failed" && it.key.contains("optional")})

}