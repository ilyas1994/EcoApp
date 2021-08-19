package com.example.ecoappp.di

import android.app.Application
import org.koin.core.context.startKoin

class AppClass: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(appModules, fragmentConverter1Categoryy, fragmentonBoarding))
        }
    }
}