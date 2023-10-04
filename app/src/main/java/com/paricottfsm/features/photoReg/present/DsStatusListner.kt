package com.paricottfsm.features.photoReg.present

import com.paricottfsm.app.domain.ProspectEntity
import com.paricottfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}