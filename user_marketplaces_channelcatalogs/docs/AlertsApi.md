# AlertsApi

All URIs are relative to *https://api.beezup.com/v2/user/customer*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStoreAlerts**](AlertsApi.md#getStoreAlerts) | **GET** /stores/{storeId}/alerts | Get store&#39;s alerts
[**saveStoreAlert**](AlertsApi.md#saveStoreAlert) | **PUT** /stores/{storeId}/alerts/{alertId} | Save store alert


<a name="getStoreAlerts"></a>
# **getStoreAlerts**
> StoreAlerts getStoreAlerts(storeId)

Get store&#39;s alerts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreAlerts result = apiInstance.getStoreAlerts(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getStoreAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreAlerts**](StoreAlerts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveStoreAlert"></a>
# **saveStoreAlert**
> saveStoreAlert(storeId, alertId, request)

Save store alert

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer alertId = 56; // Integer | 
List<SaveStoreAlertRequest> request = Arrays.asList(new SaveStoreAlertRequest()); // List<SaveStoreAlertRequest> | 
try {
    apiInstance.saveStoreAlert(storeId, alertId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#saveStoreAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **alertId** | **Integer**|  |
 **request** | [**List&lt;SaveStoreAlertRequest&gt;**](SaveStoreAlertRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

