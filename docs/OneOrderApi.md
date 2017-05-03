# OneOrderApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeOrder**](OneOrderApi.md#changeOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change order status
[**clearMerchantOrderInfo**](OneOrderApi.md#clearMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear the merchant info related to this order
[**getOrder**](OneOrderApi.md#getOrder) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get order details
[**getOrderHistory**](OneOrderApi.md#getOrderHistory) | **GET** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get the harvest history and the change status operations
[**harvestOrder**](OneOrderApi.md#harvestOrder) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Harvest a specific order from the marketplace
[**setMerchantOrderInfo**](OneOrderApi.md#setMerchantOrderInfo) | **POST** /v2/user/marketplaces/orders/{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Associate your merchant order identifier to this order


<a name="changeOrder"></a>
# **changeOrder**
> changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode)

Change order status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OneOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OneOrderApi apiInstance = new OneOrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The order BeezUP identifier
String changeOrderType = "changeOrderType_example"; // String | The order change type
String userName = "userName_example"; // String | Sometimes the user in the e-commerce application is not the same than the subscription key you indicate in your settings. We recommand you to indicate the login of the user in your appplication.
ChangeOrderRequest request = new ChangeOrderRequest(); // ChangeOrderRequest | 
String ifMatch = "ifMatch_example"; // String | To ensure that you are making a change on the lastest version of the order. ETag value to identify the order given in the order information. \\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3 
Boolean testMode = false; // Boolean | If true, the operation will be be commited. But the validation will be taken in account.
try {
    apiInstance.changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode);
} catch (ApiException e) {
    System.err.println("Exception when calling OneOrderApi#changeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The order BeezUP identifier |
 **changeOrderType** | **String**| The order change type |
 **userName** | **String**| Sometimes the user in the e-commerce application is not the same than the subscription key you indicate in your settings. We recommand you to indicate the login of the user in your appplication. |
 **request** | [**ChangeOrderRequest**](ChangeOrderRequest.md)|  |
 **ifMatch** | **String**| To ensure that you are making a change on the lastest version of the order. ETag value to identify the order given in the order information. \\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  |
 **testMode** | **Boolean**| If true, the operation will be be commited. But the validation will be taken in account. | [optional] [default to false]

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

Clear the merchant info related to this order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OneOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OneOrderApi apiInstance = new OneOrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The order BeezUP identifier
try {
    apiInstance.clearMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OneOrderApi#clearMerchantOrderInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The order BeezUP identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch)

Get order details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OneOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OneOrderApi apiInstance = new OneOrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The order BeezUP identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag value to identify the order given in the order information. \\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3 
try {
    Order result = apiInstance.getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OneOrderApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The order BeezUP identifier |
 **ifNoneMatch** | **String**| ETag value to identify the order given in the order information. \\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderHistory"></a>
# **getOrderHistory**
> OrderHistory getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId)

Get the harvest history and the change status operations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OneOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OneOrderApi apiInstance = new OneOrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The order BeezUP identifier
try {
    OrderHistory result = apiInstance.getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OneOrderApi#getOrderHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The order BeezUP identifier |

### Return type

[**OrderHistory**](OrderHistory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="harvestOrder"></a>
# **harvestOrder**
> harvestOrder(marketplaceTechnicalCode, accountId, beezUPOrderId)

Harvest a specific order from the marketplace

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OneOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OneOrderApi apiInstance = new OneOrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The order BeezUP identifier
try {
    apiInstance.harvestOrder(marketplaceTechnicalCode, accountId, beezUPOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OneOrderApi#harvestOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The order BeezUP identifier |

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

Associate your merchant order identifier to this order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OneOrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OneOrderApi apiInstance = new OneOrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
String beezUPOrderId = "00000000000000000000000000000000000000000000000"; // String | The order BeezUP identifier
SetMerchantOrderInfoRequest request = new SetMerchantOrderInfoRequest(); // SetMerchantOrderInfoRequest | 
try {
    apiInstance.setMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OneOrderApi#setMerchantOrderInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **String**| The order BeezUP identifier |
 **request** | [**SetMerchantOrderInfoRequest**](SetMerchantOrderInfoRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

