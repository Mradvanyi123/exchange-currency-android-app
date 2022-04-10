package com.example.exchange_currency_android_app.di

import android.app.Application
import androidx.room.Room
import com.example.exchange_currency_android_app.R
import com.example.exchange_currency_android_app.persistence.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersistenceModule {
    @Provides
    @Singleton
    fun provideAppDatabase(application: Application) = Room
        .databaseBuilder(
            application,
            AppDatabase::class.java,
            application.getString(R.string.database)
        )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideCurrencyDao(appDatabase: AppDatabase) = appDatabase.currencyDao()
}