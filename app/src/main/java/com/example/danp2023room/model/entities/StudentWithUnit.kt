package com.example.danp2023room.model.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class StudentWithUnit (
    @Embedded val studentEntity: StudentEntity,
    @Relation(
        parentColumn = "studentId",
        entityColumn = "unitId",
        associateBy = Junction(StudentUnitCrossRef::class)

    )
    val Unit: List<UnitEntity>
        )
