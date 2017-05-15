# ChannelCatalogsExclusionFiltersApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureChannelCatalogExclusionFilters**](ChannelCatalogsExclusionFiltersApi.md#configureChannelCatalogExclusionFilters) | **PUT** /user/channelCatalogs/{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
[**getChannelCatalogExclusionFilterOperators**](ChannelCatalogsExclusionFiltersApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /user/channelCatalogs/exclusionFilterOperators | Get channel catalog exclusion filter operators


<a name="configureChannelCatalogExclusionFilters"></a>
# **configureChannelCatalogExclusionFilters**
> configureChannelCatalogExclusionFilters(channelCatalogId, request)

Configure channel catalog exclusion filters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsExclusionFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsExclusionFiltersApi apiInstance = new ChannelCatalogsExclusionFiltersApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
ExclusionFilters request = new ExclusionFilters(); // ExclusionFilters | 
try {
    apiInstance.configureChannelCatalogExclusionFilters(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsExclusionFiltersApi#configureChannelCatalogExclusionFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**ExclusionFilters**](ExclusionFilters.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogExclusionFilterOperators"></a>
# **getChannelCatalogExclusionFilterOperators**
> List&lt;ExclusionFilterOperator&gt; getChannelCatalogExclusionFilterOperators()

Get channel catalog exclusion filter operators

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsExclusionFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsExclusionFiltersApi apiInstance = new ChannelCatalogsExclusionFiltersApi();
try {
    List<ExclusionFilterOperator> result = apiInstance.getChannelCatalogExclusionFilterOperators();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsExclusionFiltersApi#getChannelCatalogExclusionFilterOperators");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ExclusionFilterOperator&gt;**](ExclusionFilterOperator.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

