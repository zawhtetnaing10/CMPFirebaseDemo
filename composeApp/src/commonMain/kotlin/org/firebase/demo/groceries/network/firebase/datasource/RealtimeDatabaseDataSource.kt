package org.firebase.demo.groceries.network.firebase.datasource

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.database.database
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.firebase.demo.groceries.data.GroceryVO

object RealtimeDatabaseDataSource : DataSource {
    val db = Firebase.database

    val groceryRef = db.reference("groceries")

    override fun getGroceries(): Flow<List<GroceryVO>> {
        return groceryRef.valueEvents
            .map {
                it.value<Map<String, GroceryVO>>().values.toList()
            }
    }
}