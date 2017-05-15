# CustomerStoresApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStore**](CustomerStoresApi.md#createStore) | **POST** /user/customer/stores | Create a new store
[**deleteStore**](CustomerStoresApi.md#deleteStore) | **DELETE** /user/customer/stores/{storeId} | Delete a store
[**getStore**](CustomerStoresApi.md#getStore) | **GET** /user/customer/stores/{storeId} | Get store&#39;s information
[**getStores**](CustomerStoresApi.md#getStores) | **GET** /user/customer/stores | Get store list
[**updateStore**](CustomerStoresApi.md#updateStore) | **PATCH** /user/customer/stores/{storeId} | Update some store&#39;s information.


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
//import io.swagger.client.api.CustomerStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerStoresApi apiInstance = new CustomerStoresApi();
CreateStoreRequest request = new CreateStoreRequest(); // CreateStoreRequest | 
try {
    LinksGetStoresLink result = apiInstance.createStore(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerStoresApi#createStore");
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
//import io.swagger.client.api.CustomerStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerStoresApi apiInstance = new CustomerStoresApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.deleteStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerStoresApi#deleteStore");
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
//import io.swagger.client.api.CustomerStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerStoresApi apiInstance = new CustomerStoresApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreHeader result = apiInstance.getStore(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerStoresApi#getStore");
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
//import io.swagger.client.api.CustomerStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerStoresApi apiInstance = new CustomerStoresApi();
try {
    Stores result = apiInstance.getStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerStoresApi#getStores");
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
//import io.swagger.client.api.CustomerStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CustomerStoresApi apiInstance = new CustomerStoresApi();
String storeId = "storeId_example"; // String | Your store identifier
UpdateStoreRequest request = new UpdateStoreRequest(); // UpdateStoreRequest | 
try {
    apiInstance.updateStore(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerStoresApi#updateStore");
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

