package com.example.weatherapp.ui.view.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.databinding.ActivityWeatherBinding
import com.example.weatherapp.ui.viewmodel.WeatherViewModel

class WeatherActivity : AppCompatActivity() {

    private val weatherViewModel: WeatherViewModel by lazy {
        ViewModelProvider(this)[WeatherViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding: ActivityWeatherBinding = DataBindingUtil.setContentView(this, R.layout.activity_weather)
        binding.lifecycleOwner = this
        binding.weatherViewModel = weatherViewModel
    }
}