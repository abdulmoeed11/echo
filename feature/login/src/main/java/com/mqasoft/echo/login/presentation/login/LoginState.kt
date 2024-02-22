package com.mqasoft.echo.login.presentation.login

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser

data class LoginState(
    val error: String? = null,
    val isLoading: Boolean = false,
    val result: FirebaseUser? = null
)
