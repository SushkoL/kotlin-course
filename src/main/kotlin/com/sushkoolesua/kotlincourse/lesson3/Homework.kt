package com.sushkoolesua.kotlincourse.lesson3

import java.lang.invoke.StringConcatException

//Погрузимся в атмосферу "Hackathon Survival": Марафон, где участники пытаются завершить реальный проект в условиях
// искусственно созданного хаоса (например, часто меняющиеся требования, неожиданные "сбои" в оборудовании)
// Для каждого из полей подбери наилучший способ хранения из известных тебе. Учитывай такие факторы, как изменяемость,
// обязательность, возможность начальной установки, ресурсоёмкие вычисления значения, необходимость проверки
// устанавливаемого значения на валидность или запрет доступа на установку при возможности чтения, публичность и
// приватность данных.


// Название мероприятия
const val NAME_EVENT: String = "Hackathon Survival"

// Дата проведения
var dateEvent: Double = 11.11.2024

// Место проведения
val placeEvent: String = "Тверская Ямская 12"


// Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
val detailedBudget: String = "Кофе, чай и конфетки вышел косарь (1000)"

// Количество участников
var quantityMembers: Int = 0

// Длительность хакатона
var duration: Int = "48"

// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
lateinit var contactInfo: String

// Текущее состояние хакатона (статус)
var currentStatus: String = "Open check-in"

// Список спонсоров
val sponsors: String = "Вот тут идет список спонсоров"

// Бюджет мероприятия
val budget: Int = 1000000

// Текущий уровень доступа к интернету
var InternetStatus: String = "Подключен"

// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private val transportationInformation: String = "info"

// Количество команд
var numberOfComands: Int = 0

// Перечень задач
val tasks: String = "Task1,Task..."

// План эвакуации
val evacuationPlan: String = "Table"

// Список доступного оборудования
var listOfAvailableEquipment: String = "Тут список должен быть"

// Список свободного оборудования
var listOfAvailableEquipment: String = "Тут список должен быть"

// График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit val MealSchedule: String

// План мероприятий на случай сбоев
val DisasterPlan: String = "План мероприятий на случай сбоев"

// Список экспертов и жюри
val expertsAndJury: String = "Вот тут список экспертов и жюри"

// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
var feddbackMethods: String by lazy {
    "Тут много всяких методов и процедур описаны"
}

// Политика конфиденциальности
val privacyPolicy: String "Тут вот как раз все прописывается подробно"

// Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private lateinit val feedbackPrivate: String

// Текущая температура в помещении
var currentTemperature: Int = 28

// Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var networkEquipmentPerformance: String = "text"

// Уровень освещения
var lightingLevel: Int = 1200

// Лог событий мероприятия
lateinit private val logMeeting: String

// Доступность медицинской помощи
val medicalCare: String = "Доступна"

// Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций
private val plansSafeMeeting: String = "Тут секретная инфа"

// Регистрационный номер мероприятия
val numberMeeting: Int = 987654321

// Максимально допустимый уровень шума в помещении хакатона
val maxNoise: Int = 100000

// Индикатор превышения уровня шума в помещениях
var indicatorOfNoise: Boolean = true

// Формат мероприятия (зависит от геополитической обстановки)
var eventFormat: String = "Дистанционный"

// Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было
// меньше нуля.
var avaliablePlaceToRelax: Int = 100
    get() = field
    set(value) {
        if (value < 0) field = 0
    }

// План взаимодействия с прессой
private val planPressRelations: String = "Секретный план"

// Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона
// автоматизированных проверок.
val detailsAboutTeamProjects: String by lazy {
    "Тут будет формула и проверки"
}


// Статус получения всех необходимых разрешений указывает, открыт ли доступ к эксклюзивным
// ресурсам (например, специальному оборудованию)
var permitStatus: Boolean = true

// Список партнеров мероприятия
val listOfPartners: String = "Тут вот будет список"

// Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var reportMeeting: String = "Отчет"

// План распределения призов
private val planOfPresent: String = "Тут инфа по распределению"

// Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val emergencyContacts: String = "01 скорая, 02 полиция..."

// Особые условия для участников с ограниченными возможностями
val SpecialConditionsForDisabilities: String = "Особые условия для участников с ограниченными возможностями"

// Общее настроение участников (определяется опросами)
val moodOfMembers: String by lazy {
    "Тут формулку для подсчета настроения"
}

// Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед
// началом мероприятия.
lateinit var detailedPlan: String

// Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit val speshialGuest: String

// Максимальное количество людей, которое может вместить место проведения.
const val MAX_QUANTITY_PEOPLE: Int = 300

// Стандартное количество часов, отведенное каждой команде для работы над проектом.
const val TIME_TO_TEAM: Int = 4