package com.raihan.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.raihan.auth.screens.AuthScreen
import com.raihan.auth.screens.HomeScreen

@Composable
fun SetupNavGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Auth){
        composable<Screen.Auth> {
            AuthScreen {
                navController.navigate(Screen.Home)
            }
        }

        composable<Screen.Home> {
            HomeScreen()
        }
    }
}
