package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.StatusModel

class StatusListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.adapter_item_status_list, parent, false)
) {
    private val imgStatusProfile: ImageView
    private val statusUserName: TextView
    private val statusDate: TextView


    init {
        imgStatusProfile = itemView.findViewById(R.id.imgStatusProfile)
        statusUserName = itemView.findViewById(R.id.statusUserName)
        statusDate = itemView.findViewById(R.id.statusDate)
    }

    fun bind(statusModel: StatusModel, onItemClickListener: (StatusModel) -> Unit) {

        imgStatusProfile.setBackgroundResource(statusModel.statusProfilePhoto)
        statusUserName.text = statusModel.statusUserName
        statusDate.text = statusModel.statusDate


        itemView.setOnClickListener {
            onItemClickListener(statusModel)
        }
    }

}