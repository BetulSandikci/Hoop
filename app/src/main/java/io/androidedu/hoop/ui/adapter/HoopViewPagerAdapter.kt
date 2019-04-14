package io.androidedu.hoop.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import io.androidedu.hoop.ui.ui.calls
import io.androidedu.hoop.ui.ui.camera
import io.androidedu.hoop.ui.ui.chats
import io.androidedu.hoop.ui.ui.status


//class extends from both , less fragment use -> FragmentPagerAdapter(can cause memory leak), multiple and dynamic fragments use -> FragmentStatePagerAdapter
//FragmentStatePagerAdapter,FragmentPagerAdapter
class HoopViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    private val cameraFragment by lazy { camera.newInstance() }
    private val chatsFragment by lazy { chats.newInstance() }
    private val statusFragment by lazy { status.newInstance() }
    private val callsFragment by lazy { calls.newInstance() }

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    init {
        fragmentList.add(cameraFragment)
        fragmentList.add(chatsFragment)
        fragmentList.add(statusFragment)
        fragmentList.add(callsFragment)


        fragmentTitleList.add("Camera")
        fragmentTitleList.add("Chats")
        fragmentTitleList.add("Status")
        fragmentTitleList.add("Calls")
    }


    override fun getItem(position: Int): Fragment = fragmentList[position]


    override fun getCount(): Int = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleList[position]

}
