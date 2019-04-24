package io.androidedu.hoop.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.androidedu.hoop.entity.CallEntity

@Dao
interface CallDao {

    @Insert
    fun addNewCall(CallDao: CallEntity)

    @Delete
    fun deleteCall(CallDao: CallEntity)

    @Query("SELECT * FROM call_table")
    fun getAllCalls(): List<CallEntity>


}