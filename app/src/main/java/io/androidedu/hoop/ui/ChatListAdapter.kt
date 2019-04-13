package io.androidedu.hoop.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R

class ChatListAdapter(val chatList: ArrayList<String>) : RecyclerView.Adapter<ChatListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder {
        val itemView =
            ChatListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_chat_list, parent))
        return itemView
    }

    override fun getItemCount(): Int = chatList.size

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        chatList[position]
        val imgProfile = holder.itemView.findViewById<ImageView>(R.id.imgProfile)
        val txtUserName = holder.itemView.findViewById<TextView>(R.id.txtUserName)
        val txtUserMessage = holder.itemView.findViewById<TextView>(R.id.txtUserMessage)
        val txtDate = holder.itemView.findViewById<TextView>(R.id.txtDate)

        txtUserName.text = chatList[position]
        txtUserMessage.text = chatList[position]
        txtDate.text = chatList[position]


    }

}