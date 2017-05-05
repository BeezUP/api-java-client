# InvoicesApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoices**](InvoicesApi.md#getInvoices) | **GET** /v2/user/customer/invoices | Get all your invoices


<a name="getInvoices"></a>
# **getInvoices**
> Invoices getInvoices()

Get all your invoices

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

InvoicesApi apiInstance = new InvoicesApi();
try {
    Invoices result = apiInstance.getInvoices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Invoices**](Invoices.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

