package com.paricottfsm.features.lead.api

import com.paricottfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.paricottfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}