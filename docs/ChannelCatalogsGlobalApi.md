# ChannelCatalogsGlobalApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChannelCatalog**](ChannelCatalogsGlobalApi.md#createChannelCatalog) | **POST** /user/channelCatalogs/ | Create a new channel catalog
[**deleteChannelCatalog**](ChannelCatalogsGlobalApi.md#deleteChannelCatalog) | **DELETE** /user/channelCatalogs/{channelCatalogId} | Delete the channel catalog
[**getChannelCatalog**](ChannelCatalogsGlobalApi.md#getChannelCatalog) | **GET** /user/channelCatalogs/{channelCatalogId} | Get the channel catalog information
[**getChannelCatalogs**](ChannelCatalogsGlobalApi.md#getChannelCatalogs) | **GET** /user/channelCatalogs/ | List all your current channel catalogs


<a name="createChannelCatalog"></a>
# **createChannelCatalog**
> List&lt;BeezUPCommonLink2&gt; createChannelCatalog(request)

Create a new channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsGlobalApi apiInstance = new ChannelCatalogsGlobalApi();
CreateChannelCatalogRequest request = new CreateChannelCatalogRequest(); // CreateChannelCatalogRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.createChannelCatalog(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsGlobalApi#createChannelCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateChannelCatalogRequest**](CreateChannelCatalogRequest.md)|  |

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChannelCatalog"></a>
# **deleteChannelCatalog**
> deleteChannelCatalog(channelCatalogId)

Delete the channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsGlobalApi apiInstance = new ChannelCatalogsGlobalApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.deleteChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsGlobalApi#deleteChannelCatalog");
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

<a name="getChannelCatalog"></a>
# **getChannelCatalog**
> ChannelCatalog getChannelCatalog(channelCatalogId)

Get the channel catalog information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsGlobalApi apiInstance = new ChannelCatalogsGlobalApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalog result = apiInstance.getChannelCatalog(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsGlobalApi#getChannelCatalog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |

### Return type

[**ChannelCatalog**](ChannelCatalog.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelCatalogs"></a>
# **getChannelCatalogs**
> ChannelCatalogList getChannelCatalogs(storeId)

List all your current channel catalogs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelCatalogsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelCatalogsGlobalApi apiInstance = new ChannelCatalogsGlobalApi();
String storeId = "04730364-9826-4ff3-92e4-51fccd02bf10"; // String | The store identifier
try {
    ChannelCatalogList result = apiInstance.getChannelCatalogs(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelCatalogsGlobalApi#getChannelCatalogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| The store identifier | [optional]

### Return type

[**ChannelCatalogList**](ChannelCatalogList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

