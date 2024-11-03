package com.sushkoolesua.kotlincourse.lesson17

open class EducationalInstitution (
    val address: String,
    val name: String
)

open class School (
    address: String,
    name: String,
    val numberSchoolchildren: Int
) : EducationalInstitution (address,name)

class MusicalSchool (
    address: String,
    name: String,
    numberSchoolchildren: Int,
    val numberInstruments: Int
) : School (address,name,numberSchoolchildren)

open class University (
    address: String,
    name: String,
    val numberDepartments: Int
) : EducationalInstitution (address,name)

class TechnicalUniversity (
    address: String,
    name: String,
    numberDepartments: Int,
    val numberEducationEquipment: Int
) : University (address, name, numberDepartments)