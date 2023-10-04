package com.paricottfsm.features.location.shopRevisitStatus

import com.paricottfsm.features.location.shopdurationapi.ShopDurationApi
import com.paricottfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}