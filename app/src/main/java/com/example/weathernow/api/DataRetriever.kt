package com.example.weathernow.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataRetriever {
    val API = "39d0b8791dc849d89ba230626252801"
    private val URL = "https://api.weatherapi.com"
    val weatherApi = getInstance().create(WeatherApi::class.java)

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}