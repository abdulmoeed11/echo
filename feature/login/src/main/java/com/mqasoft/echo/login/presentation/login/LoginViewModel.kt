package com.mqasoft.echo.login.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

//@HiltViewModel
class LoginViewModel : ViewModel() {

    var state = mutableStateOf(LoginState())
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    fun onEmailChanged(value: String) {
        email = value
    }

    fun onPasswordChanged(value: String) {
        password = value
    }

    fun onSubmit(){
        if (email.trim().isEmpty() || password.trim().isEmpty()){
            state.value = state.value.copy(
                error = "Add information"
            )
        }
    }

    fun onDismissBottomSheet(){
        viewModelScope.launch {
            state.value = state.value.copy(
                error = null
            )
        }
    }
}