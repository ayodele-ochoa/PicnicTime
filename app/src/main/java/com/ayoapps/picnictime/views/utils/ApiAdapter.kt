package com.ayoapps.picnictime.views.utils

import com.ayoapps.picnictime.views.interfaces.OpenWeahterApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiAdapter {
    val apiClient: OpenWeahterApi = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(OpenWeahterApi::class.java)
}