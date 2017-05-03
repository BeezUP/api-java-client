# FriendsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFriendInfo**](FriendsApi.md#getFriendInfo) | **GET** /v2/user/customer/friends/{userId} | Get friend information


<a name="getFriendInfo"></a>
# **getFriendInfo**
> UserFriendInfo getFriendInfo(userId)

Get friend information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FriendsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

FriendsApi apiInstance = new FriendsApi();
String userId = "userId_example"; // String | Your friend user id
try {
    UserFriendInfo result = apiInstance.getFriendInfo(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FriendsApi#getFriendInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Your friend user id |

### Return type

[**UserFriendInfo**](UserFriendInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

