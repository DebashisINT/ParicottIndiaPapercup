package com.paricottfsm.features.viewAllOrder.interf

import com.paricottfsm.app.domain.NewOrderProductEntity
import com.paricottfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}