package com.mqasoft.echo.login.domain.usecase

import com.google.firebase.auth.FirebaseUser
import com.mqasoft.echo.core.common.Resource
import com.mqasoft.echo.login.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUsecase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String) : Flow<Resource<FirebaseUser>>{
        return repository.login(email, password)
    }

}