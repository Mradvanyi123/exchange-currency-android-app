package com.example.exchange_currency_android_app.di

import android.content.Context
import com.example.exchange_currency_android_app.network.RequestInspector
import javax.inject.Singleton
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient


@Module
@InstallIn(SingletonComponent::class)
object NetworkingModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context) = OkHttpClient.Builder()
        .addInterceptor(RequestInspector())
        .build()

}
