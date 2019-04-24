package io.androidedu.hoop.dao

import androidx.room.*
import io.androidedu.hoop.entity.StatusEntity

@Dao
interface StatusDao {

    @Insert
    fun addNewStatus(StatusDao: StatusEntity)

    @Update
    fun updateStatus(StatusDao: StatusEntity)

    @Delete
    fun deleteStatus(StatusDao: StatusEntity)

    @Query("SELECT * FROM status_table")
    fun getAllStatusList(): List<StatusEntity>


}