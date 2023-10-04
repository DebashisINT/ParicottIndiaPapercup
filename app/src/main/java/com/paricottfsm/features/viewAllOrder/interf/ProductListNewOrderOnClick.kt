package com.paricottfsm.features.viewAllOrder.interf

import com.paricottfsm.app.domain.NewOrderGenderEntity
import com.paricottfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}