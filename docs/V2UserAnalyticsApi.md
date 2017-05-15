# V2UserAnalyticsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRule**](V2UserAnalyticsApi.md#createRule) | **POST** /v2/user/analytics/{storeId}/rules | Rule creation
[**deleteReportFilter**](V2UserAnalyticsApi.md#deleteReportFilter) | **DELETE** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Delete the report filter
[**deleteRule**](V2UserAnalyticsApi.md#deleteRule) | **DELETE** /v2/user/analytics/{storeId}/rules/{ruleId} | Delete Rule
[**disableRule**](V2UserAnalyticsApi.md#disableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/disable | Disable rule
[**enableRule**](V2UserAnalyticsApi.md#enableRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/enable | Enable rule
[**exportStoreReportByCategory**](V2UserAnalyticsApi.md#exportStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory/export | Export the report by category
[**exportStoreReportByChannel**](V2UserAnalyticsApi.md#exportStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel/export | Export the report by channel
[**exportStoreReportByProduct**](V2UserAnalyticsApi.md#exportStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct/export | Export the report by product
[**getReportFilter**](V2UserAnalyticsApi.md#getReportFilter) | **GET** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Get the report filter description
[**getReportFilters**](V2UserAnalyticsApi.md#getReportFilters) | **GET** /v2/user/analytics/{storeId}/reports/filters | Get report filter list for the given store
[**getRule**](V2UserAnalyticsApi.md#getRule) | **GET** /v2/user/analytics/{storeId}/rules/{ruleId} | Gets the rule
[**getRules**](V2UserAnalyticsApi.md#getRules) | **GET** /v2/user/analytics/{storeId}/rules | Gets the list of rules for a given store
[**getRulesExecutions**](V2UserAnalyticsApi.md#getRulesExecutions) | **GET** /v2/user/analytics/{storeId}/rules/executions | Get the rules execution history
[**getStoreReportByCategory**](V2UserAnalyticsApi.md#getStoreReportByCategory) | **POST** /v2/user/analytics/{storeId}/reports/bycategory | Get the report by category
[**getStoreReportByChannel**](V2UserAnalyticsApi.md#getStoreReportByChannel) | **POST** /v2/user/analytics/{storeId}/reports/bychannel | Get the report by channel
[**getStoreReportByDay**](V2UserAnalyticsApi.md#getStoreReportByDay) | **POST** /v2/user/analytics/{storeId}/reports/byday | Get the report by day
[**getStoreReportByDayExport**](V2UserAnalyticsApi.md#getStoreReportByDayExport) | **POST** /v2/user/analytics/{storeId}/reports/byday/export | Get the report by day
[**getStoreReportByProduct**](V2UserAnalyticsApi.md#getStoreReportByProduct) | **POST** /v2/user/analytics/{storeId}/reports/byproduct | Get the report by product
[**getStoreTrackedClicks**](V2UserAnalyticsApi.md#getStoreTrackedClicks) | **GET** /v2/user/analytics/{storeId}/tracking/clicks | Get the latest clicks tracked
[**getStoreTrackedExternalOrders**](V2UserAnalyticsApi.md#getStoreTrackedExternalOrders) | **GET** /v2/user/analytics/{storeId}/tracking/externalorders | Get the latest external orders tracked
[**getStoreTrackedOrders**](V2UserAnalyticsApi.md#getStoreTrackedOrders) | **GET** /v2/user/analytics/{storeId}/tracking/orders | Get the latest orders tracked
[**getStoreTrackingStatus**](V2UserAnalyticsApi.md#getStoreTrackingStatus) | **GET** /v2/user/analytics/{storeId}/tracking/status | Get store tracking synchronization status
[**getTrackingStatus**](V2UserAnalyticsApi.md#getTrackingStatus) | **GET** /v2/user/analytics/tracking/status | Display the synchronization status of the clicks and orders
[**moveDownRule**](V2UserAnalyticsApi.md#moveDownRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/movedown | Move the rule down
[**moveUpRule**](V2UserAnalyticsApi.md#moveUpRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/moveup | Move the rule up
[**optimise**](V2UserAnalyticsApi.md#optimise) | **POST** /v2/user/analytics/{storeId}/optimisations/{actionName} | Optimise products
[**optimiseByCategory**](V2UserAnalyticsApi.md#optimiseByCategory) | **POST** /v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName} | Optimise products&#39;s category
[**optimiseByChannel**](V2UserAnalyticsApi.md#optimiseByChannel) | **POST** /v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName} | Optimise products&#39;s category
[**optimiseByProduct**](V2UserAnalyticsApi.md#optimiseByProduct) | **POST** /v2/user/analytics/{storeId}/optimisations/byproduct/{productId}/{actionName} | Optimise products
[**runRule**](V2UserAnalyticsApi.md#runRule) | **POST** /v2/user/analytics/{storeId}/rules/{ruleId}/run | Run rule
[**runRules**](V2UserAnalyticsApi.md#runRules) | **POST** /v2/user/analytics/{storeId}/rules/run | Run all rules for this store
[**saveReportFilter**](V2UserAnalyticsApi.md#saveReportFilter) | **PUT** /v2/user/analytics/{storeId}/reports/filters/{reportFilterId} | Save the report filter
[**updateRule**](V2UserAnalyticsApi.md#updateRule) | **PATCH** /v2/user/analytics/{storeId}/rules/{ruleId} | Update Rule


<a name="createRule"></a>
# **createRule**
> createRule(storeId, request)

Rule creation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
CreateRuleRequest request = new CreateRuleRequest(); // CreateRuleRequest | 
try {
    apiInstance.createRule(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#createRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**CreateRuleRequest**](CreateRuleRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
try {
    apiInstance.deleteReportFilter(storeId, reportFilterId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#deleteReportFilter");
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

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(storeId, ruleId)

Delete Rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.deleteRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#deleteRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableRule"></a>
# **disableRule**
> disableRule(storeId, ruleId)

Disable rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.disableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#disableRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableRule"></a>
# **enableRule**
> enableRule(storeId, ruleId)

Enable rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.enableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#enableRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByCategory"></a>
# **exportStoreReportByCategory**
> List&lt;BeezUPCommonLink2&gt; exportStoreReportByCategory(storeId, format, request)

Export the report by category

Export the report by category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByCategoryRequest request = new ReportByCategoryRequest(); // ReportByCategoryRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.exportStoreReportByCategory(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#exportStoreReportByCategory");
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

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByChannel"></a>
# **exportStoreReportByChannel**
> List&lt;BeezUPCommonLink2&gt; exportStoreReportByChannel(storeId, format, request)

Export the report by channel

Export the report by channel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByChannelRequest request = new ReportByChannelRequest(); // ReportByChannelRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.exportStoreReportByChannel(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#exportStoreReportByChannel");
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

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportStoreReportByProduct"></a>
# **exportStoreReportByProduct**
> List&lt;BeezUPCommonLink2&gt; exportStoreReportByProduct(storeId, format, request)

Export the report by product

Export the report by product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByProductRequest request = new ReportByProductRequest(); // ReportByProductRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.exportStoreReportByProduct(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#exportStoreReportByProduct");
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

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
try {
    ReportFilter result = apiInstance.getReportFilter(storeId, reportFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getReportFilter");
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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    ReportFilters result = apiInstance.getReportFilters(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getReportFilters");
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

<a name="getRule"></a>
# **getRule**
> Rule getRule(storeId, ruleId)

Gets the rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    Rule result = apiInstance.getRule(storeId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

[**Rule**](Rule.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRules"></a>
# **getRules**
> Rules getRules(storeId)

Gets the list of rules for a given store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    Rules result = apiInstance.getRules(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**Rules**](Rules.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRulesExecutions"></a>
# **getRulesExecutions**
> RuleExecutionReportings getRulesExecutions(storeId, pageNumber, pageSize)

Get the rules execution history

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer pageNumber = 1; // Integer | The page to retrieve
Integer pageSize = 10; // Integer | The count of rule history to retrieve
try {
    RuleExecutionReportings result = apiInstance.getRulesExecutions(storeId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getRulesExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **pageNumber** | **Integer**| The page to retrieve | [default to 1]
 **pageSize** | **Integer**| The count of rule history to retrieve | [default to 10]

### Return type

[**RuleExecutionReportings**](RuleExecutionReportings.md)

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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByCategoryRequest request = new ReportByCategoryRequest(); // ReportByCategoryRequest | 
try {
    ReportByCategoryResponse result = apiInstance.getStoreReportByCategory(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreReportByCategory");
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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByChannelRequest request = new ReportByChannelRequest(); // ReportByChannelRequest | 
try {
    ReportByChannelResponse result = apiInstance.getStoreReportByChannel(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreReportByChannel");
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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByDayRequest request = new ReportByDayRequest(); // ReportByDayRequest | 
try {
    ReportByDayResponse result = apiInstance.getStoreReportByDay(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreReportByDay");
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
> List&lt;BeezUPCommonLink2&gt; getStoreReportByDayExport(storeId, format, request)

Get the report by day

Get the report by day

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String format = "format_example"; // String | 
ReportByDayRequest request = new ReportByDayRequest(); // ReportByDayRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.getStoreReportByDayExport(storeId, format, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreReportByDayExport");
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

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
ReportByProductRequest request = new ReportByProductRequest(); // ReportByProductRequest | 
try {
    ReportByProductResponse result = apiInstance.getStoreReportByProduct(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreReportByProduct");
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

<a name="getStoreTrackedClicks"></a>
# **getStoreTrackedClicks**
> TrackedClicks getStoreTrackedClicks(storeId, count)

Get the latest clicks tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The click's count you want to get
try {
    TrackedClicks result = apiInstance.getStoreTrackedClicks(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreTrackedClicks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The click&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedClicks**](TrackedClicks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedExternalOrders"></a>
# **getStoreTrackedExternalOrders**
> TrackedExternalOrders getStoreTrackedExternalOrders(storeId, count)

Get the latest external orders tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The external order's count you want to get
try {
    TrackedExternalOrders result = apiInstance.getStoreTrackedExternalOrders(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreTrackedExternalOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The external order&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedExternalOrders**](TrackedExternalOrders.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackedOrders"></a>
# **getStoreTrackedOrders**
> TrackedOrders getStoreTrackedOrders(storeId, count)

Get the latest orders tracked

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The order's count you want to get
try {
    TrackedOrders result = apiInstance.getStoreTrackedOrders(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreTrackedOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The order&#39;s count you want to get | [optional] [default to 100]

### Return type

[**TrackedOrders**](TrackedOrders.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoreTrackingStatus"></a>
# **getStoreTrackingStatus**
> StoreTrackingStatus getStoreTrackingStatus(storeId)

Get store tracking synchronization status

Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    StoreTrackingStatus result = apiInstance.getStoreTrackingStatus(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getStoreTrackingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**StoreTrackingStatus**](StoreTrackingStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrackingStatus"></a>
# **getTrackingStatus**
> TrackingStatus getTrackingStatus()

Display the synchronization status of the clicks and orders

Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
try {
    TrackingStatus result = apiInstance.getTrackingStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#getTrackingStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TrackingStatus**](TrackingStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveDownRule"></a>
# **moveDownRule**
> moveDownRule(storeId, ruleId)

Move the rule down

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveDownRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#moveDownRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveUpRule"></a>
# **moveUpRule**
> moveUpRule(storeId, ruleId)

Move the rule up

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveUpRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#moveUpRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimise"></a>
# **optimise**
> optimise(storeId, actionName, request)

Optimise products

/!\\ WARNING /!\\ \\ Apply the operation on every product related to this request. \\ This operation is used at the bottom of the analytics page result. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String actionName = "actionName_example"; // String | 
OptimiseRequest request = new OptimiseRequest(); // OptimiseRequest | 
try {
    apiInstance.optimise(storeId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#optimise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | [**OptimiseRequest**](OptimiseRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByCategory"></a>
# **optimiseByCategory**
> optimiseByCategory(storeId, catalogCategoryId, actionName, request)

Optimise products&#39;s category

/!\\ WARNING /!\\ \\ This operation will reenable or disable products&#39;s category for every channel indicated in the body.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String catalogCategoryId = "catalogCategoryId_example"; // String | The category identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
List<String> request = Arrays.asList(new List<String>()); // List<String> | The channel identifier list concerned by this optimisation
try {
    apiInstance.optimiseByCategory(storeId, catalogCategoryId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#optimiseByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **catalogCategoryId** | **String**| The category identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | **List&lt;String&gt;**| The channel identifier list concerned by this optimisation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByChannel"></a>
# **optimiseByChannel**
> optimiseByChannel(storeId, channelId, actionName)

Optimise products&#39;s category

/!\\ WARNING /!\\ \\ Apply the operation on every product on this channel. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String channelId = "channelId_example"; // String | The channel identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
try {
    apiInstance.optimiseByChannel(storeId, channelId, actionName);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#optimiseByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **channelId** | **String**| The channel identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimiseByProduct"></a>
# **optimiseByProduct**
> optimiseByProduct(storeId, productId, actionName, request)

Optimise products

/!\\ WARNING /!\\ \\ This operation will reenable or disable this product for every channel indicated in the body.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String productId = "productId_example"; // String | The product identifier concerned by this optimisation
String actionName = "actionName_example"; // String | 
List<String> request = Arrays.asList(new List<String>()); // List<String> | The channel identifier list concerned by this optimisation
try {
    apiInstance.optimiseByProduct(storeId, productId, actionName, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#optimiseByProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **productId** | **String**| The product identifier concerned by this optimisation |
 **actionName** | **String**|  | [enum: reenable, disable]
 **request** | **List&lt;String&gt;**| The channel identifier list concerned by this optimisation | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runRule"></a>
# **runRule**
> runRule(storeId, ruleId)

Run rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.runRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#runRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runRules"></a>
# **runRules**
> runRules(storeId)

Run all rules for this store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.runRules(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#runRules");
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
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String reportFilterId = "reportFilterId_example"; // String | Your report filter identifier
SaveReportFilterRequest reportFilter = new SaveReportFilterRequest(); // SaveReportFilterRequest | 
try {
    apiInstance.saveReportFilter(storeId, reportFilterId, reportFilter);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#saveReportFilter");
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

<a name="updateRule"></a>
# **updateRule**
> updateRule(storeId, ruleId, request)

Update Rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserAnalyticsApi apiInstance = new V2UserAnalyticsApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
UpdateRuleRequest request = new UpdateRuleRequest(); // UpdateRuleRequest | 
try {
    apiInstance.updateRule(storeId, ruleId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserAnalyticsApi#updateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **ruleId** | **String**| Your rule identifier |
 **request** | [**UpdateRuleRequest**](UpdateRuleRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

