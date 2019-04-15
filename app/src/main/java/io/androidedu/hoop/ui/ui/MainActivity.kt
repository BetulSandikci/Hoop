package io.androidedu.hoop.ui.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import io.androidedu.hoop.R
import io.androidedu.hoop.ui.adapter.HoopViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>,
    ViewPager.OnPageChangeListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Set the toolbar as support action bar
        setSupportActionBar(main_app_bar)
        // Now get the support action bar
        val actionBar = supportActionBar
        //// Display the app icon in action bar/toolbar
        actionBar!!.setTitle(R.string.app_name)



        vpHoopContainer.adapter = HoopViewPagerAdapter(supportFragmentManager)
        tblLayoutHoopContainer.setupWithViewPager(vpHoopContainer)
        vpHoopContainer.currentItem = 1
        tblLayoutHoopContainer.addOnTabSelectedListener(this)
        vpHoopContainer.addOnPageChangeListener(this)





    }

    override fun onTabReselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabReSelected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabUnSelected", Toast.LENGTH_SHORT).show()

    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabSelected", Toast.LENGTH_SHORT).show()

    }

    override fun onPageScrollStateChanged(state: Int) {
        Toast.makeText(this, "onPageScrollStateChange", Toast.LENGTH_SHORT).show()
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Toast.makeText(this, "onPageScroll", Toast.LENGTH_SHORT).show()
    }

    override fun onPageSelected(position: Int) {
        Toast.makeText(this, "onPageSelected", Toast.LENGTH_SHORT).show()
    }
/*
    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }

    fun AppCompatActivity.addFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }

    fun AppCompatActivity.replaceFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.inTransaction { replace(frameId, fragment) }
    }
*/



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.main_app_bar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle presses on the action bar menu items
        when (item?.itemId) {
            R.id.search -> {
                //null for now
                return true
            }
            R.id.new_group -> {
                return true
            }
            R.id.new_bulk_message -> {
                return true
            }
            R.id.starred_messages -> {
                return true
            }
            R.id.settings -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
