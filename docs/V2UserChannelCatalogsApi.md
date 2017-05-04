# V2UserChannelCatalogsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureChannelCatalogCostSettings**](V2UserChannelCatalogsApi.md#configureChannelCatalogCostSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/cost | Disable a channel catalog
[**configureChannelCatalogExclusionFilters**](V2UserChannelCatalogsApi.md#configureChannelCatalogExclusionFilters) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
[**configureChannelCatalogGeneralSettings**](V2UserChannelCatalogsApi.md#configureChannelCatalogGeneralSettings) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/settings/general | Disable a channel catalog
[**createChannelCatalog**](V2UserChannelCatalogsApi.md#createChannelCatalog) | **POST** /v2/user/channelCatalogs/ | Create a new channel catalog
[**deleteChannelCatalog**](V2UserChannelCatalogsApi.md#deleteChannelCatalog) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId} | Delete the channel catalog
[**deleteChannelCatalogProductValueOverride**](V2UserChannelCatalogsApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
[**disableChannelCatalog**](V2UserChannelCatalogsApi.md#disableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/disable | Disable a channel catalog
[**disableChannelCatalogProduct**](V2UserChannelCatalogsApi.md#disableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/disable | Disable channel catalog product
[**enableChannelCatalog**](V2UserChannelCatalogsApi.md#enableChannelCatalog) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/enable | Enable a channel catalog
[**getChannelCatalog**](V2UserChannelCatalogsApi.md#getChannelCatalog) | **GET** /v2/user/channelCatalogs/{channelCatalogId} | Get the channel catalog information
[**getChannelCatalogCategories**](V2UserChannelCatalogsApi.md#getChannelCatalogCategories) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings | Get channel catalog categories
[**getChannelCatalogExclusionFilterOperators**](V2UserChannelCatalogsApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /v2/user/channelCatalogs/exclusionFilterOperators | Get channel catalog exclusion filter operators
[**getChannelCatalogProductInfo**](V2UserChannelCatalogsApi.md#getChannelCatalogProductInfo) | **GET** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId} | Get channel catalog product information
[**getChannelCatalogProductInfoList**](V2UserChannelCatalogsApi.md#getChannelCatalogProductInfoList) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products | Get channel catalog product information list
[**getChannelCatalogs**](V2UserChannelCatalogsApi.md#getChannelCatalogs) | **GET** /v2/user/channelCatalogs/ | List all your current channel catalogs
[**mapChannelCatalogCategory**](V2UserChannelCatalogsApi.md#mapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map | Map channel catalog category
[**mapChannelCatalogColumns**](V2UserChannelCatalogsApi.md#mapChannelCatalogColumns) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/columnMappings | Configure channel catalog column mappings
[**overrideChannelCatalogProductOverrides**](V2UserChannelCatalogsApi.md#overrideChannelCatalogProductOverrides) | **PUT** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values
[**reenableChannelCatalogProduct**](V2UserChannelCatalogsApi.md#reenableChannelCatalogProduct) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/reenable | Reenable channel catalog product
[**unmapChannelCatalogCategory**](V2UserChannelCatalogsApi.md#unmapChannelCatalogCategory) | **POST** /v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category


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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
CostSettings request = new CostSettings(); // CostSettings | 
try {
    apiInstance.configureChannelCatalogCostSettings(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#configureChannelCatalogCostSettings");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
ExclusionFilters request = new ExclusionFilters(); // ExclusionFilters | 
try {
    apiInstance.configureChannelCatalogExclusionFilters(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#configureChannelCatalogExclusionFilters");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
GeneralSettings request = new GeneralSettings(); // GeneralSettings | 
try {
    apiInstance.configureChannelCatalogGeneralSettings(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#configureChannelCatalogGeneralSettings");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
CreateChannelCatalogRequest request = new CreateChannelCatalogRequest(); // CreateChannelCatalogRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.createChannelCatalog(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#createChannelCatalog");
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
> deleteChannelCatalog()

Delete the channel catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
try {
    apiInstance.deleteChannelCatalog();
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#deleteChannelCatalog");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
String channelColumnId = "8a76f06a-fefc-4c0d-bcfe-b210f1482977"; // String | The channel column identifier
try {
    apiInstance.deleteChannelCatalogProductValueOverride(channelCatalogId, productId, channelColumnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#deleteChannelCatalogProductValueOverride");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.disableChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#disableChannelCatalog");
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

<a name="disableChannelCatalogProduct"></a>
# **disableChannelCatalogProduct**
> disableChannelCatalogProduct(channelCatalogId, productId)

Disable channel catalog product

By default a all your catalog products are exposed to the channel. You can disable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    apiInstance.disableChannelCatalogProduct(channelCatalogId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#disableChannelCatalogProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |

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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    apiInstance.enableChannelCatalog(channelCatalogId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#enableChannelCatalog");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalog result = apiInstance.getChannelCatalog(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#getChannelCatalog");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
try {
    ChannelCatalogCategoryMappings result = apiInstance.getChannelCatalogCategories(channelCatalogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#getChannelCatalogCategories");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
try {
    List<ExclusionFilterOperator> result = apiInstance.getChannelCatalogExclusionFilterOperators();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#getChannelCatalogExclusionFilterOperators");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    ChannelCatalogProductInfo result = apiInstance.getChannelCatalogProductInfo(channelCatalogId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#getChannelCatalogProductInfo");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
GetChannelCatalogProductInfoListRequest request = new GetChannelCatalogProductInfoListRequest(); // GetChannelCatalogProductInfoListRequest | The channel catalog product list filter
try {
    ChannelCatalogProductInfoList result = apiInstance.getChannelCatalogProductInfoList(channelCatalogId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#getChannelCatalogProductInfoList");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String storeId = "04730364-9826-4ff3-92e4-51fccd02bf10"; // String | The store identifier
try {
    ChannelCatalogList result = apiInstance.getChannelCatalogs(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#getChannelCatalogs");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
MapCategoryRequest request = new MapCategoryRequest(); // MapCategoryRequest | 
try {
    apiInstance.mapChannelCatalogCategory(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#mapChannelCatalogCategory");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
ColumnMappingList request = new ColumnMappingList(); // ColumnMappingList | 
try {
    apiInstance.mapChannelCatalogColumns(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#mapChannelCatalogColumns");
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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
ProductOverrides request = new ProductOverrides(); // ProductOverrides | 
try {
    apiInstance.overrideChannelCatalogProductOverrides(channelCatalogId, productId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#overrideChannelCatalogProductOverrides");
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

<a name="reenableChannelCatalogProduct"></a>
# **reenableChannelCatalogProduct**
> reenableChannelCatalogProduct(channelCatalogId, productId)

Reenable channel catalog product

By default a all your catalog products are exposed to the channel. You can reenable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
String productId = "578419df-1bbf-41a6-96fa-862e42182b67"; // String | The product identifier
try {
    apiInstance.reenableChannelCatalogProduct(channelCatalogId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#reenableChannelCatalogProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelCatalogId** | **String**| The channel catalog identifier |
 **productId** | **String**| The product identifier |

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
//import io.swagger.client.api.V2UserChannelCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserChannelCatalogsApi apiInstance = new V2UserChannelCatalogsApi();
String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
UnmapCategoryRequest request = new UnmapCategoryRequest(); // UnmapCategoryRequest | 
try {
    apiInstance.unmapChannelCatalogCategory(channelCatalogId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserChannelCatalogsApi#unmapChannelCatalogCategory");
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

