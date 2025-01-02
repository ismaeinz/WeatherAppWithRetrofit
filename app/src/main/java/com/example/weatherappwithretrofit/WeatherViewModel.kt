package com.example.weatherappwithretrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherappwithretrofit.api.RetroInstance
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val weatherApi = RetroInstance.weatherApi


    //
    fun getData(city: String) {
        viewModelScope.launch {
            val response = weatherApi.getWeather("2c737010a5ef434eb0883741250201", city)
            if (response.isSuccessful) {
                Log.i("Response:", response.body().toString())

            } else {
                Log.i("Response:", response.message())

            }
        }
    }
}