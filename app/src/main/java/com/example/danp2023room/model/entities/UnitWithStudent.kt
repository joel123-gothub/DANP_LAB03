package com.example.danp2023room.model.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class UnitWithStudent (
    @Embedded val unit: UnitEntity,
    @Relation(
        parentColumn = "unitId",
        entityColumn = "studentId",
        associateBy = Junction(StudentUnitCrossRef::class)
    )
    val Student: List<StudentEntity>
    )
