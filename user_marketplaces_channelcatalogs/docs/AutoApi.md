# AutoApi

All URIs are relative to *https://api.beezup.com/v2/user/catalogs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autoConfigureAutoImportInterval**](AutoApi.md#autoConfigureAutoImportInterval) | **POST** /{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
[**autoDeleteAutoImport**](AutoApi.md#autoDeleteAutoImport) | **DELETE** /{storeId}/autoImport | Delete Auto Import
[**autoGetAutoImportConfiguration**](AutoApi.md#autoGetAutoImportConfiguration) | **GET** /{storeId}/autoImport | Get the auto import configuration
[**autoPauseAutoImport**](AutoApi.md#autoPauseAutoImport) | **POST** /{storeId}/autoImport/pause | Pause Auto Import
[**autoResumeAutoImport**](AutoApi.md#autoResumeAutoImport) | **POST** /{storeId}/autoImport/resume | Resume Auto Import
[**autoScheduleAutoImport**](AutoApi.md#autoScheduleAutoImport) | **POST** /{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
[**autoStartAutoImport**](AutoApi.md#autoStartAutoImport) | **POST** /{storeId}/autoImport/start | Start Auto Import Manually
[**importationActivateAutoImport**](AutoApi.md#importationActivateAutoImport) | **POST** /{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.


<a name="autoConfigureAutoImportInterval"></a>
# **autoConfigureAutoImportInterval**
> autoConfigureAutoImportInterval(storeId, request)

Configure Auto Import Interval

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
ConfigureAutoImportIntervalRequest request = new ConfigureAutoImportIntervalRequest(); // ConfigureAutoImportIntervalRequest | 
try {
    apiInstance.autoConfigureAutoImportInterval(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoConfigureAutoImportInterval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ConfigureAutoImportIntervalRequest**](ConfigureAutoImportIntervalRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoDeleteAutoImport"></a>
# **autoDeleteAutoImport**
> autoDeleteAutoImport(storeId)

Delete Auto Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoDeleteAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoDeleteAutoImport");
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

<a name="autoGetAutoImportConfiguration"></a>
# **autoGetAutoImportConfiguration**
> AutoImportConfiguration autoGetAutoImportConfiguration(storeId)

Get the auto import configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    AutoImportConfiguration result = apiInstance.autoGetAutoImportConfiguration(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoGetAutoImportConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**AutoImportConfiguration**](AutoImportConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoPauseAutoImport"></a>
# **autoPauseAutoImport**
> autoPauseAutoImport(storeId)

Pause Auto Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoPauseAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoPauseAutoImport");
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

<a name="autoResumeAutoImport"></a>
# **autoResumeAutoImport**
> autoResumeAutoImport(storeId)

Resume Auto Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoResumeAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoResumeAutoImport");
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

<a name="autoScheduleAutoImport"></a>
# **autoScheduleAutoImport**
> autoScheduleAutoImport(storeId, request)

Configure Auto Import Schedules

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
ScheduleAutoImportRequest request = new ScheduleAutoImportRequest(); // ScheduleAutoImportRequest | 
try {
    apiInstance.autoScheduleAutoImport(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoScheduleAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ScheduleAutoImportRequest**](ScheduleAutoImportRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoStartAutoImport"></a>
# **autoStartAutoImport**
> List&lt;BeezUPCommonLink2&gt; autoStartAutoImport(storeId)

Start Auto Import Manually

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    List<BeezUPCommonLink2> result = apiInstance.autoStartAutoImport(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#autoStartAutoImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationActivateAutoImport"></a>
# **importationActivateAutoImport**
> importationActivateAutoImport(storeId)

Activate the auto importation of the last successful manual catalog importation.

Once you have made your fist manual catalog importation with success, you can call this operation to import it automatically. No parameter required, we know which one it is.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AutoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutoApi apiInstance = new AutoApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.importationActivateAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoApi#importationActivateAutoImport");
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

