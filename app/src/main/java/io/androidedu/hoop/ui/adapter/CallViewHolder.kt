package io.androidedu.hoop.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.ui.Model.CallsModel

class CallViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.adapter_item_call_list, parent, false)
) {
    private val imgCallProfile: ImageView
    private val callUserName: TextView
    private val callDate: TextView
    private val callPhone: ImageView


    init {
        imgCallProfile = itemView.findViewById(R.id.imgCallProfile)
        callUserName = itemView.findViewById(R.id.callUserName)
        callDate = itemView.findViewById(R.id.callDate)
        callPhone = itemView.findViewById(R.id.phone_image)
    }


    fun bind(callModel: CallsModel, onItemClickListener: (CallsModel) -> Unit) {

        imgCallProfile.setBackgroundResource(callModel.callProfilePhoto)
        callUserName.text = callModel.callUserName
        callDate.text = callModel.callDate
        callPhone.setBackgroundResource(callModel.callPhone)

        itemView.setOnClickListener {
            onItemClickListener(callModel)
        }


    }


}