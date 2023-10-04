package com.paricottfsm.features.viewAllOrder.interf

import com.paricottfsm.app.domain.NewOrderGenderEntity
import com.paricottfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}