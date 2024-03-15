package com.example.weatherapp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.databinding.FragmentLocationWeatherBinding
import com.example.weatherapp.viewmodel.LocationWeatherViewModel

class LocationWeatherFragment(private val location: String) : Fragment() {

    private val locationWeatherViewModel: LocationWeatherViewModel by lazy {
        ViewModelProvider(this)[LocationWeatherViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLocationWeatherBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_location_weather, container, false)
        binding.locationWeatherViewModel = locationWeatherViewModel
        locationWeatherViewModel.location.postValue(location)
        binding.lifecycleOwner = this // Important for LiveData to automatically update the UI
        return binding.root
    }
}