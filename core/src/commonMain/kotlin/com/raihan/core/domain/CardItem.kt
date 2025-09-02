package com.raihan.core.domain

import kotlinx.serialization.Serializable
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@Serializable
data class CardItem @OptIn(ExperimentalUuidApi::class) constructor(
    val id : String = Uuid.random().toHexString(),
    val productId : String,
    val flavor : String = "",
    val quantity : Int = 0,
)