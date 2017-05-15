# MarketplacesChannelCatalogsSettingsApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannelCatalogMarketplaceProperties**](MarketplacesChannelCatalogsSettingsApi.md#getChannelCatalogMarketplaceProperties) | **GET** /user/marketplaces/channelcatalogs/{channelCatalogId}/properties | Get the marketplace properties for a channel catalog
[**getChannelCatalogMarketplaceSettings**](MarketplacesChannelCatalogsSettingsApi.md#getChannelCatalogMarketplaceSettings) | **GET** /user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Get the marketplace settings for a channel catalog
[**setChannelCatalogMarketplaceSettings**](MarketplacesChannelCatalogsSettingsApi.md#setChannelCatalogMarketplaceSettings) | **POST** /user/marketplaces/channelcatalogs/{channelCatalogId}/settings | Save new marketplace settings for a channel catalog


<a name="getChannelCatalogMarketplaceProperties"></a>
# **getChannelCatalogMarketplaceProperties**
> ChannelCatalogMarketplaceProperties getChannelCatalogMarketplaceProperties(channelCatalogId)

Get the marketplace properties for a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesChannelCatalogsSettingsApi apiInstance = new MarketplacesChannelCatalogsSettingsApi();
String channelCatalogId = "channelCatalogId_example"; // String | 
try {
    ChannelCatalogMarketplaceProperties result = apiInstance.getChannelCatalogMarketplaceProperties(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesChannelCatalogsSettingsApi#getChannelCatalogMarketplaceProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**|  |

### Return type

[**ChannelCatalogMarketplaceProperties**](ChannelCatalogMarketplaceProperties.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogMarketplaceSettings"></a>
# **getChannelCatalogMarketplaceSettings**
> ChannelCatalogMarketplaceSettings getChannelCatalogMarketplaceSettings(channelCatalogId)

Get the marketplace settings for a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesChannelCatalogsSettingsApi apiInstance = new MarketplacesChannelCatalogsSettingsApi();
String channelCatalogId = "channelCatalogId_example"; // String | Channel Catalog Id to query (required)
try {
    ChannelCatalogMarketplaceSettings result = apiInstance.getChannelCatalogMarketplaceSettings(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesChannelCatalogsSettingsApi#getChannelCatalogMarketplaceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| Channel Catalog Id to query (required) |

### Return type

[**ChannelCatalogMarketplaceSettings**](ChannelCatalogMarketplaceSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setChannelCatalogMarketplaceSettings"></a>
# **setChannelCatalogMarketplaceSettings**
> setChannelCatalogMarketplaceSettings(channelCatalogId, model)

Save new marketplace settings for a channel catalog

Allow you to configure your marketplace settings.  Partial update accepted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesChannelCatalogsSettingsApi apiInstance = new MarketplacesChannelCatalogsSettingsApi();
String channelCatalogId = "channelCatalogId_example"; // String | Channel Catalog Id to query
SetChannelCatalogMarketplaceSettingsRequest model = new SetChannelCatalogMarketplaceSettingsRequest(); // SetChannelCatalogMarketplaceSettingsRequest | Settings to save
try {
    apiInstance.setChannelCatalogMarketplaceSettings(channelCatalogId, model);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesChannelCatalogsSettingsApi#setChannelCatalogMarketplaceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| Channel Catalog Id to query |
 **model** | [**SetChannelCatalogMarketplaceSettingsRequest**](SetChannelCatalogMarketplaceSettingsRequest.md)| Settings to save |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

