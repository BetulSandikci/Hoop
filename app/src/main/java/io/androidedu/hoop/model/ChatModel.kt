package io.androidedu.hoop.model

data class ChatModel(
    var profilePhoto: Int,
    val userName: String,
    val userMessage: String,
    val date: String
)