package com.example.exchange_currency_android_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import javax.annotation.concurrent.Immutable

@Entity(tableName = "currency")
@Immutable
data class Currency(
    @PrimaryKey(autoGenerate = true)
    val name: String,
    val date: Date,
    val exchangeRates: String // Object/ string
){
    companion object {
        fun mock() = Currency(
            name = "What do you call Dragon with no silver?",
            date = Date(),
            exchangeRates = "JsonReader()"
        )
    }
}
