# ChannelCatalogsSettingsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureChannelCatalogCostSettings**](ChannelCatalogsSettingsApi.md#configureChannelCatalogCostSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/cost | Disable a channel catalog
[**configureChannelCatalogGeneralSettings**](ChannelCatalogsSettingsApi.md#configureChannelCatalogGeneralSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/general | Disable a channel catalog
[**disableChannelCatalog**](ChannelCatalogsSettingsApi.md#disableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/disable | Disable a channel catalog
[**enableChannelCatalog**](ChannelCatalogsSettingsApi.md#enableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/enable | Enable a channel catalog


<a name="configureChannelCatalogCostSettings"></a>
# **configureChannelCatalogCostSettings**
> configureChannelCatalogCostSettings(channelCatalogId, request)

Disable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsSettingsApi apiInstance = new ChannelCatalogsSettingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
CostSettings request = new CostSettings(); // CostSettings | 
try {
    apiInstance.configureChannelCatalogCostSettings(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsSettingsApi#configureChannelCatalogCostSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**CostSettings**](CostSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configureChannelCatalogGeneralSettings"></a>
# **configureChannelCatalogGeneralSettings**
> configureChannelCatalogGeneralSettings(channelCatalogId, request)

Disable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsSettingsApi apiInstance = new ChannelCatalogsSettingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
GeneralSettings request = new GeneralSettings(); // GeneralSettings | 
try {
    apiInstance.configureChannelCatalogGeneralSettings(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsSettingsApi#configureChannelCatalogGeneralSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **request** | [**GeneralSettings**](GeneralSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableChannelCatalog"></a>
# **disableChannelCatalog**
> disableChannelCatalog(channelCatalogId)

Disable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsSettingsApi apiInstance = new ChannelCatalogsSettingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.disableChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsSettingsApi#disableChannelCatalog");
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

<a name="enableChannelCatalog"></a>
# **enableChannelCatalog**
> enableChannelCatalog(channelCatalogId)

Enable a channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsSettingsApi apiInstance = new ChannelCatalogsSettingsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.enableChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsSettingsApi#enableChannelCatalog");
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

