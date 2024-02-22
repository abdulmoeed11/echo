package com.mqasoft.echo.login.di

import com.google.firebase.auth.FirebaseAuth
import com.mqasoft.echo.login.data.repository.AuthRepositoryImpl
import com.mqasoft.echo.login.domain.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {

    @Provides
    @Singleton
    fun provideAuthRepository(firebaseAuth: FirebaseAuth): AuthRepository = AuthRepositoryImpl(firebaseAuth)
}