package org.firebase.demo.core.utils

import kotlinx.serialization.json.Json

val universalJsonParser = Json {
    ignoreUnknownKeys = true
    explicitNulls = false
    prettyPrint = true
}