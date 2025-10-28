package org.firebase.demo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import cmpfirebasedemo.composeapp.generated.resources.Res
import cmpfirebasedemo.composeapp.generated.resources.compose_multiplatform
import org.firebase.demo.core.firebase.analytics.Analytics
import org.firebase.demo.core.firebase.authentication.Authentication
import org.firebase.demo.core.utils.universalJsonParser

@Composable
@Preview
fun App() {

    LaunchedEffect(Unit) {
//        RealtimeDatabaseDataSource.getGroceries()
//            .collectLatest {
//                println("Grocery items ====> $it")
//            }

//        FirestoreDataSource.getGroceries()
//            .collectLatest {
//                println("Grocery items ====> $it")
//            }

        // Try registering
        //Authentication.register("zawgyi.gog@gmail.com", "zawhtetnaing1992")

        // Try Logging in
        //Authentication.login("zawgyi.gog@gmail.com", "zawhtetnaing1992")

        // Check if logged in
        //Authentication.isLoggedIn()

        Analytics.logEvent("userloggedIn", "zawgyi.gog@gmail.com")
    }

    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}