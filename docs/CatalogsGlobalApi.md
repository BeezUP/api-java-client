# CatalogsGlobalApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogGetBeezUPColumns**](CatalogsGlobalApi.md#catalogGetBeezUPColumns) | **GET** /user/catalogs/beezupColumns | Get the BeezUP columns


<a name="catalogGetBeezUPColumns"></a>
# **catalogGetBeezUPColumns**
> List&lt;BeezUPColumnConfiguration&gt; catalogGetBeezUPColumns()

Get the BeezUP columns

Get the BeezUP columns, this columns are used for mapping during the manual catalog importation process.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsGlobalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogsGlobalApi apiInstance = new CatalogsGlobalApi();
try {
    List<BeezUPColumnConfiguration> result = apiInstance.catalogGetBeezUPColumns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsGlobalApi#catalogGetBeezUPColumns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPColumnConfiguration&gt;**](BeezUPColumnConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

