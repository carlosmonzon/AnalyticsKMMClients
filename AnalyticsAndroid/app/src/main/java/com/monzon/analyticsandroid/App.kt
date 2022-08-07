package com.monzon.analyticsandroid

import android.app.Application
import com.monzon.analytics.Analytics
import com.monzon.analytics.Configuration

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Analytics(configuration = Configuration(writeKey = "YOUR API KEY"))
    }
}