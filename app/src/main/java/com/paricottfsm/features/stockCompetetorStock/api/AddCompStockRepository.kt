package com.paricottfsm.features.stockCompetetorStock.api

import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.orderList.model.NewOrderListResponseModel
import com.paricottfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.paricottfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}