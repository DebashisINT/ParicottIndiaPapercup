package com.paricottfsm.features.nearbyuserlist.api

import com.paricottfsm.app.Pref
import com.paricottfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.paricottfsm.features.newcollection.model.NewCollectionListResponseModel
import com.paricottfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}