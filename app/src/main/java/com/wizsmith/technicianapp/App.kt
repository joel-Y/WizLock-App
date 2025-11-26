package com.wizsmith.technicianapp

import android.app.Application
import com.wizsmith.technicianapp.ttlock.TTLockHelper

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        TTLockHelper.initialize(this)
    }
}
