package com.mqasoft.echo.login.domain.repository

import com.google.firebase.auth.FirebaseUser
import com.mqasoft.echo.core.common.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val currentUser: FirebaseUser?
    suspend fun login(email: String, password: String): Flow<Resource<FirebaseUser>>
    suspend fun signup(name: String, email: String, password: String): Flow<Resource<FirebaseUser>>
    fun logout()
}