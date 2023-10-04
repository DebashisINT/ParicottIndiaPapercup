package com.paricottfsm.features.viewAllOrder.interf

import com.paricottfsm.app.domain.NewOrderGenderEntity
import com.paricottfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}