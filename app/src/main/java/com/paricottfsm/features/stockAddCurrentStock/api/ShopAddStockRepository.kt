package com.paricottfsm.features.stockAddCurrentStock.api

import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.location.model.ShopRevisitStatusRequest
import com.paricottfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.paricottfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.paricottfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.paricottfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}