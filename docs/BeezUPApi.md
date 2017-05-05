# BeezUPApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateUserAccount**](BeezUPApi.md#activateUserAccount) | **POST** /v2/user/customer/account/activate | Activate the user account
[**autoConfigureAutoImportInterval**](BeezUPApi.md#autoConfigureAutoImportInterval) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
[**autoDeleteAutoImport**](BeezUPApi.md#autoDeleteAutoImport) | **DELETE** /v2/user/catalogs/{storeId}/autoImport | Delete Auto Import
[**autoGetAutoImportConfiguration**](BeezUPApi.md#autoGetAutoImportConfiguration) | **GET** /v2/user/catalogs/{storeId}/autoImport | Get the auto import configuration
[**autoPauseAutoImport**](BeezUPApi.md#autoPauseAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/pause | Pause Auto Import
[**autoResumeAutoImport**](BeezUPApi.md#autoResumeAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/resume | Resume Auto Import
[**autoScheduleAutoImport**](BeezUPApi.md#autoScheduleAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
[**autoStartAutoImport**](BeezUPApi.md#autoStartAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/start | Start Auto Import Manually
[**catalogChangeCatalogColumnUserName**](BeezUPApi.md#catalogChangeCatalogColumnUserName) | **POST** /v2/user/catalogs/{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
[**catalogChangeCustomColumnExpression**](BeezUPApi.md#catalogChangeCustomColumnExpression) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Change custom column expression
[**catalogChangeCustomColumnUserName**](BeezUPApi.md#catalogChangeCustomColumnUserName) | **POST** /v2/user/catalogs/{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
[**catalogComputeExpression**](BeezUPApi.md#catalogComputeExpression) | **POST** /v2/user/catalogs/{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
[**catalogDeleteCustomColumn**](BeezUPApi.md#catalogDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Delete custom column
[**catalogGetBeezUPColumns**](BeezUPApi.md#catalogGetBeezUPColumns) | **GET** /v2/user/catalogs/beezupColumns | Get the BeezUP columns
[**catalogGetCatalogColumns**](BeezUPApi.md#catalogGetCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/catalogColumns | Get catalog column list
[**catalogGetCategories**](BeezUPApi.md#catalogGetCategories) | **GET** /v2/user/catalogs/{storeId}/categories | Get category list
[**catalogGetCustomColumnExpression**](BeezUPApi.md#catalogGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
[**catalogGetCustomColumns**](BeezUPApi.md#catalogGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/customColumns | Get custom column list
[**catalogGetProduct**](BeezUPApi.md#catalogGetProduct) | **GET** /v2/user/catalogs/{storeId}/products/{productId} | Get product
[**catalogGetProducts**](BeezUPApi.md#catalogGetProducts) | **POST** /v2/user/catalogs/{storeId}/products | Get product list
[**catalogGetRandomProducts**](BeezUPApi.md#catalogGetRandomProducts) | **GET** /v2/user/catalogs/{storeId}/products/random | Get random product list
[**catalogSaveCustomColumn**](BeezUPApi.md#catalogSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Create or replace a custom column
[**changeOrder**](BeezUPApi.md#changeOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change your marketplace Order Information (accept, ship, etc.)
[**changeOrderList**](BeezUPApi.md#changeOrderList) | **POST** /v2/user/marketplaces/orders/batches/changeOrders/{changeOrderType} | Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
[**changePassword**](BeezUPApi.md#changePassword) | **POST** /v2/user/customer/account/changePassword | Change user password
[**clearMerchantOrderInfo**](BeezUPApi.md#clearMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear an Order&#39;s merchant information
[**clearMerchantOrderInfoList**](BeezUPApi.md#clearMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/clearMerchantOrderInfos | Send a batch of operations to clear an Order&#39;s merchant information
[**configureAutomaticTransitions**](BeezUPApi.md#configureAutomaticTransitions) | **POST** /v2/user/marketplaces/orders/automaticTransitions | Configure new or existing automatic Order status transition
[**configureChannelCatalogCostSettings**](BeezUPApi.md#configureChannelCatalogCostSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/cost | Disable a channel catalog
[**configureChannelCatalogExclusionFilters**](BeezUPApi.md#configureChannelCatalogExclusionFilters) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
[**configureChannelCatalogGeneralSettings**](BeezUPApi.md#configureChannelCatalogGeneralSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/general | Disable a channel catalog
[**createChannelCatalog**](BeezUPApi.md#createChannelCatalog) | **POST** /v2/user/channelCatalogs/ | Create a new channel catalog
[**createContract**](BeezUPApi.md#createContract) | **POST** /v2/user/customer/contracts | Create a new contract
[**createRule**](BeezUPApi.md#createRule) | **POST** /v2/user/analytics/{storeId}/rules | Rule creation
[**createStore**](BeezUPApi.md#createStore) | **POST** /v2/user/customer/stores | Create a new store
[**deleteChannelCatalog**](BeezUPApi.md#deleteChannelCatalog) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId} | Delete the channel catalog
[**deleteChannelCatalogProductValueOverride**](BeezUPApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
[**deleteNextContract**](BeezUPApi.md#deleteNextContract) | **DELETE** /v2/user/customer/contracts/next | Delete your next contract
[**deleteReportFilter**](BeezUPApi.md#deleteReportFilter) | **DELETE** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Delete the report filter
[**deleteRule**](BeezUPApi.md#deleteRule) | **DELETE** /v2/user/analytics/{storeId}/rules/{ruleId} | Delete Rule
[**deleteShare**](BeezUPApi.md#deleteShare) | **DELETE** /v2/user/customer/stores/{storeId}/shares/{userId} | Delete a share to another user
[**deleteStore**](BeezUPApi.md#deleteStore) | **DELETE** /v2/user/customer/stores/{storeId} | Delete a store
[**disableChannelCatalog**](BeezUPApi.md#disableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/disable | Disable a channel catalog
[**disableChannelCatalogProduct**](BeezUPApi.md#disableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/disable | Disable channel catalog product
[**disableRule**](BeezUPApi.md#disableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/disable | Disable rule
[**enableChannelCatalog**](BeezUPApi.md#enableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/enable | Enable a channel catalog
[**enableRule**](BeezUPApi.md#enableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/enable | Enable rule
[**exportOrders**](BeezUPApi.md#exportOrders) | **POST** /v2/user/marketplaces/orders/exportations | Request a new Order report exportation to be generated
[**exportStoreReportByCategory**](BeezUPApi.md#exportStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory/export | Export the report by category
[**exportStoreReportByChannel**](BeezUPApi.md#exportStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel/export | Export the report by channel
[**exportStoreReportByProduct**](BeezUPApi.md#exportStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct/export | Export the report by product
[**getAutomaticTransitions**](BeezUPApi.md#getAutomaticTransitions) | **GET** /v2/user/marketplaces/orders/automaticTransitions | Get list of configured automatic Order status transitions
[**getBillingPeriods**](BeezUPApi.md#getBillingPeriods) | **GET** /v2/user/customer/billingPeriods | Get billing periods conditions
[**getChannelCatalog**](BeezUPApi.md#getChannelCatalog) | **GET** /v2/user/channelCatalogs/{channelCatalogId} | Get the channel catalog information
[**getChannelCatalogCategories**](BeezUPApi.md#getChannelCatalogCategories) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings | Get channel catalog categories
[**getChannelCatalogExclusionFilterOperators**](BeezUPApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /v2/user/channelCatalogs/exclusionFilterOperators | Get channel catalog exclusion filter operators
[**getChannelCatalogMarketplaceProperties**](BeezUPApi.md#getChannelCatalogMarketplaceProperties) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/properties | Get the marketplace properties for a channel catalog
[**getChannelCatalogMarketplaceSettings**](BeezUPApi.md#getChannelCatalogMarketplaceSettings) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Get the marketplace settings for a channel catalog
[**getChannelCatalogProductInfo**](BeezUPApi.md#getChannelCatalogProductInfo) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId} | Get channel catalog product information
[**getChannelCatalogProductInfoList**](BeezUPApi.md#getChannelCatalogProductInfoList) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products | Get channel catalog product information list
[**getChannelCatalogs**](BeezUPApi.md#getChannelCatalogs) | **GET** /v2/user/channelCatalogs/ | List all your current channel catalogs
[**getChannelCategories**](BeezUPApi.md#getChannelCategories) | **GET** /v2/user/channels/{channelId}/categories | Get channel categories
[**getChannelColumns**](BeezUPApi.md#getChannelColumns) | **POST** /v2/user/channels/{channelId}/columns | Get channel columns
[**getChannelInfo**](BeezUPApi.md#getChannelInfo) | **GET** /v2/user/channels/{channelId} | Get channel information
[**getContracts**](BeezUPApi.md#getContracts) | **GET** /v2/user/customer/contracts | Get contract list
[**getCreditCardInfo**](BeezUPApi.md#getCreditCardInfo) | **GET** /v2/user/customer/account/creditCardInfo | Get credit card information
[**getCurrentChannels**](BeezUPApi.md#getCurrentChannels) | **GET** /v2/user/channels/ | List all available channel for this store
[**getFriendInfo**](BeezUPApi.md#getFriendInfo) | **GET** /v2/user/customer/friends/{userId} | Get friend information
[**getInvoices**](BeezUPApi.md#getInvoices) | **GET** /v2/user/customer/invoices | Get all your invoices
[**getMarketplaceAccountStores**](BeezUPApi.md#getMarketplaceAccountStores) | **GET** /v2/user/marketplaces/channelcatalogs/ | Get  you marketplace channel catalog list
[**getMarketplaceAccountsSynchronization**](BeezUPApi.md#getMarketplaceAccountsSynchronization) | **GET** /v2/user/marketplaces/orders/status | Get current synchronization status between your marketplaces and BeezUP accounts
[**getOffer**](BeezUPApi.md#getOffer) | **POST** /v2/user/customer/offers | Get offer pricing
[**getOrder**](BeezUPApi.md#getOrder) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get full Order and Order Item(s) properties
[**getOrderExportations**](BeezUPApi.md#getOrderExportations) | **GET** /v2/user/marketplaces/orders/exportations | Get a paginated list of Order report exportations
[**getOrderHistory**](BeezUPApi.md#getOrderHistory) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get an Order&#39;s harvest and change history
[**getOrderListFull**](BeezUPApi.md#getOrderListFull) | **POST** /v2/user/marketplaces/orders/list/full | Get a paginated list of all Orders with all Order and Order Item(s) properties
[**getOrderListLight**](BeezUPApi.md#getOrderListLight) | **POST** /v2/user/marketplaces/orders/list/light | Get a paginated list of all Orders without details
[**getProfilePictureInfo**](BeezUPApi.md#getProfilePictureInfo) | **GET** /v2/user/customer/account/profilePictureInfo | Get profile picture information
[**getPublications**](BeezUPApi.md#getPublications) | **GET** /v2/user/marketplaces/channelcatalogs/publications/{marketplaceTechnicalCode}/{accountId}/history | Fetch the publication history for an account, sorted by descending start date
[**getReportFilter**](BeezUPApi.md#getReportFilter) | **GET** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Get the report filter description
[**getReportFilters**](BeezUPApi.md#getReportFilters) | **GET** /v2/user/analytics/{storeId}/reports/filters | Get report filter list for the given store
[**getRights**](BeezUPApi.md#getRights) | **POST** /v2/user/customer/stores/{storeId}/rights | Get store&#39;s rights
[**getRule**](BeezUPApi.md#getRule) | **GET** /v2/user/analytics/{storeId}/rules/{ruleId} | Gets the rule
[**getRules**](BeezUPApi.md#getRules) | **GET** /v2/user/analytics/{storeId}/rules | Gets the list of rules for a given store
[**getRulesExecutions**](BeezUPApi.md#getRulesExecutions) | **GET** /v2/user/analytics/{storeId}/rules/executions | Get the rules execution history
[**getShares**](BeezUPApi.md#getShares) | **GET** /v2/user/customer/stores/{storeId}/shares | Get shares related to this store
[**getStandardOffers**](BeezUPApi.md#getStandardOffers) | **GET** /v2/user/customer/offers | Get all standard offers
[**getStore**](BeezUPApi.md#getStore) | **GET** /v2/user/customer/stores/{storeId} | Get store&#39;s information
[**getStoreAlerts**](BeezUPApi.md#getStoreAlerts) | **GET** /v2/user/customer/stores/{storeId}/alerts | Get store&#39;s alerts
[**getStoreReportByCategory**](BeezUPApi.md#getStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory | Get the report by category
[**getStoreReportByChannel**](BeezUPApi.md#getStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel | Get the report by channel
[**getStoreReportByDay**](BeezUPApi.md#getStoreReportByDay) | **POST** /v2/user/analytics/{storeId}/reports/byday | Get the report by day
[**getStoreReportByDayExport**](BeezUPApi.md#getStoreReportByDayExport) | **POST** /v2/user/analytics/{storeId}/reports/byday/export | Get the report by day
[**getStoreReportByProduct**](BeezUPApi.md#getStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct | Get the report by product
[**getStoreTrackedClicks**](BeezUPApi.md#getStoreTrackedClicks) | **GET** /v2/user/analytics/{storeId}/tracking/clicks | Get the latest clicks tracked
[**getStoreTrackedExternalOrders**](BeezUPApi.md#getStoreTrackedExternalOrders) | **GET** /v2/user/analytics/{storeId}/tracking/externalorders | Get the latest external orders tracked
[**getStoreTrackedOrders**](BeezUPApi.md#getStoreTrackedOrders) | **GET** /v2/user/analytics/{storeId}/tracking/orders | Get the latest orders tracked
[**getStoreTrackingStatus**](BeezUPApi.md#getStoreTrackingStatus) | **GET** /v2/user/analytics/{storeId}/tracking/status | Get store tracking synchronization status
[**getStores**](BeezUPApi.md#getStores) | **GET** /v2/user/customer/stores | Get store list
[**getTrackingStatus**](BeezUPApi.md#getTrackingStatus) | **GET** /v2/user/analytics/tracking/status | Display the synchronization status of the clicks and orders
[**getUserAccountInfo**](BeezUPApi.md#getUserAccountInfo) | **GET** /v2/user/customer/account | Get user account information
[**getUserListGroup**](BeezUPApi.md#getUserListGroup) | **GET** /v2/user/lov/groups/{listGroupName} | Get list of values related to this group name
[**getUserListGroupNames**](BeezUPApi.md#getUserListGroupNames) | **GET** /v2/user/lov/groups | Get list of group of list name
[**getUserListNames**](BeezUPApi.md#getUserListNames) | **GET** /v2/user/lov/ | Get all list names
[**getUserListOfValues**](BeezUPApi.md#getUserListOfValues) | **GET** /v2/user/lov/{listName} | Get the list of values related to this list name
[**harvestAll**](BeezUPApi.md#harvestAll) | **POST** /v2/user/marketplaces/orders/harvest | Send harvest request to all your marketplaces
[**harvestOrder**](BeezUPApi.md#harvestOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Send harvest request for a single Order
[**importationActivateAutoImport**](BeezUPApi.md#importationActivateAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.
[**importationCancel**](BeezUPApi.md#importationCancel) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId} | Cancel importation
[**importationCommit**](BeezUPApi.md#importationCommit) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commit | Commit Importation
[**importationCommitColumns**](BeezUPApi.md#importationCommitColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commitColumns | Commit columns
[**importationConfigureCatalogColumn**](BeezUPApi.md#importationConfigureCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId} | Configure catalog column
[**importationConfigureRemainingCatalogColumns**](BeezUPApi.md#importationConfigureRemainingCatalogColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
[**importationDeleteCustomColumn**](BeezUPApi.md#importationDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Delete Custom Column
[**importationGetCustomColumnExpression**](BeezUPApi.md#importationGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/expression | Get the encrypted custom column expression in this importation
[**importationGetCustomColumns**](BeezUPApi.md#importationGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns | Get custom columns currently place in this importation
[**importationGetDetectedCatalogColumns**](BeezUPApi.md#importationGetDetectedCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns | Get detected catalog columns during this importation.
[**importationGetImportationMonitoring**](BeezUPApi.md#importationGetImportationMonitoring) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId} | Get the importation status
[**importationGetManualUpdateLastInputConfig**](BeezUPApi.md#importationGetManualUpdateLastInputConfig) | **GET** /v2/user/catalogs/{storeId}/inputConfiguration | Get the last input configuration
[**importationGetProductSample**](BeezUPApi.md#importationGetProductSample) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex} | Get the product sample related to this importation with all columns (catalog and custom)
[**importationGetProductSampleCustomColumnValue**](BeezUPApi.md#importationGetProductSampleCustomColumnValue) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex}/customColumns/{columnId} | Get product sample custom column value related to this importation.
[**importationGetReportings**](BeezUPApi.md#importationGetReportings) | **GET** /v2/user/catalogs/{storeId}/importations | Get the latest catalog importation reporting
[**importationIgnoreColumn**](BeezUPApi.md#importationIgnoreColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/ignore | Ignore Column
[**importationMapCatalogColumn**](BeezUPApi.md#importationMapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/map | Map catalog column to a BeezUP column
[**importationMapCustomColumn**](BeezUPApi.md#importationMapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/map | Map custom column to a BeezUP column
[**importationReattendColumn**](BeezUPApi.md#importationReattendColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/reattend | Reattend Column
[**importationSaveCustomColumn**](BeezUPApi.md#importationSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Create or replace a custom column
[**importationStartManualUpdate**](BeezUPApi.md#importationStartManualUpdate) | **POST** /v2/user/catalogs/{storeId}/importations | Start Manual Import
[**importationTechnicalProgression**](BeezUPApi.md#importationTechnicalProgression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/technicalProgression | Get technical progression
[**importationUnmapCatalogColumn**](BeezUPApi.md#importationUnmapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/unmap | Unmap catalog column
[**importationUnmapCustomColumn**](BeezUPApi.md#importationUnmapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/unmap | Unmap custom column
[**logout**](BeezUPApi.md#logout) | **POST** /v2/user/customer/security/logout | Log out the current user from go2
[**mapChannelCatalogCategory**](BeezUPApi.md#mapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map | Map channel catalog category
[**mapChannelCatalogColumns**](BeezUPApi.md#mapChannelCatalogColumns) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/columnMappings | Configure channel catalog column mappings
[**moveDownRule**](BeezUPApi.md#moveDownRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/movedown | Move the rule down
[**moveUpRule**](BeezUPApi.md#moveUpRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/moveup | Move the rule up
[**optimise**](BeezUPApi.md#optimise) | **POST** /v2/user/analytics/{storeId}/optimisations/{actionName} | Optimise products
[**optimiseByCategory**](BeezUPApi.md#optimiseByCategory) | **POST** /v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
[**optimiseByChannel**](BeezUPApi.md#optimiseByChannel) | **POST** /v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
[**optimiseByProduct**](BeezUPApi.md#optimiseByProduct) | **POST** /v2/user/analytics/{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products
[**overrideChannelCatalogProductOverrides**](BeezUPApi.md#overrideChannelCatalogProductOverrides) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values
[**reactivateCurrentContract**](BeezUPApi.md#reactivateCurrentContract) | **POST** /v2/user/customer/contracts/current/reenableAutoRenewal | Reactivate your terminated contract.
[**reenableChannelCatalogProduct**](BeezUPApi.md#reenableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/reenable | Reenable channel catalog product
[**resendEmailActivation**](BeezUPApi.md#resendEmailActivation) | **POST** /v2/user/customer/account/resendEmailActivation | Resend email activation
[**runRule**](BeezUPApi.md#runRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/run | Run rule
[**runRules**](BeezUPApi.md#runRules) | **POST** /v2/user/analytics/{storeId}/rules/run | Run all rules for this store
[**saveCompanyInfo**](BeezUPApi.md#saveCompanyInfo) | **PUT** /v2/user/customer/account/companyInfo | Change company information
[**saveCreditCardInfo**](BeezUPApi.md#saveCreditCardInfo) | **PUT** /v2/user/customer/account/creditCardInfo | Save user credit card info
[**savePersonalInfo**](BeezUPApi.md#savePersonalInfo) | **PUT** /v2/user/customer/account/personalInfo | Save user personal information
[**saveProfilePictureInfo**](BeezUPApi.md#saveProfilePictureInfo) | **PUT** /v2/user/customer/account/profilePictureInfo | Change user picture information
[**saveReportFilter**](BeezUPApi.md#saveReportFilter) | **PUT** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Save the report filter
[**saveStoreAlert**](BeezUPApi.md#saveStoreAlert) | **PUT** /v2/user/customer/stores/{storeId}/alerts/{alertId} | Save store alert
[**setChannelCatalogMarketplaceSettings**](BeezUPApi.md#setChannelCatalogMarketplaceSettings) | **POST** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Save new marketplace settings for a channel catalog
[**setMerchantOrderInfo**](BeezUPApi.md#setMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Set an Order&#39;s merchant information
[**setMerchantOrderInfoList**](BeezUPApi.md#setMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/setMerchantOrderInfos | Send a batch of operations to set an Order&#39;s merchant information
[**share**](BeezUPApi.md#share) | **POST** /v2/user/customer/stores/{storeId}/shares | Share a store to another user
[**terminateCurrentContract**](BeezUPApi.md#terminateCurrentContract) | **POST** /v2/user/customer/contracts/current/disableAutoRenewal | Schedule termination of your current contract at the end of the commitment.
[**unmapChannelCatalogCategory**](BeezUPApi.md#unmapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category
[**updateRule**](BeezUPApi.md#updateRule) | **PATCH** /v2/user/analytics/{storeId}/rules/{ruleId} | Update Rule
[**updateStore**](BeezUPApi.md#updateStore) | **PATCH** /v2/user/customer/stores/{storeId} | Update some store&#39;s information.


<a name="activateUserAccount"></a>
# **activateUserAccount**
> activateUserAccount(emailActivationId)

Activate the user account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String emailActivationId = "emailActivationId_example"; // String | The email activation id received by email.
try {
    apiInstance.activateUserAccount(emailActivationId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#activateUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailActivationId** | **String**| The email activation id received by email. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoConfigureAutoImportInterval"></a>
# **autoConfigureAutoImportInterval**
> autoConfigureAutoImportInterval(storeId, request)

Configure Auto Import Interval

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ConfigureAutoImportIntervalRequest request = new ConfigureAutoImportIntervalRequest(); // ConfigureAutoImportIntervalRequest | 
try {
    apiInstance.autoConfigureAutoImportInterval(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoConfigureAutoImportInterval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ConfigureAutoImportIntervalRequest**](ConfigureAutoImportIntervalRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoDeleteAutoImport"></a>
# **autoDeleteAutoImport**
> autoDeleteAutoImport(storeId)

Delete Auto Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoDeleteAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoDeleteAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoGetAutoImportConfiguration"></a>
# **autoGetAutoImportConfiguration**
> AutoImportConfiguration autoGetAutoImportConfiguration(storeId)

Get the auto import configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    AutoImportConfiguration result = apiInstance.autoGetAutoImportConfiguration(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoGetAutoImportConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**AutoImportConfiguration**](AutoImportConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoPauseAutoImport"></a>
# **autoPauseAutoImport**
> autoPauseAutoImport(storeId)

Pause Auto Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoPauseAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoPauseAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoResumeAutoImport"></a>
# **autoResumeAutoImport**
> autoResumeAutoImport(storeId)

Resume Auto Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoResumeAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoResumeAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoScheduleAutoImport"></a>
# **autoScheduleAutoImport**
> autoScheduleAutoImport(storeId, request)

Configure Auto Import Schedules

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ScheduleAutoImportRequest request = new ScheduleAutoImportRequest(); // ScheduleAutoImportRequest | 
try {
    apiInstance.autoScheduleAutoImport(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoScheduleAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ScheduleAutoImportRequest**](ScheduleAutoImportRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoStartAutoImport"></a>
# **autoStartAutoImport**
> List&lt;BeezUPCommonLink2&gt; autoStartAutoImport(storeId)

Start Auto Import Manually

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    List<BeezUPCommonLink2> result = apiInstance.autoStartAutoImport(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#autoStartAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogChangeCatalogColumnUserName"></a>
# **catalogChangeCatalogColumnUserName**
> catalogChangeCatalogColumnUserName(storeId, columnId, request)

Change Catalog Column User Name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The catalog column identifier
ChangeUserColumnNameRequest request = new ChangeUserColumnNameRequest(); // ChangeUserColumnNameRequest | 
try {
    apiInstance.catalogChangeCatalogColumnUserName(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogChangeCatalogColumnUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The catalog column identifier |
 **request** | [**ChangeUserColumnNameRequest**](ChangeUserColumnNameRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogChangeCustomColumnExpression"></a>
# **catalogChangeCustomColumnExpression**
> catalogChangeCustomColumnExpression(storeId, columnId, request)

Change custom column expression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
ChangeCustomColumnExpressionRequest request = new ChangeCustomColumnExpressionRequest(); // ChangeCustomColumnExpressionRequest | 
try {
    apiInstance.catalogChangeCustomColumnExpression(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogChangeCustomColumnExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ChangeCustomColumnExpressionRequest**](ChangeCustomColumnExpressionRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogChangeCustomColumnUserName"></a>
# **catalogChangeCustomColumnUserName**
> catalogChangeCustomColumnUserName(storeId, columnId, request)

Change Custom Column User Name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
ChangeUserColumnNameRequest request = new ChangeUserColumnNameRequest(); // ChangeUserColumnNameRequest | 
try {
    apiInstance.catalogChangeCustomColumnUserName(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogChangeCustomColumnUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ChangeUserColumnNameRequest**](ChangeUserColumnNameRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogComputeExpression"></a>
# **catalogComputeExpression**
> String catalogComputeExpression(storeId, request)

Compute the expression for this catalog.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ComputeExpressionRequest request = new ComputeExpressionRequest(); // ComputeExpressionRequest | 
try {
    String result = apiInstance.catalogComputeExpression(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogComputeExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ComputeExpressionRequest**](ComputeExpressionRequest.md)|  |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogDeleteCustomColumn"></a>
# **catalogDeleteCustomColumn**
> catalogDeleteCustomColumn(storeId, columnId)

Delete custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.catalogDeleteCustomColumn(storeId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogDeleteCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetBeezUPColumns"></a>
# **catalogGetBeezUPColumns**
> List&lt;BeezUPColumnConfiguration&gt; catalogGetBeezUPColumns()

Get the BeezUP columns

Get the BeezUP columns, this columns are used for mapping during the manual catalog importation process.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    List<BeezUPColumnConfiguration> result = apiInstance.catalogGetBeezUPColumns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetBeezUPColumns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPColumnConfiguration&gt;**](BeezUPColumnConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCatalogColumns"></a>
# **catalogGetCatalogColumns**
> CatalogColumns catalogGetCatalogColumns(storeId)

Get catalog column list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    CatalogColumns result = apiInstance.catalogGetCatalogColumns(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**CatalogColumns**](CatalogColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCategories"></a>
# **catalogGetCategories**
> Categories catalogGetCategories(storeId, acceptEncoding)

Get category list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
try {
    Categories result = apiInstance.catalogGetCategories(storeId, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts that the response will be compressed to reduce traffic size. |

### Return type

[**Categories**](Categories.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCustomColumnExpression"></a>
# **catalogGetCustomColumnExpression**
> String catalogGetCustomColumnExpression(storeId, columnId)

Get the encrypted custom column expression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.catalogGetCustomColumnExpression(storeId, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetCustomColumnExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCustomColumns"></a>
# **catalogGetCustomColumns**
> CustomColumns catalogGetCustomColumns(storeId)

Get custom column list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    CustomColumns result = apiInstance.catalogGetCustomColumns(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetCustomColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**CustomColumns**](CustomColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetProduct"></a>
# **catalogGetProduct**
> Product catalogGetProduct(storeId, productId)

Get product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String productId = "productId_example"; // String | The product identifier you want to get
try {
    Product result = apiInstance.catalogGetProduct(storeId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **productId** | **String**| The product identifier you want to get |

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetProducts"></a>
# **catalogGetProducts**
> Products catalogGetProducts(storeId, request)

Get product list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
GetProductsRequest request = new GetProductsRequest(); // GetProductsRequest | 
try {
    Products result = apiInstance.catalogGetProducts(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**GetProductsRequest**](GetProductsRequest.md)|  | [optional]

### Return type

[**Products**](Products.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetRandomProducts"></a>
# **catalogGetRandomProducts**
> Products catalogGetRandomProducts(storeId, count)

Get random product list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The count of random product you want to get
try {
    Products result = apiInstance.catalogGetRandomProducts(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogGetRandomProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The count of random product you want to get | [optional] [default to 100]

### Return type

[**Products**](Products.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogSaveCustomColumn"></a>
# **catalogSaveCustomColumn**
> catalogSaveCustomColumn(storeId, columnId, request)

Create or replace a custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
CreateCustomColumnRequest request = new CreateCustomColumnRequest(); // CreateCustomColumnRequest | 
try {
    apiInstance.catalogSaveCustomColumn(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#catalogSaveCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |
 **request** | [**CreateCustomColumnRequest**](CreateCustomColumnRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeOrder"></a>
# **changeOrder**
> changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode)

Change your marketplace Order Information (accept, ship, etc.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The BeezUP Order identifier
String changeOrderType = "changeOrderType_example"; // String | The Order change type
String userName = "userName_example"; // String | Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application's user login.
ChangeOrderRequest request = new ChangeOrderRequest(); // ChangeOrderRequest | 
String ifMatch = "ifMatch_example"; // String | ETag value to identify the last known version of requested Order, to ensure that you are making a change on the lastest version of the order.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3 
Boolean testMode = false; // Boolean | If true, the operation will be not be sent to marketplace. But the validation will be taken in account.
try {
    apiInstance.changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#changeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The BeezUP Order identifier |
 **changeOrderType** | **String**| The Order change type |
 **userName** | **String**| Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application&#39;s user login. |
 **request** | [**ChangeOrderRequest**](ChangeOrderRequest.md)|  |
 **ifMatch** | **String**| ETag value to identify the last known version of requested Order, to ensure that you are making a change on the lastest version of the order.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  |
 **testMode** | **Boolean**| If true, the operation will be not be sent to marketplace. But the validation will be taken in account. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeOrderList"></a>
# **changeOrderList**
> BatchOrderOperationResponse changeOrderList(changeOrderType, userName, request, testMode)

Send a batch of operations to change your marketplace Order information (accept, ship, etc.)

The purpose of this operation is to reduce the amount of request to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String changeOrderType = "changeOrderType_example"; // String | The Order change type
String userName = "userName_example"; // String | Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application's user login.
ChangeOrderListRequest request = new ChangeOrderListRequest(); // ChangeOrderListRequest | 
Boolean testMode = false; // Boolean | If true, the operation will be not be sent to marketplace. But the validation will be taken in account.
try {
    BatchOrderOperationResponse result = apiInstance.changeOrderList(changeOrderType, userName, request, testMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#changeOrderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeOrderType** | **String**| The Order change type |
 **userName** | **String**| Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application&#39;s user login. |
 **request** | [**ChangeOrderListRequest**](ChangeOrderListRequest.md)|  |
 **testMode** | **Boolean**| If true, the operation will be not be sent to marketplace. But the validation will be taken in account. | [optional] [default to false]

### Return type

[**BatchOrderOperationResponse**](BatchOrderOperationResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changePassword"></a>
# **changePassword**
> changePassword(request)

Change user password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
ChangePasswordRequest request = new ChangePasswordRequest(); // ChangePasswordRequest | 
try {
    apiInstance.changePassword(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearMerchantOrderInfo"></a>
# **clearMerchantOrderInfo**
> clearMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId)

Clear an Order&#39;s merchant information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The BeezUP Order identifier
try {
    apiInstance.clearMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#clearMerchantOrderInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The BeezUP Order identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearMerchantOrderInfoList"></a>
# **clearMerchantOrderInfoList**
> BatchOrderOperationResponse clearMerchantOrderInfoList(request)

Send a batch of operations to clear an Order&#39;s merchant information

The purpose of this operation is to reduce the amount of request to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
ClearMerchantOrderInfoListRequest request = new ClearMerchantOrderInfoListRequest(); // ClearMerchantOrderInfoListRequest | 
try {
    BatchOrderOperationResponse result = apiInstance.clearMerchantOrderInfoList(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#clearMerchantOrderInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClearMerchantOrderInfoListRequest**](ClearMerchantOrderInfoListRequest.md)|  |

### Return type

[**BatchOrderOperationResponse**](BatchOrderOperationResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configureAutomaticTransitions"></a>
# **configureAutomaticTransitions**
> configureAutomaticTransitions(request)

Configure new or existing automatic Order status transition

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
SaveAutomaticTransitionRequest request = new SaveAutomaticTransitionRequest(); // SaveAutomaticTransitionRequest | 
try {
    apiInstance.configureAutomaticTransitions(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#configureAutomaticTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveAutomaticTransitionRequest**](SaveAutomaticTransitionRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configureChannelCatalogCostSettings"></a>
# **configureChannelCatalogCostSettings**
> configureChannelCatalogCostSettings(channelCatalogId, request)

Disable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
CostSettings request = new CostSettings(); // CostSettings | 
try {
    apiInstance.configureChannelCatalogCostSettings(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#configureChannelCatalogCostSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**CostSettings**](CostSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configureChannelCatalogExclusionFilters"></a>
# **configureChannelCatalogExclusionFilters**
> configureChannelCatalogExclusionFilters(channelCatalogId, request)

Configure channel catalog exclusion filters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
ExclusionFilters request = new ExclusionFilters(); // ExclusionFilters | 
try {
    apiInstance.configureChannelCatalogExclusionFilters(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#configureChannelCatalogExclusionFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**ExclusionFilters**](ExclusionFilters.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configureChannelCatalogGeneralSettings"></a>
# **configureChannelCatalogGeneralSettings**
> configureChannelCatalogGeneralSettings(channelCatalogId, request)

Disable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
GeneralSettings request = new GeneralSettings(); // GeneralSettings | 
try {
    apiInstance.configureChannelCatalogGeneralSettings(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#configureChannelCatalogGeneralSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**GeneralSettings**](GeneralSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createChannelCatalog"></a>
# **createChannelCatalog**
> List&lt;BeezUPCommonLink2&gt; createChannelCatalog(request)

Create a new channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
CreateChannelCatalogRequest request = new CreateChannelCatalogRequest(); // CreateChannelCatalogRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.createChannelCatalog(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#createChannelCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateChannelCatalogRequest**](CreateChannelCatalogRequest.md)|  |

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContract"></a>
# **createContract**
> BeezUPCommonInfoSummaries createContract(request)

Create a new contract

Now you are ready to create your contract. Before that, please ensure that you check the offer with the same request parameterts. /offers 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
CreateContract request = new CreateContract(); // CreateContract | 
try {
    BeezUPCommonInfoSummaries result = apiInstance.createContract(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#createContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateContract**](CreateContract.md)|  |

### Return type

[**BeezUPCommonInfoSummaries**](BeezUPCommonInfoSummaries.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRule"></a>
# **createRule**
> createRule(storeId, request)

Rule creation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
CreateRuleRequest request = new CreateRuleRequest(); // CreateRuleRequest | 
try {
    apiInstance.createRule(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#createRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**CreateRuleRequest**](CreateRuleRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createStore"></a>
# **createStore**
> LinksGetStoresLink createStore(request)

Create a new store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
CreateStoreRequest request = new CreateStoreRequest(); // CreateStoreRequest | 
try {
    LinksGetStoresLink result = apiInstance.createStore(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#createStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateStoreRequest**](CreateStoreRequest.md)|  |

### Return type

[**LinksGetStoresLink**](LinksGetStoresLink.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChannelCatalog"></a>
# **deleteChannelCatalog**
> deleteChannelCatalog()

Delete the channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    apiInstance.deleteChannelCatalog();
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteChannelCatalog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChannelCatalogProductValueOverride"></a>
# **deleteChannelCatalogProductValueOverride**
> deleteChannelCatalogProductValueOverride(channelCatalogId, productId, channelColumnId)

Delete a specific channel catalog product value override

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
String channelColumnId = "8a76f06a-fefc-4c0d-bcfe-b210f1482977"; // String | The channel column identifier
try {
    apiInstance.deleteChannelCatalogProductValueOverride(channelCatalogId, productId, channelColumnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteChannelCatalogProductValueOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |
 **channelColumnId** | **String**| The channel column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNextContract"></a>
# **deleteNextContract**
> deleteNextContract()

Delete your next contract

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    apiInstance.deleteNextContract();
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteNextContract");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportFilter"></a>
# **deleteReportFilter**
> deleteReportFilter(storeId, reportFilterId)

Delete the report filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
try {
    apiInstance.deleteReportFilter(storeId, reportFilterId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteReportFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **reportFilterId** | **String**| Your report filter identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(storeId, ruleId)

Delete Rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.deleteRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteShare"></a>
# **deleteShare**
> deleteShare(storeId, userId)

Delete a share to another user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String userId = "userId_example"; // String | The friend user id
try {
    apiInstance.deleteShare(storeId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **userId** | **String**| The friend user id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStore"></a>
# **deleteStore**
> deleteStore(storeId)

Delete a store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.deleteStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#deleteStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableChannelCatalog"></a>
# **disableChannelCatalog**
> disableChannelCatalog(channelCatalogId)

Disable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.disableChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#disableChannelCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableChannelCatalogProduct"></a>
# **disableChannelCatalogProduct**
> disableChannelCatalogProduct(channelCatalogId, productId)

Disable channel catalog product

By default a all your catalog products are exposed to the channel. You can disable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    apiInstance.disableChannelCatalogProduct(channelCatalogId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#disableChannelCatalogProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableRule"></a>
# **disableRule**
> disableRule(storeId, ruleId)

Disable rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.disableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#disableRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableChannelCatalog"></a>
# **enableChannelCatalog**
> enableChannelCatalog(channelCatalogId)

Enable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.enableChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#enableChannelCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableRule"></a>
# **enableRule**
> enableRule(storeId, ruleId)

Enable rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.enableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#enableRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportOrders"></a>
# **exportOrders**
> exportOrders(format, request)

Request a new Order report exportation to be generated

A new file will be generated containing a summary of all the Orders matching the requested filter settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String format = "csv"; // String | The type of the file to export
ExportOrderListRequest request = new ExportOrderListRequest(); // ExportOrderListRequest | 
try {
    apiInstance.exportOrders(format, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#exportOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| The type of the file to export | [default to csv] [enum: csv]
 **request** | [**ExportOrderListRequest**](ExportOrderListRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByCategory"></a>
# **exportStoreReportByCategory**
> BeezUPCommonLink3 exportStoreReportByCategory(storeId, format, request)

Export the report by category

Export the report by category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByCategoryRequest request = new ReportByCategoryRequest(); // ReportByCategoryRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.exportStoreReportByCategory(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#exportStoreReportByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByCategoryRequest**](ReportByCategoryRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByChannel"></a>
# **exportStoreReportByChannel**
> BeezUPCommonLink3 exportStoreReportByChannel(storeId, format, request)

Export the report by channel

Export the report by channel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByChannelRequest request = new ReportByChannelRequest(); // ReportByChannelRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.exportStoreReportByChannel(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#exportStoreReportByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByChannelRequest**](ReportByChannelRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByProduct"></a>
# **exportStoreReportByProduct**
> BeezUPCommonLink3 exportStoreReportByProduct(storeId, format, request)

Export the report by product

Export the report by product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByProductRequest request = new ReportByProductRequest(); // ReportByProductRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.exportStoreReportByProduct(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#exportStoreReportByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByProductRequest**](ReportByProductRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutomaticTransitions"></a>
# **getAutomaticTransitions**
> AutomaticTransitionInfos getAutomaticTransitions()

Get list of configured automatic Order status transitions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    AutomaticTransitionInfos result = apiInstance.getAutomaticTransitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getAutomaticTransitions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AutomaticTransitionInfos**](AutomaticTransitionInfos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBillingPeriods"></a>
# **getBillingPeriods**
> BillingPeriods getBillingPeriods()

Get billing periods conditions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    BillingPeriods result = apiInstance.getBillingPeriods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getBillingPeriods");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingPeriods**](BillingPeriods.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalog"></a>
# **getChannelCatalog**
> ChannelCatalog getChannelCatalog(channelCatalogId)

Get the channel catalog information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalog result = apiInstance.getChannelCatalog(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

[**ChannelCatalog**](ChannelCatalog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogCategories"></a>
# **getChannelCatalogCategories**
> ChannelCatalogCategoryMappings getChannelCatalogCategories(channelCatalogId)

Get channel catalog categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalogCategoryMappings result = apiInstance.getChannelCatalogCategories(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

[**ChannelCatalogCategoryMappings**](ChannelCatalogCategoryMappings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogExclusionFilterOperators"></a>
# **getChannelCatalogExclusionFilterOperators**
> List&lt;ExclusionFilterOperator&gt; getChannelCatalogExclusionFilterOperators()

Get channel catalog exclusion filter operators

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    List<ExclusionFilterOperator> result = apiInstance.getChannelCatalogExclusionFilterOperators();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogExclusionFilterOperators");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ExclusionFilterOperator&gt;**](ExclusionFilterOperator.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogMarketplaceProperties"></a>
# **getChannelCatalogMarketplaceProperties**
> ChannelCatalogMarketplaceProperties getChannelCatalogMarketplaceProperties(channelCatalogId)

Get the marketplace properties for a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "channelCatalogId_example"; // String | 
try {
    ChannelCatalogMarketplaceProperties result = apiInstance.getChannelCatalogMarketplaceProperties(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogMarketplaceProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**|  |

### Return type

[**ChannelCatalogMarketplaceProperties**](ChannelCatalogMarketplaceProperties.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogMarketplaceSettings"></a>
# **getChannelCatalogMarketplaceSettings**
> ChannelCatalogMarketplaceSettings getChannelCatalogMarketplaceSettings(channelCatalogId)

Get the marketplace settings for a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "channelCatalogId_example"; // String | Channel Catalog Id to query (required)
try {
    ChannelCatalogMarketplaceSettings result = apiInstance.getChannelCatalogMarketplaceSettings(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogMarketplaceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| Channel Catalog Id to query (required) |

### Return type

[**ChannelCatalogMarketplaceSettings**](ChannelCatalogMarketplaceSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogProductInfo"></a>
# **getChannelCatalogProductInfo**
> ChannelCatalogProductInfo getChannelCatalogProductInfo(channelCatalogId, productId)

Get channel catalog product information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    ChannelCatalogProductInfo result = apiInstance.getChannelCatalogProductInfo(channelCatalogId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogProductInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |

### Return type

[**ChannelCatalogProductInfo**](ChannelCatalogProductInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogProductInfoList"></a>
# **getChannelCatalogProductInfoList**
> ChannelCatalogProductInfoList getChannelCatalogProductInfoList(channelCatalogId, request)

Get channel catalog product information list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
GetChannelCatalogProductInfoListRequest request = new GetChannelCatalogProductInfoListRequest(); // GetChannelCatalogProductInfoListRequest | The channel catalog product list filter
try {
    ChannelCatalogProductInfoList result = apiInstance.getChannelCatalogProductInfoList(channelCatalogId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogProductInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**GetChannelCatalogProductInfoListRequest**](GetChannelCatalogProductInfoListRequest.md)| The channel catalog product list filter | [optional]

### Return type

[**ChannelCatalogProductInfoList**](ChannelCatalogProductInfoList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogs"></a>
# **getChannelCatalogs**
> ChannelCatalogList getChannelCatalogs(storeId)

List all your current channel catalogs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "04730364-9826-4ff3-92e4-51fccd02bf10"; // String | The store identifier
try {
    ChannelCatalogList result = apiInstance.getChannelCatalogs(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCatalogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| The store identifier | [optional]

### Return type

[**ChannelCatalogList**](ChannelCatalogList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCategories"></a>
# **getChannelCategories**
> ChannelRootCategory getChannelCategories(channelId, acceptEncoding)

Get channel categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelId = "2dc136a7-0d3d-4cc9-a825-a28a42c53e28"; // String | The channel identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
try {
    ChannelRootCategory result = apiInstance.getChannelCategories(channelId, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel identifier |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts that the response will be compressed to reduce traffic size. |

### Return type

[**ChannelRootCategory**](ChannelRootCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelColumns"></a>
# **getChannelColumns**
> List&lt;ChannelColumn&gt; getChannelColumns(channelId, acceptEncoding, request)

Get channel columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelId = "2dc136a7-0d3d-4cc9-a825-a28a42c53e28"; // String | The channel identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
List<BeezUPCommonChannelColumnId> request = Arrays.asList(new BeezUPCommonChannelColumnId()); // List<BeezUPCommonChannelColumnId> | Allow you to filter the channel column identifier list your want to get
try {
    List<ChannelColumn> result = apiInstance.getChannelColumns(channelId, acceptEncoding, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel identifier |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts that the response will be compressed to reduce traffic size. |
 **request** | [**List&lt;BeezUPCommonChannelColumnId&gt;**](BeezUPCommonChannelColumnId.md)| Allow you to filter the channel column identifier list your want to get | [optional]

### Return type

[**List&lt;ChannelColumn&gt;**](ChannelColumn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelInfo"></a>
# **getChannelInfo**
> ChannelInfo getChannelInfo(channelId)

Get channel information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelId = "2dc136a7-0d3d-4cc9-a825-a28a42c53e28"; // String | The channel identifier
try {
    ChannelInfo result = apiInstance.getChannelInfo(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getChannelInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel identifier |

### Return type

[**ChannelInfo**](ChannelInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContracts"></a>
# **getContracts**
> Contracts getContracts()

Get contract list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    Contracts result = apiInstance.getContracts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getContracts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Contracts**](Contracts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCreditCardInfo"></a>
# **getCreditCardInfo**
> CreditCardInfoResponse getCreditCardInfo()

Get credit card information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    CreditCardInfoResponse result = apiInstance.getCreditCardInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getCreditCardInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreditCardInfoResponse**](CreditCardInfoResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentChannels"></a>
# **getCurrentChannels**
> List&lt;ChannelHeader&gt; getCurrentChannels(storeId)

List all available channel for this store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "04730364-9826-4ff3-92e4-51fccd02bf10"; // String | The store identifier
try {
    List<ChannelHeader> result = apiInstance.getCurrentChannels(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getCurrentChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| The store identifier |

### Return type

[**List&lt;ChannelHeader&gt;**](ChannelHeader.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFriendInfo"></a>
# **getFriendInfo**
> UserFriendInfo getFriendInfo(userId)

Get friend information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String userId = "userId_example"; // String | Your friend user id
try {
    UserFriendInfo result = apiInstance.getFriendInfo(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getFriendInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Your friend user id |

### Return type

[**UserFriendInfo**](UserFriendInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoices"></a>
# **getInvoices**
> Invoices getInvoices()

Get all your invoices

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    Invoices result = apiInstance.getInvoices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Invoices**](Invoices.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketplaceAccountStores"></a>
# **getMarketplaceAccountStores**
> MarketplaceChannelCatalogList getMarketplaceAccountStores()

Get  you marketplace channel catalog list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    MarketplaceChannelCatalogList result = apiInstance.getMarketplaceAccountStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getMarketplaceAccountStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MarketplaceChannelCatalogList**](MarketplaceChannelCatalogList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketplaceAccountsSynchronization"></a>
# **getMarketplaceAccountsSynchronization**
> AccountSynchronizations getMarketplaceAccountsSynchronization()

Get current synchronization status between your marketplaces and BeezUP accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    AccountSynchronizations result = apiInstance.getMarketplaceAccountsSynchronization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getMarketplaceAccountsSynchronization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSynchronizations**](AccountSynchronizations.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOffer"></a>
# **getOffer**
> Offer getOffer(request)

Get offer pricing

Get the offer pricing then you can create your contract with the same request parameters. /v2/user/customer/contracts 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
OfferRequest request = new OfferRequest(); // OfferRequest | 
try {
    Offer result = apiInstance.getOffer(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**OfferRequest**](OfferRequest.md)|  |

### Return type

[**Offer**](Offer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch)

Get full Order and Order Item(s) properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The BeezUP Order identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag value to identify the last known version of requested Order\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3 
try {
    Order result = apiInstance.getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The BeezUP Order identifier |
 **ifNoneMatch** | **String**| ETag value to identify the last known version of requested Order\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderExportations"></a>
# **getOrderExportations**
> OrderExportations getOrderExportations(pageNumber, pageSize)

Get a paginated list of Order report exportations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
Integer pageNumber = 1; // Integer | The page number you want to get
Integer pageSize = 25; // Integer | The count of Order report exportations you want to get
try {
    OrderExportations result = apiInstance.getOrderExportations(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getOrderExportations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number you want to get |
 **pageSize** | **Integer**| The count of Order report exportations you want to get |

### Return type

[**OrderExportations**](OrderExportations.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderHistory"></a>
# **getOrderHistory**
> OrderHistory getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId)

Get an Order&#39;s harvest and change history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The BeezUP Order identifier
try {
    OrderHistory result = apiInstance.getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getOrderHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The BeezUP Order identifier |

### Return type

[**OrderHistory**](OrderHistory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderListFull"></a>
# **getOrderListFull**
> OrderListFull getOrderListFull(acceptEncoding, request)

Get a paginated list of all Orders with all Order and Order Item(s) properties

The purpose of this operation is to reduce the amount of request to the API.\\ \\ Previous implmentation of this feature only returned a partial (light) version of the Orders. The purpose of this API is to reduce the number of incoming requests by returning the complete (full) Order and Order Item(s) properties. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size
OrderListRequest request = new OrderListRequest(); // OrderListRequest | 
try {
    OrderListFull result = apiInstance.getOrderListFull(acceptEncoding, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getOrderListFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size |
 **request** | [**OrderListRequest**](OrderListRequest.md)|  | [optional]

### Return type

[**OrderListFull**](OrderListFull.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderListLight"></a>
# **getOrderListLight**
> OrderListLight getOrderListLight(request)

Get a paginated list of all Orders without details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
OrderListRequest request = new OrderListRequest(); // OrderListRequest | 
try {
    OrderListLight result = apiInstance.getOrderListLight(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getOrderListLight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**OrderListRequest**](OrderListRequest.md)|  | [optional]

### Return type

[**OrderListLight**](OrderListLight.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfilePictureInfo"></a>
# **getProfilePictureInfo**
> ProfilePictureInfoResponse getProfilePictureInfo()

Get profile picture information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    ProfilePictureInfoResponse result = apiInstance.getProfilePictureInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getProfilePictureInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfilePictureInfoResponse**](ProfilePictureInfoResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPublications"></a>
# **getPublications**
> AccountPublications getPublications(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes)

Fetch the publication history for an account, sorted by descending start date

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "marketplaceTechnicalCode_example"; // String | Marketplace Technical Code to query (required)
Integer accountId = 56; // Integer | Account Id to query (required)
String channelCatalogId = "channelCatalogId_example"; // String | Channel Catalog Id by which to filter (optional)
Integer count = 10; // Integer | Amount of entries to fetch (optional, default set to 10)
List<String> publicationTypes = Arrays.asList("publicationTypes_example"); // List<String> | Publication types by which to filter (optional)
try {
    AccountPublications result = apiInstance.getPublications(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getPublications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| Marketplace Technical Code to query (required) |
 **accountId** | **Integer**| Account Id to query (required) |
 **channelCatalogId** | **String**| Channel Catalog Id by which to filter (optional) | [optional]
 **count** | **Integer**| Amount of entries to fetch (optional, default set to 10) | [optional] [default to 10]
 **publicationTypes** | [**List&lt;String&gt;**](String.md)| Publication types by which to filter (optional) | [optional] [enum: PublishProducts, PublishOffers, Unpublish]

### Return type

[**AccountPublications**](AccountPublications.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportFilter"></a>
# **getReportFilter**
> ReportFilter getReportFilter(storeId, reportFilterId)

Get the report filter description

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
try {
    ReportFilter result = apiInstance.getReportFilter(storeId, reportFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getReportFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **reportFilterId** | **String**| Your report filter identifier |

### Return type

[**ReportFilter**](ReportFilter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportFilters"></a>
# **getReportFilters**
> ReportFilters getReportFilters(storeId)

Get report filter list for the given store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    ReportFilters result = apiInstance.getReportFilters(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getReportFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**ReportFilters**](ReportFilters.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRights"></a>
# **getRights**
> List&lt;FunctionalityRightInfo&gt; getRights(storeId, functionalityCodeList)

Get store&#39;s rights

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
List<String> functionalityCodeList = Arrays.asList(new List<String>()); // List<String> | The functionality code list you want to check
try {
    List<FunctionalityRightInfo> result = apiInstance.getRights(storeId, functionalityCodeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getRights");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **functionalityCodeList** | **List&lt;String&gt;**| The functionality code list you want to check |

### Return type

[**List&lt;FunctionalityRightInfo&gt;**](FunctionalityRightInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRule"></a>
# **getRule**
> Rule getRule(storeId, ruleId)

Gets the rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    Rule result = apiInstance.getRule(storeId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

[**Rule**](Rule.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRules"></a>
# **getRules**
> RuleList getRules(storeId)

Gets the list of rules for a given store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    RuleList result = apiInstance.getRules(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**RuleList**](RuleList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRulesExecutions"></a>
# **getRulesExecutions**
> RuleExecutionReportings getRulesExecutions(storeId, pageNumber, pageSize)

Get the rules execution history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer pageNumber = 1; // Integer | The page to retrieve
Integer pageSize = 10; // Integer | The count of rule history to retrieve
try {
    RuleExecutionReportings result = apiInstance.getRulesExecutions(storeId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getRulesExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **pageNumber** | **Integer**| The page to retrieve | [default to 1]
 **pageSize** | **Integer**| The count of rule history to retrieve | [default to 10]

### Return type

[**RuleExecutionReportings**](RuleExecutionReportings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShares"></a>
# **getShares**
> StoreShares getShares(storeId)

Get shares related to this store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreShares result = apiInstance.getShares(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreShares**](StoreShares.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStandardOffers"></a>
# **getStandardOffers**
> StandardOffers getStandardOffers()

Get all standard offers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    StandardOffers result = apiInstance.getStandardOffers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStandardOffers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StandardOffers**](StandardOffers.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStore"></a>
# **getStore**
> StoreHeader getStore(storeId)

Get store&#39;s information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreHeader result = apiInstance.getStore(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreHeader**](StoreHeader.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreAlerts"></a>
# **getStoreAlerts**
> StoreAlerts getStoreAlerts(storeId)

Get store&#39;s alerts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreAlerts result = apiInstance.getStoreAlerts(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreAlerts**](StoreAlerts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByCategory"></a>
# **getStoreReportByCategory**
> ReportByCategoryResponse getStoreReportByCategory(storeId, request)

Get the report by category

Get the report by category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByCategoryRequest request = new ReportByCategoryRequest(); // ReportByCategoryRequest | 
try {
    ReportByCategoryResponse result = apiInstance.getStoreReportByCategory(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreReportByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByCategoryRequest**](ReportByCategoryRequest.md)|  |

### Return type

[**ReportByCategoryResponse**](ReportByCategoryResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByChannel"></a>
# **getStoreReportByChannel**
> ReportByChannelResponse getStoreReportByChannel(storeId, request)

Get the report by channel

Get the report by channel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByChannelRequest request = new ReportByChannelRequest(); // ReportByChannelRequest | 
try {
    ReportByChannelResponse result = apiInstance.getStoreReportByChannel(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreReportByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByChannelRequest**](ReportByChannelRequest.md)|  |

### Return type

[**ReportByChannelResponse**](ReportByChannelResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByDay"></a>
# **getStoreReportByDay**
> ReportByDayResponse getStoreReportByDay(storeId, request)

Get the report by day

Get the report by day

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByDayRequest request = new ReportByDayRequest(); // ReportByDayRequest | 
try {
    ReportByDayResponse result = apiInstance.getStoreReportByDay(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreReportByDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByDayRequest**](ReportByDayRequest.md)|  |

### Return type

[**ReportByDayResponse**](ReportByDayResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByDayExport"></a>
# **getStoreReportByDayExport**
> BeezUPCommonLink3 getStoreReportByDayExport(storeId, format, request)

Get the report by day

Get the report by day

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByDayRequest request = new ReportByDayRequest(); // ReportByDayRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.getStoreReportByDayExport(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreReportByDayExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByDayRequest**](ReportByDayRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByProduct"></a>
# **getStoreReportByProduct**
> ReportByProductResponse getStoreReportByProduct(storeId, request)

Get the report by product

Get the report by product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByProductRequest request = new ReportByProductRequest(); // ReportByProductRequest | 
try {
    ReportByProductResponse result = apiInstance.getStoreReportByProduct(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreReportByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByProductRequest**](ReportByProductRequest.md)|  |

### Return type

[**ReportByProductResponse**](ReportByProductResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedClicks"></a>
# **getStoreTrackedClicks**
> TrackedClicks getStoreTrackedClicks(storeId, count)

Get the latest clicks tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The click's count you want to get
try {
    TrackedClicks result = apiInstance.getStoreTrackedClicks(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreTrackedClicks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The click&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedClicks**](TrackedClicks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedExternalOrders"></a>
# **getStoreTrackedExternalOrders**
> TrackedExternalOrders getStoreTrackedExternalOrders(storeId, count)

Get the latest external orders tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The external order's count you want to get
try {
    TrackedExternalOrders result = apiInstance.getStoreTrackedExternalOrders(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreTrackedExternalOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The external order&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedExternalOrders**](TrackedExternalOrders.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedOrders"></a>
# **getStoreTrackedOrders**
> TrackedOrders getStoreTrackedOrders(storeId, count)

Get the latest orders tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The order's count you want to get
try {
    TrackedOrders result = apiInstance.getStoreTrackedOrders(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreTrackedOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The order&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedOrders**](TrackedOrders.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackingStatus"></a>
# **getStoreTrackingStatus**
> StoreTrackingStatus getStoreTrackingStatus(storeId)

Get store tracking synchronization status

Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreTrackingStatus result = apiInstance.getStoreTrackingStatus(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStoreTrackingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreTrackingStatus**](StoreTrackingStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStores"></a>
# **getStores**
> Stores getStores()

Get store list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    Stores result = apiInstance.getStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Stores**](Stores.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrackingStatus"></a>
# **getTrackingStatus**
> TrackingStatus getTrackingStatus()

Display the synchronization status of the clicks and orders

Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    TrackingStatus result = apiInstance.getTrackingStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getTrackingStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrackingStatus**](TrackingStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserAccountInfo"></a>
# **getUserAccountInfo**
> AccountInfo getUserAccountInfo()

Get user account information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    AccountInfo result = apiInstance.getUserAccountInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getUserAccountInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountInfo**](AccountInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListGroup"></a>
# **getUserListGroup**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListGroup(listGroupName)

Get list of values related to this group name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String listGroupName = "listGroupName_example"; // String | The list group name your want to get
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListGroup(listGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getUserListGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listGroupName** | **String**| The list group name your want to get |

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListGroupNames"></a>
# **getUserListGroupNames**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListGroupNames()

Get list of group of list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListGroupNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getUserListGroupNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListNames"></a>
# **getUserListNames**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListNames()

Get all list names

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getUserListNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListOfValues"></a>
# **getUserListOfValues**
> List&lt;BeezUPCommonListOfValueItem&gt; getUserListOfValues(listName, acceptLanguage)

Get the list of values related to this list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String listName = "listName_example"; // String | The list of value name your want to get
List<String> acceptLanguage = Arrays.asList("acceptLanguage_example"); // List<String> | Indicates that the client accepts the following languages.
try {
    List<BeezUPCommonListOfValueItem> result = apiInstance.getUserListOfValues(listName, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#getUserListOfValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listName** | **String**| The list of value name your want to get |
 **acceptLanguage** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts the following languages. | [optional]

### Return type

[**List&lt;BeezUPCommonListOfValueItem&gt;**](BeezUPCommonListOfValueItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="harvestAll"></a>
# **harvestAll**
> harvestAll()

Send harvest request to all your marketplaces

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    apiInstance.harvestAll();
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#harvestAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="harvestOrder"></a>
# **harvestOrder**
> harvestOrder(marketplaceTechnicalCode, accountId, beezUPOrderId)

Send harvest request for a single Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The BeezUP Order identifier
try {
    apiInstance.harvestOrder(marketplaceTechnicalCode, accountId, beezUPOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#harvestOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The BeezUP Order identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationActivateAutoImport"></a>
# **importationActivateAutoImport**
> importationActivateAutoImport(storeId)

Activate the auto importation of the last successful manual catalog importation.

Once you have made your fist manual catalog importation with success, you can call this operation to import it automatically. No parameter required, we know which one it is.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.importationActivateAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationActivateAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationCancel"></a>
# **importationCancel**
> importationCancel(storeId, executionId)

Cancel importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCancel(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationCommit"></a>
# **importationCommit**
> importationCommit(storeId, executionId)

Commit Importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCommit(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationCommitColumns"></a>
# **importationCommitColumns**
> importationCommitColumns(storeId, executionId)

Commit columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCommitColumns(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationCommitColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationConfigureCatalogColumn"></a>
# **importationConfigureCatalogColumn**
> importationConfigureCatalogColumn(storeId, executionId, columnId, request)

Configure catalog column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
ConfigureCatalogColumnCatalogRequest request = new ConfigureCatalogColumnCatalogRequest(); // ConfigureCatalogColumnCatalogRequest | 
try {
    apiInstance.importationConfigureCatalogColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationConfigureCatalogColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ConfigureCatalogColumnCatalogRequest**](ConfigureCatalogColumnCatalogRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationConfigureRemainingCatalogColumns"></a>
# **importationConfigureRemainingCatalogColumns**
> importationConfigureRemainingCatalogColumns(storeId, executionId)

Configure remaining catalog columns

This operation should be used after you have mapped the required BeezUP Columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationConfigureRemainingCatalogColumns(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationConfigureRemainingCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationDeleteCustomColumn"></a>
# **importationDeleteCustomColumn**
> importationDeleteCustomColumn(storeId, executionId, columnId)

Delete Custom Column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationDeleteCustomColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationDeleteCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetCustomColumnExpression"></a>
# **importationGetCustomColumnExpression**
> String importationGetCustomColumnExpression(storeId, executionId, columnId)

Get the encrypted custom column expression in this importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.importationGetCustomColumnExpression(storeId, executionId, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetCustomColumnExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetCustomColumns"></a>
# **importationGetCustomColumns**
> CustomColumns importationGetCustomColumns(storeId, executionId)

Get custom columns currently place in this importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    CustomColumns result = apiInstance.importationGetCustomColumns(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetCustomColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**CustomColumns**](CustomColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetDetectedCatalogColumns"></a>
# **importationGetDetectedCatalogColumns**
> DetectedCatalogColumns importationGetDetectedCatalogColumns(storeId, executionId)

Get detected catalog columns during this importation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    DetectedCatalogColumns result = apiInstance.importationGetDetectedCatalogColumns(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetDetectedCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**DetectedCatalogColumns**](DetectedCatalogColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetImportationMonitoring"></a>
# **importationGetImportationMonitoring**
> ImportationMonitoring importationGetImportationMonitoring(storeId, executionId)

Get the importation status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    ImportationMonitoring result = apiInstance.importationGetImportationMonitoring(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetImportationMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**ImportationMonitoring**](ImportationMonitoring.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetManualUpdateLastInputConfig"></a>
# **importationGetManualUpdateLastInputConfig**
> LastManualImportInputConfiguration importationGetManualUpdateLastInputConfig(storeId)

Get the last input configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    LastManualImportInputConfiguration result = apiInstance.importationGetManualUpdateLastInputConfig(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetManualUpdateLastInputConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**LastManualImportInputConfiguration**](LastManualImportInputConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetProductSample"></a>
# **importationGetProductSample**
> ProductSample importationGetProductSample(storeId, executionId, productSampleIndex)

Get the product sample related to this importation with all columns (catalog and custom)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
Integer productSampleIndex = 56; // Integer | Index of the product sample. Starting from 0 to 99.
try {
    ProductSample result = apiInstance.importationGetProductSample(storeId, executionId, productSampleIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetProductSample");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **productSampleIndex** | **Integer**| Index of the product sample. Starting from 0 to 99. |

### Return type

[**ProductSample**](ProductSample.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetProductSampleCustomColumnValue"></a>
# **importationGetProductSampleCustomColumnValue**
> String importationGetProductSampleCustomColumnValue(storeId, executionId, productSampleIndex, columnId)

Get product sample custom column value related to this importation.

/!\\ Use this operation only when you just changed the custom column expression and you want to get a precise the property value. Otherwise use the operation Importation_GetProductSample which will give you all property values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
Integer productSampleIndex = 56; // Integer | Index of the product sample. Starting from 0 to 99.
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.importationGetProductSampleCustomColumnValue(storeId, executionId, productSampleIndex, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetProductSampleCustomColumnValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **productSampleIndex** | **Integer**| Index of the product sample. Starting from 0 to 99. |
 **columnId** | **String**| The custom column identifier |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetReportings"></a>
# **importationGetReportings**
> List&lt;ImportationReporting&gt; importationGetReportings(storeId)

Get the latest catalog importation reporting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    List<ImportationReporting> result = apiInstance.importationGetReportings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationGetReportings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**List&lt;ImportationReporting&gt;**](ImportationReporting.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationIgnoreColumn"></a>
# **importationIgnoreColumn**
> importationIgnoreColumn(storeId, executionId, columnId)

Ignore Column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationIgnoreColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationIgnoreColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationMapCatalogColumn"></a>
# **importationMapCatalogColumn**
> importationMapCatalogColumn(storeId, executionId, columnId, request)

Map catalog column to a BeezUP column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The catalog column identifier
MapBeezUPColumnRequest request = new MapBeezUPColumnRequest(); // MapBeezUPColumnRequest | 
try {
    apiInstance.importationMapCatalogColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationMapCatalogColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The catalog column identifier |
 **request** | [**MapBeezUPColumnRequest**](MapBeezUPColumnRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationMapCustomColumn"></a>
# **importationMapCustomColumn**
> importationMapCustomColumn(storeId, executionId, columnId, request)

Map custom column to a BeezUP column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
MapBeezUPColumnRequest request = new MapBeezUPColumnRequest(); // MapBeezUPColumnRequest | 
try {
    apiInstance.importationMapCustomColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationMapCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |
 **request** | [**MapBeezUPColumnRequest**](MapBeezUPColumnRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationReattendColumn"></a>
# **importationReattendColumn**
> importationReattendColumn(storeId, executionId, columnId)

Reattend Column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationReattendColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationReattendColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationSaveCustomColumn"></a>
# **importationSaveCustomColumn**
> importationSaveCustomColumn(storeId, executionId, columnId, request)

Create or replace a custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
ChangeCustomColumnRequest request = new ChangeCustomColumnRequest(); // ChangeCustomColumnRequest | 
try {
    apiInstance.importationSaveCustomColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationSaveCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ChangeCustomColumnRequest**](ChangeCustomColumnRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationStartManualUpdate"></a>
# **importationStartManualUpdate**
> List&lt;BeezUPCommonLink2&gt; importationStartManualUpdate(storeId, request)

Start Manual Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
StartManualImportRequest request = new StartManualImportRequest(); // StartManualImportRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.importationStartManualUpdate(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationStartManualUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**StartManualImportRequest**](StartManualImportRequest.md)|  |

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationTechnicalProgression"></a>
# **importationTechnicalProgression**
> ImportationTechnicalProgression importationTechnicalProgression(storeId, executionId)

Get technical progression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    ImportationTechnicalProgression result = apiInstance.importationTechnicalProgression(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationTechnicalProgression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**ImportationTechnicalProgression**](ImportationTechnicalProgression.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationUnmapCatalogColumn"></a>
# **importationUnmapCatalogColumn**
> importationUnmapCatalogColumn(storeId, executionId, columnId)

Unmap catalog column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The catalog column identifier
try {
    apiInstance.importationUnmapCatalogColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationUnmapCatalogColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The catalog column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationUnmapCustomColumn"></a>
# **importationUnmapCustomColumn**
> importationUnmapCustomColumn(storeId, executionId, columnId)

Unmap custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationUnmapCustomColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#importationUnmapCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout()

Log out the current user from go2

Log out the current user from go2

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mapChannelCatalogCategory"></a>
# **mapChannelCatalogCategory**
> mapChannelCatalogCategory(channelCatalogId, request)

Map channel catalog category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
MapCategoryRequest request = new MapCategoryRequest(); // MapCategoryRequest | 
try {
    apiInstance.mapChannelCatalogCategory(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#mapChannelCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**MapCategoryRequest**](MapCategoryRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mapChannelCatalogColumns"></a>
# **mapChannelCatalogColumns**
> mapChannelCatalogColumns(channelCatalogId, request)

Configure channel catalog column mappings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
ColumnMappingList request = new ColumnMappingList(); // ColumnMappingList | 
try {
    apiInstance.mapChannelCatalogColumns(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#mapChannelCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**ColumnMappingList**](ColumnMappingList.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveDownRule"></a>
# **moveDownRule**
> moveDownRule(storeId, ruleId)

Move the rule down

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveDownRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#moveDownRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveUpRule"></a>
# **moveUpRule**
> moveUpRule(storeId, ruleId)

Move the rule up

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveUpRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#moveUpRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimise"></a>
# **optimise**
> optimise(storeId, actionName, request)

Optimise products

/!\\ WARNING /!\\ \\ Apply the operation on every product related to this request. \\ This operation is used at the bottom of the analytics page result. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String actionName = "actionName_example"; // String | 
OptimiseRequest request = new OptimiseRequest(); // OptimiseRequest | 
try {
    apiInstance.optimise(storeId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#optimise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | [**OptimiseRequest**](OptimiseRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByCategory"></a>
# **optimiseByCategory**
> optimiseByCategory(storeId, catalogCategoryId, actionName, request)

Optimise products&#39;s category

/!\\ WARNING /!\\ \\ This operation will reenable or disable products&#39;s category for every channel indicated in the body.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String catalogCategoryId = "catalogCategoryId_example"; // String | The category identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
List<String> request = Arrays.asList(new List<String>()); // List<String> | The channel identifier list concerned by this optimisation
try {
    apiInstance.optimiseByCategory(storeId, catalogCategoryId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#optimiseByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **catalogCategoryId** | **String**| The category identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | **List&lt;String&gt;**| The channel identifier list concerned by this optimisation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByChannel"></a>
# **optimiseByChannel**
> optimiseByChannel(storeId, channelId, actionName)

Optimise products&#39;s category

/!\\ WARNING /!\\ \\ Apply the operation on every product on this channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String channelId = "channelId_example"; // String | The channel identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
try {
    apiInstance.optimiseByChannel(storeId, channelId, actionName);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#optimiseByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **channelId** | **String**| The channel identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByProduct"></a>
# **optimiseByProduct**
> optimiseByProduct(storeId, productId, actionName, request)

Optimise products

/!\\ WARNING /!\\ \\ This operation will reenable or disable this product for every channel indicated in the body.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String productId = "productId_example"; // String | The product identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
List<String> request = Arrays.asList(new List<String>()); // List<String> | The channel identifier list concerned by this optimisation
try {
    apiInstance.optimiseByProduct(storeId, productId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#optimiseByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **productId** | **String**| The product identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | **List&lt;String&gt;**| The channel identifier list concerned by this optimisation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="overrideChannelCatalogProductOverrides"></a>
# **overrideChannelCatalogProductOverrides**
> overrideChannelCatalogProductOverrides(channelCatalogId, productId, request)

Override channel catalog product values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
ProductOverrides request = new ProductOverrides(); // ProductOverrides | 
try {
    apiInstance.overrideChannelCatalogProductOverrides(channelCatalogId, productId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#overrideChannelCatalogProductOverrides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |
 **request** | [**ProductOverrides**](ProductOverrides.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reactivateCurrentContract"></a>
# **reactivateCurrentContract**
> reactivateCurrentContract()

Reactivate your terminated contract.

By calling this operation you can re-enable the auto renewal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    apiInstance.reactivateCurrentContract();
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#reactivateCurrentContract");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reenableChannelCatalogProduct"></a>
# **reenableChannelCatalogProduct**
> reenableChannelCatalogProduct(channelCatalogId, productId)

Reenable channel catalog product

By default a all your catalog products are exposed to the channel. You can reenable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    apiInstance.reenableChannelCatalogProduct(channelCatalogId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#reenableChannelCatalogProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendEmailActivation"></a>
# **resendEmailActivation**
> resendEmailActivation()

Resend email activation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
try {
    apiInstance.resendEmailActivation();
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#resendEmailActivation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runRule"></a>
# **runRule**
> runRule(storeId, ruleId)

Run rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.runRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#runRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runRules"></a>
# **runRules**
> runRules(storeId)

Run all rules for this store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.runRules(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#runRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveCompanyInfo"></a>
# **saveCompanyInfo**
> saveCompanyInfo(request)

Change company information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
CompanyInfo request = new CompanyInfo(); // CompanyInfo | 
try {
    apiInstance.saveCompanyInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#saveCompanyInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CompanyInfo**](CompanyInfo.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveCreditCardInfo"></a>
# **saveCreditCardInfo**
> saveCreditCardInfo(request)

Save user credit card info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
CreditCardInfo request = new CreditCardInfo(); // CreditCardInfo | Credit card info
try {
    apiInstance.saveCreditCardInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#saveCreditCardInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreditCardInfo**](CreditCardInfo.md)| Credit card info |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="savePersonalInfo"></a>
# **savePersonalInfo**
> savePersonalInfo(request)

Save user personal information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
PersonalInfo request = new PersonalInfo(); // PersonalInfo | 
try {
    apiInstance.savePersonalInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#savePersonalInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PersonalInfo**](PersonalInfo.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveProfilePictureInfo"></a>
# **saveProfilePictureInfo**
> saveProfilePictureInfo(request)

Change user picture information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
ProfilePictureInfo request = new ProfilePictureInfo(); // ProfilePictureInfo | 
try {
    apiInstance.saveProfilePictureInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#saveProfilePictureInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ProfilePictureInfo**](ProfilePictureInfo.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveReportFilter"></a>
# **saveReportFilter**
> saveReportFilter(storeId, reportFilterId, reportFilter)

Save the report filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
SaveReportFilterRequest reportFilter = new SaveReportFilterRequest(); // SaveReportFilterRequest | 
try {
    apiInstance.saveReportFilter(storeId, reportFilterId, reportFilter);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#saveReportFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **reportFilterId** | **String**| Your report filter identifier |
 **reportFilter** | [**SaveReportFilterRequest**](SaveReportFilterRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveStoreAlert"></a>
# **saveStoreAlert**
> saveStoreAlert(storeId, alertId, request)

Save store alert

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer alertId = 56; // Integer | 
List<SaveStoreAlertRequest> request = Arrays.asList(new SaveStoreAlertRequest()); // List<SaveStoreAlertRequest> | 
try {
    apiInstance.saveStoreAlert(storeId, alertId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#saveStoreAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **alertId** | **Integer**|  |
 **request** | [**List&lt;SaveStoreAlertRequest&gt;**](SaveStoreAlertRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setChannelCatalogMarketplaceSettings"></a>
# **setChannelCatalogMarketplaceSettings**
> setChannelCatalogMarketplaceSettings(channelCatalogId, model)

Save new marketplace settings for a channel catalog

Allow you to configure your marketplace settings.  Partial update accepted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "channelCatalogId_example"; // String | Channel Catalog Id to query
SetChannelCatalogMarketplaceSettingsRequest model = new SetChannelCatalogMarketplaceSettingsRequest(); // SetChannelCatalogMarketplaceSettingsRequest | Settings to save
try {
    apiInstance.setChannelCatalogMarketplaceSettings(channelCatalogId, model);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#setChannelCatalogMarketplaceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| Channel Catalog Id to query |
 **model** | [**SetChannelCatalogMarketplaceSettingsRequest**](SetChannelCatalogMarketplaceSettingsRequest.md)| Settings to save |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMerchantOrderInfo"></a>
# **setMerchantOrderInfo**
> setMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId, request)

Set an Order&#39;s merchant information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The BeezUP Order identifier
SetMerchantOrderInfoRequest request = new SetMerchantOrderInfoRequest(); // SetMerchantOrderInfoRequest | 
try {
    apiInstance.setMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#setMerchantOrderInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The BeezUP Order identifier |
 **request** | [**SetMerchantOrderInfoRequest**](SetMerchantOrderInfoRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMerchantOrderInfoList"></a>
# **setMerchantOrderInfoList**
> BatchOrderOperationResponse setMerchantOrderInfoList(request)

Send a batch of operations to set an Order&#39;s merchant information

The purpose of this operation is to reduce the amount of request to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
SetMerchantOrderInfoListRequest request = new SetMerchantOrderInfoListRequest(); // SetMerchantOrderInfoListRequest | 
try {
    BatchOrderOperationResponse result = apiInstance.setMerchantOrderInfoList(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#setMerchantOrderInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetMerchantOrderInfoListRequest**](SetMerchantOrderInfoListRequest.md)|  |

### Return type

[**BatchOrderOperationResponse**](BatchOrderOperationResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="share"></a>
# **share**
> share(storeId, email)

Share a store to another user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
FriendEmail email = new FriendEmail(); // FriendEmail | Your friend's email
try {
    apiInstance.share(storeId, email);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#share");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **email** | [**FriendEmail**](FriendEmail.md)| Your friend&#39;s email |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terminateCurrentContract"></a>
# **terminateCurrentContract**
> terminateCurrentContract(request)

Schedule termination of your current contract at the end of the commitment.

By default your contract are automatically renew. By calling this operation you can disable the auto renewal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
TerminateContract request = new TerminateContract(); // TerminateContract | Indicate the termination reason
try {
    apiInstance.terminateCurrentContract(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#terminateCurrentContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TerminateContract**](TerminateContract.md)| Indicate the termination reason |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unmapChannelCatalogCategory"></a>
# **unmapChannelCatalogCategory**
> unmapChannelCatalogCategory(channelCatalogId, request)

Unmap channel catalog category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
UnmapCategoryRequest request = new UnmapCategoryRequest(); // UnmapCategoryRequest | 
try {
    apiInstance.unmapChannelCatalogCategory(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#unmapChannelCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**UnmapCategoryRequest**](UnmapCategoryRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRule"></a>
# **updateRule**
> updateRule(storeId, ruleId, request)

Update Rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
UpdateRuleRequest request = new UpdateRuleRequest(); // UpdateRuleRequest | 
try {
    apiInstance.updateRule(storeId, ruleId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#updateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |
 **request** | [**UpdateRuleRequest**](UpdateRuleRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStore"></a>
# **updateStore**
> updateStore(storeId, request)

Update some store&#39;s information.

Update some store&#39;s information. FYI, you cannot change the country. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeezUPApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BeezUPApi apiInstance = new BeezUPApi();
String storeId = "storeId_example"; // String | Your store identifier
UpdateStoreRequest request = new UpdateStoreRequest(); // UpdateStoreRequest | 
try {
    apiInstance.updateStore(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling BeezUPApi#updateStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**UpdateStoreRequest**](UpdateStoreRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

