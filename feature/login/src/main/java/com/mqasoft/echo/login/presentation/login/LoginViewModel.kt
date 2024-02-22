package com.mqasoft.echo.login.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mqasoft.echo.core.common.Resource
import com.mqasoft.echo.login.domain.usecase.LoginUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel  @Inject constructor(
    private val loginUsecase: LoginUsecase
): ViewModel() {

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
        viewModelScope.launch {
            if (email.trim().isEmpty() || password.trim().isEmpty()){
                state.value = state.value.copy(
                    error = "Add information"
                )
            } else{
                loginUsecase(email, password).collect {respone ->
                    when(respone){
                        is Resource.Success ->{
                            state.value = state.value.copy(
                                result = respone.data,
                                isLoading = false
                            )
                        }
                        is Resource.Loading ->{
                            state.value = state.value.copy(
                                isLoading = true
                            )
                        }
                        is Resource.Error -> {
                            state.value = state.value.copy(
                                isLoading = false,
                                error = respone.message,
                                result = null
                            )
                        }
                    }

                }
            }
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