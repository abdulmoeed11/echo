package com.mqasoft.echo.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mqasoft.echo.core.navigation.Screen
import com.mqasoft.echo.login.presentation.LoginScreen
import com.mqasoft.echo.welcome.WelcomeScreen

@Composable
fun EchoNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.WelcomeScreen.route){
        composable(route = Screen.WelcomeScreen.route){
            WelcomeScreen(navController)
        }
        composable(route = Screen.LoginScreen.route){
            LoginScreen()
        }
    }

}
