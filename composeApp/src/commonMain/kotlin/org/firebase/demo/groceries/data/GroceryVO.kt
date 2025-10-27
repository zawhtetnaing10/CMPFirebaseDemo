package org.firebase.demo.groceries.data

import kotlinx.serialization.Serializable

@Serializable
data class GroceryVO(
    val name: String,
    val description: String,
    val price: Int
)