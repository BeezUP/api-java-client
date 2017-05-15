# MarketplacesOrdersGlobalApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketplaceAccountsSynchronization**](MarketplacesOrdersGlobalApi.md#getMarketplaceAccountsSynchronization) | **GET** /user/marketplaces/orders/status | Get current synchronization status between your marketplaces and BeezUP accounts
[**getOrderIndex**](MarketplacesOrdersGlobalApi.md#getOrderIndex) | **GET** /user/marketplaces/orders/ | Get all actions you can do on the order API
[**harvestAll**](MarketplacesOrdersGlobalApi.md#harvestAll) | **POST** /user/marketplaces/orders/harvest | Send harvest request to all your marketplaces


<a name="getMarketplaceAccountsSynchronization"></a>
# **getMarketplaceAccountsSynchronization**
> AccountSynchronizations getMarketplaceAccountsSynchronization()

Get current synchronization status between your marketplaces and BeezUP accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesOrdersGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesOrdersGlobalApi apiInstance = new MarketplacesOrdersGlobalApi();
try {
    AccountSynchronizations result = apiInstance.getMarketplaceAccountsSynchronization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesOrdersGlobalApi#getMarketplaceAccountsSynchronization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSynchronizations**](AccountSynchronizations.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderIndex"></a>
# **getOrderIndex**
> OrderIndex getOrderIndex()

Get all actions you can do on the order API

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesOrdersGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesOrdersGlobalApi apiInstance = new MarketplacesOrdersGlobalApi();
try {
    OrderIndex result = apiInstance.getOrderIndex();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesOrdersGlobalApi#getOrderIndex");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderIndex**](OrderIndex.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="harvestAll"></a>
# **harvestAll**
> harvestAll()

Send harvest request to all your marketplaces

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesOrdersGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesOrdersGlobalApi apiInstance = new MarketplacesOrdersGlobalApi();
try {
    apiInstance.harvestAll();
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesOrdersGlobalApi#harvestAll");
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

