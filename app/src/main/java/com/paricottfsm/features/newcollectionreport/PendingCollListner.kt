package com.paricottfsm.features.newcollectionreport

import com.paricottfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}