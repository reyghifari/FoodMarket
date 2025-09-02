package com.raihan.data

import com.raihan.core.domain.Customer
import com.raihan.core.domain.PhoneNumber
import com.raihan.data.domain.CustomerRepository
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.FirebaseUser
import dev.gitlive.firebase.firestore.firestore

class CustomerRepositoryImpl : CustomerRepository {

    override suspend fun createCustomer(
        user: FirebaseUser?,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        try {
            if (user != null){
                val customerCollection = Firebase.firestore.collection("customer")
                val customer = Customer(
                    id = user.uid,
                    firstName = user.displayName?.split(" ")?.firstOrNull() ?: "",
                    name = user.displayName ?: "",
                    email = user.email ?: "",
                    lastName =  user.displayName?.split(" ")?.lastOrNull() ?: "",
                    phoneNumber = PhoneNumber(
                        dialCode = 0,
                        number = user.phoneNumber ?: ""
                    )
                )
                val customerExist = customerCollection.document(user.uid).get().exists

                if (customerExist){
                    onSuccess()
                }else{
                    customerCollection.document(user.uid).set(customer)
                    onSuccess()
                }

            }else{
                onError("User is not available")
            }
        }catch (e: Exception){
            onError("Error while creating a user ${e.message}")
        }
    }

}