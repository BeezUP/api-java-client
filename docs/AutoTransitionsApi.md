# AutoTransitionsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureAutomaticTransitions**](AutoTransitionsApi.md#configureAutomaticTransitions) | **POST** /v2/user/marketplaces/orders/automaticTransitions | Configure automatic order status transitions
[**getAutomaticTransitions**](AutoTransitionsApi.md#getAutomaticTransitions) | **GET** /v2/user/marketplaces/orders/automaticTransitions | Get automatic order status transition list


<a name="configureAutomaticTransitions"></a>
# **configureAutomaticTransitions**
> configureAutomaticTransitions(request)

Configure automatic order status transitions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoTransitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoTransitionsApi apiInstance = new AutoTransitionsApi();
SaveAutomaticTransitionRequest request = new SaveAutomaticTransitionRequest(); // SaveAutomaticTransitionRequest | 
try {
    apiInstance.configureAutomaticTransitions(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTransitionsApi#configureAutomaticTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveAutomaticTransitionRequest**](SaveAutomaticTransitionRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutomaticTransitions"></a>
# **getAutomaticTransitions**
> AutomaticTransitionInfos getAutomaticTransitions()

Get automatic order status transition list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoTransitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoTransitionsApi apiInstance = new AutoTransitionsApi();
try {
    AutomaticTransitionInfos result = apiInstance.getAutomaticTransitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTransitionsApi#getAutomaticTransitions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AutomaticTransitionInfos**](AutomaticTransitionInfos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

