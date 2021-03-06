# SharesApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteShare**](SharesApi.md#deleteShare) | **DELETE** /v2/user/customer/stores/{storeId}/shares/{userId} | Delete a share to another user
[**getShares**](SharesApi.md#getShares) | **GET** /v2/user/customer/stores/{storeId}/shares | Get shares related to this store
[**share**](SharesApi.md#share) | **POST** /v2/user/customer/stores/{storeId}/shares | Share a store to another user


<a name="deleteShare"></a>
# **deleteShare**
> deleteShare(storeId, userId)

Delete a share to another user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SharesApi apiInstance = new SharesApi();
String storeId = "storeId_example"; // String | Your store identifier
String userId = "userId_example"; // String | The friend user id
try {
    apiInstance.deleteShare(storeId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling SharesApi#deleteShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **userId** | **String**| The friend user id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShares"></a>
# **getShares**
> StoreShares getShares(storeId)

Get shares related to this store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SharesApi apiInstance = new SharesApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreShares result = apiInstance.getShares(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SharesApi#getShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreShares**](StoreShares.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="share"></a>
# **share**
> share(storeId, email)

Share a store to another user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SharesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SharesApi apiInstance = new SharesApi();
String storeId = "storeId_example"; // String | Your store identifier
FriendEmail email = new FriendEmail(); // FriendEmail | Your friend's email
try {
    apiInstance.share(storeId, email);
} catch (ApiException e) {
    System.err.println("Exception when calling SharesApi#share");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **email** | [**FriendEmail**](FriendEmail.md)| Your friend&#39;s email |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

