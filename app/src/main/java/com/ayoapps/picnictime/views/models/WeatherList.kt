package com.ayoapps.picnictime.views.models

data class WeatherList(
    val name: String?,
    val timezone: String?,
    val id: String?,
    val cod: String?,
    val weather: List<Map<String, Any>>,
    val visibility: Int?,
    val clouds: Map<String, Any>,
    val main: Map<String, Any>,
    val wind: Map<String, Any>,
    val rain: Map<String, Any>,

)
