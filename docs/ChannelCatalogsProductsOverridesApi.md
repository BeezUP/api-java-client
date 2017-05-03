# ChannelCatalogsProductsOverridesApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChannelCatalogProductValueOverride**](ChannelCatalogsProductsOverridesApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
[**overrideChannelCatalogProductOverrides**](ChannelCatalogsProductsOverridesApi.md#overrideChannelCatalogProductOverrides) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values


<a name="deleteChannelCatalogProductValueOverride"></a>
# **deleteChannelCatalogProductValueOverride**
> deleteChannelCatalogProductValueOverride(channelCatalogId, productId, channelColumnId)

Delete a specific channel catalog product value override

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsProductsOverridesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsProductsOverridesApi apiInstance = new ChannelCatalogsProductsOverridesApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
String channelColumnId = "8a76f06a-fefc-4c0d-bcfe-b210f1482977"; // String | The channel column identifier
try {
    apiInstance.deleteChannelCatalogProductValueOverride(channelCatalogId, productId, channelColumnId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsProductsOverridesApi#deleteChannelCatalogProductValueOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |
 **channelColumnId** | **String**| The channel column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="overrideChannelCatalogProductOverrides"></a>
# **overrideChannelCatalogProductOverrides**
> overrideChannelCatalogProductOverrides(channelCatalogId, productId, request)

Override channel catalog product values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsProductsOverridesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsProductsOverridesApi apiInstance = new ChannelCatalogsProductsOverridesApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
ProductOverrides request = new ProductOverrides(); // ProductOverrides | 
try {
    apiInstance.overrideChannelCatalogProductOverrides(channelCatalogId, productId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsProductsOverridesApi#overrideChannelCatalogProductOverrides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |
 **request** | [**ProductOverrides**](ProductOverrides.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

