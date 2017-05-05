# MarketplacesChannelCatalogsGlobalApi

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/channelcatalogs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketplaceAccountStores**](MarketplacesChannelCatalogsGlobalApi.md#getMarketplaceAccountStores) | **GET** / | Get  you marketplace channel catalog list


<a name="getMarketplaceAccountStores"></a>
# **getMarketplaceAccountStores**
> MarketplaceChannelCatalogList getMarketplaceAccountStores()

Get  you marketplace channel catalog list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesChannelCatalogsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesChannelCatalogsGlobalApi apiInstance = new MarketplacesChannelCatalogsGlobalApi();
try {
    MarketplaceChannelCatalogList result = apiInstance.getMarketplaceAccountStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesChannelCatalogsGlobalApi#getMarketplaceAccountStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MarketplaceChannelCatalogList**](MarketplaceChannelCatalogList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

