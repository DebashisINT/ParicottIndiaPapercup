package com.paricottfsm.features.photoReg.adapter

import com.paricottfsm.features.photoReg.model.ProsCustom
import com.paricottfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}