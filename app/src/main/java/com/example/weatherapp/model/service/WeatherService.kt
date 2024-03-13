package com.example.weatherapp.model.service

import com.example.weatherapp.model.data.LocationWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("v4/weather/forecast")
    suspend fun getWeatherByLocation(
        @Query("location") location: String,
        @Query("apikey") apikey: String = "ImAUAK80vu09qEi4eUcFUilDWRORaaOY"
    ): Response<LocationWeather>
}