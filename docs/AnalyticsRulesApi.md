# AnalyticsRulesApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRule**](AnalyticsRulesApi.md#createRule) | **POST** /user/analytics/{storeId}/rules | Rule creation
[**deleteRule**](AnalyticsRulesApi.md#deleteRule) | **DELETE** /user/analytics/{storeId}/rules/{ruleId} | Delete Rule
[**disableRule**](AnalyticsRulesApi.md#disableRule) | **POST** /user/analytics/{storeId}/rules/{ruleId}/disable | Disable rule
[**enableRule**](AnalyticsRulesApi.md#enableRule) | **POST** /user/analytics/{storeId}/rules/{ruleId}/enable | Enable rule
[**getRule**](AnalyticsRulesApi.md#getRule) | **GET** /user/analytics/{storeId}/rules/{ruleId} | Gets the rule
[**getRules**](AnalyticsRulesApi.md#getRules) | **GET** /user/analytics/{storeId}/rules | Gets the list of rules for a given store
[**getRulesExecutions**](AnalyticsRulesApi.md#getRulesExecutions) | **GET** /user/analytics/{storeId}/rules/executions | Get the rules execution history
[**moveDownRule**](AnalyticsRulesApi.md#moveDownRule) | **POST** /user/analytics/{storeId}/rules/{ruleId}/movedown | Move the rule down
[**moveUpRule**](AnalyticsRulesApi.md#moveUpRule) | **POST** /user/analytics/{storeId}/rules/{ruleId}/moveup | Move the rule up
[**runRule**](AnalyticsRulesApi.md#runRule) | **POST** /user/analytics/{storeId}/rules/{ruleId}/run | Run rule
[**runRules**](AnalyticsRulesApi.md#runRules) | **POST** /user/analytics/{storeId}/rules/run | Run all rules for this store
[**updateRule**](AnalyticsRulesApi.md#updateRule) | **PATCH** /user/analytics/{storeId}/rules/{ruleId} | Update Rule


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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
CreateRuleRequest request = new CreateRuleRequest(); // CreateRuleRequest | 
try {
    apiInstance.createRule(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#createRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.deleteRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#deleteRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.disableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#disableRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.enableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#enableRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    Rule result = apiInstance.getRule(storeId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#getRule");
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
> RuleList getRules(storeId)

Gets the list of rules for a given store

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    RuleList result = apiInstance.getRules(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#getRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**RuleList**](RuleList.md)

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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer pageNumber = 1; // Integer | The page to retrieve
Integer pageSize = 10; // Integer | The count of rule history to retrieve
try {
    RuleExecutionReportings result = apiInstance.getRulesExecutions(storeId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#getRulesExecutions");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveDownRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#moveDownRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveUpRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#moveUpRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.runRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#runRule");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.runRules(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#runRules");
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
//import io.swagger.client.api.AnalyticsRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AnalyticsRulesApi apiInstance = new AnalyticsRulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
UpdateRuleRequest request = new UpdateRuleRequest(); // UpdateRuleRequest | 
try {
    apiInstance.updateRule(storeId, ruleId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsRulesApi#updateRule");
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

