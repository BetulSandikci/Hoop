package io.androidedu.hoop.ui.util

import io.androidedu.hoop.R
import io.androidedu.hoop.ui.Model.ChatModel

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


}


