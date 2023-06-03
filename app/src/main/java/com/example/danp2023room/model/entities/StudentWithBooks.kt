package com.example.danp2023room.model.entities

import androidx.room.Embedded
import androidx.room.Relation

data class StudentWithBooks(
    @Embedded val studentEntity: StudentEntity,
    @Relation(
        parentColumn = "studentId",
        entityColumn = "studentOwnerId"
    )
    val books: List<BookEntity>

)