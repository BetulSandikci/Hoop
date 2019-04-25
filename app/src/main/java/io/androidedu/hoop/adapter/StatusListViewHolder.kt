package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.entity.StatusEntity

class StatusListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.adapter_item_status_list, parent, false)
) {
    private val imgStatusProfile by lazy { itemView.findViewById<ImageView>(R.id.imgStatusProfile) }
    private val statusUserName by lazy { itemView.findViewById<TextView>(R.id.statusUserName) }
    private val statusDate by lazy { itemView.findViewById<TextView>(R.id.statusDate) }


    fun bind(statusEntity: StatusEntity, onItemClickListener: (StatusEntity) -> Unit) {

        imgStatusProfile.setBackgroundResource(statusEntity.profilePhoto)
        statusUserName.text = statusEntity.userName
        statusDate.text = statusEntity.date


        itemView.setOnClickListener {
            onItemClickListener(statusEntity)
        }
    }

}