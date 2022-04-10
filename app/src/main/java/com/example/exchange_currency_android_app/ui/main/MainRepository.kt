package com.example.exchange_currency_android_app.ui.main

import com.example.exchange_currency_android_app.network.CurrencyService
import com.example.exchange_currency_android_app.persistence.CurrencyDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val currencyService: CurrencyService,
    private val currencyDao: CurrencyDao
)