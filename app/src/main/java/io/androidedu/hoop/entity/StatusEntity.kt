package io.androidedu.hoop.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "status_table")
data class StatusEntity(
    @PrimaryKey(autoGenerate = true) @NonNull
    val id: Int = 0,

    @ColumnInfo(name = "profile_photo")
    val profilePhoto: Int,

    @ColumnInfo(name = "user_name")
    val userName: String,

    @ColumnInfo(name = "status_date")
    val date: String
)