package com.example.clean_architecture_example.di

import android.content.Context
import android.content.SharedPreferences
import com.example.clean_architecture_example.data.implementation.BitcoinResponseAPIImpl
import com.example.clean_architecture_example.data.retofit.ApiClient
import com.example.clean_architecture_example.page.use_case.MainGetUseCase
import com.example.clean_architecture_example.page.use_case.MainUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): ApiClient {
        return ApiClient
    }

    @Provides
    @Singleton
    fun providesBitcoinApiImpl(apiClient: ApiClient): BitcoinResponseAPIImpl {
        return BitcoinResponseAPIImpl(apiClient = apiClient)
    }

    @Provides
    @Singleton
    fun provideMainUseCases(repository: BitcoinResponseAPIImpl): MainUseCase {
        return MainUseCase(
            getBitcoinResponse = MainGetUseCase(repository),
        )
    }

}