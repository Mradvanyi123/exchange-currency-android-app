package com.example.exchange_currency_android_app.di

import android.app.Application
import androidx.room.Room
import com.example.exchange_currency_android_app.persistence.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersistenceModule {

}