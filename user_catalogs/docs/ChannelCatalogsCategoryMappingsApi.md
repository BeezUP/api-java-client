# ChannelCatalogsCategoryMappingsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannelCatalogCategories**](ChannelCatalogsCategoryMappingsApi.md#getChannelCatalogCategories) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings | Get channel catalog categories
[**mapChannelCatalogCategory**](ChannelCatalogsCategoryMappingsApi.md#mapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map | Map channel catalog category
[**unmapChannelCatalogCategory**](ChannelCatalogsCategoryMappingsApi.md#unmapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category


<a name="getChannelCatalogCategories"></a>
# **getChannelCatalogCategories**
> ChannelCatalogCategoryMappings getChannelCatalogCategories(channelCatalogId)

Get channel catalog categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsCategoryMappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsCategoryMappingsApi apiInstance = new ChannelCatalogsCategoryMappingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalogCategoryMappings result = apiInstance.getChannelCatalogCategories(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsCategoryMappingsApi#getChannelCatalogCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

[**ChannelCatalogCategoryMappings**](ChannelCatalogCategoryMappings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mapChannelCatalogCategory"></a>
# **mapChannelCatalogCategory**
> mapChannelCatalogCategory(channelCatalogId, request)

Map channel catalog category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsCategoryMappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsCategoryMappingsApi apiInstance = new ChannelCatalogsCategoryMappingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
MapCategoryRequest request = new MapCategoryRequest(); // MapCategoryRequest | 
try {
    apiInstance.mapChannelCatalogCategory(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsCategoryMappingsApi#mapChannelCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**MapCategoryRequest**](MapCategoryRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unmapChannelCatalogCategory"></a>
# **unmapChannelCatalogCategory**
> unmapChannelCatalogCategory(channelCatalogId, request)

Unmap channel catalog category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsCategoryMappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsCategoryMappingsApi apiInstance = new ChannelCatalogsCategoryMappingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
UnmapCategoryRequest request = new UnmapCategoryRequest(); // UnmapCategoryRequest | 
try {
    apiInstance.unmapChannelCatalogCategory(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsCategoryMappingsApi#unmapChannelCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**UnmapCategoryRequest**](UnmapCategoryRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

