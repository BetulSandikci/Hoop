package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.entity.CallEntity

class CallViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.adapter_item_call_list, parent, false)
) {

    private val imgCallProfile by lazy { itemView.findViewById<ImageView>(R.id.imgCallProfile) }
    private val callUserName by lazy { itemView.findViewById<TextView>(R.id.callUserName) }
    private val callDate by lazy { itemView.findViewById<TextView>(R.id.callDate) }
    private val callPhone by lazy { itemView.findViewById<ImageView>(R.id.phone_image) }


    fun bind(callEntity: CallEntity, onItemClickListener: (CallEntity) -> Unit) {

        imgCallProfile.setBackgroundResource(callEntity.profile_photo)
        callUserName.text = callEntity.userName
        callDate.text = callEntity.callDate
        callPhone.setBackgroundResource(callEntity.callPhone)

        itemView.setOnClickListener {
            onItemClickListener(callEntity)
        }


    }


}