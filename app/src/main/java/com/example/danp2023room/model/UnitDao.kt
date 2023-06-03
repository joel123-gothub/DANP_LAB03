package com.example.danp2023room.model

import androidx.room.*
import com.example.danp2023room.model.entities.*

@Dao
interface UnitDao {
    @Query("select * from unit")
    suspend fun getAll(): List<UnitEntity>

    @Transaction
    @Query("select * from unit")
    suspend fun getUnitWithStudent(): List<UnitWithStudent>

    @Transaction
    @Query("select * from student")
    suspend fun getStudentWithUnit(): List<StudentWithUnit>

    @Insert
    suspend fun insert(unitEntity: UnitEntity)

    @Insert
    suspend fun insert(unitEntity: List<UnitEntity>)

    @Delete
    suspend fun delete(unitEntity: UnitEntity)
}