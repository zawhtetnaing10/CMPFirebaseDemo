package org.firebase.demo.groceries.network.firebase.datasource

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.installations.installations

object FirebaseInstallations {
    suspend fun getInstallationsId(){
        val installationsId = Firebase.installations.getId()
        println("Installation Id ====> $installationsId")
    }
}