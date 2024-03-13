package com.example.weatherapp.view.activity

import AddLocationFragment
import LocationWeatherPagerAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.view.fragment.LocationWeatherFragment
import com.example.weatherapp.viewmodel.LocationsViewModel
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: LocationWeatherPagerAdapter

    private val locationsViewModel: LocationsViewModel by lazy {
        ViewModelProvider(this)[LocationsViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        adapter = LocationWeatherPagerAdapter(this)
        binding.viewPager.adapter = adapter

        adapter.addAddLocationFragment(AddLocationFragment())

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text =
                if (position < adapter.itemCount - 1) "Location ${position + 1}" else "Add Location"
        }.attach()

        locationsViewModel.locations.observe(this) { locations ->
            Log.e("xd", "locations changed: $locations")
            adapter.addFragment(LocationWeatherFragment(locations.last()))
        }
    }
}