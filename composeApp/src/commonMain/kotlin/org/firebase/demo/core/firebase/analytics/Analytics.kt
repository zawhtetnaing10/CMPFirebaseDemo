package org.firebase.demo.core.firebase.analytics

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.analytics.analytics
import dev.gitlive.firebase.analytics.logEvent


object Analytics {
    val analytics = Firebase.analytics

    fun logEvent(eventName: String, extraData: String) {
        analytics.logEvent(eventName) {
            param("extraData", extraData)
        }
    }
}