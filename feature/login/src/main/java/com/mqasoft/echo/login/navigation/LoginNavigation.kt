package com.mqasoft.echo.login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mqasoft.echo.core.navigation.Screen
import com.mqasoft.echo.home.presentation.home.HomeScreen

private const val LoginScreenRoute = "loginscreenroute"
fun NavGraphBuilder.addLoginNestedGraph(navController: NavController){
    navigation(startDestination = Screen.LoginScreen.route, route = LoginScreenRoute){
        composable(Screen.HomeScreen.route){
            HomeScreen()
        }
    }
}