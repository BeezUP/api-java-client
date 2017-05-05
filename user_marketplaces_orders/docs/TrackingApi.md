# TrackingApi

All URIs are relative to *https://api.beezup.com/v2/user/analytics*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStoreTrackedClicks**](TrackingApi.md#getStoreTrackedClicks) | **GET** /{storeId}/tracking/clicks | Get the latest clicks tracked
[**getStoreTrackedExternalOrders**](TrackingApi.md#getStoreTrackedExternalOrders) | **GET** /{storeId}/tracking/externalorders | Get the latest external orders tracked
[**getStoreTrackedOrders**](TrackingApi.md#getStoreTrackedOrders) | **GET** /{storeId}/tracking/orders | Get the latest orders tracked
[**getStoreTrackingStatus**](TrackingApi.md#getStoreTrackingStatus) | **GET** /{storeId}/tracking/status | Get store tracking synchronization status
[**getTrackingStatus**](TrackingApi.md#getTrackingStatus) | **GET** /tracking/status | Display the synchronization status of the clicks and orders


<a name="getStoreTrackedClicks"></a>
# **getStoreTrackedClicks**
> TrackedClicks getStoreTrackedClicks(storeId, count)

Get the latest clicks tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The click's count you want to get
try {
    TrackedClicks result = apiInstance.getStoreTrackedClicks(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#getStoreTrackedClicks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The click&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedClicks**](TrackedClicks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedExternalOrders"></a>
# **getStoreTrackedExternalOrders**
> TrackedExternalOrders getStoreTrackedExternalOrders(storeId, count)

Get the latest external orders tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The external order's count you want to get
try {
    TrackedExternalOrders result = apiInstance.getStoreTrackedExternalOrders(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#getStoreTrackedExternalOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The external order&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedExternalOrders**](TrackedExternalOrders.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedOrders"></a>
# **getStoreTrackedOrders**
> TrackedOrders getStoreTrackedOrders(storeId, count)

Get the latest orders tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The order's count you want to get
try {
    TrackedOrders result = apiInstance.getStoreTrackedOrders(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#getStoreTrackedOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The order&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedOrders**](TrackedOrders.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackingStatus"></a>
# **getStoreTrackingStatus**
> StoreTrackingStatus getStoreTrackingStatus(storeId)

Get store tracking synchronization status

Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreTrackingStatus result = apiInstance.getStoreTrackingStatus(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#getStoreTrackingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreTrackingStatus**](StoreTrackingStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrackingStatus"></a>
# **getTrackingStatus**
> TrackingStatus getTrackingStatus()

Display the synchronization status of the clicks and orders

Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TrackingApi apiInstance = new TrackingApi();
try {
    TrackingStatus result = apiInstance.getTrackingStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackingApi#getTrackingStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrackingStatus**](TrackingStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

