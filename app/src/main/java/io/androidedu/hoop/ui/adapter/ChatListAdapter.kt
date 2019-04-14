package io.androidedu.hoop.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.ui.Model.ChatModel

class ChatListAdapter(val chatList: ArrayList<ChatModel>, val onItemClickListener: (chatModel: ChatModel) -> Unit) :
    RecyclerView.Adapter<ChatListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder = ChatListViewHolder(parent)

    override fun getItemCount(): Int = chatList.size

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {

        holder.bind(chatList[position], onItemClickListener)
    }

}