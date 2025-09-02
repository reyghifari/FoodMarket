package com.raihan.core.domain

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id : String = "",
    val name : String = "",
    val email : String = "",
    val firstName : String = "",
    val lastName : String = "",
    val city : String = "",
    val postalCode : Int = 0,
    val address : String = "",
    val phoneNumber: PhoneNumber,
    val listCartItem : List<CardItem> = emptyList()
)

@Serializable
data class PhoneNumber(
    val dialCode : Int = 0,
    val number : String = ""
)

