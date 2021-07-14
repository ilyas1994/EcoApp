package com.example.ecoappp

import PresenterOnBoarding.FragmentAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    private var fragmentAdapter = FragmentAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tabs)
        viewPager = findViewById(R.id.viewPager)
        switchFragment(Fragment())
        switchStatusTablayout(true)

    }

    fun switchFragment(fr: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.constrainLayoutOnBoarding, fr)
            commit()
        }
    }

    fun switchStatusTablayout(boolean: Boolean) {
        if (boolean == true) {
            viewPager.adapter = fragmentAdapter
            tabLayout.setupWithViewPager(viewPager)
        } else {
            viewPager.adapter = null
            tabLayout.setupWithViewPager(null)
        }

    }


}