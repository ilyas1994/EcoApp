package com.example.ecoappp

import View.ViewFragmentPager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager()
    }

    private fun viewPager() {
        val viewPager = Router().createFragment(ViewFragmentPager())
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.emptyFragment, viewPager)
            commit()
        }
    }
}