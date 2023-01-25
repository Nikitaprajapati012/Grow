package com.example.grow.data.models

import java.io.Serializable

class StockSymbol : ArrayList<StockSymbol.StockSymbolItem>(){
    data class StockSymbolItem(
        val currency: String,
        val description: String,
        val displaySymbol: String,
        val figi: String,
        val mic: String,
        val symbol: String,
        val type: String
    ):Serializable
}
