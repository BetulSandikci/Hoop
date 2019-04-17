package io.androidedu.hoop.ui.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.ui.adapter.CallListAdapter
import io.androidedu.hoop.ui.util.GenerateDummyData
import kotlinx.android.synthetic.main.fragment_calls.*


class calls : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recycCallList) {
            adapter = CallListAdapter(GenerateDummyData.getDummyCallList()) { callModel ->
                Toast.makeText(activity, callModel.callUserName, Toast.LENGTH_SHORT).show()

            }
            layoutManager = LinearLayoutManager(activity)
        }


    }

    companion object {
        fun newInstance() = calls()
    }


}
