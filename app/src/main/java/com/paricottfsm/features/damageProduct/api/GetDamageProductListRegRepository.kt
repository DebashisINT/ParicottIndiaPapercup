package com.paricottfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.paricottfsm.app.FileUtils
import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.NewQuotation.model.*
import com.paricottfsm.features.addshop.model.AddShopRequestData
import com.paricottfsm.features.addshop.model.AddShopResponse
import com.paricottfsm.features.damageProduct.model.DamageProductResponseModel
import com.paricottfsm.features.damageProduct.model.delBreakageReq
import com.paricottfsm.features.damageProduct.model.viewAllBreakageReq
import com.paricottfsm.features.login.model.userconfig.UserConfigResponseModel
import com.paricottfsm.features.myjobs.model.WIPImageSubmit
import com.paricottfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}