package com.raihan.auth.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raihan.data.domain.CustomerRepository
import dev.gitlive.firebase.auth.FirebaseUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch

class AuthViewModel(
    private val customerRepository: CustomerRepository
) : ViewModel() {

    fun createCustomer(
        user : FirebaseUser?,
        onSuccess : () -> Unit,
        onError : (String) -> Unit
    ) {
        viewModelScope.launch(Dispatchers.Main) {
            customerRepository.createCustomer(
                user = user,
                onSuccess = onSuccess,
                onError = onError
            )
        }
    }

}