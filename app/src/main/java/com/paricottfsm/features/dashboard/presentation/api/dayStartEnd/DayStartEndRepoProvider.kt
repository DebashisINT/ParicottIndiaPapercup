package com.paricottfsm.features.dashboard.presentation.api.dayStartEnd

import com.paricottfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.paricottfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}