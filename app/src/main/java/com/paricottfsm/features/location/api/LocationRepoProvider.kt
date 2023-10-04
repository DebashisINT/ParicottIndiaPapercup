package com.paricottfsm.features.location.api

import com.paricottfsm.features.location.shopdurationapi.ShopDurationApi
import com.paricottfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}