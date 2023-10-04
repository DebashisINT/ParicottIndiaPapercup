package com.paricottfsm.features.stockAddCurrentStock.api

import com.paricottfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.paricottfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}