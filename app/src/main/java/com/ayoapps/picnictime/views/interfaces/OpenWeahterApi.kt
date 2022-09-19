package com.ayoapps.picnictime.views.interfaces

import com.ayoapps.picnictime.views.models.WeatherList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface OpenWeahterApi {

    @GET("weather")
    suspend fun getUpdate(
                          @Query("lat") latitude: String,
                          @Query("lon") longitude: String,
                          @Query("appid") apiKey: String,
                          @Query("units") imperial: String,
                          ) : Response<WeatherList>

  //  lat={lat}&lon={lon}&appid={appid}
}