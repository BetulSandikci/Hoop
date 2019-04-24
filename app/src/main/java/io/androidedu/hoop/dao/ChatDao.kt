package io.androidedu.hoop.dao

import androidx.room.*
import io.androidedu.hoop.entity.ChatEntity

@Dao
interface ChatDao {

    @Insert
    fun addNewChat(ChatDao: ChatEntity)

    @Update
    fun updateChat(ChatDao: ChatEntity)

    @Delete
    fun deleteChat(ChatDao: ChatEntity)

    @Query("SELECT * FROM chat_table WHERE id = :id ")
    fun findSingleChat(id: Int): ChatEntity

    @Query("Select* from chat_table  ORDER BY chat_date DESC")
    fun getAllChats(): List<ChatEntity>


}