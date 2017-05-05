# BatchesApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeOrderList**](BatchesApi.md#changeOrderList) | **POST** /v2/user/marketplaces/orders/batches/changeOrders/{changeOrderType} | Batches the change order operation.
[**clearMerchantOrderInfoList**](BatchesApi.md#clearMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/clearMerchantOrderInfos | Batches the clear merchant order info operation.
[**setMerchantOrderInfoList**](BatchesApi.md#setMerchantOrderInfoList) | **POST** /v2/user/marketplaces/orders/batches/setMerchantOrderInfos | Batches the set merchant order info operation.


<a name="changeOrderList"></a>
# **changeOrderList**
> changeOrderList(changeOrderType, userName, request, testMode)

Batches the change order operation.

The purpose of this  operation is to reduce the amount of request to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BatchesApi apiInstance = new BatchesApi();
String changeOrderType = "changeOrderType_example"; // String | The order change type
String userName = "userName_example"; // String | Sometimes the user in the e-commerce application is not the same than the subscription key you indicate in your settings. We recommand you to indicate the login of the user in your appplication.
ChangeOrderListRequest request = new ChangeOrderListRequest(); // ChangeOrderListRequest | 
Boolean testMode = false; // Boolean | If true, the operation will be be commited. But the validation will be taken in account.
try {
    apiInstance.changeOrderList(changeOrderType, userName, request, testMode);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#changeOrderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeOrderType** | **String**| The order change type |
 **userName** | **String**| Sometimes the user in the e-commerce application is not the same than the subscription key you indicate in your settings. We recommand you to indicate the login of the user in your appplication. |
 **request** | [**ChangeOrderListRequest**](ChangeOrderListRequest.md)|  |
 **testMode** | **Boolean**| If true, the operation will be be commited. But the validation will be taken in account. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearMerchantOrderInfoList"></a>
# **clearMerchantOrderInfoList**
> clearMerchantOrderInfoList(request)

Batches the clear merchant order info operation.

The purpose of this  operation is to reduce the amount of request to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BatchesApi apiInstance = new BatchesApi();
ClearMerchantOrderInfoListRequest request = new ClearMerchantOrderInfoListRequest(); // ClearMerchantOrderInfoListRequest | 
try {
    apiInstance.clearMerchantOrderInfoList(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#clearMerchantOrderInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClearMerchantOrderInfoListRequest**](ClearMerchantOrderInfoListRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMerchantOrderInfoList"></a>
# **setMerchantOrderInfoList**
> setMerchantOrderInfoList(request)

Batches the set merchant order info operation.

The purpose of this  operation is to reduce the amount of request to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

BatchesApi apiInstance = new BatchesApi();
SetMerchantOrderInfoListRequest request = new SetMerchantOrderInfoListRequest(); // SetMerchantOrderInfoListRequest | 
try {
    apiInstance.setMerchantOrderInfoList(request);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#setMerchantOrderInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetMerchantOrderInfoListRequest**](SetMerchantOrderInfoListRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

