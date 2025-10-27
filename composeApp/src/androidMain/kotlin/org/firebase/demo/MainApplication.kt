package org.firebase.demo

import android.app.Application
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseOptions
import dev.gitlive.firebase.initialize

class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Firebase.initialize(this)
    }
}