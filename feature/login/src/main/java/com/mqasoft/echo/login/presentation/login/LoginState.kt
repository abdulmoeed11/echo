package com.mqasoft.echo.login.presentation.login

data class LoginState(
    val error: String? = null,
    val isLoading: Boolean = false,
    val value: String = "Success"
)
