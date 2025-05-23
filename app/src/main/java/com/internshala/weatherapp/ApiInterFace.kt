package com.internshala.weatherapp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterFace {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city:String,
        @Query("appid") apiid:String,
        @Query("units") units:String

    ):Call<WeatherApp>
}