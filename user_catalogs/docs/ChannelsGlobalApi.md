# ChannelsGlobalApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannelCategories**](ChannelsGlobalApi.md#getChannelCategories) | **GET** /v2/user/channels/{channelId}/categories | Get channel categories
[**getChannelColumns**](ChannelsGlobalApi.md#getChannelColumns) | **POST** /v2/user/channels/{channelId}/columns | Get channel columns
[**getChannelInfo**](ChannelsGlobalApi.md#getChannelInfo) | **GET** /v2/user/channels/{channelId} | Get channel information
[**getCurrentChannels**](ChannelsGlobalApi.md#getCurrentChannels) | **GET** /v2/user/channels/ | List all available channel for this store


<a name="getChannelCategories"></a>
# **getChannelCategories**
> ChannelRootCategory getChannelCategories(channelId, acceptEncoding)

Get channel categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelsGlobalApi apiInstance = new ChannelsGlobalApi();
String channelId = "2dc136a7-0d3d-4cc9-a825-a28a42c53e28"; // String | The channel identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
try {
    ChannelRootCategory result = apiInstance.getChannelCategories(channelId, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsGlobalApi#getChannelCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel identifier |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts that the response will be compressed to reduce traffic size. |

### Return type

[**ChannelRootCategory**](ChannelRootCategory.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelColumns"></a>
# **getChannelColumns**
> List&lt;ChannelColumn&gt; getChannelColumns(channelId, acceptEncoding, request)

Get channel columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelsGlobalApi apiInstance = new ChannelsGlobalApi();
String channelId = "2dc136a7-0d3d-4cc9-a825-a28a42c53e28"; // String | The channel identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
List<BeezUPCommonChannelColumnId> request = Arrays.asList(new BeezUPCommonChannelColumnId()); // List<BeezUPCommonChannelColumnId> | Allow you to filter the channel column identifier list your want to get
try {
    List<ChannelColumn> result = apiInstance.getChannelColumns(channelId, acceptEncoding, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsGlobalApi#getChannelColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel identifier |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts that the response will be compressed to reduce traffic size. |
 **request** | [**List&lt;BeezUPCommonChannelColumnId&gt;**](BeezUPCommonChannelColumnId.md)| Allow you to filter the channel column identifier list your want to get | [optional]

### Return type

[**List&lt;ChannelColumn&gt;**](ChannelColumn.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelInfo"></a>
# **getChannelInfo**
> ChannelInfo getChannelInfo(channelId)

Get channel information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelsGlobalApi apiInstance = new ChannelsGlobalApi();
String channelId = "2dc136a7-0d3d-4cc9-a825-a28a42c53e28"; // String | The channel identifier
try {
    ChannelInfo result = apiInstance.getChannelInfo(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsGlobalApi#getChannelInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The channel identifier |

### Return type

[**ChannelInfo**](ChannelInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentChannels"></a>
# **getCurrentChannels**
> List&lt;ChannelHeader&gt; getCurrentChannels(storeId)

List all available channel for this store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChannelsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChannelsGlobalApi apiInstance = new ChannelsGlobalApi();
String storeId = "04730364-9826-4ff3-92e4-51fccd02bf10"; // String | The store identifier
try {
    List<ChannelHeader> result = apiInstance.getCurrentChannels(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsGlobalApi#getCurrentChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| The store identifier |

### Return type

[**List&lt;ChannelHeader&gt;**](ChannelHeader.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

