package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.entity.ChatEntity

class ChatListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
    (
    LayoutInflater.from(parent.context)
        .inflate(R.layout.adapter_item_chat_list, parent, false)
) {

    private val imgProfile by lazy { itemView.findViewById<ImageView>(R.id.imgCallProfile) }
    private val txtUserName by lazy { itemView.findViewById<TextView>(R.id.txtUserName) }
    private val txtUserMessage by lazy { itemView.findViewById<TextView>(R.id.txtUserMessage) }
    private val txtDate by lazy { itemView.findViewById<TextView>(R.id.txtDate) }


    fun bind(chatEntity: ChatEntity, onItemClickListener: (ChatEntity) -> Unit) {

        imgProfile.setBackgroundResource(chatEntity.profilePhoto)
        txtUserName.text = chatEntity.userName
        txtUserMessage.text = chatEntity.userMessage
        txtDate.text = chatEntity.date

        itemView.setOnClickListener {
            onItemClickListener(chatEntity)
        }


    }

}
