# GroupsApi

All URIs are relative to *https://api.beezup.com/v2/user/lov*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListGroup**](GroupsApi.md#getUserListGroup) | **GET** /groups/{listGroupName} | Get list of values related to this group name
[**getUserListGroupNames**](GroupsApi.md#getUserListGroupNames) | **GET** /groups | Get list of group of list name


<a name="getUserListGroup"></a>
# **getUserListGroup**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListGroup(listGroupName)

Get list of values related to this group name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GroupsApi apiInstance = new GroupsApi();
String listGroupName = "listGroupName_example"; // String | The list group name your want to get
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListGroup(listGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getUserListGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listGroupName** | **String**| The list group name your want to get |

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListGroupNames"></a>
# **getUserListGroupNames**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListGroupNames()

Get list of group of list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GroupsApi apiInstance = new GroupsApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListGroupNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getUserListGroupNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

