package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import io.androidedu.hoop.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var container = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        container = R.id.fragment_container

        // Set the toolbar as support action bar
        setSupportActionBar(main_app_bar)
        // Now get the support action bar
        val actionBar = supportActionBar
        //// Display the app icon in action bar/toolbar
        actionBar!!.setTitle(R.string.app_name)

        //when the app opened first camera tab shows
        addFragment(container, camera.newInstance())


        camera_tab.setOnClickListener(this)
        chats_tab.setOnClickListener(this)
        status_tab.setOnClickListener(this)
        call_tab.setOnClickListener(this)


    }

    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }

    fun AppCompatActivity.addFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }

    fun AppCompatActivity.replaceFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.inTransaction { replace(frameId, fragment) }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.camera_tab -> replaceFragment(container, camera.newInstance())
            R.id.chats_tab -> replaceFragment(container, chats.newInstance())
            R.id.status_tab -> replaceFragment(container, status.newInstance())
            R.id.call_tab -> replaceFragment(container, calls.newInstance())

        }
    }

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
