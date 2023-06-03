package com.example.danp2023room.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "unit")
data class UnitEntity(
    @PrimaryKey(autoGenerate = true)
    val unitId: Int,

    @ColumnInfo(name = "name")
    val name: String,

    val studentOwnerId:Int
) {
    constructor(name: String, studentId: Int) : this(0, name, studentId)

}