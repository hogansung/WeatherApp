package com.example.weatherapp.data.model

import java.time.Instant

data class ValueMinutely(
    val cloudBase: Double?,
    val cloudCeiling: Double?,
    val cloudCover: Double?,
    val dewPoint: Double?,
    val freezingRainIntensity: Double?,
    val humidity: Double?,
    val precipitationProbability: Double?,
    val pressureSurfaceLevel: Double?,
    val rainIntensity: Double?,
    val sleetIntensity: Double?,
    val snowIntensity: Double?,
    val temperature: Double?,
    val temperatureApparent: Double?,
    val uvHealthConcern: Double?,
    val uvIndex: Double?,
    val visibility: Double?,
    val weatherCode: Double?,
    val windDirection: Double?,
    val windGust: Double?,
    val windSpeed: Double?,
)

data class ValueHourly(
    val cloudBase: Double?,
    val cloudCeiling: Double?,
    val cloudCover: Double?,
    val dewPoint: Double?,
    val evapotranspiration: Double?,
    val freezingRainIntensity: Double?,
    val humidity: Double?,
    val iceAccumulation: Double?,
    val iceAccumulationLwe: Double?,
    val precipitationProbability: Double?,
    val pressureSurfaceLevel: Double?,
    val rainAccumulation: Double?,
    val rainAccumulationLwe: Double?,
    val rainIntensity: Double?,
    val sleetAccumulation: Double?,
    val sleetAccumulationLwe: Double?,
    val sleetIntensity: Double?,
    val snowAccumulation: Double?,
    val snowAccumulationLwe: Double?,
    val snowDepth: Double?,
    val snowIntensity: Double?,
    val temperature: Double?,
    val temperatureApparent: Double?,
    val uvHealthConcern: Double?,
    val uvIndex: Double?,
    val visibility: Double?,
    val weatherCode: Double?,
    val windDirection: Double?,
    val windGust: Double?,
    val windSpeed: Double?,
)

data class ValueDaily(
    val cloudBaseAvg: Double?,
    val cloudBaseMax: Double?,
    val cloudBaseMin: Double?,
    val cloudCeilingAvg: Double?,
    val cloudCeilingMax: Double?,
    val cloudCeilingMin: Double?,
    val cloudCoverAvg: Double?,
    val cloudCoverMax: Double?,
    val cloudCoverMin: Double?,
    val dewPointAvg: Double?,
    val dewPointMax: Double?,
    val dewPointMin: Double?,
    val evapotranspirationAvg: Double?,
    val evapotranspirationMax: Double?,
    val evapotranspirationMin: Double?,
    val evapotranspirationSum: Double?,
    val freezingRainIntensityAvg: Double?,
    val freezingRainIntensityMax: Double?,
    val freezingRainIntensityMin: Double?,
    val humidityAvg: Double?,
    val humidityMax: Double?,
    val humidityMin: Double?,
    val iceAccumulationAvg: Double?,
    val iceAccumulationLweAvg: Double?,
    val iceAccumulationLweMax: Double?,
    val iceAccumulationLweMin: Double?,
    val iceAccumulationLweSum: Double?,
    val iceAccumulationMax: Double?,
    val iceAccumulationMin: Double?,
    val iceAccumulationSum: Double?,
    val moonriseTime: Instant?,
    val moonsetTime: Instant?,
    val precipitationProbabilityAvg: Double?,
    val precipitationProbabilityMax: Double?,
    val precipitationProbabilityMin: Double?,
    val pressureSurfaceLevelAvg: Double?,
    val pressureSurfaceLevelMax: Double?,
    val pressureSurfaceLevelMin: Double?,
    val rainAccumulationAvg: Double?,
    val rainAccumulationLweAvg: Double?,
    val rainAccumulationLweMax: Double?,
    val rainAccumulationLweMin: Double?,
    val rainAccumulationMax: Double?,
    val rainAccumulationMin: Double?,
    val rainAccumulationSum: Double?,
    val rainIntensityAvg: Double?,
    val rainIntensityMax: Double?,
    val rainIntensityMin: Double?,
    val sleetAccumulationAvg: Double?,
    val sleetAccumulationLweAvg: Double?,
    val sleetAccumulationLweMax: Double?,
    val sleetAccumulationLweMin: Double?,
    val sleetAccumulationLweSum: Double?,
    val sleetAccumulationMax: Double?,
    val sleetAccumulationMin: Double?,
    val sleetIntensityAvg: Double?,
    val sleetIntensityMax: Double?,
    val sleetIntensityMin: Double?,
    val snowAccumulationAvg: Double?,
    val snowAccumulationLweAvg: Double?,
    val snowAccumulationLweMax: Double?,
    val snowAccumulationLweMin: Double?,
    val snowAccumulationLweSum: Double?,
    val snowAccumulationMax: Double?,
    val snowAccumulationMin: Double?,
    val snowAccumulationSum: Double?,
    val snowDepthAvg: Double?,
    val snowDepthMax: Double?,
    val snowDepthMin: Double?,
    val snowDepthSum: Double?,
    val snowIntensityAvg: Double?,
    val snowIntensityMax: Double?,
    val snowIntensityMin: Double?,
    val sunriseTime: Instant?,
    val sunsetTime: Instant?,
    val temperatureApparentAvg: Double?,
    val temperatureApparentMax: Double?,
    val temperatureApparentMin: Double?,
    val temperatureAvg: Double?,
    val temperatureMax: Double?,
    val temperatureMin: Double?,
    val uvHealthConcernAvg: Double?,
    val uvHealthConcernMax: Double?,
    val uvHealthConcernMin: Double?,
    val uvIndexAvg: Double?,
    val uvIndexMax: Double?,
    val uvIndexMin: Double?,
    val visibilityAvg: Double?,
    val visibilityMax: Double?,
    val visibilityMin: Double?,
    val weatherCodeMax: Double?,
    val weatherCodeMin: Double?,
    val windDirectionAvg: Double?,
    val windGustAvg: Double?,
    val windGustMax: Double?,
    val windGustMin: Double?,
    val windSpeedAvg: Double?,
    val windSpeedMax: Double?,
    val windSpeedMin: Double?,
)

data class MinutelyEntry(
    val time: Instant,
    val values: ValueMinutely,
)

data class HourlyEntry(
    val time: Instant,
    val values: ValueHourly,
)

data class DailyEntry(
    val time: Instant,
    val values: ValueDaily,
)

data class Timelines(
    val minutely: List<MinutelyEntry>?,
    val hourly: List<HourlyEntry>?,
    val daily: List<DailyEntry>?,
)

data class Location(val lat: Double, val lon: Double)

data class LocationWeather(val timelines: Timelines, val location: Location)
