# CustomerRightsApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRights**](CustomerRightsApi.md#getRights) | **POST** /user/customer/stores/{storeId}/rights | Get store&#39;s rights


<a name="getRights"></a>
# **getRights**
> List&lt;FunctionalityRightInfo&gt; getRights(storeId, functionalityCodeList)

Get store&#39;s rights

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomerRightsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerRightsApi apiInstance = new CustomerRightsApi();
String storeId = "storeId_example"; // String | Your store identifier
List<String> functionalityCodeList = Arrays.asList(new List<String>()); // List<String> | The functionality code list you want to check
try {
    List<FunctionalityRightInfo> result = apiInstance.getRights(storeId, functionalityCodeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerRightsApi#getRights");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **functionalityCodeList** | **List&lt;String&gt;**| The functionality code list you want to check |

### Return type

[**List&lt;FunctionalityRightInfo&gt;**](FunctionalityRightInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

