package com.paricottfsm.features.newcollection.model

import com.paricottfsm.app.domain.CollectionDetailsEntity
import com.paricottfsm.base.BaseResponse
import com.paricottfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}