package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallsModel
import io.androidedu.hoop.model.ChatModel
import io.androidedu.hoop.model.StatusModel

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {
        val chatModel = ChatModel(
            R.drawable.ic_photo_camera_black,
            "Betul",
            "Öğrenci",
            "Yesterday"
        )

        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)

    }


    fun getDummyStatusList(): ArrayList<StatusModel> = ArrayList<StatusModel>().apply {
        val statusModel = StatusModel(
            R.drawable.ic_person_outline_black_24dp,
            "Nuran",
            "Today"
        )
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)

    }

    fun getDummyCallList(): ArrayList<CallsModel> = ArrayList<CallsModel>().apply {
        val callModel = CallsModel(
            R.drawable.ic_photo_camera_black,
            "Firdevs",
            "Tomorrow",
            R.drawable.ic_local_phone_black_24dp
        )
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)


    }
}


