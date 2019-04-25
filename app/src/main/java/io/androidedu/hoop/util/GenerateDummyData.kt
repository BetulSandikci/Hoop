package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.entity.CallEntity
import io.androidedu.hoop.entity.ChatEntity
import io.androidedu.hoop.entity.StatusEntity

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatEntity> = ArrayList<ChatEntity>().apply {

        val chatEntity = ChatEntity(

            profilePhoto = R.drawable.ic_photo_camera_black,
            userName = "Betul",
            userMessage = "Öğrenci",
            date = "Yesterday"
        )

        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)
        add(chatEntity)

    }


    fun getDummyStatusList(): ArrayList<StatusEntity> = ArrayList<StatusEntity>().apply {
        val statusEntity = StatusEntity(

            profilePhoto = R.drawable.ic_person_outline_black_24dp,
            userName = "Nuran",
            date = "Today"
        )
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
        add(statusEntity)
    }

    fun getDummyCallList(): ArrayList<CallEntity> = ArrayList<CallEntity>().apply {
        val callEntity = CallEntity(
            profile_photo = R.drawable.ic_photo_camera_black,
            userName = "Firdevs",
            callDate = "Tomorrow",
            callPhone = R.drawable.ic_local_phone_black_24dp
        )
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)
        add(callEntity)


    }
}


