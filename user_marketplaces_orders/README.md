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
import io.swagger.client.api.AutoTransitionsApi;

import java.io.File;
import java.util.*;

public class AutoTransitionsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AutoTransitionsApi apiInstance = new AutoTransitionsApi();
        SaveAutomaticTransitionRequest request = new SaveAutomaticTransitionRequest(); // SaveAutomaticTransitionRequest | 
        try {
            apiInstance.configureAutomaticTransitions(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutoTransitionsApi#configureAutomaticTransitions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/orders*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AutoTransitionsApi* | [**configureAutomaticTransitions**](docs/AutoTransitionsApi.md#configureAutomaticTransitions) | **POST** /automaticTransitions | Configure new or existing automatic Order status transition
*AutoTransitionsApi* | [**getAutomaticTransitions**](docs/AutoTransitionsApi.md#getAutomaticTransitions) | **GET** /automaticTransitions | Get list of configured automatic Order status transitions
*BatchesApi* | [**changeOrderList**](docs/BatchesApi.md#changeOrderList) | **POST** /batches/changeOrders/{changeOrderType} | Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
*BatchesApi* | [**clearMerchantOrderInfoList**](docs/BatchesApi.md#clearMerchantOrderInfoList) | **POST** /batches/clearMerchantOrderInfos | Send a batch of operations to clear an Order&#39;s merchant information
*BatchesApi* | [**setMerchantOrderInfoList**](docs/BatchesApi.md#setMerchantOrderInfoList) | **POST** /batches/setMerchantOrderInfos | Send a batch of operations to set an Order&#39;s merchant information
*ExportsApi* | [**exportOrders**](docs/ExportsApi.md#exportOrders) | **POST** /exportations | Request a new Order report exportation to be generated
*ExportsApi* | [**getOrderExportations**](docs/ExportsApi.md#getOrderExportations) | **GET** /exportations | Get a paginated list of Order report exportations
*GlobalApi* | [**getMarketplaceAccountsSynchronization**](docs/GlobalApi.md#getMarketplaceAccountsSynchronization) | **GET** /status | Get current synchronization status between your marketplaces and BeezUP accounts
*GlobalApi* | [**harvestAll**](docs/GlobalApi.md#harvestAll) | **POST** /harvest | Send harvest request to all your marketplaces
*ListApi* | [**getOrderListFull**](docs/ListApi.md#getOrderListFull) | **POST** /list/full | Get a paginated list of all Orders with all Order and Order Item(s) properties
*ListApi* | [**getOrderListLight**](docs/ListApi.md#getOrderListLight) | **POST** /list/light | Get a paginated list of all Orders without details
*OrderApi* | [**changeOrder**](docs/OrderApi.md#changeOrder) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change your marketplace Order Information (accept, ship, etc.)
*OrderApi* | [**clearMerchantOrderInfo**](docs/OrderApi.md#clearMerchantOrderInfo) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear an Order&#39;s merchant information
*OrderApi* | [**getOrder**](docs/OrderApi.md#getOrder) | **GET** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get full Order and Order Item(s) properties
*OrderApi* | [**getOrderHistory**](docs/OrderApi.md#getOrderHistory) | **GET** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get an Order&#39;s harvest and change history
*OrderApi* | [**harvestOrder**](docs/OrderApi.md#harvestOrder) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Send harvest request for a single Order
*OrderApi* | [**setMerchantOrderInfo**](docs/OrderApi.md#setMerchantOrderInfo) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Set an Order&#39;s merchant information


## Documentation for Models

 - [AccountId](docs/AccountId.md)
 - [AccountSynchronization](docs/AccountSynchronization.md)
 - [AccountSynchronizations](docs/AccountSynchronizations.md)
 - [AutomaticTransition](docs/AutomaticTransition.md)
 - [AutomaticTransitionInfo](docs/AutomaticTransitionInfo.md)
 - [AutomaticTransitionInfos](docs/AutomaticTransitionInfos.md)
 - [BatchOrderOperationResponse](docs/BatchOrderOperationResponse.md)
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
 - [BeezUPCommonStoreId](docs/BeezUPCommonStoreId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonUserId](docs/BeezUPCommonUserId.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [BeezUPOrderId](docs/BeezUPOrderId.md)
 - [BeezUPOrderStatus](docs/BeezUPOrderStatus.md)
 - [BusinessOperationType](docs/BusinessOperationType.md)
 - [ChangeOrderListRequest](docs/ChangeOrderListRequest.md)
 - [ChangeOrderListRequestItem](docs/ChangeOrderListRequestItem.md)
 - [ChangeOrderReporting](docs/ChangeOrderReporting.md)
 - [ChangeOrderRequest](docs/ChangeOrderRequest.md)
 - [ClearMerchantOrderInfoListRequest](docs/ClearMerchantOrderInfoListRequest.md)
 - [DateSearchType](docs/DateSearchType.md)
 - [Etag](docs/Etag.md)
 - [ExecutionUUID](docs/ExecutionUUID.md)
 - [ExportOrderListRequest](docs/ExportOrderListRequest.md)
 - [HarvestOrderReporting](docs/HarvestOrderReporting.md)
 - [LinksChangeOrderLink](docs/LinksChangeOrderLink.md)
 - [LinksGetOrderHistoryLink](docs/LinksGetOrderHistoryLink.md)
 - [LinksGetOrderLink](docs/LinksGetOrderLink.md)
 - [LinksSetMerchantOrderInfoLink](docs/LinksSetMerchantOrderInfoLink.md)
 - [MarketplaceBusinessCode](docs/MarketplaceBusinessCode.md)
 - [MarketplaceOrderId](docs/MarketplaceOrderId.md)
 - [MarketplaceOrderStatus](docs/MarketplaceOrderStatus.md)
 - [MarketplaceTechnicalCode](docs/MarketplaceTechnicalCode.md)
 - [Order](docs/Order.md)
 - [OrderBuyerName](docs/OrderBuyerName.md)
 - [OrderExportationReporting](docs/OrderExportationReporting.md)
 - [OrderExportationReportingProcessingStatus](docs/OrderExportationReportingProcessingStatus.md)
 - [OrderExportations](docs/OrderExportations.md)
 - [OrderHeader](docs/OrderHeader.md)
 - [OrderHeaderLinks](docs/OrderHeaderLinks.md)
 - [OrderHistory](docs/OrderHistory.md)
 - [OrderIdentifier](docs/OrderIdentifier.md)
 - [OrderIdentifierWithETag](docs/OrderIdentifierWithETag.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderLinks](docs/OrderLinks.md)
 - [OrderListFull](docs/OrderListFull.md)
 - [OrderListLight](docs/OrderListLight.md)
 - [OrderListRequest](docs/OrderListRequest.md)
 - [OrderMerchantECommerceSoftwareName](docs/OrderMerchantECommerceSoftwareName.md)
 - [OrderMerchantECommerceSoftwareVersion](docs/OrderMerchantECommerceSoftwareVersion.md)
 - [OrderMerchantOrderId](docs/OrderMerchantOrderId.md)
 - [OrderOperationResponse](docs/OrderOperationResponse.md)
 - [OrderTransitionLinks](docs/OrderTransitionLinks.md)
 - [PageNumber](docs/PageNumber.md)
 - [PageSize](docs/PageSize.md)
 - [Processing](docs/Processing.md)
 - [SaveAutomaticTransitionRequest](docs/SaveAutomaticTransitionRequest.md)
 - [SetMerchantOrderInfoListRequest](docs/SetMerchantOrderInfoListRequest.md)
 - [SetMerchantOrderInfoListRequestItem](docs/SetMerchantOrderInfoListRequestItem.md)
 - [SetMerchantOrderInfoRequest](docs/SetMerchantOrderInfoRequest.md)
 - [SourceType](docs/SourceType.md)


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

