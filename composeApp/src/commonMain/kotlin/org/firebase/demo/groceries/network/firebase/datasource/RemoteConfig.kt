package org.firebase.demo.groceries.network.firebase.datasource

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.remoteconfig.FirebaseRemoteConfig
import dev.gitlive.firebase.remoteconfig.remoteConfig
import kotlin.time.Duration.Companion.seconds

object RemoteConfig {
    val remoteConfig: FirebaseRemoteConfig = Firebase.remoteConfig

    suspend fun fetchAndActivate() {
        remoteConfig.settings {
            minimumFetchInterval = 10.seconds
        }
        remoteConfig.fetchAndActivate()
    }

    fun getViewType(): String {
        return remoteConfig.getValue("view_type").asString()
    }
}