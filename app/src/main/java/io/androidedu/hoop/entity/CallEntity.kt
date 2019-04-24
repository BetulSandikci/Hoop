package io.androidedu.hoop.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "call_table")

data class CallEntity(

    @PrimaryKey(autoGenerate = true) @NonNull
    val id: Int = 0,

    @ColumnInfo(name = "profile_photo")
    val profile_photo: Int,

    @ColumnInfo(name = "user_name")
    val userName: String,


    @ColumnInfo(name = "call_date")

    val callDate: String
)

