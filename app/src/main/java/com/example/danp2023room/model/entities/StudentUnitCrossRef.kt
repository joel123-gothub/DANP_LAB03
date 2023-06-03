package com.example.danp2023room.model.entities

import androidx.room.Entity

@Entity (primaryKeys = ["studentId", "unitId"])
data class StudentUnitCrossRef (
        val studentId: Int,
        val unitId: Int
        )
