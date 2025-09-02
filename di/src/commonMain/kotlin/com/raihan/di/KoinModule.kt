package com.raihan.di

import com.raihan.auth.screens.AuthViewModel
import com.raihan.data.CustomerRepositoryImpl
import com.raihan.data.domain.CustomerRepository
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module


val coreModule = module {
    single<CustomerRepository> { CustomerRepositoryImpl() }
    viewModelOf(::AuthViewModel)
}


fun initializeModule(
    config : (KoinApplication.() -> Unit)? = null
){
    startKoin {
        config?.invoke(this)
        modules(coreModule)
    }
}