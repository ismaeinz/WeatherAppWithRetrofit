package com.example.weatherappwithretrofit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {
    private fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.weatherapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val weatherApi: WeatherApi = getInstance().create(WeatherApi::class.java)
}