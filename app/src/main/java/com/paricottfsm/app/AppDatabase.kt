package com.paricottfsm.app

import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import android.content.Context

import com.paricottfsm.app.AppConstant.DBNAME
import com.paricottfsm.app.domain.*
import com.paricottfsm.features.lead.model.LeadActivityDao
import com.paricottfsm.features.lead.model.LeadActivityEntity
import com.paricottfsm.features.location.UserLocationDataDao
import com.paricottfsm.features.location.UserLocationDataEntity
import com.paricottfsm.features.login.*
import com.paricottfsm.features.taskManagement.model.TaskManagementDao
import com.paricottfsm.features.taskManagement.model.TaskManagmentEntity


/*
 * Copyright (C) 2017 Naresh Gowd Idiga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//Revision History
// 1.0   AppV 4.0.6  Saheli    05/012/2023 shop_extra_contact migration
// 2.0   AppV 4.0.6  Saheli    06/01/2023 shop_activity and tbl_shop_deefback migration
// 3.0   AppV 4.0.6  Saheli    11/01/2023  shopStatusUpdate migration
// 4.0   AppV 4.0.6  Saheli    20/01/2023  order_product_list order_mrp & order_discount  migration mantis 25601
// 5.0   AppV 4.0.6  Saheli    01/02/2023  product_list   migration changes

@Database(entities = arrayOf(AddShopDBModelEntity::class, UserLocationDataEntity::class, UserLoginDataEntity::class, ShopActivityEntity::class,
        StateListEntity::class, CityListEntity::class, MarketingDetailEntity::class, MarketingDetailImageEntity::class, MarketingCategoryMasterEntity::class,
        TaListDBModelEntity::class, AssignToPPEntity::class, AssignToDDEntity::class, WorkTypeEntity::class, OrderListEntity::class,
        OrderDetailsListEntity::class, ShopVisitImageModelEntity::class, UpdateStockEntity::class, PerformanceEntity::class,
        GpsStatusEntity::class, CollectionDetailsEntity::class, InaccurateLocationDataEntity::class, LeaveTypeEntity::class, RouteEntity::class,
        ProductListEntity::class, OrderProductListEntity::class, StockListEntity::class, RouteShopListEntity::class, SelectedWorkTypeEntity::class,
        SelectedRouteEntity::class, SelectedRouteShopListEntity::class, OutstandingListEntity::class/*, LocationEntity::class*/,
        IdleLocEntity::class, BillingEntity::class, StockDetailsListEntity::class, StockProductListEntity::class, BillingProductListEntity::class,
        MeetingEntity::class, MeetingTypeEntity::class, ProductRateEntity::class, AreaListEntity::class, PjpListEntity::class,
        ShopTypeEntity::class, ModelEntity::class, PrimaryAppEntity::class, SecondaryAppEntity::class, LeadTypeEntity::class,
        StageEntity::class, FunnelStageEntity::class, BSListEntity::class, QuotationEntity::class, TypeListEntity::class,
        MemberEntity::class, MemberShopEntity::class, TeamAreaEntity::class, TimesheetListEntity::class, ClientListEntity::class,
        ProjectListEntity::class, ActivityListEntity::class, TimesheetProductListEntity::class, ShopVisitAudioEntity::class,
        TaskEntity::class, BatteryNetStatusEntity::class, ActivityDropDownEntity::class, TypeEntity::class,
        PriorityListEntity::class, ActivityEntity::class, AddDoctorProductListEntity::class, AddDoctorEntity::class,
        AddChemistProductListEntity::class, AddChemistEntity::class, DocumentypeEntity::class, DocumentListEntity::class, PaymentModeEntity::class,
        EntityTypeEntity::class, PartyStatusEntity::class, RetailerEntity::class, DealerEntity::class, BeatEntity::class, AssignToShopEntity::class,
        VisitRemarksEntity::class, ShopVisitCompetetorModelEntity::class,
        OrderStatusRemarksModelEntity::class, CurrentStockEntryModelEntity::class, CurrentStockEntryProductModelEntity::class,
        CcompetetorStockEntryModelEntity::class, CompetetorStockEntryProductModelEntity::class,
        ShopTypeStockViewStatus::class,
        NewOrderGenderEntity::class, NewOrderProductEntity::class, NewOrderColorEntity::class, NewOrderSizeEntity::class, NewOrderScrOrderEntity::class, ProspectEntity::class,
        QuestionEntity::class, QuestionSubmitEntity::class, AddShopSecondaryImgEntity::class, ReturnDetailsEntity::class, ReturnProductListEntity::class, UserWiseLeaveListEntity::class, ShopFeedbackEntity::class, ShopFeedbackTempEntity::class, LeadActivityEntity::class,
        ShopDtlsTeamEntity::class, CollDtlsTeamEntity::class, BillDtlsTeamEntity::class, OrderDtlsTeamEntity::class,
        TeamAllShopDBModelEntity::class, DistWiseOrderTblEntity::class, NewGpsStatusEntity::class,ShopExtraContactEntity::class,ProductOnlineRateTempEntity::class, TaskManagmentEntity::class,
    VisitRevisitWhatsappStatus::class,CallHisEntity::class,CompanyMasterEntity::class,TypeMasterEntity::class,StatusMasterEntity::class,SourceMasterEntity::class,StageMasterEntity::class,TeamListEntity::class,
    ContactActivityEntity::class,ScheduleTemplateEntity::class,ModeTemplateEntity::class,RuleTemplateEntity::class,SchedulerMasterEntity::class),
        version = 2, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun addShopEntryDao(): AddShopDao
    abstract fun userLocationDataDao(): UserLocationDataDao
    abstract fun userAttendanceDataDao(): UserAttendanceDataDao
    abstract fun shopActivityDao(): ShopActivityDao
    abstract fun stateDao(): StateListDao
    abstract fun cityDao(): CityListDao
    abstract fun marketingDetailDao(): MarketingDetailDao
    abstract fun marketingDetailImageDao(): MarketingDetailImageDao
    abstract fun marketingCategoryMasterDao(): MarketingCategoryMasterDao

    //New implementation
    abstract fun taListDao(): TaListDao

    abstract fun ppListDao(): AssignToPPDao
    abstract fun ddListDao(): AssignToDDDao
    abstract fun workTypeDao(): WorkTypeDao
    abstract fun orderListDao(): OrderListDao
    abstract fun orderDetailsListDao(): OrderDetailsListDao
    abstract fun shopVisitImageDao(): ShopVisitImageDao
    abstract fun shopVisitCompetetorImageDao(): ShopVisitCompetetorDao
    abstract fun shopVisitOrderStatusRemarksDao(): OrderStatusRemarksDao
    abstract fun shopCurrentStockEntryDao(): CurrentStockEntryDao
    abstract fun shopCurrentStockProductsEntryDao(): CurrentStockEntryProductDao
    abstract fun competetorStockEntryDao(): CompetetorStockEntryDao
    abstract fun competetorStockEntryProductDao(): CompetetorStockEntryProductDao
    abstract fun shopTypeStockViewStatusDao(): ShopTypeStockViewStatusDao
    abstract fun updateStockDao(): UpdateStockDao
    abstract fun performanceDao(): PerformanceDao
    abstract fun gpsStatusDao(): GpsStatusDao
    abstract fun collectionDetailsDao(): CollectionDetailsDao
    abstract fun inaccurateLocDao(): InAccurateLocDataDao
    abstract fun leaveTypeDao(): LeaveTypeDao
    abstract fun routeDao(): RouteDao
    abstract fun productListDao(): ProductListDao
    abstract fun orderProductListDao(): OrderProductListDao
    abstract fun stockListDao(): StockListDao
    abstract fun routeShopListDao(): RouteShopListDao
    abstract fun selectedWorkTypeDao(): SelectedWorkTypeDao
    abstract fun selectedRouteListDao(): SelectedRouteDao
    abstract fun selectedRouteShopListDao(): SelectedRouteShopListDao
    abstract fun updateOutstandingDao(): OutstandingListDao

    //abstract fun locationDao(): LocationDao
    abstract fun idleLocDao(): IdleLocDao

    abstract fun billingDao(): BillingDao
    abstract fun stockDetailsListDao(): StockDetailsListDao
    abstract fun stockProductDao(): StockProductListDao
    abstract fun billProductDao(): BillingProductListDao
    abstract fun addMeetingDao(): MeetingDao
    abstract fun addMeetingTypeDao(): MeetingTypeDao
    abstract fun productRateDao(): ProductRateDao
    abstract fun areaListDao(): AreaListDao
    abstract fun shopTypeDao(): ShopTypeDao
    abstract fun pjpListDao(): PjpListDao
    abstract fun modelListDao(): ModelDao
    abstract fun primaryAppListDao(): PrimaryAppDao
    abstract fun secondaryAppListDao(): SecondaryAppDao
    abstract fun leadTypeDao(): LeadTypeDao
    abstract fun stageDao(): StageDao
    abstract fun funnelStageDao(): FunnelStageDao
    abstract fun bsListDao(): BSListDao
    abstract fun quotDao(): QuotationDao
    abstract fun typeListDao(): TypeListDao
    abstract fun memberDao(): MemberDao
    abstract fun memberShopDao(): MemberShopDao
    abstract fun memberAreaDao(): TeamAreaDao
    abstract fun timesheetDao(): TimesheetListDao
    abstract fun clientDao(): ClientListDao
    abstract fun projectDao(): ProjectListDao
    abstract fun activityDao(): ActivityListDao
    abstract fun productDao(): TimesheetProductListDao
    abstract fun shopVisitAudioDao(): ShopVisitAudioDao
    abstract fun taskDao(): TaskDao
    abstract fun batteryNetDao(): BatteryNetStatusDao

    abstract fun activityDropdownDao(): ActivityDropDownDao
    abstract fun typeDao(): TypeDao
    abstract fun priorityDao(): PriorityDao
    abstract fun activDao(): ActivityDao

    abstract fun addDocProductDao(): AddDoctorProductListDao
    abstract fun addDocDao(): AddDoctorDao
    abstract fun addChemistProductDao(): AddChemistProductListDao
    abstract fun addChemistDao(): AddChemistDao

    abstract fun documentTypeDao(): DocumentypeDao
    abstract fun documentListDao(): DocumentListDao

    abstract fun paymenttDao(): PaymentModeDao

    abstract fun entityDao(): EntityTypeDao
    abstract fun partyStatusDao(): PartyStatusDao
    abstract fun retailerDao(): RetailerDao
    abstract fun dealerDao(): DealerDao
    abstract fun beatDao(): BeatDao
    abstract fun assignToShopDao(): AssignToShopDao

    abstract fun visitRemarksDao(): VisitRemarksDao


    //03-09-2021
    abstract fun newOrderGenderDao(): NewOrderGenderDao
    abstract fun newOrderProductDao(): NewOrderProductDao
    abstract fun newOrderColorDao(): NewOrderColorDao
    abstract fun newOrderSizeDao(): NewOrderSizeDao
    abstract fun newOrderScrOrderDao(): NewOrderScrOrderDao

    abstract fun prosDao(): ProspectDao
    abstract fun questionMasterDao(): QuestionDao
    abstract fun questionSubmitDao(): QuestionSubmitDao
    abstract fun addShopSecondaryImgDao(): AddShopSecondaryImgDao

    abstract fun returnDetailsDao(): ReturnDetailsDao
    abstract fun returnProductListDao(): ReturnProductListDao

    abstract fun userWiseLeaveListDao(): UserWiseLeaveListDao

    abstract fun shopFeedbackDao(): ShopFeedbackDao
    abstract fun shopFeedbackTempDao(): ShopFeedbackTepDao
    abstract fun leadActivityDao(): LeadActivityDao

    abstract fun shopDtlsTeamDao(): ShopDtlsTeamDao
    abstract fun billDtlsTeamDao(): BillDtlsTeamDao
    abstract fun orderDtlsTeamDao(): OrderDtlsTeamDao
    abstract fun collDtlsTeamDao(): CollDtlsTeamDao
    abstract fun teamAllShopDBModelDao(): TeamAllShopDBModelDao

    abstract fun distWiseOrderTblDao(): DistWiseOrderTblDao

    abstract fun newGpsStatusDao(): NewGpsStatusDao
    abstract fun shopExtraContactDao(): ShopExtraContactDao

    abstract fun productOnlineRateTempDao(): ProductOnlineRateTempDao


    abstract fun taskManagementDao(): TaskManagementDao
    abstract fun visitRevisitWhatsappStatusDao(): VisitRevisitWhatsappStatusDao
    abstract fun callhisDao(): CallHisDao
    abstract fun companyMasterDao(): CompanyMasterDao
    abstract fun typeMasterDao(): TypeMasterDao
    abstract fun statusMasterDao(): StatusMasterDao
    abstract fun sourceMasterDao(): SourceMasterDao
    abstract fun stageMasterDao(): StageMasterDao
    abstract fun teamListDao(): TeamListDao
    abstract fun contactActivityDao(): ContactActivityDao
    abstract fun scheduleTemplateDao(): ScheduleTemplateDao
    abstract fun modeTemplateDao(): ModeTemplateDao
    abstract fun ruleTemplateDao(): RuleTemplateDao
    abstract fun schedulerMasterDao(): SchedulerMasterDao


    companion object {
        var INSTANCE: AppDatabase? = null

        fun initAppDatabase(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, DBNAME)
                        // allow queries on the main thread.
                        // Don't do this on a real app! See PersistenceBasicSample for an example.
                        .allowMainThreadQueries()
                        .addMigrations( MIGRATION_1_2 )
//                        .fallbackToDestructiveMigration()
                        .build()
            }
        }

        fun getDBInstance(): AppDatabase? {

            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }

        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("create TABLE call_his (sl_no INTEGER NOT NULL PRIMARY KEY , shop_id TEXT NOT NULL DEFAULT '', call_number TEXT NOT NULL DEFAULT '', call_date TEXT NOT NULL DEFAULT '', call_time TEXT NOT NULL DEFAULT '', call_date_time TEXT NOT NULL DEFAULT '', call_type TEXT NOT NULL DEFAULT '',call_duration_sec TEXT NOT NULL DEFAULT '',call_duration TEXT NOT NULL DEFAULT '' ,isUploaded INTEGER NOT NULL DEFAULT 0) ")
                database.execSQL("create TABLE company_master (sl_no INTEGER NOT NULL PRIMARY KEY , company_id INTEGER NOT NULL DEFAULT 0 , company_name TEXT NOT NULL DEFAULT '',isUploaded INTEGER NOT NULL DEFAULT 0) ")
                database.execSQL("create TABLE crm_type_master (sl_no INTEGER NOT NULL PRIMARY KEY , type_id INTEGER NOT NULL DEFAULT 0 , type_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE crm_status_master (sl_no INTEGER NOT NULL PRIMARY KEY , status_id INTEGER NOT NULL DEFAULT 0 , status_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE crm_source_master (sl_no INTEGER NOT NULL PRIMARY KEY , source_id INTEGER NOT NULL DEFAULT 0 , source_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE crm_stage_master (sl_no INTEGER NOT NULL PRIMARY KEY , stage_id INTEGER NOT NULL DEFAULT 0 , stage_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE team_list (sl_no INTEGER NOT NULL PRIMARY KEY , user_id TEXT NOT NULL DEFAULT '' , user_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE contact_activity (sl_no INTEGER NOT NULL PRIMARY KEY , shop_id TEXT NOT NULL DEFAULT '' , activity_date TEXT NOT NULL DEFAULT '', create_date_time TEXT NOT NULL DEFAULT '', isActivityDone INTEGER NOT NULL DEFAULT 0) ")
                database.execSQL("create TABLE schedule_template (sl_no INTEGER NOT NULL PRIMARY KEY , template_id INTEGER NOT NULL DEFAULT 0 , template_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE mode_template (sl_no INTEGER NOT NULL PRIMARY KEY , mode_template_id INTEGER NOT NULL DEFAULT 0 , mode_template_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE rule_template (sl_no INTEGER NOT NULL PRIMARY KEY , rule_template_id INTEGER NOT NULL DEFAULT 0 , rule_template_name TEXT NOT NULL DEFAULT '') ")
                database.execSQL("create TABLE crm_scheduler_master (sl_no INTEGER NOT NULL PRIMARY KEY , scheduler_name TEXT NOT NULL DEFAULT '' , select_template TEXT NOT NULL DEFAULT '', template_content TEXT NOT NULL DEFAULT '', select_mode_id TEXT NOT NULL DEFAULT '', select_mode TEXT NOT NULL DEFAULT '', select_rule_id TEXT NOT NULL DEFAULT '', select_rule TEXT NOT NULL DEFAULT '', select_hour TEXT NOT NULL DEFAULT '', select_minute TEXT NOT NULL DEFAULT '', select_time TEXT NOT NULL DEFAULT '', select_date TEXT NOT NULL DEFAULT '', select_timestamp TEXT NOT NULL DEFAULT '', repeat_every_month INTEGER NOT NULL DEFAULT 0, select_contact_id TEXT NOT NULL DEFAULT '', select_contact TEXT NOT NULL DEFAULT '', save_date_time TEXT NOT NULL DEFAULT '', isUploaded INTEGER NOT NULL DEFAULT 0, isActivityDone INTEGER NOT NULL DEFAULT 0) ")


                //database.execSQL("alter table shop_detail ADD COLUMN FSSAILicNo TEXT")
                database.execSQL("alter table shop_detail ADD COLUMN isUpdateAddressFromShopMaster INTEGER ")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_firstName TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_lastName TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN companyName TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN companyName_id TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN jobTitle TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_assignTo TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_status TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_source TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_reference TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_reference_ID TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_reference_ID_type TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_stage TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_stage_ID TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_assignTo_ID TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_type TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_type_ID TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_status_ID TEXT")
                database.execSQL("ALTER TABLE shop_detail ADD COLUMN crm_source_ID TEXT")
                database.execSQL("alter table shop_detail ADD COLUMN crm_saved_from TEXT")
                database.execSQL("alter table gps_status ADD COLUMN reasontagforGPS TEXT")
            }}

    }


//}


}