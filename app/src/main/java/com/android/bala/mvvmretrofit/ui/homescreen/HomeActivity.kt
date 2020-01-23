package com.android.bala.mvvmretrofit.ui.homescreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.android.bala.mvvmretrofit.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var homeAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)

        setHeading(0)

        homeAdapter = HomeAdapter(supportFragmentManager)
        homeViewPager.adapter = homeAdapter
        homeTab.setupWithViewPager(homeViewPager)

        homeTab.getTabAt(0)!!.setIcon(R.drawable.icon_user).setCustomView(R.layout.tab_user)
        homeTab.getTabAt(1)!!.setIcon(R.drawable.icon_post).setCustomView(R.layout.tab_post)
        homeTab.getTabAt(2)!!.setIcon(R.drawable.icon_album).setCustomView(R.layout.tab_album)

        homeViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
            override fun onPageSelected(position: Int) {
                setHeading(position)
            }

        })

    }

    private fun setHeading(position : Int) {
        when(position) {
            0 -> supportActionBar?.title = resources.getString(R.string.tab_user)
            1 -> supportActionBar?.title = resources.getString(R.string.tab_time)
            2 -> supportActionBar?.title = resources.getString(R.string.tab_album)
        }
    }

}