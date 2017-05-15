# MarketplacesOrdersBatchesApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeOrderList**](MarketplacesOrdersBatchesApi.md#changeOrderList) | **POST** /user/marketplaces/orders/batches/changeOrders/{changeOrderType} | Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
[**clearMerchantOrderInfoList**](MarketplacesOrdersBatchesApi.md#clearMerchantOrderInfoList) | **POST** /user/marketplaces/orders/batches/clearMerchantOrderInfos | Send a batch of operations to clear an Order&#39;s merchant information
[**setMerchantOrderInfoList**](MarketplacesOrdersBatchesApi.md#setMerchantOrderInfoList) | **POST** /user/marketplaces/orders/batches/setMerchantOrderInfos | Send a batch of operations to set an Order&#39;s merchant information


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
//import io.swagger.client.api.MarketplacesOrdersBatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesOrdersBatchesApi apiInstance = new MarketplacesOrdersBatchesApi();
String changeOrderType = "changeOrderType_example"; // String | The Order change type
String userName = "userName_example"; // String | Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application's user login.
ChangeOrderListRequest request = new ChangeOrderListRequest(); // ChangeOrderListRequest | 
Boolean testMode = false; // Boolean | If true, the operation will be not be sent to marketplace. But the validation will be taken in account.
try {
    BatchOrderOperationResponse result = apiInstance.changeOrderList(changeOrderType, userName, request, testMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesOrdersBatchesApi#changeOrderList");
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
//import io.swagger.client.api.MarketplacesOrdersBatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesOrdersBatchesApi apiInstance = new MarketplacesOrdersBatchesApi();
ClearMerchantOrderInfoListRequest request = new ClearMerchantOrderInfoListRequest(); // ClearMerchantOrderInfoListRequest | 
try {
    BatchOrderOperationResponse result = apiInstance.clearMerchantOrderInfoList(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesOrdersBatchesApi#clearMerchantOrderInfoList");
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
//import io.swagger.client.api.MarketplacesOrdersBatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesOrdersBatchesApi apiInstance = new MarketplacesOrdersBatchesApi();
SetMerchantOrderInfoListRequest request = new SetMerchantOrderInfoListRequest(); // SetMerchantOrderInfoListRequest | 
try {
    BatchOrderOperationResponse result = apiInstance.setMerchantOrderInfoList(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesOrdersBatchesApi#setMerchantOrderInfoList");
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

