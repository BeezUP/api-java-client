# OrderApi

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/orders*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeOrder**](OrderApi.md#changeOrder) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/{changeOrderType} | Change your marketplace Order Information (accept, ship, etc.)
[**clearMerchantOrderInfo**](OrderApi.md#clearMerchantOrderInfo) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/clearMerchantOrderInfo | Clear an Order&#39;s merchant information
[**getOrder**](OrderApi.md#getOrder) | **GET** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId} | Get full Order and Order Item(s) properties
[**getOrderHistory**](OrderApi.md#getOrderHistory) | **GET** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/history | Get an Order&#39;s harvest and change history
[**harvestOrder**](OrderApi.md#harvestOrder) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/harvest | Send harvest request for a single Order
[**setMerchantOrderInfo**](OrderApi.md#setMerchantOrderInfo) | **POST** /{marketplaceTechnicalCode}/{accountId}/{beezUPOrderId}/setMerchantOrderInfo | Set an Order&#39;s merchant information


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
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
UUID beezUPOrderId = new UUID(); // UUID | The BeezUP Order identifier
String changeOrderType = "changeOrderType_example"; // String | The Order change type
String userName = "userName_example"; // String | Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application's user login.
ChangeOrderRequest request = new ChangeOrderRequest(); // ChangeOrderRequest | 
String ifMatch = "ifMatch_example"; // String | ETag value to identify the last known version of requested Order, to ensure that you are making a change on the lastest version of the order.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3 
Boolean testMode = false; // Boolean | If true, the operation will be not be sent to marketplace. But the validation will be taken in account.
try {
    apiInstance.changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#changeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **UUID**| The BeezUP Order identifier |
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
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
UUID beezUPOrderId = new UUID(); // UUID | The BeezUP Order identifier
try {
    apiInstance.clearMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#clearMerchantOrderInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **UUID**| The BeezUP Order identifier |

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

Get full Order and Order Item(s) properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
UUID beezUPOrderId = new UUID(); // UUID | The BeezUP Order identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag value to identify the last known version of requested Order\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3 
try {
    Order result = apiInstance.getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **UUID**| The BeezUP Order identifier |
 **ifNoneMatch** | **String**| ETag value to identify the last known version of requested Order\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  | [optional]

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

Get an Order&#39;s harvest and change history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
UUID beezUPOrderId = new UUID(); // UUID | The BeezUP Order identifier
try {
    OrderHistory result = apiInstance.getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **UUID**| The BeezUP Order identifier |

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

Send harvest request for a single Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
UUID beezUPOrderId = new UUID(); // UUID | The BeezUP Order identifier
try {
    apiInstance.harvestOrder(marketplaceTechnicalCode, accountId, beezUPOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#harvestOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **UUID**| The BeezUP Order identifier |

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
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String marketplaceTechnicalCode = "Amazon"; // String | The marketplace technical code
Integer accountId = 1001; // Integer | The account identifier
UUID beezUPOrderId = new UUID(); // UUID | The BeezUP Order identifier
SetMerchantOrderInfoRequest request = new SetMerchantOrderInfoRequest(); // SetMerchantOrderInfoRequest | 
try {
    apiInstance.setMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#setMerchantOrderInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| The marketplace technical code |
 **accountId** | **Integer**| The account identifier |
 **beezUPOrderId** | **UUID**| The BeezUP Order identifier |
 **request** | [**SetMerchantOrderInfoRequest**](SetMerchantOrderInfoRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

