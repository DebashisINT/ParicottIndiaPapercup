package com.paricottfsm.features.login.model.productlistmodel

import com.paricottfsm.app.domain.ModelEntity
import com.paricottfsm.app.domain.ProductListEntity
import com.paricottfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}