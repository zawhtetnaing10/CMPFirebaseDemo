package org.firebase.demo.groceries.network.firebase.datasource

import kotlinx.coroutines.flow.Flow
import org.firebase.demo.groceries.data.GroceryVO

interface DataSource {
    fun getGroceries(): Flow<List<GroceryVO>>
}