package io.androidedu.hoop.activities_ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.StatusListAdapter
import io.androidedu.hoop.util.GenerateDummyData
import kotlinx.android.synthetic.main.fragment_status.*


class status : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recycStatusList) {
            adapter = StatusListAdapter(GenerateDummyData.getDummyStatusList()) { statusModel ->
                Toast.makeText(activity, statusModel.statusUserName, Toast.LENGTH_SHORT).show()
            }
            layoutManager = LinearLayoutManager(activity)
        }

    }

    companion object {

        fun newInstance() = status()
    }
}
