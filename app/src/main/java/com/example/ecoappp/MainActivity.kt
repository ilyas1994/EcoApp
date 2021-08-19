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

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle123", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle123", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle123", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle123", "onStop")


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle123", "onDestroy")
    }

}