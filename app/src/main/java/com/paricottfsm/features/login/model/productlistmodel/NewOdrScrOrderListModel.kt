package com.paricottfsm.features.login.model.productlistmodel

import com.paricottfsm.app.domain.NewOrderScrOrderEntity
import com.paricottfsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}