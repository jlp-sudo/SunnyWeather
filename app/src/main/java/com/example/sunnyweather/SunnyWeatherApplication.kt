package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import java.security.AccessControlContext

class SunnyWeatherApplication:Application() {
    companion object{
        const val TOKEN="xYCaYrlUQb2pdthf"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}