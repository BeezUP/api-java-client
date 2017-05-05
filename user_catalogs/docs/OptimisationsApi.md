# OptimisationsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**optimise**](OptimisationsApi.md#optimise) | **POST** /v2/user/analytics/{storeId}/optimisations/{actionName} | Optimise products
[**optimiseByCategory**](OptimisationsApi.md#optimiseByCategory) | **POST** /v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
[**optimiseByChannel**](OptimisationsApi.md#optimiseByChannel) | **POST** /v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
[**optimiseByProduct**](OptimisationsApi.md#optimiseByProduct) | **POST** /v2/user/analytics/{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products


<a name="optimise"></a>
# **optimise**
> optimise(storeId, actionName, request)

Optimise products

/!\\ WARNING /!\\ \\ Apply the operation on every product related to this request. \\ This operation is used at the bottom of the analytics page result. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OptimisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OptimisationsApi apiInstance = new OptimisationsApi();
String storeId = "storeId_example"; // String | Your store identifier
String actionName = "actionName_example"; // String | 
OptimiseRequest request = new OptimiseRequest(); // OptimiseRequest | 
try {
    apiInstance.optimise(storeId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OptimisationsApi#optimise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | [**OptimiseRequest**](OptimiseRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByCategory"></a>
# **optimiseByCategory**
> optimiseByCategory(storeId, catalogCategoryId, actionName, request)

Optimise products&#39;s category

/!\\ WARNING /!\\ \\ This operation will reenable or disable products&#39;s category for every channel indicated in the body.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OptimisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OptimisationsApi apiInstance = new OptimisationsApi();
String storeId = "storeId_example"; // String | Your store identifier
String catalogCategoryId = "catalogCategoryId_example"; // String | The category identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
List<String> request = Arrays.asList(new List<String>()); // List<String> | The channel identifier list concerned by this optimisation
try {
    apiInstance.optimiseByCategory(storeId, catalogCategoryId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OptimisationsApi#optimiseByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **catalogCategoryId** | **String**| The category identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | **List&lt;String&gt;**| The channel identifier list concerned by this optimisation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByChannel"></a>
# **optimiseByChannel**
> optimiseByChannel(storeId, channelId, actionName)

Optimise products&#39;s category

/!\\ WARNING /!\\ \\ Apply the operation on every product on this channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OptimisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OptimisationsApi apiInstance = new OptimisationsApi();
String storeId = "storeId_example"; // String | Your store identifier
String channelId = "channelId_example"; // String | The channel identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
try {
    apiInstance.optimiseByChannel(storeId, channelId, actionName);
} catch (ApiException e) {
    System.err.println("Exception when calling OptimisationsApi#optimiseByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **channelId** | **String**| The channel identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByProduct"></a>
# **optimiseByProduct**
> optimiseByProduct(storeId, productId, actionName, request)

Optimise products

/!\\ WARNING /!\\ \\ This operation will reenable or disable this product for every channel indicated in the body.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OptimisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OptimisationsApi apiInstance = new OptimisationsApi();
String storeId = "storeId_example"; // String | Your store identifier
String productId = "productId_example"; // String | The product identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
List<String> request = Arrays.asList(new List<String>()); // List<String> | The channel identifier list concerned by this optimisation
try {
    apiInstance.optimiseByProduct(storeId, productId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OptimisationsApi#optimiseByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **productId** | **String**| The product identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | **List&lt;String&gt;**| The channel identifier list concerned by this optimisation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

