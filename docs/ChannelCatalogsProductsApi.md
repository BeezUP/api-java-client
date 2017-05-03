# ChannelCatalogsProductsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannelCatalogProductInfo**](ChannelCatalogsProductsApi.md#getChannelCatalogProductInfo) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId} | Get channel catalog product information
[**getChannelCatalogProductInfoList**](ChannelCatalogsProductsApi.md#getChannelCatalogProductInfoList) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products | Get channel catalog product information list


<a name="getChannelCatalogProductInfo"></a>
# **getChannelCatalogProductInfo**
> ChannelCatalogProductInfo getChannelCatalogProductInfo(channelCatalogId, productId)

Get channel catalog product information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsProductsApi apiInstance = new ChannelCatalogsProductsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    ChannelCatalogProductInfo result = apiInstance.getChannelCatalogProductInfo(channelCatalogId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsProductsApi#getChannelCatalogProductInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |

### Return type

[**ChannelCatalogProductInfo**](ChannelCatalogProductInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogProductInfoList"></a>
# **getChannelCatalogProductInfoList**
> ChannelCatalogProductInfoList getChannelCatalogProductInfoList(channelCatalogId, request)

Get channel catalog product information list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsProductsApi apiInstance = new ChannelCatalogsProductsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
GetChannelCatalogProductInfoListRequest request = new GetChannelCatalogProductInfoListRequest(); // GetChannelCatalogProductInfoListRequest | The channel catalog product list filter
try {
    ChannelCatalogProductInfoList result = apiInstance.getChannelCatalogProductInfoList(channelCatalogId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsProductsApi#getChannelCatalogProductInfoList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**GetChannelCatalogProductInfoListRequest**](GetChannelCatalogProductInfoListRequest.md)| The channel catalog product list filter | [optional]

### Return type

[**ChannelCatalogProductInfoList**](ChannelCatalogProductInfoList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

