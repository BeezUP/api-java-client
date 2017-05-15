# ChannelCatalogsExportationsApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChannelCatalogExportationCache**](ChannelCatalogsExportationsApi.md#deleteChannelCatalogExportationCache) | **DELETE** /user/channelCatalogs/{channelCatalogId}/exportations/cache | Delete the exportation cache
[**getChannelCatalogExportationCacheInfo**](ChannelCatalogsExportationsApi.md#getChannelCatalogExportationCacheInfo) | **GET** /user/channelCatalogs/{channelCatalogId}/exportations/cache | Get the exportation cache information
[**getChannelCatalogExportationHistory**](ChannelCatalogsExportationsApi.md#getChannelCatalogExportationHistory) | **GET** /user/channelCatalogs/{channelCatalogId}/exportations/history | Get the exportation history


<a name="deleteChannelCatalogExportationCache"></a>
# **deleteChannelCatalogExportationCache**
> deleteChannelCatalogExportationCache(channelCatalogId)

Delete the exportation cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsExportationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsExportationsApi apiInstance = new ChannelCatalogsExportationsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.deleteChannelCatalogExportationCache(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsExportationsApi#deleteChannelCatalogExportationCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogExportationCacheInfo"></a>
# **getChannelCatalogExportationCacheInfo**
> ChannelCatalogExportCacheInfoResponse getChannelCatalogExportationCacheInfo(channelCatalogId)

Get the exportation cache information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsExportationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsExportationsApi apiInstance = new ChannelCatalogsExportationsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalogExportCacheInfoResponse result = apiInstance.getChannelCatalogExportationCacheInfo(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsExportationsApi#getChannelCatalogExportationCacheInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

[**ChannelCatalogExportCacheInfoResponse**](ChannelCatalogExportCacheInfoResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogExportationHistory"></a>
# **getChannelCatalogExportationHistory**
> ChannelCatalogExportationHistory getChannelCatalogExportationHistory(channelCatalogId, pageNumber, pageSize)

Get the exportation history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsExportationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsExportationsApi apiInstance = new ChannelCatalogsExportationsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
Integer pageNumber = 1; // Integer | The page number you want to get
Integer pageSize = 25; // Integer | The entry count you want to get
try {
    ChannelCatalogExportationHistory result = apiInstance.getChannelCatalogExportationHistory(channelCatalogId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsExportationsApi#getChannelCatalogExportationHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **pageNumber** | **Integer**| The page number you want to get |
 **pageSize** | **Integer**| The entry count you want to get |

### Return type

[**ChannelCatalogExportationHistory**](ChannelCatalogExportationHistory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

