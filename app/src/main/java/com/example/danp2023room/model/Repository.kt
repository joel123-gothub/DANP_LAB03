package com.example.danp2023room.model

import com.example.danp2023room.model.entities.*

class Repository(private val appDatabase: AppDatabase) {

    suspend fun getAllUnits(): List<UnitEntity> {
        return appDatabase.unitDao().getAll()
    }

    suspend fun getUnitWithStudent(): List<UnitWithStudent> {
        return appDatabase.unitDao().getUnitWithStudent()
    }

    suspend fun getStudentWithUnit(): List<StudentWithUnit> {
        return appDatabase.unitDao().getStudentWithUnit()
    }

    suspend fun insertUnits(unitEntity: UnitEntity) {
        appDatabase.unitDao().insert(unitEntity)
    }

    suspend fun getAllStudents(): List<StudentEntity> {
        return appDatabase.studentDao().getAll()
    }

    suspend fun getStudentWithBooks(): List<StudentWithBooks> {
        return appDatabase.studentDao().getStudentWithBooks()
    }

    suspend fun insertStudents(studentsEntity: List<StudentEntity>) {
        appDatabase.studentDao().insert(studentsEntity)
    }

    suspend fun insertBooks(books: List<BookEntity>) {
        appDatabase.bookDao().insert(books)
    }

    suspend fun insertBook(book: BookEntity) {
        appDatabase.bookDao().insert(book)
    }

    suspend fun getAllBooks(): List<BookEntity> {
        return appDatabase.bookDao().getAll()
    }
}