package com.paricottfsm.features.viewAllOrder.interf

import com.paricottfsm.app.domain.NewOrderColorEntity
import com.paricottfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}