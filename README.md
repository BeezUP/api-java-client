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
import io.swagger.client.api.BeezUPApi;

import java.io.File;
import java.util.*;

public class BeezUPApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.comv2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BeezUPApi* | [**activateUserAccount**](docs/BeezUPApi.md#activateUserAccount) | **POST** /v2/user/customer/account/activate | Activate the user account
*BeezUPApi* | [**autoConfigureAutoImportInterval**](docs/BeezUPApi.md#autoConfigureAutoImportInterval) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
*BeezUPApi* | [**autoDeleteAutoImport**](docs/BeezUPApi.md#autoDeleteAutoImport) | **DELETE** /v2/user/catalogs/{storeId}/autoImport | Delete Auto Import
*BeezUPApi* | [**autoGetAutoImportConfiguration**](docs/BeezUPApi.md#autoGetAutoImportConfiguration) | **GET** /v2/user/catalogs/{storeId}/autoImport | Get the auto import configuration
*BeezUPApi* | [**autoPauseAutoImport**](docs/BeezUPApi.md#autoPauseAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/pause | Pause Auto Import
*BeezUPApi* | [**autoResumeAutoImport**](docs/BeezUPApi.md#autoResumeAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/resume | Resume Auto Import
*BeezUPApi* | [**autoScheduleAutoImport**](docs/BeezUPApi.md#autoScheduleAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
*BeezUPApi* | [**autoStartAutoImport**](docs/BeezUPApi.md#autoStartAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/start | Start Auto Import Manually
*BeezUPApi* | [**catalogChangeCatalogColumnUserName**](docs/BeezUPApi.md#catalogChangeCatalogColumnUserName) | **POST** /v2/user/catalogs/{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
*BeezUPApi* | [**catalogChangeCustomColumnExpression**](docs/BeezUPApi.md#catalogChangeCustomColumnExpression) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Change custom column expression
*BeezUPApi* | [**catalogChangeCustomColumnUserName**](docs/BeezUPApi.md#catalogChangeCustomColumnUserName) | **POST** /v2/user/catalogs/{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
*BeezUPApi* | [**catalogComputeExpression**](docs/BeezUPApi.md#catalogComputeExpression) | **POST** /v2/user/catalogs/{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
*BeezUPApi* | [**catalogDeleteCustomColumn**](docs/BeezUPApi.md#catalogDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Delete custom column
*BeezUPApi* | [**catalogGetBeezUPColumns**](docs/BeezUPApi.md#catalogGetBeezUPColumns) | **GET** /v2/user/catalogs/beezupColumns | Get the BeezUP columns
*BeezUPApi* | [**catalogGetCatalogColumns**](docs/BeezUPApi.md#catalogGetCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/catalogColumns | Get catalog column list
*BeezUPApi* | [**catalogGetCategories**](docs/BeezUPApi.md#catalogGetCategories) | **GET** /v2/user/catalogs/{storeId}/categories | Get category list
*BeezUPApi* | [**catalogGetCustomColumnExpression**](docs/BeezUPApi.md#catalogGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
*BeezUPApi* | [**catalogGetCustomColumns**](docs/BeezUPApi.md#catalogGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/customColumns | Get custom column list
*BeezUPApi* | [**catalogGetProduct**](docs/BeezUPApi.md#catalogGetProduct) | **GET** /v2/user/catalogs/{storeId}/products/{productId} | Get product
*BeezUPApi* | [**catalogGetProducts**](docs/BeezUPApi.md#catalogGetProducts) | **POST** /v2/user/catalogs/{storeId}/products | Get product list
*BeezUPApi* | [**catalogGetRandomProducts**](docs/BeezUPApi.md#catalogGetRandomProducts) | **GET** /v2/user/catalogs/{storeId}/products/random | Get random product list
*BeezUPApi* | [**catalogSaveCustomColumn**](docs/BeezUPApi.md#catalogSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Create or replace a custom column
*BeezUPApi* | [**changeOrder**](docs/BeezUPApi.md#changeOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change your marketplace Order Information (accept, ship, etc.)
*BeezUPApi* | [**changeOrderList**](docs/BeezUPApi.md#changeOrderList) | **POST** /v2/user/marketplaces/orders/batches/changeOrders/{changeOrderType} | Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
*BeezUPApi* | [**changePassword**](docs/BeezUPApi.md#changePassword) | **POST** /v2/user/customer/account/changePassword | Change user password
*BeezUPApi* | [**clearMerchantOrderInfo**](docs/BeezUPApi.md#clearMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear an Order&#39;s merchant information
*BeezUPApi* | [**clearMerchantOrderInfoList**](docs/BeezUPApi.md#clearMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/clearMerchantOrderInfos | Send a batch of operations to clear an Order&#39;s merchant information
*BeezUPApi* | [**configureAutomaticTransitions**](docs/BeezUPApi.md#configureAutomaticTransitions) | **POST** /v2/user/marketplaces/orders/automaticTransitions | Configure new or existing automatic Order status transition
*BeezUPApi* | [**configureChannelCatalogCostSettings**](docs/BeezUPApi.md#configureChannelCatalogCostSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/cost | Disable a channel catalog
*BeezUPApi* | [**configureChannelCatalogExclusionFilters**](docs/BeezUPApi.md#configureChannelCatalogExclusionFilters) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
*BeezUPApi* | [**configureChannelCatalogGeneralSettings**](docs/BeezUPApi.md#configureChannelCatalogGeneralSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/general | Disable a channel catalog
*BeezUPApi* | [**createChannelCatalog**](docs/BeezUPApi.md#createChannelCatalog) | **POST** /v2/user/channelCatalogs/ | Create a new channel catalog
*BeezUPApi* | [**createContract**](docs/BeezUPApi.md#createContract) | **POST** /v2/user/customer/contracts | Create a new contract
*BeezUPApi* | [**createRule**](docs/BeezUPApi.md#createRule) | **POST** /v2/user/analytics/{storeId}/rules | Rule creation
*BeezUPApi* | [**createStore**](docs/BeezUPApi.md#createStore) | **POST** /v2/user/customer/stores | Create a new store
*BeezUPApi* | [**deleteChannelCatalog**](docs/BeezUPApi.md#deleteChannelCatalog) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId} | Delete the channel catalog
*BeezUPApi* | [**deleteChannelCatalogProductValueOverride**](docs/BeezUPApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
*BeezUPApi* | [**deleteNextContract**](docs/BeezUPApi.md#deleteNextContract) | **DELETE** /v2/user/customer/contracts/next | Delete your next contract
*BeezUPApi* | [**deleteReportFilter**](docs/BeezUPApi.md#deleteReportFilter) | **DELETE** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Delete the report filter
*BeezUPApi* | [**deleteRule**](docs/BeezUPApi.md#deleteRule) | **DELETE** /v2/user/analytics/{storeId}/rules/{ruleId} | Delete Rule
*BeezUPApi* | [**deleteShare**](docs/BeezUPApi.md#deleteShare) | **DELETE** /v2/user/customer/stores/{storeId}/shares/{userId} | Delete a share to another user
*BeezUPApi* | [**deleteStore**](docs/BeezUPApi.md#deleteStore) | **DELETE** /v2/user/customer/stores/{storeId} | Delete a store
*BeezUPApi* | [**disableChannelCatalog**](docs/BeezUPApi.md#disableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/disable | Disable a channel catalog
*BeezUPApi* | [**disableChannelCatalogProduct**](docs/BeezUPApi.md#disableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/disable | Disable channel catalog product
*BeezUPApi* | [**disableRule**](docs/BeezUPApi.md#disableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/disable | Disable rule
*BeezUPApi* | [**enableChannelCatalog**](docs/BeezUPApi.md#enableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/enable | Enable a channel catalog
*BeezUPApi* | [**enableRule**](docs/BeezUPApi.md#enableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/enable | Enable rule
*BeezUPApi* | [**exportOrders**](docs/BeezUPApi.md#exportOrders) | **POST** /v2/user/marketplaces/orders/exportations | Request a new Order report exportation to be generated
*BeezUPApi* | [**exportStoreReportByCategory**](docs/BeezUPApi.md#exportStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory/export | Export the report by category
*BeezUPApi* | [**exportStoreReportByChannel**](docs/BeezUPApi.md#exportStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel/export | Export the report by channel
*BeezUPApi* | [**exportStoreReportByProduct**](docs/BeezUPApi.md#exportStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct/export | Export the report by product
*BeezUPApi* | [**getAutomaticTransitions**](docs/BeezUPApi.md#getAutomaticTransitions) | **GET** /v2/user/marketplaces/orders/automaticTransitions | Get list of configured automatic Order status transitions
*BeezUPApi* | [**getBillingPeriods**](docs/BeezUPApi.md#getBillingPeriods) | **GET** /v2/user/customer/billingPeriods | Get billing periods conditions
*BeezUPApi* | [**getChannelCatalog**](docs/BeezUPApi.md#getChannelCatalog) | **GET** /v2/user/channelCatalogs/{channelCatalogId} | Get the channel catalog information
*BeezUPApi* | [**getChannelCatalogCategories**](docs/BeezUPApi.md#getChannelCatalogCategories) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings | Get channel catalog categories
*BeezUPApi* | [**getChannelCatalogExclusionFilterOperators**](docs/BeezUPApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /v2/user/channelCatalogs/exclusionFilterOperators | Get channel catalog exclusion filter operators
*BeezUPApi* | [**getChannelCatalogMarketplaceProperties**](docs/BeezUPApi.md#getChannelCatalogMarketplaceProperties) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/properties | Get the marketplace properties for a channel catalog
*BeezUPApi* | [**getChannelCatalogMarketplaceSettings**](docs/BeezUPApi.md#getChannelCatalogMarketplaceSettings) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Get the marketplace settings for a channel catalog
*BeezUPApi* | [**getChannelCatalogProductInfo**](docs/BeezUPApi.md#getChannelCatalogProductInfo) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId} | Get channel catalog product information
*BeezUPApi* | [**getChannelCatalogProductInfoList**](docs/BeezUPApi.md#getChannelCatalogProductInfoList) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products | Get channel catalog product information list
*BeezUPApi* | [**getChannelCatalogs**](docs/BeezUPApi.md#getChannelCatalogs) | **GET** /v2/user/channelCatalogs/ | List all your current channel catalogs
*BeezUPApi* | [**getChannelCategories**](docs/BeezUPApi.md#getChannelCategories) | **GET** /v2/user/channels/{channelId}/categories | Get channel categories
*BeezUPApi* | [**getChannelColumns**](docs/BeezUPApi.md#getChannelColumns) | **POST** /v2/user/channels/{channelId}/columns | Get channel columns
*BeezUPApi* | [**getChannelInfo**](docs/BeezUPApi.md#getChannelInfo) | **GET** /v2/user/channels/{channelId} | Get channel information
*BeezUPApi* | [**getContracts**](docs/BeezUPApi.md#getContracts) | **GET** /v2/user/customer/contracts | Get contract list
*BeezUPApi* | [**getCreditCardInfo**](docs/BeezUPApi.md#getCreditCardInfo) | **GET** /v2/user/customer/account/creditCardInfo | Get credit card information
*BeezUPApi* | [**getCurrentChannels**](docs/BeezUPApi.md#getCurrentChannels) | **GET** /v2/user/channels/ | List all available channel for this store
*BeezUPApi* | [**getFriendInfo**](docs/BeezUPApi.md#getFriendInfo) | **GET** /v2/user/customer/friends/{userId} | Get friend information
*BeezUPApi* | [**getInvoices**](docs/BeezUPApi.md#getInvoices) | **GET** /v2/user/customer/invoices | Get all your invoices
*BeezUPApi* | [**getMarketplaceAccountStores**](docs/BeezUPApi.md#getMarketplaceAccountStores) | **GET** /v2/user/marketplaces/channelcatalogs/ | Get  you marketplace channel catalog list
*BeezUPApi* | [**getMarketplaceAccountsSynchronization**](docs/BeezUPApi.md#getMarketplaceAccountsSynchronization) | **GET** /v2/user/marketplaces/orders/status | Get current synchronization status between your marketplaces and BeezUP accounts
*BeezUPApi* | [**getOffer**](docs/BeezUPApi.md#getOffer) | **POST** /v2/user/customer/offers | Get offer pricing
*BeezUPApi* | [**getOrder**](docs/BeezUPApi.md#getOrder) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get full Order and Order Item(s) properties
*BeezUPApi* | [**getOrderExportations**](docs/BeezUPApi.md#getOrderExportations) | **GET** /v2/user/marketplaces/orders/exportations | Get a paginated list of Order report exportations
*BeezUPApi* | [**getOrderHistory**](docs/BeezUPApi.md#getOrderHistory) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get an Order&#39;s harvest and change history
*BeezUPApi* | [**getOrderListFull**](docs/BeezUPApi.md#getOrderListFull) | **POST** /v2/user/marketplaces/orders/list/full | Get a paginated list of all Orders with all Order and Order Item(s) properties
*BeezUPApi* | [**getOrderListLight**](docs/BeezUPApi.md#getOrderListLight) | **POST** /v2/user/marketplaces/orders/list/light | Get a paginated list of all Orders without details
*BeezUPApi* | [**getPublications**](docs/BeezUPApi.md#getPublications) | **GET** /v2/user/marketplaces/channelcatalogs/publications/{marketplaceTechnicalCode}/{accountId}/history | Fetch the publication history for an account, sorted by descending start date
*BeezUPApi* | [**getReportFilter**](docs/BeezUPApi.md#getReportFilter) | **GET** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Get the report filter description
*BeezUPApi* | [**getReportFilters**](docs/BeezUPApi.md#getReportFilters) | **GET** /v2/user/analytics/{storeId}/reports/filters | Get report filter list for the given store
*BeezUPApi* | [**getRights**](docs/BeezUPApi.md#getRights) | **POST** /v2/user/customer/stores/{storeId}/rights | Get store&#39;s rights
*BeezUPApi* | [**getRule**](docs/BeezUPApi.md#getRule) | **GET** /v2/user/analytics/{storeId}/rules/{ruleId} | Gets the rule
*BeezUPApi* | [**getRules**](docs/BeezUPApi.md#getRules) | **GET** /v2/user/analytics/{storeId}/rules | Gets the list of rules for a given store
*BeezUPApi* | [**getRulesExecutions**](docs/BeezUPApi.md#getRulesExecutions) | **GET** /v2/user/analytics/{storeId}/rules/executions | Get the rules execution history
*BeezUPApi* | [**getShares**](docs/BeezUPApi.md#getShares) | **GET** /v2/user/customer/stores/{storeId}/shares | Get shares related to this store
*BeezUPApi* | [**getStandardOffers**](docs/BeezUPApi.md#getStandardOffers) | **GET** /v2/user/customer/offers | Get all standard offers
*BeezUPApi* | [**getStore**](docs/BeezUPApi.md#getStore) | **GET** /v2/user/customer/stores/{storeId} | Get store&#39;s information
*BeezUPApi* | [**getStoreAlerts**](docs/BeezUPApi.md#getStoreAlerts) | **GET** /v2/user/customer/stores/{storeId}/alerts | Get store&#39;s alerts
*BeezUPApi* | [**getStoreReportByCategory**](docs/BeezUPApi.md#getStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory | Get the report by category
*BeezUPApi* | [**getStoreReportByChannel**](docs/BeezUPApi.md#getStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel | Get the report by channel
*BeezUPApi* | [**getStoreReportByDay**](docs/BeezUPApi.md#getStoreReportByDay) | **POST** /v2/user/analytics/{storeId}/reports/byday | Get the report by day
*BeezUPApi* | [**getStoreReportByDayExport**](docs/BeezUPApi.md#getStoreReportByDayExport) | **POST** /v2/user/analytics/{storeId}/reports/byday/export | Get the report by day
*BeezUPApi* | [**getStoreReportByProduct**](docs/BeezUPApi.md#getStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct | Get the report by product
*BeezUPApi* | [**getStoreTrackedClicks**](docs/BeezUPApi.md#getStoreTrackedClicks) | **GET** /v2/user/analytics/{storeId}/tracking/clicks | Get the latest clicks tracked
*BeezUPApi* | [**getStoreTrackedExternalOrders**](docs/BeezUPApi.md#getStoreTrackedExternalOrders) | **GET** /v2/user/analytics/{storeId}/tracking/externalorders | Get the latest external orders tracked
*BeezUPApi* | [**getStoreTrackedOrders**](docs/BeezUPApi.md#getStoreTrackedOrders) | **GET** /v2/user/analytics/{storeId}/tracking/orders | Get the latest orders tracked
*BeezUPApi* | [**getStoreTrackingStatus**](docs/BeezUPApi.md#getStoreTrackingStatus) | **GET** /v2/user/analytics/{storeId}/tracking/status | Get store tracking synchronization status
*BeezUPApi* | [**getStores**](docs/BeezUPApi.md#getStores) | **GET** /v2/user/customer/stores | Get store list
*BeezUPApi* | [**getTrackingStatus**](docs/BeezUPApi.md#getTrackingStatus) | **GET** /v2/user/analytics/tracking/status | Display the synchronization status of the clicks and orders
*BeezUPApi* | [**getUserAccountInfo**](docs/BeezUPApi.md#getUserAccountInfo) | **GET** /v2/user/customer/account | Get user account information
*BeezUPApi* | [**getUserListGroup**](docs/BeezUPApi.md#getUserListGroup) | **GET** /v2/user/lov/groups/{listGroupName} | Get list of values related to this group name
*BeezUPApi* | [**getUserListGroupNames**](docs/BeezUPApi.md#getUserListGroupNames) | **GET** /v2/user/lov/groups | Get list of group of list name
*BeezUPApi* | [**getUserListNames**](docs/BeezUPApi.md#getUserListNames) | **GET** /v2/user/lov/ | Get all list names
*BeezUPApi* | [**getUserListOfValues**](docs/BeezUPApi.md#getUserListOfValues) | **GET** /v2/user/lov/{listName} | Get the list of values related to this list name
*BeezUPApi* | [**harvestAll**](docs/BeezUPApi.md#harvestAll) | **POST** /v2/user/marketplaces/orders/harvest | Send harvest request to all your marketplaces
*BeezUPApi* | [**harvestOrder**](docs/BeezUPApi.md#harvestOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Send harvest request for a single Order
*BeezUPApi* | [**importationActivateAutoImport**](docs/BeezUPApi.md#importationActivateAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.
*BeezUPApi* | [**importationCancel**](docs/BeezUPApi.md#importationCancel) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId} | Cancel importation
*BeezUPApi* | [**importationCommit**](docs/BeezUPApi.md#importationCommit) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commit | Commit Importation
*BeezUPApi* | [**importationCommitColumns**](docs/BeezUPApi.md#importationCommitColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commitColumns | Commit columns
*BeezUPApi* | [**importationConfigureCatalogColumn**](docs/BeezUPApi.md#importationConfigureCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId} | Configure catalog column
*BeezUPApi* | [**importationConfigureRemainingCatalogColumns**](docs/BeezUPApi.md#importationConfigureRemainingCatalogColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
*BeezUPApi* | [**importationDeleteCustomColumn**](docs/BeezUPApi.md#importationDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Delete Custom Column
*BeezUPApi* | [**importationGetCustomColumnExpression**](docs/BeezUPApi.md#importationGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/expression | Get the encrypted custom column expression in this importation
*BeezUPApi* | [**importationGetCustomColumns**](docs/BeezUPApi.md#importationGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns | Get custom columns currently place in this importation
*BeezUPApi* | [**importationGetDetectedCatalogColumns**](docs/BeezUPApi.md#importationGetDetectedCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns | Get detected catalog columns during this importation.
*BeezUPApi* | [**importationGetImportationMonitoring**](docs/BeezUPApi.md#importationGetImportationMonitoring) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId} | Get the importation status
*BeezUPApi* | [**importationGetManualUpdateLastInputConfig**](docs/BeezUPApi.md#importationGetManualUpdateLastInputConfig) | **GET** /v2/user/catalogs/{storeId}/inputConfiguration | Get the last input configuration
*BeezUPApi* | [**importationGetProductSample**](docs/BeezUPApi.md#importationGetProductSample) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex} | Get the product sample related to this importation with all columns (catalog and custom)
*BeezUPApi* | [**importationGetProductSampleCustomColumnValue**](docs/BeezUPApi.md#importationGetProductSampleCustomColumnValue) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex}/customColumns/{columnId} | Get product sample custom column value related to this importation.
*BeezUPApi* | [**importationGetReportings**](docs/BeezUPApi.md#importationGetReportings) | **GET** /v2/user/catalogs/{storeId}/importations | Get the latest catalog importation reporting
*BeezUPApi* | [**importationIgnoreColumn**](docs/BeezUPApi.md#importationIgnoreColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/ignore | Ignore Column
*BeezUPApi* | [**importationMapCatalogColumn**](docs/BeezUPApi.md#importationMapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/map | Map catalog column to a BeezUP column
*BeezUPApi* | [**importationMapCustomColumn**](docs/BeezUPApi.md#importationMapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/map | Map custom column to a BeezUP column
*BeezUPApi* | [**importationReattendColumn**](docs/BeezUPApi.md#importationReattendColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/reattend | Reattend Column
*BeezUPApi* | [**importationSaveCustomColumn**](docs/BeezUPApi.md#importationSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Create or replace a custom column
*BeezUPApi* | [**importationStartManualUpdate**](docs/BeezUPApi.md#importationStartManualUpdate) | **POST** /v2/user/catalogs/{storeId}/importations | Start Manual Import
*BeezUPApi* | [**importationTechnicalProgression**](docs/BeezUPApi.md#importationTechnicalProgression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/technicalProgression | Get technical progression
*BeezUPApi* | [**importationUnmapCatalogColumn**](docs/BeezUPApi.md#importationUnmapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/unmap | Unmap catalog column
*BeezUPApi* | [**importationUnmapCustomColumn**](docs/BeezUPApi.md#importationUnmapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/unmap | Unmap custom column
*BeezUPApi* | [**logout**](docs/BeezUPApi.md#logout) | **POST** /v2/user/customer/security/logout | Log out the current user from go2
*BeezUPApi* | [**mapChannelCatalogCategory**](docs/BeezUPApi.md#mapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map | Map channel catalog category
*BeezUPApi* | [**mapChannelCatalogColumns**](docs/BeezUPApi.md#mapChannelCatalogColumns) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/columnMappings | Configure channel catalog column mappings
*BeezUPApi* | [**moveDownRule**](docs/BeezUPApi.md#moveDownRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/movedown | Move the rule down
*BeezUPApi* | [**moveUpRule**](docs/BeezUPApi.md#moveUpRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/moveup | Move the rule up
*BeezUPApi* | [**optimise**](docs/BeezUPApi.md#optimise) | **POST** /v2/user/analytics/{storeId}/optimisations/{actionName} | Optimise products
*BeezUPApi* | [**optimiseByCategory**](docs/BeezUPApi.md#optimiseByCategory) | **POST** /v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
*BeezUPApi* | [**optimiseByChannel**](docs/BeezUPApi.md#optimiseByChannel) | **POST** /v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
*BeezUPApi* | [**optimiseByProduct**](docs/BeezUPApi.md#optimiseByProduct) | **POST** /v2/user/analytics/{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products
*BeezUPApi* | [**overrideChannelCatalogProductOverrides**](docs/BeezUPApi.md#overrideChannelCatalogProductOverrides) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values
*BeezUPApi* | [**reactivateCurrentContract**](docs/BeezUPApi.md#reactivateCurrentContract) | **POST** /v2/user/customer/contracts/current/reenableAutoRenewal | Reactivate your terminated contract.
*BeezUPApi* | [**reenableChannelCatalogProduct**](docs/BeezUPApi.md#reenableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/reenable | Reenable channel catalog product
*BeezUPApi* | [**resendEmailActivation**](docs/BeezUPApi.md#resendEmailActivation) | **POST** /v2/user/customer/account/resendEmailActivation | Resend email activation
*BeezUPApi* | [**runRule**](docs/BeezUPApi.md#runRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/run | Run rule
*BeezUPApi* | [**runRules**](docs/BeezUPApi.md#runRules) | **POST** /v2/user/analytics/{storeId}/rules/run | Run all rules for this store
*BeezUPApi* | [**saveCompanyInfo**](docs/BeezUPApi.md#saveCompanyInfo) | **PUT** /v2/user/customer/account/companyInfo | Change company information
*BeezUPApi* | [**saveCreditCardInfo**](docs/BeezUPApi.md#saveCreditCardInfo) | **PUT** /v2/user/customer/account/creditCardInfo | Save user credit card info
*BeezUPApi* | [**savePersonalInfo**](docs/BeezUPApi.md#savePersonalInfo) | **PUT** /v2/user/customer/account/personalInfo | Save user personal information
*BeezUPApi* | [**saveProfilePictureInfo**](docs/BeezUPApi.md#saveProfilePictureInfo) | **PUT** /v2/user/customer/account/profilePictureInfo | Change user picture information
*BeezUPApi* | [**saveReportFilter**](docs/BeezUPApi.md#saveReportFilter) | **PUT** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Save the report filter
*BeezUPApi* | [**saveStoreAlert**](docs/BeezUPApi.md#saveStoreAlert) | **PUT** /v2/user/customer/stores/{storeId}/alerts/{alertId} | Save store alert
*BeezUPApi* | [**setChannelCatalogMarketplaceSettings**](docs/BeezUPApi.md#setChannelCatalogMarketplaceSettings) | **POST** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Save new marketplace settings for a channel catalog
*BeezUPApi* | [**setMerchantOrderInfo**](docs/BeezUPApi.md#setMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Set an Order&#39;s merchant information
*BeezUPApi* | [**setMerchantOrderInfoList**](docs/BeezUPApi.md#setMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/setMerchantOrderInfos | Send a batch of operations to set an Order&#39;s merchant information
*BeezUPApi* | [**share**](docs/BeezUPApi.md#share) | **POST** /v2/user/customer/stores/{storeId}/shares | Share a store to another user
*BeezUPApi* | [**terminateCurrentContract**](docs/BeezUPApi.md#terminateCurrentContract) | **POST** /v2/user/customer/contracts/current/disableAutoRenewal | Schedule termination of your current contract at the end of the commitment.
*BeezUPApi* | [**unmapChannelCatalogCategory**](docs/BeezUPApi.md#unmapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category
*BeezUPApi* | [**updateRule**](docs/BeezUPApi.md#updateRule) | **PATCH** /v2/user/analytics/{storeId}/rules/{ruleId} | Update Rule
*BeezUPApi* | [**updateStore**](docs/BeezUPApi.md#updateStore) | **PATCH** /v2/user/customer/stores/{storeId} | Update some store&#39;s information.
*GroupsApi* | [**getPublicListGroup**](docs/GroupsApi.md#getPublicListGroup) | **GET** /v2/public/lov/groups/{listGroupName} | Get list of values related to this group name
*GroupsApi* | [**getPublicListGroupNames**](docs/GroupsApi.md#getPublicListGroupNames) | **GET** /v2/public/lov/groups | Get list of group of list name
*LOVApi* | [**getPublicListNames**](docs/LOVApi.md#getPublicListNames) | **GET** /v2/public/lov/ | Get all list names
*LOVApi* | [**getPublicListOfValues**](docs/LOVApi.md#getPublicListOfValues) | **GET** /v2/public/lov/{listName} | Get the list of values related to this list name
*SecurityApi* | [**login**](docs/SecurityApi.md#login) | **POST** /v2/public/security/login | Login
*SecurityApi* | [**lostPassword**](docs/SecurityApi.md#lostPassword) | **POST** /v2/public/security/lostpassword | Lost password
*SecurityApi* | [**register**](docs/SecurityApi.md#register) | **POST** /v2/public/security/register | User Registration


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
 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
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
 - [BeezUPCommonPaginationResultLinks](docs/BeezUPCommonPaginationResultLinks.md)
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
 - [PaginationRequestParameters](docs/PaginationRequestParameters.md)
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
 - [ProductOverrideWithCatalogValue](docs/ProductOverrideWithCatalogValue.md)
 - [ProductOverrides](docs/ProductOverrides.md)
 - [ProductOverridesWithCatalogValues](docs/ProductOverridesWithCatalogValues.md)
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

