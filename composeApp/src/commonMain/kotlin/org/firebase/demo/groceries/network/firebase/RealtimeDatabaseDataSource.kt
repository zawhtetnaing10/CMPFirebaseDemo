package org.firebase.demo.groceries.network.firebase

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.database.DataSnapshot
import dev.gitlive.firebase.database.database
import kotlinx.coroutines.flow.Flow

object RealtimeDatabaseDataSource{
    val db = Firebase.database

    val groceryRef = db.reference("groceries")

    fun getGroceries() : Flow<DataSnapshot> {
        return groceryRef.valueEvents
    }
}