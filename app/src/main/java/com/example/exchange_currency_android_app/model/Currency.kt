package com.example.exchange_currency_android_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import javax.annotation.concurrent.Immutable

@Entity
@Immutable
data class Currency(
    @PrimaryKey val id: String,
    val name: String,
    val date: Date,
    val exchangeRates: String, // Object/ string
){
    companion object {
        fun mock() = Currency(
            id = "0",
            name = "What do you call Dragon with no silver?",
            date = Date("2022-04-10"),
            exchangeRates = "JsonReader()"
        )
    }
}
