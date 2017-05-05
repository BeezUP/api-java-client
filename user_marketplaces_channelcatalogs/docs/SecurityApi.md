# SecurityApi

All URIs are relative to *https://api.beezup.com/v2/user/customer*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logout**](SecurityApi.md#logout) | **POST** /security/logout | Log out the current user from go2


<a name="logout"></a>
# **logout**
> logout()

Log out the current user from go2

Log out the current user from go2

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SecurityApi apiInstance = new SecurityApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#logout");
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

