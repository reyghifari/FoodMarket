package com.raihan.market

import android.app.Application
import com.google.firebase.FirebaseApp
import com.raihan.di.initializeModule
import org.koin.android.ext.koin.androidContext

class FoodApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeModule(
            config = {
                androidContext(this@FoodApplication)
            }
        )
        FirebaseApp.initializeApp(this)
    }
}