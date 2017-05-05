# StoresApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStore**](StoresApi.md#createStore) | **POST** /v2/user/customer/stores | Create a new store
[**deleteStore**](StoresApi.md#deleteStore) | **DELETE** /v2/user/customer/stores/{storeId} | Delete a store
[**getStore**](StoresApi.md#getStore) | **GET** /v2/user/customer/stores/{storeId} | Get store&#39;s information
[**getStores**](StoresApi.md#getStores) | **GET** /v2/user/customer/stores | Get store list
[**updateStore**](StoresApi.md#updateStore) | **PATCH** /v2/user/customer/stores/{storeId} | Update some store&#39;s information.


<a name="createStore"></a>
# **createStore**
> LinksGetStoresLink createStore(request)

Create a new store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StoresApi apiInstance = new StoresApi();
CreateStoreRequest request = new CreateStoreRequest(); // CreateStoreRequest | 
try {
    LinksGetStoresLink result = apiInstance.createStore(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#createStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateStoreRequest**](CreateStoreRequest.md)|  |

### Return type

[**LinksGetStoresLink**](LinksGetStoresLink.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStore"></a>
# **deleteStore**
> deleteStore(storeId)

Delete a store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StoresApi apiInstance = new StoresApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.deleteStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#deleteStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStore"></a>
# **getStore**
> StoreHeader getStore(storeId)

Get store&#39;s information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StoresApi apiInstance = new StoresApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreHeader result = apiInstance.getStore(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreHeader**](StoreHeader.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStores"></a>
# **getStores**
> Stores getStores()

Get store list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StoresApi apiInstance = new StoresApi();
try {
    Stores result = apiInstance.getStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Stores**](Stores.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStore"></a>
# **updateStore**
> updateStore(storeId, request)

Update some store&#39;s information.

Update some store&#39;s information. FYI, you cannot change the country. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StoresApi apiInstance = new StoresApi();
String storeId = "storeId_example"; // String | Your store identifier
UpdateStoreRequest request = new UpdateStoreRequest(); // UpdateStoreRequest | 
try {
    apiInstance.updateStore(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#updateStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**UpdateStoreRequest**](UpdateStoreRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

