package com.example.weatherapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.repository.WeatherRepository
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val weatherRepository by lazy { WeatherRepository() }

    val locationInput = MutableLiveData<String>()

    val weatherData = MutableLiveData<String>()

    fun fetchLocationWeather() {
        val location = locationInput.value!!
        location.let {
            viewModelScope.launch {
                try {
                    val locationWeather = weatherRepository.getWeatherByLocation(it)
                    if (locationWeather == null) {
                        weatherData.postValue("Null response is received in ViewModel")
                    } else {
                        weatherData.postValue(locationWeather.toString())
                    }
                } catch (exception: Exception) {
                    weatherData.postValue("Exception $exception in ViewModel")
                }
            }
        }
    }
}