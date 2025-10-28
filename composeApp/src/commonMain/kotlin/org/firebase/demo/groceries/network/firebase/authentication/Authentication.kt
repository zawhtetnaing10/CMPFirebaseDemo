package org.firebase.demo.groceries.network.firebase.authentication

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth

object Authentication {
    val auth = Firebase.auth

    // Check if user is logged in
    fun isLoggedIn(): Boolean {
        val isUserLoggedIn = auth.currentUser != null

        // Logged in user
        println("Logged in user ======> ${auth.currentUser?.email}")

        return isUserLoggedIn
    }

    suspend fun register(email: String, password: String) {
        val createdUser =
            auth.createUserWithEmailAndPassword(email = email, password = password).user
        if (createdUser != null) {
            println("The user has been created ${createdUser.uid}")
        }
    }

    suspend fun login(email: String, password: String) {
        val signedInUser = auth.signInWithEmailAndPassword(email = email, password = password).user
        if (signedInUser != null) {
            println("login successful ${signedInUser.uid}")
        }
    }
}