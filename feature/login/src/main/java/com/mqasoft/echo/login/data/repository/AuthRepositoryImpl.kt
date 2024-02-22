package com.mqasoft.echo.login.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.UserProfileChangeRequest
import com.mqasoft.echo.core.common.Resource
import com.mqasoft.echo.core.utils.await
import com.mqasoft.echo.login.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : AuthRepository {
    override val currentUser: FirebaseUser?
        get() = firebaseAuth.currentUser

    override suspend fun login(email: String, password: String): Flow<Resource<FirebaseUser>> {
        return flow {
            try {
                emit(Resource.Loading())
                val authResult = firebaseAuth.signInWithEmailAndPassword(email, password).await()
                emit(Resource.Success(authResult.user!!))
            } catch (e : Exception){
                emit(Resource.Error(e.message ?: "Login Failed"))
            }
        }

    }

    override suspend fun signup(
        name: String,
        email: String,
        password: String
    ): Flow<Resource<FirebaseUser>> {
        return flow {
            try {
                emit(Resource.Loading())
                val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
                result?.user?.updateProfile(UserProfileChangeRequest.Builder().setDisplayName(name).build())
                    ?.await()
                emit(Resource.Success(result.user!!))
            } catch (e: Exception) {
                emit(Resource.Error(e.message ?: "Sign up Failed"))
            }
        }
    }

    override fun logout() {
        firebaseAuth.signOut()
    }
}