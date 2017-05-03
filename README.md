# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountApi apiInstance = new AccountApi();
        String emailActivationId = "emailActivationId_example"; // String | The email activation id received by email.
        try {
            apiInstance.activateUserAccount(emailActivationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#activateUserAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.comv2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**activateUserAccount**](docs/AccountApi.md#activateUserAccount) | **POST** /v2/user/customer/account/activate | Activate the user account
*AccountApi* | [**changePassword**](docs/AccountApi.md#changePassword) | **POST** /v2/user/customer/account/changePassword | Change user password
*AccountApi* | [**getCreditCardInfo**](docs/AccountApi.md#getCreditCardInfo) | **GET** /v2/user/customer/account/creditCardInfo | Get credit card information
*AccountApi* | [**getUserAccountInfo**](docs/AccountApi.md#getUserAccountInfo) | **GET** /v2/user/customer/account | Get user account information
*AccountApi* | [**resendEmailActivation**](docs/AccountApi.md#resendEmailActivation) | **POST** /v2/user/customer/account/resendEmailActivation | Resend email activation
*AccountApi* | [**saveCompanyInfo**](docs/AccountApi.md#saveCompanyInfo) | **PUT** /v2/user/customer/account/companyInfo | Change company information
*AccountApi* | [**saveCreditCardInfo**](docs/AccountApi.md#saveCreditCardInfo) | **PUT** /v2/user/customer/account/creditCardInfo | Save user credit card info
*AccountApi* | [**savePersonalInfo**](docs/AccountApi.md#savePersonalInfo) | **PUT** /v2/user/customer/account/personalInfo | Save user personal information
*AccountApi* | [**saveProfilePictureInfo**](docs/AccountApi.md#saveProfilePictureInfo) | **PUT** /v2/user/customer/account/profilePictureInfo | Change user picture information
*AlertsApi* | [**getStoreAlerts**](docs/AlertsApi.md#getStoreAlerts) | **GET** /v2/user/customer/stores/{storeId}/alerts | Get store&#39;s alerts
*AlertsApi* | [**saveStoreAlert**](docs/AlertsApi.md#saveStoreAlert) | **PUT** /v2/user/customer/stores/{storeId}/alerts/{alertId} | Save store alert
*AutoApi* | [**autoConfigureAutoImportInterval**](docs/AutoApi.md#autoConfigureAutoImportInterval) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
*AutoApi* | [**autoDeleteAutoImport**](docs/AutoApi.md#autoDeleteAutoImport) | **DELETE** /v2/user/catalogs/{storeId}/autoImport | Delete Auto Import
*AutoApi* | [**autoGetAutoImportConfiguration**](docs/AutoApi.md#autoGetAutoImportConfiguration) | **GET** /v2/user/catalogs/{storeId}/autoImport | Get the auto import configuration
*AutoApi* | [**autoPauseAutoImport**](docs/AutoApi.md#autoPauseAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/pause | Pause Auto Import
*AutoApi* | [**autoResumeAutoImport**](docs/AutoApi.md#autoResumeAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/resume | Resume Auto Import
*AutoApi* | [**autoScheduleAutoImport**](docs/AutoApi.md#autoScheduleAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
*AutoApi* | [**autoStartAutoImport**](docs/AutoApi.md#autoStartAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/start | Start Auto Import Manually
*AutoApi* | [**importationActivateAutoImport**](docs/AutoApi.md#importationActivateAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.
*AutoTransitionsApi* | [**configureAutomaticTransitions**](docs/AutoTransitionsApi.md#configureAutomaticTransitions) | **POST** /v2/user/marketplaces/orders/automaticTransitions | Configure automatic order status transitions
*AutoTransitionsApi* | [**getAutomaticTransitions**](docs/AutoTransitionsApi.md#getAutomaticTransitions) | **GET** /v2/user/marketplaces/orders/automaticTransitions | Get automatic order status transition list
*BatchesApi* | [**changeOrderList**](docs/BatchesApi.md#changeOrderList) | **POST** /v2/user/marketplaces/orders/batches/changeOrders/{changeOrderType} | Batches the change order operation.
*BatchesApi* | [**clearMerchantOrderInfoList**](docs/BatchesApi.md#clearMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/clearMerchantOrderInfos | Batches the clear merchant order info operation.
*BatchesApi* | [**setMerchantOrderInfoList**](docs/BatchesApi.md#setMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/setMerchantOrderInfos | Batches the set merchant order info operation.
*CatalogApi* | [**catalogChangeCatalogColumnUserName**](docs/CatalogApi.md#catalogChangeCatalogColumnUserName) | **POST** /v2/user/catalogs/{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
*CatalogApi* | [**catalogChangeCustomColumnExpression**](docs/CatalogApi.md#catalogChangeCustomColumnExpression) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Change custom column expression
*CatalogApi* | [**catalogChangeCustomColumnUserName**](docs/CatalogApi.md#catalogChangeCustomColumnUserName) | **POST** /v2/user/catalogs/{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
*CatalogApi* | [**catalogComputeExpression**](docs/CatalogApi.md#catalogComputeExpression) | **POST** /v2/user/catalogs/{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
*CatalogApi* | [**catalogDeleteCustomColumn**](docs/CatalogApi.md#catalogDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Delete custom column
*CatalogApi* | [**catalogGetCatalogColumns**](docs/CatalogApi.md#catalogGetCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/catalogColumns | Get catalog column list
*CatalogApi* | [**catalogGetCategories**](docs/CatalogApi.md#catalogGetCategories) | **GET** /v2/user/catalogs/{storeId}/categories | Get category list
*CatalogApi* | [**catalogGetCustomColumnExpression**](docs/CatalogApi.md#catalogGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
*CatalogApi* | [**catalogGetCustomColumns**](docs/CatalogApi.md#catalogGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/customColumns | Get custom column list
*CatalogApi* | [**catalogGetProduct**](docs/CatalogApi.md#catalogGetProduct) | **GET** /v2/user/catalogs/{storeId}/products/{productId} | Get product
*CatalogApi* | [**catalogGetProducts**](docs/CatalogApi.md#catalogGetProducts) | **POST** /v2/user/catalogs/{storeId}/products | Get product list
*CatalogApi* | [**catalogGetRandomProducts**](docs/CatalogApi.md#catalogGetRandomProducts) | **GET** /v2/user/catalogs/{storeId}/products/random | Get random product list
*CatalogApi* | [**catalogSaveCustomColumn**](docs/CatalogApi.md#catalogSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Create or replace a custom column
*CatalogApi* | [**importationGetManualUpdateLastInputConfig**](docs/CatalogApi.md#importationGetManualUpdateLastInputConfig) | **GET** /v2/user/catalogs/{storeId}/inputConfiguration | Get the last input configuration
*ChannelCatalogsCategoryMappingsApi* | [**getChannelCatalogCategories**](docs/ChannelCatalogsCategoryMappingsApi.md#getChannelCatalogCategories) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings | Get channel catalog categories
*ChannelCatalogsCategoryMappingsApi* | [**mapChannelCatalogCategory**](docs/ChannelCatalogsCategoryMappingsApi.md#mapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map | Map channel catalog category
*ChannelCatalogsCategoryMappingsApi* | [**unmapChannelCatalogCategory**](docs/ChannelCatalogsCategoryMappingsApi.md#unmapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category
*ChannelCatalogsColumnMappingsApi* | [**mapChannelCatalogColumns**](docs/ChannelCatalogsColumnMappingsApi.md#mapChannelCatalogColumns) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/columnMappings | Configure channel catalog column mappings
*ChannelCatalogsExclusionFiltersApi* | [**configureChannelCatalogExclusionFilters**](docs/ChannelCatalogsExclusionFiltersApi.md#configureChannelCatalogExclusionFilters) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
*ChannelCatalogsExclusionFiltersApi* | [**getChannelCatalogExclusionFilterOperators**](docs/ChannelCatalogsExclusionFiltersApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /v2/user/channelCatalogs/exclusionFilterOperators | Get channel catalog exclusion filter operators
*ChannelCatalogsGlobalApi* | [**createChannelCatalog**](docs/ChannelCatalogsGlobalApi.md#createChannelCatalog) | **POST** /v2/user/channelCatalogs/ | Create a new channel catalog
*ChannelCatalogsGlobalApi* | [**deleteChannelCatalog**](docs/ChannelCatalogsGlobalApi.md#deleteChannelCatalog) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId} | Delete the channel catalog
*ChannelCatalogsGlobalApi* | [**getChannelCatalog**](docs/ChannelCatalogsGlobalApi.md#getChannelCatalog) | **GET** /v2/user/channelCatalogs/{channelCatalogId} | Get the channel catalog information
*ChannelCatalogsGlobalApi* | [**getChannelCatalogs**](docs/ChannelCatalogsGlobalApi.md#getChannelCatalogs) | **GET** /v2/user/channelCatalogs/ | List all your current channel catalogs
*ChannelCatalogsProductsApi* | [**getChannelCatalogProductInfo**](docs/ChannelCatalogsProductsApi.md#getChannelCatalogProductInfo) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId} | Get channel catalog product information
*ChannelCatalogsProductsApi* | [**getChannelCatalogProductInfoList**](docs/ChannelCatalogsProductsApi.md#getChannelCatalogProductInfoList) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products | Get channel catalog product information list
*ChannelCatalogsProductsOptimisationApi* | [**disableChannelCatalogProduct**](docs/ChannelCatalogsProductsOptimisationApi.md#disableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/disable | Disable channel catalog product
*ChannelCatalogsProductsOptimisationApi* | [**reenableChannelCatalogProduct**](docs/ChannelCatalogsProductsOptimisationApi.md#reenableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/reenable | Reenable channel catalog product
*ChannelCatalogsProductsOverridesApi* | [**deleteChannelCatalogProductValueOverride**](docs/ChannelCatalogsProductsOverridesApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
*ChannelCatalogsProductsOverridesApi* | [**overrideChannelCatalogProductOverrides**](docs/ChannelCatalogsProductsOverridesApi.md#overrideChannelCatalogProductOverrides) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values
*ChannelCatalogsSettingsApi* | [**configureChannelCatalogCostSettings**](docs/ChannelCatalogsSettingsApi.md#configureChannelCatalogCostSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/cost | Disable a channel catalog
*ChannelCatalogsSettingsApi* | [**configureChannelCatalogGeneralSettings**](docs/ChannelCatalogsSettingsApi.md#configureChannelCatalogGeneralSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/general | Disable a channel catalog
*ChannelCatalogsSettingsApi* | [**disableChannelCatalog**](docs/ChannelCatalogsSettingsApi.md#disableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/disable | Disable a channel catalog
*ChannelCatalogsSettingsApi* | [**enableChannelCatalog**](docs/ChannelCatalogsSettingsApi.md#enableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/enable | Enable a channel catalog
*ChannelsGlobalApi* | [**getChannelCategories**](docs/ChannelsGlobalApi.md#getChannelCategories) | **GET** /v2/user/channels/{channelId}/categories | Get channel categories
*ChannelsGlobalApi* | [**getChannelColumns**](docs/ChannelsGlobalApi.md#getChannelColumns) | **POST** /v2/user/channels/{channelId}/columns | Get channel columns
*ChannelsGlobalApi* | [**getChannelInfo**](docs/ChannelsGlobalApi.md#getChannelInfo) | **GET** /v2/user/channels/{channelId} | Get channel information
*ChannelsGlobalApi* | [**getCurrentChannels**](docs/ChannelsGlobalApi.md#getCurrentChannels) | **GET** /v2/user/channels/ | List all available channel for this store
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /v2/user/customer/contracts | Create a new contract
*ContractsApi* | [**deleteNextContract**](docs/ContractsApi.md#deleteNextContract) | **DELETE** /v2/user/customer/contracts/next | Delete your next contract
*ContractsApi* | [**getBillingPeriods**](docs/ContractsApi.md#getBillingPeriods) | **GET** /v2/user/customer/billingPeriods | Get billing periods conditions
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /v2/user/customer/contracts | Get contract list
*ContractsApi* | [**getOffer**](docs/ContractsApi.md#getOffer) | **POST** /v2/user/customer/offers | Get offer pricing
*ContractsApi* | [**getStandardOffers**](docs/ContractsApi.md#getStandardOffers) | **GET** /v2/user/customer/offers | Get all standard offers
*ContractsApi* | [**reactivateCurrentContract**](docs/ContractsApi.md#reactivateCurrentContract) | **POST** /v2/user/customer/contracts/current/reenableAutoRenewal | Reactivate your terminated contract.
*ContractsApi* | [**terminateCurrentContract**](docs/ContractsApi.md#terminateCurrentContract) | **POST** /v2/user/customer/contracts/current/disableAutoRenewal | Schedule termination of your current contract at the end of the commitment.
*ExportsApi* | [**exportOrders**](docs/ExportsApi.md#exportOrders) | **POST** /v2/user/marketplaces/orders/exportations | Export orders
*ExportsApi* | [**getOrderExportations**](docs/ExportsApi.md#getOrderExportations) | **GET** /v2/user/marketplaces/orders/exportations | Get the order exportation list
*FriendsApi* | [**getFriendInfo**](docs/FriendsApi.md#getFriendInfo) | **GET** /v2/user/customer/friends/{userId} | Get friend information
*GlobalApi* | [**catalogGetBeezUPColumns**](docs/GlobalApi.md#catalogGetBeezUPColumns) | **GET** /v2/user/catalogs/beezupColumns | Get the BeezUP columns
*GlobalApi* | [**getMarketplaceAccountsSynchronization**](docs/GlobalApi.md#getMarketplaceAccountsSynchronization) | **GET** /v2/user/marketplaces/orders/status | Get marketplace accounts synchronization status
*GlobalApi* | [**harvestAll**](docs/GlobalApi.md#harvestAll) | **POST** /v2/user/marketplaces/orders/harvest | Harvest orders from all marketplaces
*GroupsApi* | [**getPublicListGroup**](docs/GroupsApi.md#getPublicListGroup) | **GET** /v2/public/lov/groups/{listGroupName} | Get list of values related to this group name
*GroupsApi* | [**getPublicListGroupNames**](docs/GroupsApi.md#getPublicListGroupNames) | **GET** /v2/public/lov/groups | Get list of group of list name
*GroupsApi* | [**getUserListGroup**](docs/GroupsApi.md#getUserListGroup) | **GET** /v2/user/lov/groups/{listGroupName} | Get list of values related to this group name
*GroupsApi* | [**getUserListGroupNames**](docs/GroupsApi.md#getUserListGroupNames) | **GET** /v2/user/lov/groups | Get list of group of list name
*ImportationCatalogInfoApi* | [**importationConfigureCatalogColumn**](docs/ImportationCatalogInfoApi.md#importationConfigureCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId} | Configure catalog column
*ImportationCatalogInfoApi* | [**importationDeleteCustomColumn**](docs/ImportationCatalogInfoApi.md#importationDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Delete Custom Column
*ImportationCatalogInfoApi* | [**importationGetCustomColumnExpression**](docs/ImportationCatalogInfoApi.md#importationGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/expression | Get the encrypted custom column expression in this importation
*ImportationCatalogInfoApi* | [**importationGetCustomColumns**](docs/ImportationCatalogInfoApi.md#importationGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns | Get custom columns currently place in this importation
*ImportationCatalogInfoApi* | [**importationGetDetectedCatalogColumns**](docs/ImportationCatalogInfoApi.md#importationGetDetectedCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns | Get detected catalog columns during this importation.
*ImportationCatalogInfoApi* | [**importationGetProductSample**](docs/ImportationCatalogInfoApi.md#importationGetProductSample) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex} | Get the product sample related to this importation with all columns (catalog and custom)
*ImportationCatalogInfoApi* | [**importationGetProductSampleCustomColumnValue**](docs/ImportationCatalogInfoApi.md#importationGetProductSampleCustomColumnValue) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex}/customColumns/{columnId} | Get product sample custom column value related to this importation.
*ImportationCatalogInfoApi* | [**importationIgnoreColumn**](docs/ImportationCatalogInfoApi.md#importationIgnoreColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/ignore | Ignore Column
*ImportationCatalogInfoApi* | [**importationMapCatalogColumn**](docs/ImportationCatalogInfoApi.md#importationMapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/map | Map catalog column to a BeezUP column
*ImportationCatalogInfoApi* | [**importationMapCustomColumn**](docs/ImportationCatalogInfoApi.md#importationMapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/map | Map custom column to a BeezUP column
*ImportationCatalogInfoApi* | [**importationReattendColumn**](docs/ImportationCatalogInfoApi.md#importationReattendColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/reattend | Reattend Column
*ImportationCatalogInfoApi* | [**importationSaveCustomColumn**](docs/ImportationCatalogInfoApi.md#importationSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Create or replace a custom column
*ImportationCatalogInfoApi* | [**importationUnmapCatalogColumn**](docs/ImportationCatalogInfoApi.md#importationUnmapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/unmap | Unmap catalog column
*ImportationCatalogInfoApi* | [**importationUnmapCustomColumn**](docs/ImportationCatalogInfoApi.md#importationUnmapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/unmap | Unmap custom column
*ImportationProcessApi* | [**importationCancel**](docs/ImportationProcessApi.md#importationCancel) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId} | Cancel importation
*ImportationProcessApi* | [**importationCommit**](docs/ImportationProcessApi.md#importationCommit) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commit | Commit Importation
*ImportationProcessApi* | [**importationCommitColumns**](docs/ImportationProcessApi.md#importationCommitColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commitColumns | Commit columns
*ImportationProcessApi* | [**importationConfigureRemainingCatalogColumns**](docs/ImportationProcessApi.md#importationConfigureRemainingCatalogColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
*ImportationProcessApi* | [**importationGetImportationMonitoring**](docs/ImportationProcessApi.md#importationGetImportationMonitoring) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId} | Get the importation status
*ImportationProcessApi* | [**importationGetReportings**](docs/ImportationProcessApi.md#importationGetReportings) | **GET** /v2/user/catalogs/{storeId}/importations | Get the latest catalog importation reporting
*ImportationProcessApi* | [**importationStartManualUpdate**](docs/ImportationProcessApi.md#importationStartManualUpdate) | **POST** /v2/user/catalogs/{storeId}/importations | Start Manual Import
*ImportationProcessApi* | [**importationTechnicalProgression**](docs/ImportationProcessApi.md#importationTechnicalProgression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/technicalProgression | Get technical progression
*InvoicesApi* | [**getInvoices**](docs/InvoicesApi.md#getInvoices) | **GET** /v2/user/customer/invoices | Get all your invoices
*LOVApi* | [**getPublicListNames**](docs/LOVApi.md#getPublicListNames) | **GET** /v2/public/lov/ | Get all list names
*LOVApi* | [**getPublicListOfValues**](docs/LOVApi.md#getPublicListOfValues) | **GET** /v2/public/lov/{listName} | Get the list of values related to this list name
*LOVApi* | [**getUserListNames**](docs/LOVApi.md#getUserListNames) | **GET** /v2/user/lov/ | Get all list names
*LOVApi* | [**getUserListOfValues**](docs/LOVApi.md#getUserListOfValues) | **GET** /v2/user/lov/{listName} | Get the list of values related to this list name
*ListApi* | [**getOrderListFull**](docs/ListApi.md#getOrderListFull) | **POST** /v2/user/marketplaces/orders/list/full | Get order list with all order properties and all order items.
*ListApi* | [**getOrderListLight**](docs/ListApi.md#getOrderListLight) | **POST** /v2/user/marketplaces/orders/list/light | Get order list without details
*MarketplacesChannelCatalogsGlobalApi* | [**getMarketplaceAccountStores**](docs/MarketplacesChannelCatalogsGlobalApi.md#getMarketplaceAccountStores) | **GET** /v2/user/marketplaces/channelcatalogs/ | Get  you marketplace channel catalog list
*MarketplacesChannelCatalogsPublicationsApi* | [**getPublications**](docs/MarketplacesChannelCatalogsPublicationsApi.md#getPublications) | **GET** /v2/user/marketplaces/channelcatalogs/publications/{marketplaceTechnicalCode}/{accountId}/history | Fetch the publication history for an account, sorted by descending start date
*MarketplacesChannelCatalogsSettingsApi* | [**getChannelCatalogMarketplaceProperties**](docs/MarketplacesChannelCatalogsSettingsApi.md#getChannelCatalogMarketplaceProperties) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/properties | Get the marketplace properties for a channel catalog
*MarketplacesChannelCatalogsSettingsApi* | [**getChannelCatalogMarketplaceSettings**](docs/MarketplacesChannelCatalogsSettingsApi.md#getChannelCatalogMarketplaceSettings) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Get the marketplace settings for a channel catalog
*MarketplacesChannelCatalogsSettingsApi* | [**setChannelCatalogMarketplaceSettings**](docs/MarketplacesChannelCatalogsSettingsApi.md#setChannelCatalogMarketplaceSettings) | **POST** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Save new marketplace settings for a channel catalog
*OneOrderApi* | [**changeOrder**](docs/OneOrderApi.md#changeOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change order status
*OneOrderApi* | [**clearMerchantOrderInfo**](docs/OneOrderApi.md#clearMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear the merchant info related to this order
*OneOrderApi* | [**getOrder**](docs/OneOrderApi.md#getOrder) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get order details
*OneOrderApi* | [**getOrderHistory**](docs/OneOrderApi.md#getOrderHistory) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get the harvest history and the change status operations
*OneOrderApi* | [**harvestOrder**](docs/OneOrderApi.md#harvestOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Harvest a specific order from the marketplace
*OneOrderApi* | [**setMerchantOrderInfo**](docs/OneOrderApi.md#setMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Associate your merchant order identifier to this order
*OptimisationsApi* | [**optimise**](docs/OptimisationsApi.md#optimise) | **POST** /v2/user/analytics/{storeId}/optimisations/{actionName} | Optimise products
*OptimisationsApi* | [**optimiseByCategory**](docs/OptimisationsApi.md#optimiseByCategory) | **POST** /v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
*OptimisationsApi* | [**optimiseByChannel**](docs/OptimisationsApi.md#optimiseByChannel) | **POST** /v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
*OptimisationsApi* | [**optimiseByProduct**](docs/OptimisationsApi.md#optimiseByProduct) | **POST** /v2/user/analytics/{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products
*ReportsApi* | [**deleteReportFilter**](docs/ReportsApi.md#deleteReportFilter) | **DELETE** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Delete the report filter
*ReportsApi* | [**exportStoreReportByCategory**](docs/ReportsApi.md#exportStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory/export | Export the report by category
*ReportsApi* | [**exportStoreReportByChannel**](docs/ReportsApi.md#exportStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel/export | Export the report by channel
*ReportsApi* | [**exportStoreReportByProduct**](docs/ReportsApi.md#exportStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct/export | Export the report by product
*ReportsApi* | [**getReportFilter**](docs/ReportsApi.md#getReportFilter) | **GET** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Get the report filter description
*ReportsApi* | [**getReportFilters**](docs/ReportsApi.md#getReportFilters) | **GET** /v2/user/analytics/{storeId}/reports/filters | Get report filter list for the given store
*ReportsApi* | [**getStoreReportByCategory**](docs/ReportsApi.md#getStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory | Get the report by category
*ReportsApi* | [**getStoreReportByChannel**](docs/ReportsApi.md#getStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel | Get the report by channel
*ReportsApi* | [**getStoreReportByDay**](docs/ReportsApi.md#getStoreReportByDay) | **POST** /v2/user/analytics/{storeId}/reports/byday | Get the report by day
*ReportsApi* | [**getStoreReportByDayExport**](docs/ReportsApi.md#getStoreReportByDayExport) | **POST** /v2/user/analytics/{storeId}/reports/byday/export | Get the report by day
*ReportsApi* | [**getStoreReportByProduct**](docs/ReportsApi.md#getStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct | Get the report by product
*ReportsApi* | [**saveReportFilter**](docs/ReportsApi.md#saveReportFilter) | **PUT** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Save the report filter
*RightsApi* | [**getRights**](docs/RightsApi.md#getRights) | **POST** /v2/user/customer/stores/{storeId}/rights | Get store&#39;s rights
*RulesApi* | [**createRule**](docs/RulesApi.md#createRule) | **POST** /v2/user/analytics/{storeId}/rules | Rule creation
*RulesApi* | [**deleteRule**](docs/RulesApi.md#deleteRule) | **DELETE** /v2/user/analytics/{storeId}/rules/{ruleId} | Delete Rule
*RulesApi* | [**disableRule**](docs/RulesApi.md#disableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/disable | Disable rule
*RulesApi* | [**enableRule**](docs/RulesApi.md#enableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/enable | Enable rule
*RulesApi* | [**getRule**](docs/RulesApi.md#getRule) | **GET** /v2/user/analytics/{storeId}/rules/{ruleId} | Gets the rule
*RulesApi* | [**getRules**](docs/RulesApi.md#getRules) | **GET** /v2/user/analytics/{storeId}/rules | Gets the list of rules for a given store
*RulesApi* | [**getRulesExecutions**](docs/RulesApi.md#getRulesExecutions) | **GET** /v2/user/analytics/{storeId}/rules/executions | Get the rules execution history
*RulesApi* | [**moveDownRule**](docs/RulesApi.md#moveDownRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/movedown | Move the rule down
*RulesApi* | [**moveUpRule**](docs/RulesApi.md#moveUpRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/moveup | Move the rule up
*RulesApi* | [**runRule**](docs/RulesApi.md#runRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/run | Run rule
*RulesApi* | [**runRules**](docs/RulesApi.md#runRules) | **POST** /v2/user/analytics/{storeId}/rules/run | Run all rules for this store
*RulesApi* | [**updateRule**](docs/RulesApi.md#updateRule) | **PATCH** /v2/user/analytics/{storeId}/rules/{ruleId} | Update Rule
*SecurityApi* | [**login**](docs/SecurityApi.md#login) | **POST** /v2/public/security/login | Login
*SecurityApi* | [**logout**](docs/SecurityApi.md#logout) | **POST** /v2/user/customer/security/logout | Log out the current user from go2
*SecurityApi* | [**lostPassword**](docs/SecurityApi.md#lostPassword) | **POST** /v2/public/security/lostpassword | Lost password
*SecurityApi* | [**register**](docs/SecurityApi.md#register) | **POST** /v2/public/security/register | User Registration
*SharesApi* | [**deleteShare**](docs/SharesApi.md#deleteShare) | **DELETE** /v2/user/customer/stores/{storeId}/shares/{userId} | Delete a share to another user
*SharesApi* | [**getShares**](docs/SharesApi.md#getShares) | **GET** /v2/user/customer/stores/{storeId}/shares | Get shares related to this store
*SharesApi* | [**share**](docs/SharesApi.md#share) | **POST** /v2/user/customer/stores/{storeId}/shares | Share a store to another user
*StoresApi* | [**createStore**](docs/StoresApi.md#createStore) | **POST** /v2/user/customer/stores | Create a new store
*StoresApi* | [**deleteStore**](docs/StoresApi.md#deleteStore) | **DELETE** /v2/user/customer/stores/{storeId} | Delete a store
*StoresApi* | [**getStore**](docs/StoresApi.md#getStore) | **GET** /v2/user/customer/stores/{storeId} | Get store&#39;s information
*StoresApi* | [**getStores**](docs/StoresApi.md#getStores) | **GET** /v2/user/customer/stores | Get store list
*StoresApi* | [**updateStore**](docs/StoresApi.md#updateStore) | **PATCH** /v2/user/customer/stores/{storeId} | Update some store&#39;s information.
*TrackingApi* | [**getStoreTrackedClicks**](docs/TrackingApi.md#getStoreTrackedClicks) | **GET** /v2/user/analytics/{storeId}/tracking/clicks | Get the latest clicks tracked
*TrackingApi* | [**getStoreTrackedExternalOrders**](docs/TrackingApi.md#getStoreTrackedExternalOrders) | **GET** /v2/user/analytics/{storeId}/tracking/externalorders | Get the latest external orders tracked
*TrackingApi* | [**getStoreTrackedOrders**](docs/TrackingApi.md#getStoreTrackedOrders) | **GET** /v2/user/analytics/{storeId}/tracking/orders | Get the latest orders tracked
*TrackingApi* | [**getStoreTrackingStatus**](docs/TrackingApi.md#getStoreTrackingStatus) | **GET** /v2/user/analytics/{storeId}/tracking/status | Get store tracking synchronization status
*TrackingApi* | [**getTrackingStatus**](docs/TrackingApi.md#getTrackingStatus) | **GET** /v2/user/analytics/tracking/status | Display the synchronization status of the clicks and orders


## Documentation for Models

 - [AccountId](docs/AccountId.md)
 - [AccountInfo](docs/AccountInfo.md)
 - [AccountInfoLinks](docs/AccountInfoLinks.md)
 - [AccountPublications](docs/AccountPublications.md)
 - [AccountPublicationsLinks](docs/AccountPublicationsLinks.md)
 - [AccountStatus](docs/AccountStatus.md)
 - [AccountSynchronization](docs/AccountSynchronization.md)
 - [AccountSynchronizations](docs/AccountSynchronizations.md)
 - [AccountingEmails](docs/AccountingEmails.md)
 - [Address](docs/Address.md)
 - [AlertId](docs/AlertId.md)
 - [AlertIsActive](docs/AlertIsActive.md)
 - [AlertName](docs/AlertName.md)
 - [AlertPropertyId](docs/AlertPropertyId.md)
 - [AlertPropertyValue](docs/AlertPropertyValue.md)
 - [ApiCredential](docs/ApiCredential.md)
 - [ApiCredentials](docs/ApiCredentials.md)
 - [ApiSettingStatus](docs/ApiSettingStatus.md)
 - [AutoImportConfiguration](docs/AutoImportConfiguration.md)
 - [AutomaticTransition](docs/AutomaticTransition.md)
 - [AutomaticTransitionInfo](docs/AutomaticTransitionInfo.md)
 - [AutomaticTransitionInfos](docs/AutomaticTransitionInfos.md)
 - [AvailableChannelLink](docs/AvailableChannelLink.md)
 - [BatchOrderOperationResponse](docs/BatchOrderOperationResponse.md)
 - [BeezUPColumnConfiguration](docs/BeezUPColumnConfiguration.md)
 - [BeezUPCommonBeezUPColumnName](docs/BeezUPCommonBeezUPColumnName.md)
 - [BeezUPCommonCatalogCategoryId](docs/BeezUPCommonCatalogCategoryId.md)
 - [BeezUPCommonCatalogCategoryPath](docs/BeezUPCommonCatalogCategoryPath.md)
 - [BeezUPCommonCatalogColumnId](docs/BeezUPCommonCatalogColumnId.md)
 - [BeezUPCommonCatalogColumnUserName](docs/BeezUPCommonCatalogColumnUserName.md)
 - [BeezUPCommonChannelBasicInfo](docs/BeezUPCommonChannelBasicInfo.md)
 - [BeezUPCommonChannelCatalogId](docs/BeezUPCommonChannelCatalogId.md)
 - [BeezUPCommonChannelCategoryId](docs/BeezUPCommonChannelCategoryId.md)
 - [BeezUPCommonChannelCategoryPath](docs/BeezUPCommonChannelCategoryPath.md)
 - [BeezUPCommonChannelColumnId](docs/BeezUPCommonChannelColumnId.md)
 - [BeezUPCommonChannelColumnName](docs/BeezUPCommonChannelColumnName.md)
 - [BeezUPCommonChannelId](docs/BeezUPCommonChannelId.md)
 - [BeezUPCommonChannelName](docs/BeezUPCommonChannelName.md)
 - [BeezUPCommonColumnDataType](docs/BeezUPCommonColumnDataType.md)
 - [BeezUPCommonColumnImportance](docs/BeezUPCommonColumnImportance.md)
 - [BeezUPCommonCountryIsoCodeAlpha3](docs/BeezUPCommonCountryIsoCodeAlpha3.md)
 - [BeezUPCommonCurrencyCode](docs/BeezUPCommonCurrencyCode.md)
 - [BeezUPCommonEmail](docs/BeezUPCommonEmail.md)
 - [BeezUPCommonErrorResponseMessage](docs/BeezUPCommonErrorResponseMessage.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonHttpUrl](docs/BeezUPCommonHttpUrl.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLOVLink3](docs/BeezUPCommonLOVLink3.md)
 - [BeezUPCommonLink2](docs/BeezUPCommonLink2.md)
 - [BeezUPCommonLink3](docs/BeezUPCommonLink3.md)
 - [BeezUPCommonLinkParameter2](docs/BeezUPCommonLinkParameter2.md)
 - [BeezUPCommonLinkParameter3](docs/BeezUPCommonLinkParameter3.md)
 - [BeezUPCommonListOfValueItem](docs/BeezUPCommonListOfValueItem.md)
 - [BeezUPCommonMarketplaceAccountId](docs/BeezUPCommonMarketplaceAccountId.md)
 - [BeezUPCommonMarketplaceBusinessCode](docs/BeezUPCommonMarketplaceBusinessCode.md)
 - [BeezUPCommonMarketplaceTechnicalCode](docs/BeezUPCommonMarketplaceTechnicalCode.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonPaginationResult](docs/BeezUPCommonPaginationResult.md)
 - [BeezUPCommonProductBasicInfo](docs/BeezUPCommonProductBasicInfo.md)
 - [BeezUPCommonProductId](docs/BeezUPCommonProductId.md)
 - [BeezUPCommonStoreId](docs/BeezUPCommonStoreId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonUserId](docs/BeezUPCommonUserId.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [BeezUPOrderId](docs/BeezUPOrderId.md)
 - [BeezUPOrderStatus](docs/BeezUPOrderStatus.md)
 - [BeezUPTimeZoneId](docs/BeezUPTimeZoneId.md)
 - [BillingPeriod](docs/BillingPeriod.md)
 - [BillingPeriodInMonth](docs/BillingPeriodInMonth.md)
 - [BillingPeriods](docs/BillingPeriods.md)
 - [BonusInfo](docs/BonusInfo.md)
 - [BonusType](docs/BonusType.md)
 - [BusinessOperationType](docs/BusinessOperationType.md)
 - [CanBeTruncated](docs/CanBeTruncated.md)
 - [CardNumber](docs/CardNumber.md)
 - [CardVerificationCode](docs/CardVerificationCode.md)
 - [CatalogColumn](docs/CatalogColumn.md)
 - [CatalogColumnName](docs/CatalogColumnName.md)
 - [CatalogColumns](docs/CatalogColumns.md)
 - [Categories](docs/Categories.md)
 - [Category](docs/Category.md)
 - [CategoryMappingStatus](docs/CategoryMappingStatus.md)
 - [ChangeCustomColumnExpressionRequest](docs/ChangeCustomColumnExpressionRequest.md)
 - [ChangeCustomColumnRequest](docs/ChangeCustomColumnRequest.md)
 - [ChangeOrderListRequest](docs/ChangeOrderListRequest.md)
 - [ChangeOrderListRequestItem](docs/ChangeOrderListRequestItem.md)
 - [ChangeOrderReporting](docs/ChangeOrderReporting.md)
 - [ChangeOrderRequest](docs/ChangeOrderRequest.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [ChangeUserColumnNameRequest](docs/ChangeUserColumnNameRequest.md)
 - [ChannelCatalog](docs/ChannelCatalog.md)
 - [ChannelCatalogCategoryMapping](docs/ChannelCatalogCategoryMapping.md)
 - [ChannelCatalogCategoryMappingInfo](docs/ChannelCatalogCategoryMappingInfo.md)
 - [ChannelCatalogCategoryMappings](docs/ChannelCatalogCategoryMappings.md)
 - [ChannelCatalogHeader](docs/ChannelCatalogHeader.md)
 - [ChannelCatalogHeaderLinks](docs/ChannelCatalogHeaderLinks.md)
 - [ChannelCatalogList](docs/ChannelCatalogList.md)
 - [ChannelCatalogMarketplaceProperties](docs/ChannelCatalogMarketplaceProperties.md)
 - [ChannelCatalogMarketplacePropertiesLinks](docs/ChannelCatalogMarketplacePropertiesLinks.md)
 - [ChannelCatalogMarketplaceProperty](docs/ChannelCatalogMarketplaceProperty.md)
 - [ChannelCatalogMarketplacePropertyGroup](docs/ChannelCatalogMarketplacePropertyGroup.md)
 - [ChannelCatalogMarketplaceSetting](docs/ChannelCatalogMarketplaceSetting.md)
 - [ChannelCatalogMarketplaceSettingArray](docs/ChannelCatalogMarketplaceSettingArray.md)
 - [ChannelCatalogMarketplaceSettings](docs/ChannelCatalogMarketplaceSettings.md)
 - [ChannelCatalogMarketplaceSettingsLinks](docs/ChannelCatalogMarketplaceSettingsLinks.md)
 - [ChannelCatalogProductInfo](docs/ChannelCatalogProductInfo.md)
 - [ChannelCatalogProductInfoLinks](docs/ChannelCatalogProductInfoLinks.md)
 - [ChannelCatalogProductInfoList](docs/ChannelCatalogProductInfoList.md)
 - [ChannelCatalogProductInfoListLinks](docs/ChannelCatalogProductInfoListLinks.md)
 - [ChannelCatalogStatus](docs/ChannelCatalogStatus.md)
 - [ChannelCategory](docs/ChannelCategory.md)
 - [ChannelCategoryChannelCode](docs/ChannelCategoryChannelCode.md)
 - [ChannelCategoryColumnOverride](docs/ChannelCategoryColumnOverride.md)
 - [ChannelCategoryColumnOverrides](docs/ChannelCategoryColumnOverrides.md)
 - [ChannelCategoryDefaultCost](docs/ChannelCategoryDefaultCost.md)
 - [ChannelCategoryLevel](docs/ChannelCategoryLevel.md)
 - [ChannelColumn](docs/ChannelColumn.md)
 - [ChannelColumnConfiguration](docs/ChannelColumnConfiguration.md)
 - [ChannelColumnDescription](docs/ChannelColumnDescription.md)
 - [ChannelColumnRestrictedValues](docs/ChannelColumnRestrictedValues.md)
 - [ChannelColumnShowInMapping](docs/ChannelColumnShowInMapping.md)
 - [ChannelFirstLevelCategory](docs/ChannelFirstLevelCategory.md)
 - [ChannelHeader](docs/ChannelHeader.md)
 - [ChannelInfo](docs/ChannelInfo.md)
 - [ChannelInfoDetails](docs/ChannelInfoDetails.md)
 - [ChannelInfoKeyNumbers](docs/ChannelInfoKeyNumbers.md)
 - [ChannelInfoSalesContact](docs/ChannelInfoSalesContact.md)
 - [ChannelInfoTechnicalContact](docs/ChannelInfoTechnicalContact.md)
 - [ChannelRootCategory](docs/ChannelRootCategory.md)
 - [City](docs/City.md)
 - [ClearMerchantOrderInfoListRequest](docs/ClearMerchantOrderInfoListRequest.md)
 - [ClickIncludedAndAdditionalClickPrice](docs/ClickIncludedAndAdditionalClickPrice.md)
 - [ClickIncludedAndVariablePrice](docs/ClickIncludedAndVariablePrice.md)
 - [ColumnConfiguration](docs/ColumnConfiguration.md)
 - [ColumnCultureName](docs/ColumnCultureName.md)
 - [ColumnCustomConfiguration](docs/ColumnCustomConfiguration.md)
 - [ColumnFormat](docs/ColumnFormat.md)
 - [ColumnId](docs/ColumnId.md)
 - [ColumnMapping](docs/ColumnMapping.md)
 - [ColumnMappingList](docs/ColumnMappingList.md)
 - [ColumnMappingStatus](docs/ColumnMappingStatus.md)
 - [ColumnMappingWithName](docs/ColumnMappingWithName.md)
 - [ColumnMappingWithNameList](docs/ColumnMappingWithNameList.md)
 - [Company](docs/Company.md)
 - [CompanyInfo](docs/CompanyInfo.md)
 - [CompareOptions](docs/CompareOptions.md)
 - [CompressionFormatStrategy](docs/CompressionFormatStrategy.md)
 - [ComputeExpressionRequest](docs/ComputeExpressionRequest.md)
 - [ConfigureAutoImportIntervalRequest](docs/ConfigureAutoImportIntervalRequest.md)
 - [ConfigureCatalogColumnCatalogRequest](docs/ConfigureCatalogColumnCatalogRequest.md)
 - [ContractBillingPeriodInfo](docs/ContractBillingPeriodInfo.md)
 - [ContractBonusInfo](docs/ContractBonusInfo.md)
 - [ContractClickInfo](docs/ContractClickInfo.md)
 - [ContractCommitmentInfo](docs/ContractCommitmentInfo.md)
 - [ContractDiscountInfo](docs/ContractDiscountInfo.md)
 - [ContractId](docs/ContractId.md)
 - [ContractInfo](docs/ContractInfo.md)
 - [ContractMoneyInfo](docs/ContractMoneyInfo.md)
 - [ContractStoreInfo](docs/ContractStoreInfo.md)
 - [ContractTerminationReason](docs/ContractTerminationReason.md)
 - [ContractTerminationReasonType](docs/ContractTerminationReasonType.md)
 - [Contracts](docs/Contracts.md)
 - [ContractsLinks](docs/ContractsLinks.md)
 - [CostSettings](docs/CostSettings.md)
 - [CostType](docs/CostType.md)
 - [CouponDiscountCode](docs/CouponDiscountCode.md)
 - [CouponOfferCode](docs/CouponOfferCode.md)
 - [CreateChannelCatalogRequest](docs/CreateChannelCatalogRequest.md)
 - [CreateContract](docs/CreateContract.md)
 - [CreateCustomColumnRequest](docs/CreateCustomColumnRequest.md)
 - [CreateRuleRequest](docs/CreateRuleRequest.md)
 - [CreateStoreRequest](docs/CreateStoreRequest.md)
 - [Credential](docs/Credential.md)
 - [CreditCardInfo](docs/CreditCardInfo.md)
 - [CreditCardInfoResponse](docs/CreditCardInfoResponse.md)
 - [CreditCardInfoResponseLinks](docs/CreditCardInfoResponseLinks.md)
 - [CreditCardInfoWithCardType](docs/CreditCardInfoWithCardType.md)
 - [CurrentContractInfo](docs/CurrentContractInfo.md)
 - [CurrentContractInfoLinks](docs/CurrentContractInfoLinks.md)
 - [CustomColumn](docs/CustomColumn.md)
 - [CustomColumns](docs/CustomColumns.md)
 - [DateSearchType](docs/DateSearchType.md)
 - [DetectedCatalogColumn](docs/DetectedCatalogColumn.md)
 - [DetectedCatalogColumns](docs/DetectedCatalogColumns.md)
 - [DisplayGroupName](docs/DisplayGroupName.md)
 - [DownloadCatalogStrategy](docs/DownloadCatalogStrategy.md)
 - [DuplicateProductValueConfiguration](docs/DuplicateProductValueConfiguration.md)
 - [DuplicateProductValueStrategy](docs/DuplicateProductValueStrategy.md)
 - [Email](docs/Email.md)
 - [EncryptedBlocklyExpression](docs/EncryptedBlocklyExpression.md)
 - [EncryptedExpression](docs/EncryptedExpression.md)
 - [Etag](docs/Etag.md)
 - [ExclusionFilter](docs/ExclusionFilter.md)
 - [ExclusionFilterName](docs/ExclusionFilterName.md)
 - [ExclusionFilterOperator](docs/ExclusionFilterOperator.md)
 - [ExclusionFilterOperatorDataType](docs/ExclusionFilterOperatorDataType.md)
 - [ExclusionFilterOperatorName](docs/ExclusionFilterOperatorName.md)
 - [ExclusionFilters](docs/ExclusionFilters.md)
 - [ExecutionId](docs/ExecutionId.md)
 - [ExecutionUUID](docs/ExecutionUUID.md)
 - [ExistingCatalogColumnConfiguration](docs/ExistingCatalogColumnConfiguration.md)
 - [ExpirationMonth](docs/ExpirationMonth.md)
 - [ExpirationYear](docs/ExpirationYear.md)
 - [ExportOrderListRequest](docs/ExportOrderListRequest.md)
 - [FeedType](docs/FeedType.md)
 - [FileFormatStrategy](docs/FileFormatStrategy.md)
 - [FirstName](docs/FirstName.md)
 - [FixedAndVariableClickModelInfo](docs/FixedAndVariableClickModelInfo.md)
 - [FriendCountryIsoCodeAlpha3](docs/FriendCountryIsoCodeAlpha3.md)
 - [FriendEmail](docs/FriendEmail.md)
 - [FriendProfilePictureUrl](docs/FriendProfilePictureUrl.md)
 - [Functionality](docs/Functionality.md)
 - [FunctionalityRightInfo](docs/FunctionalityRightInfo.md)
 - [GeneralSettings](docs/GeneralSettings.md)
 - [GetChannelCatalogProductInfoListRequest](docs/GetChannelCatalogProductInfoListRequest.md)
 - [GetProductsRequest](docs/GetProductsRequest.md)
 - [GlobalPerformanceIndicatorByChannel](docs/GlobalPerformanceIndicatorByChannel.md)
 - [HarvestOrderReporting](docs/HarvestOrderReporting.md)
 - [ImportationMonitoring](docs/ImportationMonitoring.md)
 - [ImportationReporting](docs/ImportationReporting.md)
 - [ImportationTechnicalProgression](docs/ImportationTechnicalProgression.md)
 - [InlineResponse409](docs/InlineResponse409.md)
 - [InputConfiguration](docs/InputConfiguration.md)
 - [InputFileConfiguration](docs/InputFileConfiguration.md)
 - [InputFileFetchConfiguration](docs/InputFileFetchConfiguration.md)
 - [InputFileReadConfiguration](docs/InputFileReadConfiguration.md)
 - [InputFileReadCsvConfiguration](docs/InputFileReadCsvConfiguration.md)
 - [InputFileReadXmlConfiguration](docs/InputFileReadXmlConfiguration.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceNumber](docs/InvoiceNumber.md)
 - [InvoicePaymentStatus](docs/InvoicePaymentStatus.md)
 - [Invoices](docs/Invoices.md)
 - [LastManualImportInputConfiguration](docs/LastManualImportInputConfiguration.md)
 - [LastName](docs/LastName.md)
 - [LinkClickToOrderType](docs/LinkClickToOrderType.md)
 - [LinksChangePasswordLink](docs/LinksChangePasswordLink.md)
 - [LinksCreateContractLink](docs/LinksCreateContractLink.md)
 - [LinksCreateStoreLink](docs/LinksCreateStoreLink.md)
 - [LinksDeleteNextContractLink](docs/LinksDeleteNextContractLink.md)
 - [LinksDeleteShareLink](docs/LinksDeleteShareLink.md)
 - [LinksDeleteStoreLink](docs/LinksDeleteStoreLink.md)
 - [LinksGetChannelCatalogMarketplacePropertiesLink](docs/LinksGetChannelCatalogMarketplacePropertiesLink.md)
 - [LinksGetChannelCatalogMarketplaceSettingsLink](docs/LinksGetChannelCatalogMarketplaceSettingsLink.md)
 - [LinksGetChannelCatalogProductInfo](docs/LinksGetChannelCatalogProductInfo.md)
 - [LinksGetContractsLink](docs/LinksGetContractsLink.md)
 - [LinksGetCreditCardInfoLink](docs/LinksGetCreditCardInfoLink.md)
 - [LinksGetMarketplaceAccountStoresLink](docs/LinksGetMarketplaceAccountStoresLink.md)
 - [LinksGetPublicationsLink](docs/LinksGetPublicationsLink.md)
 - [LinksGetSharesLink](docs/LinksGetSharesLink.md)
 - [LinksGetStoreLink](docs/LinksGetStoreLink.md)
 - [LinksGetStoresLink](docs/LinksGetStoresLink.md)
 - [LinksReactivateCurrentContractLink](docs/LinksReactivateCurrentContractLink.md)
 - [LinksSaveCompanyInfoLink](docs/LinksSaveCompanyInfoLink.md)
 - [LinksSaveCreditCardInfoLink](docs/LinksSaveCreditCardInfoLink.md)
 - [LinksSavePersonalInfoLink](docs/LinksSavePersonalInfoLink.md)
 - [LinksSaveProfilePictureInfoLink](docs/LinksSaveProfilePictureInfoLink.md)
 - [LinksSaveStoreAlertLink](docs/LinksSaveStoreAlertLink.md)
 - [LinksSetChannelCatalogMarketplaceSettingsLink](docs/LinksSetChannelCatalogMarketplaceSettingsLink.md)
 - [LinksShareLink](docs/LinksShareLink.md)
 - [LinksTerminateCurrentContractLink](docs/LinksTerminateCurrentContractLink.md)
 - [LinksUpdateStoreLink](docs/LinksUpdateStoreLink.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [MapBeezUPColumnRequest](docs/MapBeezUPColumnRequest.md)
 - [MapCategoryRequest](docs/MapCategoryRequest.md)
 - [MargingType](docs/MargingType.md)
 - [MarketplaceBusinessCode](docs/MarketplaceBusinessCode.md)
 - [MarketplaceChannelCatalog](docs/MarketplaceChannelCatalog.md)
 - [MarketplaceChannelCatalogLinks](docs/MarketplaceChannelCatalogLinks.md)
 - [MarketplaceChannelCatalogList](docs/MarketplaceChannelCatalogList.md)
 - [MarketplaceChannelCatalogListLinks](docs/MarketplaceChannelCatalogListLinks.md)
 - [MarketplaceChannelCatalogLovLinks](docs/MarketplaceChannelCatalogLovLinks.md)
 - [MarketplaceOrderId](docs/MarketplaceOrderId.md)
 - [MarketplaceOrderStatus](docs/MarketplaceOrderStatus.md)
 - [MarketplaceTechnicalCode](docs/MarketplaceTechnicalCode.md)
 - [NextContractInfo](docs/NextContractInfo.md)
 - [NextContractInfoLinks](docs/NextContractInfoLinks.md)
 - [Offer](docs/Offer.md)
 - [OfferContent](docs/OfferContent.md)
 - [OfferFunctionality](docs/OfferFunctionality.md)
 - [OfferId](docs/OfferId.md)
 - [OfferLinks](docs/OfferLinks.md)
 - [OfferRequest](docs/OfferRequest.md)
 - [OptimisationActionName](docs/OptimisationActionName.md)
 - [OptimiseRequest](docs/OptimiseRequest.md)
 - [Order](docs/Order.md)
 - [OrderBuyerName](docs/OrderBuyerName.md)
 - [OrderExportationReporting](docs/OrderExportationReporting.md)
 - [OrderExportationReportingProcessingStatus](docs/OrderExportationReportingProcessingStatus.md)
 - [OrderExportations](docs/OrderExportations.md)
 - [OrderHeader](docs/OrderHeader.md)
 - [OrderHistory](docs/OrderHistory.md)
 - [OrderIdentifier](docs/OrderIdentifier.md)
 - [OrderIdentifierWithETag](docs/OrderIdentifierWithETag.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderListFull](docs/OrderListFull.md)
 - [OrderListLight](docs/OrderListLight.md)
 - [OrderListRequest](docs/OrderListRequest.md)
 - [OrderMerchantECommerceSoftwareName](docs/OrderMerchantECommerceSoftwareName.md)
 - [OrderMerchantECommerceSoftwareVersion](docs/OrderMerchantECommerceSoftwareVersion.md)
 - [OrderMerchantOrderId](docs/OrderMerchantOrderId.md)
 - [OrderOperationResponse](docs/OrderOperationResponse.md)
 - [PageNumber](docs/PageNumber.md)
 - [PageSize](docs/PageSize.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PerformanceIndicatorFormula](docs/PerformanceIndicatorFormula.md)
 - [PerformanceIndicatorFormulaOperatorName](docs/PerformanceIndicatorFormulaOperatorName.md)
 - [PerformanceIndicatorFormulaParameterType](docs/PerformanceIndicatorFormulaParameterType.md)
 - [PerformanceIndicatorType](docs/PerformanceIndicatorType.md)
 - [PersonalInfo](docs/PersonalInfo.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PostalCode](docs/PostalCode.md)
 - [PreviousFixPeriodInvoiceProrataInfo](docs/PreviousFixPeriodInvoiceProrataInfo.md)
 - [Processing](docs/Processing.md)
 - [Product](docs/Product.md)
 - [ProductFilters](docs/ProductFilters.md)
 - [ProductOverrides](docs/ProductOverrides.md)
 - [ProductSample](docs/ProductSample.md)
 - [ProductStateFilter](docs/ProductStateFilter.md)
 - [ProductValues](docs/ProductValues.md)
 - [Products](docs/Products.md)
 - [ProfilePictureInfo](docs/ProfilePictureInfo.md)
 - [ProfilePictureUrl](docs/ProfilePictureUrl.md)
 - [PromotionalCodeValidity](docs/PromotionalCodeValidity.md)
 - [PublicationFeedReporting](docs/PublicationFeedReporting.md)
 - [PublicationReporting](docs/PublicationReporting.md)
 - [PublicationType](docs/PublicationType.md)
 - [RegisterRequest](docs/RegisterRequest.md)
 - [ReportAdvancedFilters](docs/ReportAdvancedFilters.md)
 - [ReportByCategory](docs/ReportByCategory.md)
 - [ReportByCategoryRequest](docs/ReportByCategoryRequest.md)
 - [ReportByCategoryResponse](docs/ReportByCategoryResponse.md)
 - [ReportByChannel](docs/ReportByChannel.md)
 - [ReportByChannelRequest](docs/ReportByChannelRequest.md)
 - [ReportByChannelResponse](docs/ReportByChannelResponse.md)
 - [ReportByDay](docs/ReportByDay.md)
 - [ReportByDayAllChannels](docs/ReportByDayAllChannels.md)
 - [ReportByDayByChannel](docs/ReportByDayByChannel.md)
 - [ReportByDayRequest](docs/ReportByDayRequest.md)
 - [ReportByDayResponse](docs/ReportByDayResponse.md)
 - [ReportByProduct](docs/ReportByProduct.md)
 - [ReportByProductRequest](docs/ReportByProductRequest.md)
 - [ReportByProductResponse](docs/ReportByProductResponse.md)
 - [ReportCategoryFilter](docs/ReportCategoryFilter.md)
 - [ReportFilter](docs/ReportFilter.md)
 - [ReportFilterCommonParameters](docs/ReportFilterCommonParameters.md)
 - [ReportFilterHeader](docs/ReportFilterHeader.md)
 - [ReportFilterParameters](docs/ReportFilterParameters.md)
 - [ReportFilters](docs/ReportFilters.md)
 - [ReportIndicatorFilter](docs/ReportIndicatorFilter.md)
 - [ReportIndicatorFilterOperatorName](docs/ReportIndicatorFilterOperatorName.md)
 - [ReportProductFilter](docs/ReportProductFilter.md)
 - [ReportProductFilterOperatorName](docs/ReportProductFilterOperatorName.md)
 - [ReportType](docs/ReportType.md)
 - [Rule](docs/Rule.md)
 - [RuleExecutionReporting](docs/RuleExecutionReporting.md)
 - [RuleExecutionReportingErrorType](docs/RuleExecutionReportingErrorType.md)
 - [RuleExecutionReportingExecutionSource](docs/RuleExecutionReportingExecutionSource.md)
 - [RuleExecutionReportingStatus](docs/RuleExecutionReportingStatus.md)
 - [RuleExecutionReportings](docs/RuleExecutionReportings.md)
 - [RuleLastExecutionStatus](docs/RuleLastExecutionStatus.md)
 - [Rules](docs/Rules.md)
 - [SaveAutomaticTransitionRequest](docs/SaveAutomaticTransitionRequest.md)
 - [SaveReportFilterRequest](docs/SaveReportFilterRequest.md)
 - [SaveStoreAlertRequest](docs/SaveStoreAlertRequest.md)
 - [ScheduleAutoImportRequest](docs/ScheduleAutoImportRequest.md)
 - [SchedulingType](docs/SchedulingType.md)
 - [SetChannelCatalogMarketplaceSettingsRequest](docs/SetChannelCatalogMarketplaceSettingsRequest.md)
 - [SetMerchantOrderInfoListRequest](docs/SetMerchantOrderInfoListRequest.md)
 - [SetMerchantOrderInfoListRequestItem](docs/SetMerchantOrderInfoListRequestItem.md)
 - [SetMerchantOrderInfoRequest](docs/SetMerchantOrderInfoRequest.md)
 - [SourceType](docs/SourceType.md)
 - [StandardOffer](docs/StandardOffer.md)
 - [StandardOffers](docs/StandardOffers.md)
 - [StartManualImportRequest](docs/StartManualImportRequest.md)
 - [Store](docs/Store.md)
 - [StoreAlert](docs/StoreAlert.md)
 - [StoreAlertLinks](docs/StoreAlertLinks.md)
 - [StoreAlertProperty](docs/StoreAlertProperty.md)
 - [StoreAlertPropertyInfo](docs/StoreAlertPropertyInfo.md)
 - [StoreAlerts](docs/StoreAlerts.md)
 - [StoreCount](docs/StoreCount.md)
 - [StoreCountryIsoCodeAlpha3](docs/StoreCountryIsoCodeAlpha3.md)
 - [StoreHeader](docs/StoreHeader.md)
 - [StoreHeaderLinks](docs/StoreHeaderLinks.md)
 - [StoreName](docs/StoreName.md)
 - [StoreSector](docs/StoreSector.md)
 - [StoreSectors](docs/StoreSectors.md)
 - [StoreShare](docs/StoreShare.md)
 - [StoreShareLinks](docs/StoreShareLinks.md)
 - [StoreShares](docs/StoreShares.md)
 - [StoreSharesLinks](docs/StoreSharesLinks.md)
 - [StoreStatus](docs/StoreStatus.md)
 - [StoreTrackingStatus](docs/StoreTrackingStatus.md)
 - [StoreUrl](docs/StoreUrl.md)
 - [StoreUserRole](docs/StoreUserRole.md)
 - [Stores](docs/Stores.md)
 - [StoresLinks](docs/StoresLinks.md)
 - [TerminateContract](docs/TerminateContract.md)
 - [TrackedClick](docs/TrackedClick.md)
 - [TrackedClicks](docs/TrackedClicks.md)
 - [TrackedExternalOrder](docs/TrackedExternalOrder.md)
 - [TrackedExternalOrderProduct](docs/TrackedExternalOrderProduct.md)
 - [TrackedExternalOrders](docs/TrackedExternalOrders.md)
 - [TrackedOrder](docs/TrackedOrder.md)
 - [TrackedOrderProduct](docs/TrackedOrderProduct.md)
 - [TrackedOrders](docs/TrackedOrders.md)
 - [TrackingStatus](docs/TrackingStatus.md)
 - [Type](docs/Type.md)
 - [UnmapCategoryRequest](docs/UnmapCategoryRequest.md)
 - [UpdateRuleRequest](docs/UpdateRuleRequest.md)
 - [UpdateStoreRequest](docs/UpdateStoreRequest.md)
 - [UpgradeOfferRequired](docs/UpgradeOfferRequired.md)
 - [UseGravatarProfilePicture](docs/UseGravatarProfilePicture.md)
 - [UserColumName](docs/UserColumName.md)
 - [UserFriendInfo](docs/UserFriendInfo.md)
 - [VariableModelInfo](docs/VariableModelInfo.md)
 - [VatNumber](docs/VatNumber.md)
 - [WhatIDo](docs/WhatIDo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Ocp-Apim-Subscription-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@beezup.com

