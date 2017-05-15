# ChannelCatalogsColumnMappingsApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mapChannelCatalogColumns**](ChannelCatalogsColumnMappingsApi.md#mapChannelCatalogColumns) | **PUT** /user/channelCatalogs/{channelCatalogId}/columnMappings | Configure channel catalog column mappings


<a name="mapChannelCatalogColumns"></a>
# **mapChannelCatalogColumns**
> mapChannelCatalogColumns(channelCatalogId, request)

Configure channel catalog column mappings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsColumnMappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsColumnMappingsApi apiInstance = new ChannelCatalogsColumnMappingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
ColumnMappingList request = new ColumnMappingList(); // ColumnMappingList | 
try {
    apiInstance.mapChannelCatalogColumns(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsColumnMappingsApi#mapChannelCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**ColumnMappingList**](ColumnMappingList.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

