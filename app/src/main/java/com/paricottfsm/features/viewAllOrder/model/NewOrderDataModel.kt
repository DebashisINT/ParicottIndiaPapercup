package com.paricottfsm.features.viewAllOrder.model

import com.paricottfsm.app.domain.NewOrderColorEntity
import com.paricottfsm.app.domain.NewOrderGenderEntity
import com.paricottfsm.app.domain.NewOrderProductEntity
import com.paricottfsm.app.domain.NewOrderSizeEntity
import com.paricottfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

