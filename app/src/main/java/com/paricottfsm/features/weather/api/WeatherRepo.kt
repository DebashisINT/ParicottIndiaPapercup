package com.paricottfsm.features.weather.api

import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.task.api.TaskApi
import com.paricottfsm.features.task.model.AddTaskInputModel
import com.paricottfsm.features.weather.model.ForeCastAPIResponse
import com.paricottfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}