# GlobalApi

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/orders*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketplaceAccountsSynchronization**](GlobalApi.md#getMarketplaceAccountsSynchronization) | **GET** /status | Get current synchronization status between your marketplaces and BeezUP accounts
[**harvestAll**](GlobalApi.md#harvestAll) | **POST** /harvest | Send harvest request to all your marketplaces


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
//import io.swagger.client.api.GlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GlobalApi apiInstance = new GlobalApi();
try {
    AccountSynchronizations result = apiInstance.getMarketplaceAccountsSynchronization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalApi#getMarketplaceAccountsSynchronization");
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
//import io.swagger.client.api.GlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GlobalApi apiInstance = new GlobalApi();
try {
    apiInstance.harvestAll();
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalApi#harvestAll");
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

