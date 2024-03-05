package com.mqasoft.echo.core.navigation

sealed class Screen(val route: String){
    object WelcomeScreen: Screen("welcome_screen")
    object LoginScreen: Screen("login_screen")
}
