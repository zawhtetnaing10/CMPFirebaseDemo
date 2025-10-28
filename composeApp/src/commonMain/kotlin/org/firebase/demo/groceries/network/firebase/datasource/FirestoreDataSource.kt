package org.firebase.demo.groceries.network.firebase.datasource

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.firestore.firestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.firebase.demo.groceries.data.GroceryVO

object FirestoreDataSource : DataSource {

    val db = Firebase.firestore

    override fun getGroceries(): Flow<List<GroceryVO>> {
        return db.collection("groceries")
            .snapshots
            .map { querySnapshot ->
                println("Query snapshot ====> $querySnapshot")
                querySnapshot.documents.map {
                    println("Document snapshot ======> $it")
                    it.data(GroceryVO.serializer())
                }
            }
    }
}