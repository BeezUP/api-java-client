# ExportsApi

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/orders*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportOrders**](ExportsApi.md#exportOrders) | **POST** /exportations | Request a new Order report exportation to be generated
[**getOrderExportations**](ExportsApi.md#getOrderExportations) | **GET** /exportations | Get a paginated list of Order report exportations


<a name="exportOrders"></a>
# **exportOrders**
> exportOrders(format, request)

Request a new Order report exportation to be generated

A new file will be generated containing a summary of all the Orders matching the requested filter settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportsApi apiInstance = new ExportsApi();
String format = "csv"; // String | The type of the file to export
ExportOrderListRequest request = new ExportOrderListRequest(); // ExportOrderListRequest | 
try {
    apiInstance.exportOrders(format, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportsApi#exportOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| The type of the file to export | [default to csv] [enum: csv]
 **request** | [**ExportOrderListRequest**](ExportOrderListRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderExportations"></a>
# **getOrderExportations**
> OrderExportations getOrderExportations(pageNumber, pageSize, storeId)

Get a paginated list of Order report exportations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExportsApi apiInstance = new ExportsApi();
Integer pageNumber = 1; // Integer | The page number you want to get
Integer pageSize = 25; // Integer | The count of Order report exportations you want to get
String storeId = "storeId_example"; // String | The store identifier to regroup the order exportations
try {
    OrderExportations result = apiInstance.getOrderExportations(pageNumber, pageSize, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportsApi#getOrderExportations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number you want to get |
 **pageSize** | **Integer**| The count of Order report exportations you want to get |
 **storeId** | **String**| The store identifier to regroup the order exportations |

### Return type

[**OrderExportations**](OrderExportations.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

