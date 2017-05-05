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
import io.swagger.client.api.OptimisationsApi;

import java.io.File;
import java.util.*;

public class OptimisationsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OptimisationsApi apiInstance = new OptimisationsApi();
        String storeId = "storeId_example"; // String | Your store identifier
        String actionName = "actionName_example"; // String | 
        OptimiseRequest request = new OptimiseRequest(); // OptimiseRequest | 
        try {
            apiInstance.optimise(storeId, actionName, request);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptimisationsApi#optimise");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/analytics*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OptimisationsApi* | [**optimise**](docs/OptimisationsApi.md#optimise) | **POST** /{storeId}/optimisations/{actionName} | Optimise products
*OptimisationsApi* | [**optimiseByCategory**](docs/OptimisationsApi.md#optimiseByCategory) | **POST** /{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
*OptimisationsApi* | [**optimiseByChannel**](docs/OptimisationsApi.md#optimiseByChannel) | **POST** /{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
*OptimisationsApi* | [**optimiseByProduct**](docs/OptimisationsApi.md#optimiseByProduct) | **POST** /{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products
*ReportsApi* | [**deleteReportFilter**](docs/ReportsApi.md#deleteReportFilter) | **DELETE** /{storeId}/reports/filters/{reportFilterId} | Delete the report filter
*ReportsApi* | [**exportStoreReportByCategory**](docs/ReportsApi.md#exportStoreReportByCategory) | **POST** /{storeId}/reports/bycategory/export | Export the report by category
*ReportsApi* | [**exportStoreReportByChannel**](docs/ReportsApi.md#exportStoreReportByChannel) | **POST** /{storeId}/reports/bychannel/export | Export the report by channel
*ReportsApi* | [**exportStoreReportByProduct**](docs/ReportsApi.md#exportStoreReportByProduct) | **POST** /{storeId}/reports/byproduct/export | Export the report by product
*ReportsApi* | [**getReportFilter**](docs/ReportsApi.md#getReportFilter) | **GET** /{storeId}/reports/filters/{reportFilterId} | Get the report filter description
*ReportsApi* | [**getReportFilters**](docs/ReportsApi.md#getReportFilters) | **GET** /{storeId}/reports/filters | Get report filter list for the given store
*ReportsApi* | [**getStoreReportByCategory**](docs/ReportsApi.md#getStoreReportByCategory) | **POST** /{storeId}/reports/bycategory | Get the report by category
*ReportsApi* | [**getStoreReportByChannel**](docs/ReportsApi.md#getStoreReportByChannel) | **POST** /{storeId}/reports/bychannel | Get the report by channel
*ReportsApi* | [**getStoreReportByDay**](docs/ReportsApi.md#getStoreReportByDay) | **POST** /{storeId}/reports/byday | Get the report by day
*ReportsApi* | [**getStoreReportByDayExport**](docs/ReportsApi.md#getStoreReportByDayExport) | **POST** /{storeId}/reports/byday/export | Get the report by day
*ReportsApi* | [**getStoreReportByProduct**](docs/ReportsApi.md#getStoreReportByProduct) | **POST** /{storeId}/reports/byproduct | Get the report by product
*ReportsApi* | [**saveReportFilter**](docs/ReportsApi.md#saveReportFilter) | **PUT** /{storeId}/reports/filters/{reportFilterId} | Save the report filter
*RulesApi* | [**createRule**](docs/RulesApi.md#createRule) | **POST** /{storeId}/rules | Rule creation
*RulesApi* | [**deleteRule**](docs/RulesApi.md#deleteRule) | **DELETE** /{storeId}/rules/{ruleId} | Delete Rule
*RulesApi* | [**disableRule**](docs/RulesApi.md#disableRule) | **POST** /{storeId}/rules/{ruleId}/disable | Disable rule
*RulesApi* | [**enableRule**](docs/RulesApi.md#enableRule) | **POST** /{storeId}/rules/{ruleId}/enable | Enable rule
*RulesApi* | [**getRule**](docs/RulesApi.md#getRule) | **GET** /{storeId}/rules/{ruleId} | Gets the rule
*RulesApi* | [**getRules**](docs/RulesApi.md#getRules) | **GET** /{storeId}/rules | Gets the list of rules for a given store
*RulesApi* | [**getRulesExecutions**](docs/RulesApi.md#getRulesExecutions) | **GET** /{storeId}/rules/executions | Get the rules execution history
*RulesApi* | [**moveDownRule**](docs/RulesApi.md#moveDownRule) | **POST** /{storeId}/rules/{ruleId}/movedown | Move the rule down
*RulesApi* | [**moveUpRule**](docs/RulesApi.md#moveUpRule) | **POST** /{storeId}/rules/{ruleId}/moveup | Move the rule up
*RulesApi* | [**runRule**](docs/RulesApi.md#runRule) | **POST** /{storeId}/rules/{ruleId}/run | Run rule
*RulesApi* | [**runRules**](docs/RulesApi.md#runRules) | **POST** /{storeId}/rules/run | Run all rules for this store
*RulesApi* | [**updateRule**](docs/RulesApi.md#updateRule) | **PATCH** /{storeId}/rules/{ruleId} | Update Rule
*TrackingApi* | [**getStoreTrackedClicks**](docs/TrackingApi.md#getStoreTrackedClicks) | **GET** /{storeId}/tracking/clicks | Get the latest clicks tracked
*TrackingApi* | [**getStoreTrackedExternalOrders**](docs/TrackingApi.md#getStoreTrackedExternalOrders) | **GET** /{storeId}/tracking/externalorders | Get the latest external orders tracked
*TrackingApi* | [**getStoreTrackedOrders**](docs/TrackingApi.md#getStoreTrackedOrders) | **GET** /{storeId}/tracking/orders | Get the latest orders tracked
*TrackingApi* | [**getStoreTrackingStatus**](docs/TrackingApi.md#getStoreTrackingStatus) | **GET** /{storeId}/tracking/status | Get store tracking synchronization status
*TrackingApi* | [**getTrackingStatus**](docs/TrackingApi.md#getTrackingStatus) | **GET** /tracking/status | Display the synchronization status of the clicks and orders


## Documentation for Models

 - [BeezUPCommonCatalogCategoryId](docs/BeezUPCommonCatalogCategoryId.md)
 - [BeezUPCommonCatalogCategoryPath](docs/BeezUPCommonCatalogCategoryPath.md)
 - [BeezUPCommonCatalogColumnId](docs/BeezUPCommonCatalogColumnId.md)
 - [BeezUPCommonChannelBasicInfo](docs/BeezUPCommonChannelBasicInfo.md)
 - [BeezUPCommonChannelId](docs/BeezUPCommonChannelId.md)
 - [BeezUPCommonChannelName](docs/BeezUPCommonChannelName.md)
 - [BeezUPCommonCurrencyCode](docs/BeezUPCommonCurrencyCode.md)
 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
 - [BeezUPCommonErrorResponseMessage](docs/BeezUPCommonErrorResponseMessage.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonHttpUrl](docs/BeezUPCommonHttpUrl.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLink3](docs/BeezUPCommonLink3.md)
 - [BeezUPCommonLinkParameter3](docs/BeezUPCommonLinkParameter3.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonPaginationResult](docs/BeezUPCommonPaginationResult.md)
 - [BeezUPCommonPaginationResultLinks](docs/BeezUPCommonPaginationResultLinks.md)
 - [BeezUPCommonProductBasicInfo](docs/BeezUPCommonProductBasicInfo.md)
 - [BeezUPCommonProductId](docs/BeezUPCommonProductId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [CreateRuleRequest](docs/CreateRuleRequest.md)
 - [GlobalPerformanceIndicatorByChannel](docs/GlobalPerformanceIndicatorByChannel.md)
 - [LinkClickToOrderType](docs/LinkClickToOrderType.md)
 - [LinksCreateRuleLink](docs/LinksCreateRuleLink.md)
 - [LinksDeleteReportFilterLink](docs/LinksDeleteReportFilterLink.md)
 - [LinksDeleteRuleLink](docs/LinksDeleteRuleLink.md)
 - [LinksDisableRuleLink](docs/LinksDisableRuleLink.md)
 - [LinksEnableRuleLink](docs/LinksEnableRuleLink.md)
 - [LinksGetChannelCatalogProductInfoLink](docs/LinksGetChannelCatalogProductInfoLink.md)
 - [LinksGetReportFilterLink](docs/LinksGetReportFilterLink.md)
 - [LinksGetReportFiltersLink](docs/LinksGetReportFiltersLink.md)
 - [LinksGetRuleLink](docs/LinksGetRuleLink.md)
 - [LinksGetRulesExecutionsLink](docs/LinksGetRulesExecutionsLink.md)
 - [LinksGetRulesLink](docs/LinksGetRulesLink.md)
 - [LinksMoveDownRuleLink](docs/LinksMoveDownRuleLink.md)
 - [LinksMoveUpRuleLink](docs/LinksMoveUpRuleLink.md)
 - [LinksOptimiseByCategoryLink](docs/LinksOptimiseByCategoryLink.md)
 - [LinksOptimiseByChannelLink](docs/LinksOptimiseByChannelLink.md)
 - [LinksOptimiseByProductLink](docs/LinksOptimiseByProductLink.md)
 - [LinksOptimiseLink](docs/LinksOptimiseLink.md)
 - [LinksRunRuleLink](docs/LinksRunRuleLink.md)
 - [LinksRunRulesLink](docs/LinksRunRulesLink.md)
 - [LinksSaveReportFilterLink](docs/LinksSaveReportFilterLink.md)
 - [LinksUpdateRuleLink](docs/LinksUpdateRuleLink.md)
 - [MargingType](docs/MargingType.md)
 - [OptimisationActionName](docs/OptimisationActionName.md)
 - [OptimiseRequest](docs/OptimiseRequest.md)
 - [PageNumber](docs/PageNumber.md)
 - [PageSize](docs/PageSize.md)
 - [PaginationRequestParameters](docs/PaginationRequestParameters.md)
 - [PerformanceIndicatorFormula](docs/PerformanceIndicatorFormula.md)
 - [PerformanceIndicatorFormulaOperatorName](docs/PerformanceIndicatorFormulaOperatorName.md)
 - [PerformanceIndicatorFormulaParameterType](docs/PerformanceIndicatorFormulaParameterType.md)
 - [PerformanceIndicatorType](docs/PerformanceIndicatorType.md)
 - [ProductFilters](docs/ProductFilters.md)
 - [ProductStateFilter](docs/ProductStateFilter.md)
 - [ReportAdvancedFilters](docs/ReportAdvancedFilters.md)
 - [ReportByCategory](docs/ReportByCategory.md)
 - [ReportByCategoryLinks](docs/ReportByCategoryLinks.md)
 - [ReportByCategoryRequest](docs/ReportByCategoryRequest.md)
 - [ReportByCategoryResponse](docs/ReportByCategoryResponse.md)
 - [ReportByCategoryResponseLinks](docs/ReportByCategoryResponseLinks.md)
 - [ReportByChannel](docs/ReportByChannel.md)
 - [ReportByChannelLinks](docs/ReportByChannelLinks.md)
 - [ReportByChannelRequest](docs/ReportByChannelRequest.md)
 - [ReportByChannelResponse](docs/ReportByChannelResponse.md)
 - [ReportByChannelResponseLinks](docs/ReportByChannelResponseLinks.md)
 - [ReportByCommonResponseLinks](docs/ReportByCommonResponseLinks.md)
 - [ReportByDay](docs/ReportByDay.md)
 - [ReportByDayAllChannels](docs/ReportByDayAllChannels.md)
 - [ReportByDayByChannel](docs/ReportByDayByChannel.md)
 - [ReportByDayRequest](docs/ReportByDayRequest.md)
 - [ReportByDayResponse](docs/ReportByDayResponse.md)
 - [ReportByProduct](docs/ReportByProduct.md)
 - [ReportByProductLinks](docs/ReportByProductLinks.md)
 - [ReportByProductRequest](docs/ReportByProductRequest.md)
 - [ReportByProductResponse](docs/ReportByProductResponse.md)
 - [ReportByProductResponseLinks](docs/ReportByProductResponseLinks.md)
 - [ReportCategoryFilter](docs/ReportCategoryFilter.md)
 - [ReportFilter](docs/ReportFilter.md)
 - [ReportFilterCommonParameters](docs/ReportFilterCommonParameters.md)
 - [ReportFilterHeader](docs/ReportFilterHeader.md)
 - [ReportFilterHeaderLinks](docs/ReportFilterHeaderLinks.md)
 - [ReportFilterLinks](docs/ReportFilterLinks.md)
 - [ReportFilterParameters](docs/ReportFilterParameters.md)
 - [ReportFilters](docs/ReportFilters.md)
 - [ReportFiltersLinks](docs/ReportFiltersLinks.md)
 - [ReportIndicatorFilter](docs/ReportIndicatorFilter.md)
 - [ReportIndicatorFilterOperatorName](docs/ReportIndicatorFilterOperatorName.md)
 - [ReportProductFilter](docs/ReportProductFilter.md)
 - [ReportProductFilterOperatorName](docs/ReportProductFilterOperatorName.md)
 - [ReportType](docs/ReportType.md)
 - [Rule](docs/Rule.md)
 - [RuleExecutionReporting](docs/RuleExecutionReporting.md)
 - [RuleExecutionReportingErrorType](docs/RuleExecutionReportingErrorType.md)
 - [RuleExecutionReportingExecutionSource](docs/RuleExecutionReportingExecutionSource.md)
 - [RuleExecutionReportingLinks](docs/RuleExecutionReportingLinks.md)
 - [RuleExecutionReportingStatus](docs/RuleExecutionReportingStatus.md)
 - [RuleExecutionReportings](docs/RuleExecutionReportings.md)
 - [RuleLastExecutionStatus](docs/RuleLastExecutionStatus.md)
 - [RuleLinks](docs/RuleLinks.md)
 - [RuleList](docs/RuleList.md)
 - [RuleListLinks](docs/RuleListLinks.md)
 - [SaveReportFilterRequest](docs/SaveReportFilterRequest.md)
 - [StoreTrackingStatus](docs/StoreTrackingStatus.md)
 - [TrackedClick](docs/TrackedClick.md)
 - [TrackedClicks](docs/TrackedClicks.md)
 - [TrackedExternalOrder](docs/TrackedExternalOrder.md)
 - [TrackedExternalOrderProduct](docs/TrackedExternalOrderProduct.md)
 - [TrackedExternalOrders](docs/TrackedExternalOrders.md)
 - [TrackedOrder](docs/TrackedOrder.md)
 - [TrackedOrderProduct](docs/TrackedOrderProduct.md)
 - [TrackedOrders](docs/TrackedOrders.md)
 - [TrackingStatus](docs/TrackingStatus.md)
 - [UpdateRuleRequest](docs/UpdateRuleRequest.md)


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

