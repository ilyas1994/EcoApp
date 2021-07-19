package com.example.ecoappp

import PresenterOnBoarding.FragmentAdapter
import View.ViewFragmentPager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchFragment(Fragment())
        viewPager()

    }

    private fun viewPager(){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, ViewFragmentPager())
            commit()
        }
    }


    fun switchFragment(fr: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, fr)
            commit()
        }
    }

//    fun switchStatusTablayout(boolean: Boolean) {
//        if (boolean == true) {
//            viewPager.adapter = fragmentAdapter
//            tabLayout.setupWithViewPager(viewPager)
//        } else {
//            viewPager.adapter = null
//            tabLayout.setupWithViewPager(null)
//        }
//
//    }


}