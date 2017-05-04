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
import io.swagger.client.api.GroupsApi;

import java.io.File;
import java.util.*;

public class GroupsApiExample {

    public static void main(String[] args) {
        
        GroupsApi apiInstance = new GroupsApi();
        String listGroupName = "listGroupName_example"; // String | The list group name your want to get
        try {
            List<BeezUPCommonLOVLink2> result = apiInstance.getPublicListGroup(listGroupName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getPublicListGroup");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.comv2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GroupsApi* | [**getPublicListGroup**](docs/GroupsApi.md#getPublicListGroup) | **GET** /v2/public/lov/groups/{listGroupName} | Get list of values related to this group name
*GroupsApi* | [**getPublicListGroupNames**](docs/GroupsApi.md#getPublicListGroupNames) | **GET** /v2/public/lov/groups | Get list of group of list name
*LOVApi* | [**getPublicListNames**](docs/LOVApi.md#getPublicListNames) | **GET** /v2/public/lov/ | Get all list names
*LOVApi* | [**getPublicListOfValues**](docs/LOVApi.md#getPublicListOfValues) | **GET** /v2/public/lov/{listName} | Get the list of values related to this list name
*SecurityApi* | [**login**](docs/SecurityApi.md#login) | **POST** /v2/public/security/login | Login
*SecurityApi* | [**lostPassword**](docs/SecurityApi.md#lostPassword) | **POST** /v2/public/security/lostpassword | Lost password
*SecurityApi* | [**register**](docs/SecurityApi.md#register) | **POST** /v2/public/security/register | User Registration
*UserLOVApi* | [**getUserListGroup**](docs/UserLOVApi.md#getUserListGroup) | **GET** /v2/user/lov/groups/{listGroupName} | Get list of values related to this group name
*UserLOVApi* | [**getUserListGroupNames**](docs/UserLOVApi.md#getUserListGroupNames) | **GET** /v2/user/lov/groups | Get list of group of list name
*UserLOVApi* | [**getUserListNames**](docs/UserLOVApi.md#getUserListNames) | **GET** /v2/user/lov/ | Get all list names
*UserLOVApi* | [**getUserListOfValues**](docs/UserLOVApi.md#getUserListOfValues) | **GET** /v2/user/lov/{listName} | Get the list of values related to this list name
*V2UserAnalyticsApi* | [**createRule**](docs/V2UserAnalyticsApi.md#createRule) | **POST** /v2/user/analytics/{storeId}/rules | Rule creation
*V2UserAnalyticsApi* | [**deleteReportFilter**](docs/V2UserAnalyticsApi.md#deleteReportFilter) | **DELETE** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Delete the report filter
*V2UserAnalyticsApi* | [**deleteRule**](docs/V2UserAnalyticsApi.md#deleteRule) | **DELETE** /v2/user/analytics/{storeId}/rules/{ruleId} | Delete Rule
*V2UserAnalyticsApi* | [**disableRule**](docs/V2UserAnalyticsApi.md#disableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/disable | Disable rule
*V2UserAnalyticsApi* | [**enableRule**](docs/V2UserAnalyticsApi.md#enableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/enable | Enable rule
*V2UserAnalyticsApi* | [**exportStoreReportByCategory**](docs/V2UserAnalyticsApi.md#exportStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory/export | Export the report by category
*V2UserAnalyticsApi* | [**exportStoreReportByChannel**](docs/V2UserAnalyticsApi.md#exportStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel/export | Export the report by channel
*V2UserAnalyticsApi* | [**exportStoreReportByProduct**](docs/V2UserAnalyticsApi.md#exportStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct/export | Export the report by product
*V2UserAnalyticsApi* | [**getReportFilter**](docs/V2UserAnalyticsApi.md#getReportFilter) | **GET** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Get the report filter description
*V2UserAnalyticsApi* | [**getReportFilters**](docs/V2UserAnalyticsApi.md#getReportFilters) | **GET** /v2/user/analytics/{storeId}/reports/filters | Get report filter list for the given store
*V2UserAnalyticsApi* | [**getRule**](docs/V2UserAnalyticsApi.md#getRule) | **GET** /v2/user/analytics/{storeId}/rules/{ruleId} | Gets the rule
*V2UserAnalyticsApi* | [**getRules**](docs/V2UserAnalyticsApi.md#getRules) | **GET** /v2/user/analytics/{storeId}/rules | Gets the list of rules for a given store
*V2UserAnalyticsApi* | [**getRulesExecutions**](docs/V2UserAnalyticsApi.md#getRulesExecutions) | **GET** /v2/user/analytics/{storeId}/rules/executions | Get the rules execution history
*V2UserAnalyticsApi* | [**getStoreReportByCategory**](docs/V2UserAnalyticsApi.md#getStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory | Get the report by category
*V2UserAnalyticsApi* | [**getStoreReportByChannel**](docs/V2UserAnalyticsApi.md#getStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel | Get the report by channel
*V2UserAnalyticsApi* | [**getStoreReportByDay**](docs/V2UserAnalyticsApi.md#getStoreReportByDay) | **POST** /v2/user/analytics/{storeId}/reports/byday | Get the report by day
*V2UserAnalyticsApi* | [**getStoreReportByDayExport**](docs/V2UserAnalyticsApi.md#getStoreReportByDayExport) | **POST** /v2/user/analytics/{storeId}/reports/byday/export | Get the report by day
*V2UserAnalyticsApi* | [**getStoreReportByProduct**](docs/V2UserAnalyticsApi.md#getStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct | Get the report by product
*V2UserAnalyticsApi* | [**getStoreTrackedClicks**](docs/V2UserAnalyticsApi.md#getStoreTrackedClicks) | **GET** /v2/user/analytics/{storeId}/tracking/clicks | Get the latest clicks tracked
*V2UserAnalyticsApi* | [**getStoreTrackedExternalOrders**](docs/V2UserAnalyticsApi.md#getStoreTrackedExternalOrders) | **GET** /v2/user/analytics/{storeId}/tracking/externalorders | Get the latest external orders tracked
*V2UserAnalyticsApi* | [**getStoreTrackedOrders**](docs/V2UserAnalyticsApi.md#getStoreTrackedOrders) | **GET** /v2/user/analytics/{storeId}/tracking/orders | Get the latest orders tracked
*V2UserAnalyticsApi* | [**getStoreTrackingStatus**](docs/V2UserAnalyticsApi.md#getStoreTrackingStatus) | **GET** /v2/user/analytics/{storeId}/tracking/status | Get store tracking synchronization status
*V2UserAnalyticsApi* | [**getTrackingStatus**](docs/V2UserAnalyticsApi.md#getTrackingStatus) | **GET** /v2/user/analytics/tracking/status | Display the synchronization status of the clicks and orders
*V2UserAnalyticsApi* | [**moveDownRule**](docs/V2UserAnalyticsApi.md#moveDownRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/movedown | Move the rule down
*V2UserAnalyticsApi* | [**moveUpRule**](docs/V2UserAnalyticsApi.md#moveUpRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/moveup | Move the rule up
*V2UserAnalyticsApi* | [**optimise**](docs/V2UserAnalyticsApi.md#optimise) | **POST** /v2/user/analytics/{storeId}/optimisations/{actionName} | Optimise products
*V2UserAnalyticsApi* | [**optimiseByCategory**](docs/V2UserAnalyticsApi.md#optimiseByCategory) | **POST** /v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
*V2UserAnalyticsApi* | [**optimiseByChannel**](docs/V2UserAnalyticsApi.md#optimiseByChannel) | **POST** /v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
*V2UserAnalyticsApi* | [**optimiseByProduct**](docs/V2UserAnalyticsApi.md#optimiseByProduct) | **POST** /v2/user/analytics/{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products
*V2UserAnalyticsApi* | [**runRule**](docs/V2UserAnalyticsApi.md#runRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/run | Run rule
*V2UserAnalyticsApi* | [**runRules**](docs/V2UserAnalyticsApi.md#runRules) | **POST** /v2/user/analytics/{storeId}/rules/run | Run all rules for this store
*V2UserAnalyticsApi* | [**saveReportFilter**](docs/V2UserAnalyticsApi.md#saveReportFilter) | **PUT** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Save the report filter
*V2UserAnalyticsApi* | [**updateRule**](docs/V2UserAnalyticsApi.md#updateRule) | **PATCH** /v2/user/analytics/{storeId}/rules/{ruleId} | Update Rule
*V2UserCatalogsApi* | [**autoConfigureAutoImportInterval**](docs/V2UserCatalogsApi.md#autoConfigureAutoImportInterval) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
*V2UserCatalogsApi* | [**autoDeleteAutoImport**](docs/V2UserCatalogsApi.md#autoDeleteAutoImport) | **DELETE** /v2/user/catalogs/{storeId}/autoImport | Delete Auto Import
*V2UserCatalogsApi* | [**autoGetAutoImportConfiguration**](docs/V2UserCatalogsApi.md#autoGetAutoImportConfiguration) | **GET** /v2/user/catalogs/{storeId}/autoImport | Get the auto import configuration
*V2UserCatalogsApi* | [**autoPauseAutoImport**](docs/V2UserCatalogsApi.md#autoPauseAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/pause | Pause Auto Import
*V2UserCatalogsApi* | [**autoResumeAutoImport**](docs/V2UserCatalogsApi.md#autoResumeAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/resume | Resume Auto Import
*V2UserCatalogsApi* | [**autoScheduleAutoImport**](docs/V2UserCatalogsApi.md#autoScheduleAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
*V2UserCatalogsApi* | [**autoStartAutoImport**](docs/V2UserCatalogsApi.md#autoStartAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/start | Start Auto Import Manually
*V2UserCatalogsApi* | [**catalogChangeCatalogColumnUserName**](docs/V2UserCatalogsApi.md#catalogChangeCatalogColumnUserName) | **POST** /v2/user/catalogs/{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
*V2UserCatalogsApi* | [**catalogChangeCustomColumnExpression**](docs/V2UserCatalogsApi.md#catalogChangeCustomColumnExpression) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Change custom column expression
*V2UserCatalogsApi* | [**catalogChangeCustomColumnUserName**](docs/V2UserCatalogsApi.md#catalogChangeCustomColumnUserName) | **POST** /v2/user/catalogs/{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
*V2UserCatalogsApi* | [**catalogComputeExpression**](docs/V2UserCatalogsApi.md#catalogComputeExpression) | **POST** /v2/user/catalogs/{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
*V2UserCatalogsApi* | [**catalogDeleteCustomColumn**](docs/V2UserCatalogsApi.md#catalogDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Delete custom column
*V2UserCatalogsApi* | [**catalogGetBeezUPColumns**](docs/V2UserCatalogsApi.md#catalogGetBeezUPColumns) | **GET** /v2/user/catalogs/beezupColumns | Get the BeezUP columns
*V2UserCatalogsApi* | [**catalogGetCatalogColumns**](docs/V2UserCatalogsApi.md#catalogGetCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/catalogColumns | Get catalog column list
*V2UserCatalogsApi* | [**catalogGetCategories**](docs/V2UserCatalogsApi.md#catalogGetCategories) | **GET** /v2/user/catalogs/{storeId}/categories | Get category list
*V2UserCatalogsApi* | [**catalogGetCustomColumnExpression**](docs/V2UserCatalogsApi.md#catalogGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
*V2UserCatalogsApi* | [**catalogGetCustomColumns**](docs/V2UserCatalogsApi.md#catalogGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/customColumns | Get custom column list
*V2UserCatalogsApi* | [**catalogGetProduct**](docs/V2UserCatalogsApi.md#catalogGetProduct) | **GET** /v2/user/catalogs/{storeId}/products/{productId} | Get product
*V2UserCatalogsApi* | [**catalogGetProducts**](docs/V2UserCatalogsApi.md#catalogGetProducts) | **POST** /v2/user/catalogs/{storeId}/products | Get product list
*V2UserCatalogsApi* | [**catalogGetRandomProducts**](docs/V2UserCatalogsApi.md#catalogGetRandomProducts) | **GET** /v2/user/catalogs/{storeId}/products/random | Get random product list
*V2UserCatalogsApi* | [**catalogSaveCustomColumn**](docs/V2UserCatalogsApi.md#catalogSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Create or replace a custom column
*V2UserCatalogsApi* | [**importationActivateAutoImport**](docs/V2UserCatalogsApi.md#importationActivateAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.
*V2UserCatalogsApi* | [**importationCancel**](docs/V2UserCatalogsApi.md#importationCancel) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId} | Cancel importation
*V2UserCatalogsApi* | [**importationCommit**](docs/V2UserCatalogsApi.md#importationCommit) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commit | Commit Importation
*V2UserCatalogsApi* | [**importationCommitColumns**](docs/V2UserCatalogsApi.md#importationCommitColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commitColumns | Commit columns
*V2UserCatalogsApi* | [**importationConfigureCatalogColumn**](docs/V2UserCatalogsApi.md#importationConfigureCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId} | Configure catalog column
*V2UserCatalogsApi* | [**importationConfigureRemainingCatalogColumns**](docs/V2UserCatalogsApi.md#importationConfigureRemainingCatalogColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
*V2UserCatalogsApi* | [**importationDeleteCustomColumn**](docs/V2UserCatalogsApi.md#importationDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Delete Custom Column
*V2UserCatalogsApi* | [**importationGetCustomColumnExpression**](docs/V2UserCatalogsApi.md#importationGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/expression | Get the encrypted custom column expression in this importation
*V2UserCatalogsApi* | [**importationGetCustomColumns**](docs/V2UserCatalogsApi.md#importationGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns | Get custom columns currently place in this importation
*V2UserCatalogsApi* | [**importationGetDetectedCatalogColumns**](docs/V2UserCatalogsApi.md#importationGetDetectedCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns | Get detected catalog columns during this importation.
*V2UserCatalogsApi* | [**importationGetImportationMonitoring**](docs/V2UserCatalogsApi.md#importationGetImportationMonitoring) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId} | Get the importation status
*V2UserCatalogsApi* | [**importationGetManualUpdateLastInputConfig**](docs/V2UserCatalogsApi.md#importationGetManualUpdateLastInputConfig) | **GET** /v2/user/catalogs/{storeId}/inputConfiguration | Get the last input configuration
*V2UserCatalogsApi* | [**importationGetProductSample**](docs/V2UserCatalogsApi.md#importationGetProductSample) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex} | Get the product sample related to this importation with all columns (catalog and custom)
*V2UserCatalogsApi* | [**importationGetProductSampleCustomColumnValue**](docs/V2UserCatalogsApi.md#importationGetProductSampleCustomColumnValue) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex}/customColumns/{columnId} | Get product sample custom column value related to this importation.
*V2UserCatalogsApi* | [**importationGetReportings**](docs/V2UserCatalogsApi.md#importationGetReportings) | **GET** /v2/user/catalogs/{storeId}/importations | Get the latest catalog importation reporting
*V2UserCatalogsApi* | [**importationIgnoreColumn**](docs/V2UserCatalogsApi.md#importationIgnoreColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/ignore | Ignore Column
*V2UserCatalogsApi* | [**importationMapCatalogColumn**](docs/V2UserCatalogsApi.md#importationMapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/map | Map catalog column to a BeezUP column
*V2UserCatalogsApi* | [**importationMapCustomColumn**](docs/V2UserCatalogsApi.md#importationMapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/map | Map custom column to a BeezUP column
*V2UserCatalogsApi* | [**importationReattendColumn**](docs/V2UserCatalogsApi.md#importationReattendColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/reattend | Reattend Column
*V2UserCatalogsApi* | [**importationSaveCustomColumn**](docs/V2UserCatalogsApi.md#importationSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Create or replace a custom column
*V2UserCatalogsApi* | [**importationStartManualUpdate**](docs/V2UserCatalogsApi.md#importationStartManualUpdate) | **POST** /v2/user/catalogs/{storeId}/importations | Start Manual Import
*V2UserCatalogsApi* | [**importationTechnicalProgression**](docs/V2UserCatalogsApi.md#importationTechnicalProgression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/technicalProgression | Get technical progression
*V2UserCatalogsApi* | [**importationUnmapCatalogColumn**](docs/V2UserCatalogsApi.md#importationUnmapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/unmap | Unmap catalog column
*V2UserCatalogsApi* | [**importationUnmapCustomColumn**](docs/V2UserCatalogsApi.md#importationUnmapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/unmap | Unmap custom column
*V2UserChannelCatalogsApi* | [**configureChannelCatalogCostSettings**](docs/V2UserChannelCatalogsApi.md#configureChannelCatalogCostSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/cost | Disable a channel catalog
*V2UserChannelCatalogsApi* | [**configureChannelCatalogExclusionFilters**](docs/V2UserChannelCatalogsApi.md#configureChannelCatalogExclusionFilters) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
*V2UserChannelCatalogsApi* | [**configureChannelCatalogGeneralSettings**](docs/V2UserChannelCatalogsApi.md#configureChannelCatalogGeneralSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/general | Disable a channel catalog
*V2UserChannelCatalogsApi* | [**createChannelCatalog**](docs/V2UserChannelCatalogsApi.md#createChannelCatalog) | **POST** /v2/user/channelCatalogs/ | Create a new channel catalog
*V2UserChannelCatalogsApi* | [**deleteChannelCatalog**](docs/V2UserChannelCatalogsApi.md#deleteChannelCatalog) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId} | Delete the channel catalog
*V2UserChannelCatalogsApi* | [**deleteChannelCatalogProductValueOverride**](docs/V2UserChannelCatalogsApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
*V2UserChannelCatalogsApi* | [**disableChannelCatalog**](docs/V2UserChannelCatalogsApi.md#disableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/disable | Disable a channel catalog
*V2UserChannelCatalogsApi* | [**disableChannelCatalogProduct**](docs/V2UserChannelCatalogsApi.md#disableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/disable | Disable channel catalog product
*V2UserChannelCatalogsApi* | [**enableChannelCatalog**](docs/V2UserChannelCatalogsApi.md#enableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/enable | Enable a channel catalog
*V2UserChannelCatalogsApi* | [**getChannelCatalog**](docs/V2UserChannelCatalogsApi.md#getChannelCatalog) | **GET** /v2/user/channelCatalogs/{channelCatalogId} | Get the channel catalog information
*V2UserChannelCatalogsApi* | [**getChannelCatalogCategories**](docs/V2UserChannelCatalogsApi.md#getChannelCatalogCategories) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings | Get channel catalog categories
*V2UserChannelCatalogsApi* | [**getChannelCatalogExclusionFilterOperators**](docs/V2UserChannelCatalogsApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /v2/user/channelCatalogs/exclusionFilterOperators | Get channel catalog exclusion filter operators
*V2UserChannelCatalogsApi* | [**getChannelCatalogProductInfo**](docs/V2UserChannelCatalogsApi.md#getChannelCatalogProductInfo) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId} | Get channel catalog product information
*V2UserChannelCatalogsApi* | [**getChannelCatalogProductInfoList**](docs/V2UserChannelCatalogsApi.md#getChannelCatalogProductInfoList) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products | Get channel catalog product information list
*V2UserChannelCatalogsApi* | [**getChannelCatalogs**](docs/V2UserChannelCatalogsApi.md#getChannelCatalogs) | **GET** /v2/user/channelCatalogs/ | List all your current channel catalogs
*V2UserChannelCatalogsApi* | [**mapChannelCatalogCategory**](docs/V2UserChannelCatalogsApi.md#mapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map | Map channel catalog category
*V2UserChannelCatalogsApi* | [**mapChannelCatalogColumns**](docs/V2UserChannelCatalogsApi.md#mapChannelCatalogColumns) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/columnMappings | Configure channel catalog column mappings
*V2UserChannelCatalogsApi* | [**overrideChannelCatalogProductOverrides**](docs/V2UserChannelCatalogsApi.md#overrideChannelCatalogProductOverrides) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values
*V2UserChannelCatalogsApi* | [**reenableChannelCatalogProduct**](docs/V2UserChannelCatalogsApi.md#reenableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/reenable | Reenable channel catalog product
*V2UserChannelCatalogsApi* | [**unmapChannelCatalogCategory**](docs/V2UserChannelCatalogsApi.md#unmapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category
*V2UserChannelsApi* | [**getChannelCategories**](docs/V2UserChannelsApi.md#getChannelCategories) | **GET** /v2/user/channels/{channelId}/categories | Get channel categories
*V2UserChannelsApi* | [**getChannelColumns**](docs/V2UserChannelsApi.md#getChannelColumns) | **POST** /v2/user/channels/{channelId}/columns | Get channel columns
*V2UserChannelsApi* | [**getChannelInfo**](docs/V2UserChannelsApi.md#getChannelInfo) | **GET** /v2/user/channels/{channelId} | Get channel information
*V2UserChannelsApi* | [**getCurrentChannels**](docs/V2UserChannelsApi.md#getCurrentChannels) | **GET** /v2/user/channels/ | List all available channel for this store
*V2UserCustomerApi* | [**activateUserAccount**](docs/V2UserCustomerApi.md#activateUserAccount) | **POST** /v2/user/customer/account/activate | Activate the user account
*V2UserCustomerApi* | [**changePassword**](docs/V2UserCustomerApi.md#changePassword) | **POST** /v2/user/customer/account/changePassword | Change user password
*V2UserCustomerApi* | [**createContract**](docs/V2UserCustomerApi.md#createContract) | **POST** /v2/user/customer/contracts | Create a new contract
*V2UserCustomerApi* | [**createStore**](docs/V2UserCustomerApi.md#createStore) | **POST** /v2/user/customer/stores | Create a new store
*V2UserCustomerApi* | [**deleteNextContract**](docs/V2UserCustomerApi.md#deleteNextContract) | **DELETE** /v2/user/customer/contracts/next | Delete your next contract
*V2UserCustomerApi* | [**deleteShare**](docs/V2UserCustomerApi.md#deleteShare) | **DELETE** /v2/user/customer/stores/{storeId}/shares/{userId} | Delete a share to another user
*V2UserCustomerApi* | [**deleteStore**](docs/V2UserCustomerApi.md#deleteStore) | **DELETE** /v2/user/customer/stores/{storeId} | Delete a store
*V2UserCustomerApi* | [**getBillingPeriods**](docs/V2UserCustomerApi.md#getBillingPeriods) | **GET** /v2/user/customer/billingPeriods | Get billing periods conditions
*V2UserCustomerApi* | [**getContracts**](docs/V2UserCustomerApi.md#getContracts) | **GET** /v2/user/customer/contracts | Get contract list
*V2UserCustomerApi* | [**getCreditCardInfo**](docs/V2UserCustomerApi.md#getCreditCardInfo) | **GET** /v2/user/customer/account/creditCardInfo | Get credit card information
*V2UserCustomerApi* | [**getFriendInfo**](docs/V2UserCustomerApi.md#getFriendInfo) | **GET** /v2/user/customer/friends/{userId} | Get friend information
*V2UserCustomerApi* | [**getInvoices**](docs/V2UserCustomerApi.md#getInvoices) | **GET** /v2/user/customer/invoices | Get all your invoices
*V2UserCustomerApi* | [**getOffer**](docs/V2UserCustomerApi.md#getOffer) | **POST** /v2/user/customer/offers | Get offer pricing
*V2UserCustomerApi* | [**getRights**](docs/V2UserCustomerApi.md#getRights) | **POST** /v2/user/customer/stores/{storeId}/rights | Get store&#39;s rights
*V2UserCustomerApi* | [**getShares**](docs/V2UserCustomerApi.md#getShares) | **GET** /v2/user/customer/stores/{storeId}/shares | Get shares related to this store
*V2UserCustomerApi* | [**getStandardOffers**](docs/V2UserCustomerApi.md#getStandardOffers) | **GET** /v2/user/customer/offers | Get all standard offers
*V2UserCustomerApi* | [**getStore**](docs/V2UserCustomerApi.md#getStore) | **GET** /v2/user/customer/stores/{storeId} | Get store&#39;s information
*V2UserCustomerApi* | [**getStoreAlerts**](docs/V2UserCustomerApi.md#getStoreAlerts) | **GET** /v2/user/customer/stores/{storeId}/alerts | Get store&#39;s alerts
*V2UserCustomerApi* | [**getStores**](docs/V2UserCustomerApi.md#getStores) | **GET** /v2/user/customer/stores | Get store list
*V2UserCustomerApi* | [**getUserAccountInfo**](docs/V2UserCustomerApi.md#getUserAccountInfo) | **GET** /v2/user/customer/account | Get user account information
*V2UserCustomerApi* | [**logout**](docs/V2UserCustomerApi.md#logout) | **POST** /v2/user/customer/security/logout | Log out the current user from go2
*V2UserCustomerApi* | [**reactivateCurrentContract**](docs/V2UserCustomerApi.md#reactivateCurrentContract) | **POST** /v2/user/customer/contracts/current/reenableAutoRenewal | Reactivate your terminated contract.
*V2UserCustomerApi* | [**resendEmailActivation**](docs/V2UserCustomerApi.md#resendEmailActivation) | **POST** /v2/user/customer/account/resendEmailActivation | Resend email activation
*V2UserCustomerApi* | [**saveCompanyInfo**](docs/V2UserCustomerApi.md#saveCompanyInfo) | **PUT** /v2/user/customer/account/companyInfo | Change company information
*V2UserCustomerApi* | [**saveCreditCardInfo**](docs/V2UserCustomerApi.md#saveCreditCardInfo) | **PUT** /v2/user/customer/account/creditCardInfo | Save user credit card info
*V2UserCustomerApi* | [**savePersonalInfo**](docs/V2UserCustomerApi.md#savePersonalInfo) | **PUT** /v2/user/customer/account/personalInfo | Save user personal information
*V2UserCustomerApi* | [**saveProfilePictureInfo**](docs/V2UserCustomerApi.md#saveProfilePictureInfo) | **PUT** /v2/user/customer/account/profilePictureInfo | Change user picture information
*V2UserCustomerApi* | [**saveStoreAlert**](docs/V2UserCustomerApi.md#saveStoreAlert) | **PUT** /v2/user/customer/stores/{storeId}/alerts/{alertId} | Save store alert
*V2UserCustomerApi* | [**share**](docs/V2UserCustomerApi.md#share) | **POST** /v2/user/customer/stores/{storeId}/shares | Share a store to another user
*V2UserCustomerApi* | [**terminateCurrentContract**](docs/V2UserCustomerApi.md#terminateCurrentContract) | **POST** /v2/user/customer/contracts/current/disableAutoRenewal | Schedule termination of your current contract at the end of the commitment.
*V2UserCustomerApi* | [**updateStore**](docs/V2UserCustomerApi.md#updateStore) | **PATCH** /v2/user/customer/stores/{storeId} | Update some store&#39;s information.
*V2UserMarketplacesChannelCatalogsApi* | [**getChannelCatalogMarketplaceProperties**](docs/V2UserMarketplacesChannelCatalogsApi.md#getChannelCatalogMarketplaceProperties) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/properties | Get the marketplace properties for a channel catalog
*V2UserMarketplacesChannelCatalogsApi* | [**getChannelCatalogMarketplaceSettings**](docs/V2UserMarketplacesChannelCatalogsApi.md#getChannelCatalogMarketplaceSettings) | **GET** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Get the marketplace settings for a channel catalog
*V2UserMarketplacesChannelCatalogsApi* | [**getMarketplaceAccountStores**](docs/V2UserMarketplacesChannelCatalogsApi.md#getMarketplaceAccountStores) | **GET** /v2/user/marketplaces/channelcatalogs/ | Get  you marketplace channel catalog list
*V2UserMarketplacesChannelCatalogsApi* | [**getPublications**](docs/V2UserMarketplacesChannelCatalogsApi.md#getPublications) | **GET** /v2/user/marketplaces/channelcatalogs/publications/{marketplaceTechnicalCode}/{accountId}/history | Fetch the publication history for an account, sorted by descending start date
*V2UserMarketplacesChannelCatalogsApi* | [**setChannelCatalogMarketplaceSettings**](docs/V2UserMarketplacesChannelCatalogsApi.md#setChannelCatalogMarketplaceSettings) | **POST** /v2/user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Save new marketplace settings for a channel catalog
*V2UserMarketplacesOrdersApi* | [**changeOrder**](docs/V2UserMarketplacesOrdersApi.md#changeOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change your marketplace Order Information (accept, ship, etc.)
*V2UserMarketplacesOrdersApi* | [**changeOrderList**](docs/V2UserMarketplacesOrdersApi.md#changeOrderList) | **POST** /v2/user/marketplaces/orders/batches/changeOrders/{changeOrderType} | Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
*V2UserMarketplacesOrdersApi* | [**clearMerchantOrderInfo**](docs/V2UserMarketplacesOrdersApi.md#clearMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear an Order&#39;s merchant information
*V2UserMarketplacesOrdersApi* | [**clearMerchantOrderInfoList**](docs/V2UserMarketplacesOrdersApi.md#clearMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/clearMerchantOrderInfos | Send a batch of operations to clear an Order&#39;s merchant information
*V2UserMarketplacesOrdersApi* | [**configureAutomaticTransitions**](docs/V2UserMarketplacesOrdersApi.md#configureAutomaticTransitions) | **POST** /v2/user/marketplaces/orders/automaticTransitions | Configure new or existing automatic Order status transition
*V2UserMarketplacesOrdersApi* | [**exportOrders**](docs/V2UserMarketplacesOrdersApi.md#exportOrders) | **POST** /v2/user/marketplaces/orders/exportations | Request a new Order report exportation to be generated
*V2UserMarketplacesOrdersApi* | [**getAutomaticTransitions**](docs/V2UserMarketplacesOrdersApi.md#getAutomaticTransitions) | **GET** /v2/user/marketplaces/orders/automaticTransitions | Get list of configured automatic Order status transitions
*V2UserMarketplacesOrdersApi* | [**getMarketplaceAccountsSynchronization**](docs/V2UserMarketplacesOrdersApi.md#getMarketplaceAccountsSynchronization) | **GET** /v2/user/marketplaces/orders/status | Get current synchronization status between your marketplaces and BeezUP accounts
*V2UserMarketplacesOrdersApi* | [**getOrder**](docs/V2UserMarketplacesOrdersApi.md#getOrder) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get full Order and Order Item(s) properties
*V2UserMarketplacesOrdersApi* | [**getOrderExportations**](docs/V2UserMarketplacesOrdersApi.md#getOrderExportations) | **GET** /v2/user/marketplaces/orders/exportations | Get a paginated list of Order report exportations
*V2UserMarketplacesOrdersApi* | [**getOrderHistory**](docs/V2UserMarketplacesOrdersApi.md#getOrderHistory) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get an Order&#39;s harvest and change history
*V2UserMarketplacesOrdersApi* | [**getOrderListFull**](docs/V2UserMarketplacesOrdersApi.md#getOrderListFull) | **POST** /v2/user/marketplaces/orders/list/full | Get a paginated list of all Orders with all Order and Order Item(s) properties
*V2UserMarketplacesOrdersApi* | [**getOrderListLight**](docs/V2UserMarketplacesOrdersApi.md#getOrderListLight) | **POST** /v2/user/marketplaces/orders/list/light | Get a paginated list of all Orders without details
*V2UserMarketplacesOrdersApi* | [**harvestAll**](docs/V2UserMarketplacesOrdersApi.md#harvestAll) | **POST** /v2/user/marketplaces/orders/harvest | Send harvest request to all your marketplaces
*V2UserMarketplacesOrdersApi* | [**harvestOrder**](docs/V2UserMarketplacesOrdersApi.md#harvestOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Send harvest request for a single Order
*V2UserMarketplacesOrdersApi* | [**setMerchantOrderInfo**](docs/V2UserMarketplacesOrdersApi.md#setMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Set an Order&#39;s merchant information
*V2UserMarketplacesOrdersApi* | [**setMerchantOrderInfoList**](docs/V2UserMarketplacesOrdersApi.md#setMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/setMerchantOrderInfos | Send a batch of operations to set an Order&#39;s merchant information


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

