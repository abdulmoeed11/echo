package com.mqasoft.echo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mqasoft.echo.core.navigation.Screen
import com.mqasoft.echo.login.navigation.addLoginNestedGraph
import com.mqasoft.echo.login.presentation.login.LoginScreen
import com.mqasoft.echo.welcome.WelcomeScreen

@Composable
fun EchoNavigation(loggedIn: Boolean){
    val navController = rememberNavController()
    lateinit var startDestination: String
    if (loggedIn){
        startDestination = Screen.HomeScreen.route
    } else{
        startDestination = Screen.WelcomeScreen.route
    }
    NavHost(navController = navController, startDestination = startDestination){
        composable(route = Screen.WelcomeScreen.route){
            WelcomeScreen(navController)
        }
        composable(route = Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        addLoginNestedGraph(navController)
    }

}
