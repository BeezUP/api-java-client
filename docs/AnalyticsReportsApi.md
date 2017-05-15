# AnalyticsReportsApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteReportFilter**](AnalyticsReportsApi.md#deleteReportFilter) | **DELETE** /user/analytics/{storeId}/reports/filters/{reportFilterId} | Delete the report filter
[**exportStoreReportByCategory**](AnalyticsReportsApi.md#exportStoreReportByCategory) | **POST** /user/analytics/{storeId}/reports/bycategory/export | Export the report by category
[**exportStoreReportByChannel**](AnalyticsReportsApi.md#exportStoreReportByChannel) | **POST** /user/analytics/{storeId}/reports/bychannel/export | Export the report by channel
[**exportStoreReportByProduct**](AnalyticsReportsApi.md#exportStoreReportByProduct) | **POST** /user/analytics/{storeId}/reports/byproduct/export | Export the report by product
[**getReportFilter**](AnalyticsReportsApi.md#getReportFilter) | **GET** /user/analytics/{storeId}/reports/filters/{reportFilterId} | Get the report filter description
[**getReportFilters**](AnalyticsReportsApi.md#getReportFilters) | **GET** /user/analytics/{storeId}/reports/filters | Get report filter list for the given store
[**getStoreReportByCategory**](AnalyticsReportsApi.md#getStoreReportByCategory) | **POST** /user/analytics/{storeId}/reports/bycategory | Get the report by category
[**getStoreReportByChannel**](AnalyticsReportsApi.md#getStoreReportByChannel) | **POST** /user/analytics/{storeId}/reports/bychannel | Get the report by channel
[**getStoreReportByDay**](AnalyticsReportsApi.md#getStoreReportByDay) | **POST** /user/analytics/{storeId}/reports/byday | Get the report by day
[**getStoreReportByDayExport**](AnalyticsReportsApi.md#getStoreReportByDayExport) | **POST** /user/analytics/{storeId}/reports/byday/export | Get the report by day
[**getStoreReportByProduct**](AnalyticsReportsApi.md#getStoreReportByProduct) | **POST** /user/analytics/{storeId}/reports/byproduct | Get the report by product
[**saveReportFilter**](AnalyticsReportsApi.md#saveReportFilter) | **PUT** /user/analytics/{storeId}/reports/filters/{reportFilterId} | Save the report filter


<a name="deleteReportFilter"></a>
# **deleteReportFilter**
> deleteReportFilter(storeId, reportFilterId)

Delete the report filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
try {
    apiInstance.deleteReportFilter(storeId, reportFilterId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#deleteReportFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **reportFilterId** | **String**| Your report filter identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByCategory"></a>
# **exportStoreReportByCategory**
> BeezUPCommonLink3 exportStoreReportByCategory(storeId, format, request)

Export the report by category

Export the report by category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByCategoryRequest request = new ReportByCategoryRequest(); // ReportByCategoryRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.exportStoreReportByCategory(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#exportStoreReportByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByCategoryRequest**](ReportByCategoryRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByChannel"></a>
# **exportStoreReportByChannel**
> BeezUPCommonLink3 exportStoreReportByChannel(storeId, format, request)

Export the report by channel

Export the report by channel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByChannelRequest request = new ReportByChannelRequest(); // ReportByChannelRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.exportStoreReportByChannel(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#exportStoreReportByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByChannelRequest**](ReportByChannelRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByProduct"></a>
# **exportStoreReportByProduct**
> BeezUPCommonLink3 exportStoreReportByProduct(storeId, format, request)

Export the report by product

Export the report by product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByProductRequest request = new ReportByProductRequest(); // ReportByProductRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.exportStoreReportByProduct(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#exportStoreReportByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByProductRequest**](ReportByProductRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportFilter"></a>
# **getReportFilter**
> ReportFilter getReportFilter(storeId, reportFilterId)

Get the report filter description

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
try {
    ReportFilter result = apiInstance.getReportFilter(storeId, reportFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getReportFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **reportFilterId** | **String**| Your report filter identifier |

### Return type

[**ReportFilter**](ReportFilter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportFilters"></a>
# **getReportFilters**
> ReportFilters getReportFilters(storeId)

Get report filter list for the given store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    ReportFilters result = apiInstance.getReportFilters(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getReportFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**ReportFilters**](ReportFilters.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByCategory"></a>
# **getStoreReportByCategory**
> ReportByCategoryResponse getStoreReportByCategory(storeId, request)

Get the report by category

Get the report by category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByCategoryRequest request = new ReportByCategoryRequest(); // ReportByCategoryRequest | 
try {
    ReportByCategoryResponse result = apiInstance.getStoreReportByCategory(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getStoreReportByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByCategoryRequest**](ReportByCategoryRequest.md)|  |

### Return type

[**ReportByCategoryResponse**](ReportByCategoryResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByChannel"></a>
# **getStoreReportByChannel**
> ReportByChannelResponse getStoreReportByChannel(storeId, request)

Get the report by channel

Get the report by channel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByChannelRequest request = new ReportByChannelRequest(); // ReportByChannelRequest | 
try {
    ReportByChannelResponse result = apiInstance.getStoreReportByChannel(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getStoreReportByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByChannelRequest**](ReportByChannelRequest.md)|  |

### Return type

[**ReportByChannelResponse**](ReportByChannelResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByDay"></a>
# **getStoreReportByDay**
> ReportByDayResponse getStoreReportByDay(storeId, request)

Get the report by day

Get the report by day

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByDayRequest request = new ReportByDayRequest(); // ReportByDayRequest | 
try {
    ReportByDayResponse result = apiInstance.getStoreReportByDay(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getStoreReportByDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByDayRequest**](ReportByDayRequest.md)|  |

### Return type

[**ReportByDayResponse**](ReportByDayResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByDayExport"></a>
# **getStoreReportByDayExport**
> BeezUPCommonLink3 getStoreReportByDayExport(storeId, format, request)

Get the report by day

Get the report by day

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByDayRequest request = new ReportByDayRequest(); // ReportByDayRequest | 
try {
    BeezUPCommonLink3 result = apiInstance.getStoreReportByDayExport(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getStoreReportByDayExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **format** | **String**|  | [enum: xlsx, csv]
 **request** | [**ReportByDayRequest**](ReportByDayRequest.md)|  |

### Return type

[**BeezUPCommonLink3**](BeezUPCommonLink3.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreReportByProduct"></a>
# **getStoreReportByProduct**
> ReportByProductResponse getStoreReportByProduct(storeId, request)

Get the report by product

Get the report by product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByProductRequest request = new ReportByProductRequest(); // ReportByProductRequest | 
try {
    ReportByProductResponse result = apiInstance.getStoreReportByProduct(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#getStoreReportByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ReportByProductRequest**](ReportByProductRequest.md)|  |

### Return type

[**ReportByProductResponse**](ReportByProductResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveReportFilter"></a>
# **saveReportFilter**
> saveReportFilter(storeId, reportFilterId, reportFilter)

Save the report filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsReportsApi apiInstance = new AnalyticsReportsApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
SaveReportFilterRequest reportFilter = new SaveReportFilterRequest(); // SaveReportFilterRequest | 
try {
    apiInstance.saveReportFilter(storeId, reportFilterId, reportFilter);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsReportsApi#saveReportFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **reportFilterId** | **String**| Your report filter identifier |
 **reportFilter** | [**SaveReportFilterRequest**](SaveReportFilterRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

