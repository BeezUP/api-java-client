# ListApi

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/orders*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderListFull**](ListApi.md#getOrderListFull) | **POST** /list/full | Get a paginated list of all Orders with all Order and Order Item(s) properties
[**getOrderListLight**](ListApi.md#getOrderListLight) | **POST** /list/light | Get a paginated list of all Orders without details


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
//import io.swagger.client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size
OrderListRequest request = new OrderListRequest(); // OrderListRequest | 
try {
    OrderListFull result = apiInstance.getOrderListFull(acceptEncoding, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getOrderListFull");
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
//import io.swagger.client.api.ListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ListApi apiInstance = new ListApi();
OrderListRequest request = new OrderListRequest(); // OrderListRequest | 
try {
    OrderListLight result = apiInstance.getOrderListLight(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#getOrderListLight");
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

