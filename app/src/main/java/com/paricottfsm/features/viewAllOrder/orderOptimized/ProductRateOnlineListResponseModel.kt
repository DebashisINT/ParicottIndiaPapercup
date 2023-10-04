package com.paricottfsm.features.viewAllOrder.orderOptimized

import com.paricottfsm.app.domain.ProductOnlineRateTempEntity
import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}