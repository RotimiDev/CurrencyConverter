package com.example.currencyconverter.model

data class CurrencyRate(val currencyCode: String, val rate: Double, val baseCurrencyCode: String, val date: String="latest")
