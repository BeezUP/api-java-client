# MarketplacesChannelCatalogsPublicationsApi

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/channelcatalogs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPublications**](MarketplacesChannelCatalogsPublicationsApi.md#getPublications) | **GET** /publications/{marketplaceTechnicalCode}/{accountId}/history | Fetch the publication history for an account, sorted by descending start date


<a name="getPublications"></a>
# **getPublications**
> AccountPublications getPublications(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes)

Fetch the publication history for an account, sorted by descending start date

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketplacesChannelCatalogsPublicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MarketplacesChannelCatalogsPublicationsApi apiInstance = new MarketplacesChannelCatalogsPublicationsApi();
String marketplaceTechnicalCode = "marketplaceTechnicalCode_example"; // String | Marketplace Technical Code to query (required)
Integer accountId = 56; // Integer | Account Id to query (required)
String channelCatalogId = "channelCatalogId_example"; // String | Channel Catalog Id by which to filter (optional)
Integer count = 10; // Integer | Amount of entries to fetch (optional, default set to 10)
List<String> publicationTypes = Arrays.asList("publicationTypes_example"); // List<String> | Publication types by which to filter (optional)
try {
    AccountPublications result = apiInstance.getPublications(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketplacesChannelCatalogsPublicationsApi#getPublications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplaceTechnicalCode** | **String**| Marketplace Technical Code to query (required) |
 **accountId** | **Integer**| Account Id to query (required) |
 **channelCatalogId** | **String**| Channel Catalog Id by which to filter (optional) | [optional]
 **count** | **Integer**| Amount of entries to fetch (optional, default set to 10) | [optional] [default to 10]
 **publicationTypes** | [**List&lt;String&gt;**](String.md)| Publication types by which to filter (optional) | [optional] [enum: PublishProducts, PublishOffers, Unpublish]

### Return type

[**AccountPublications**](AccountPublications.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

