package io.androidedu.hoop.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "chat_table")
data class ChatEntity(

    @PrimaryKey(autoGenerate = true) @NonNull
    val id: Int = 0,

    @ColumnInfo(name = "profile_photo")
    val profilePhoto: Int,

    @ColumnInfo(name = "user_name")
    val userName: String,

    @ColumnInfo(name = "user_message")
    val userMessage: String,

    @ColumnInfo(name = "chat_date")
    val date: String
)