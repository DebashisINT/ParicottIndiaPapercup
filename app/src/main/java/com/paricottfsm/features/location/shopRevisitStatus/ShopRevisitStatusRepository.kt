package com.paricottfsm.features.location.shopRevisitStatus

import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.location.model.ShopDurationRequest
import com.paricottfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}