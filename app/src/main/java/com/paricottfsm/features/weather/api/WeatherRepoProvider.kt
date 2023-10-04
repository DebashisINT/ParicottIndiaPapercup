package com.paricottfsm.features.weather.api

import com.paricottfsm.features.task.api.TaskApi
import com.paricottfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}