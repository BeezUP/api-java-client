# RulesApi

All URIs are relative to *https://api.beezup.com/v2/user/analytics*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRule**](RulesApi.md#createRule) | **POST** /{storeId}/rules | Rule creation
[**deleteRule**](RulesApi.md#deleteRule) | **DELETE** /{storeId}/rules/{ruleId} | Delete Rule
[**disableRule**](RulesApi.md#disableRule) | **POST** /{storeId}/rules/{ruleId}/disable | Disable rule
[**enableRule**](RulesApi.md#enableRule) | **POST** /{storeId}/rules/{ruleId}/enable | Enable rule
[**getRule**](RulesApi.md#getRule) | **GET** /{storeId}/rules/{ruleId} | Gets the rule
[**getRules**](RulesApi.md#getRules) | **GET** /{storeId}/rules | Gets the list of rules for a given store
[**getRulesExecutions**](RulesApi.md#getRulesExecutions) | **GET** /{storeId}/rules/executions | Get the rules execution history
[**moveDownRule**](RulesApi.md#moveDownRule) | **POST** /{storeId}/rules/{ruleId}/movedown | Move the rule down
[**moveUpRule**](RulesApi.md#moveUpRule) | **POST** /{storeId}/rules/{ruleId}/moveup | Move the rule up
[**runRule**](RulesApi.md#runRule) | **POST** /{storeId}/rules/{ruleId}/run | Run rule
[**runRules**](RulesApi.md#runRules) | **POST** /{storeId}/rules/run | Run all rules for this store
[**updateRule**](RulesApi.md#updateRule) | **PATCH** /{storeId}/rules/{ruleId} | Update Rule


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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
CreateRuleRequest request = new CreateRuleRequest(); // CreateRuleRequest | 
try {
    apiInstance.createRule(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#createRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.deleteRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#deleteRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.disableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#disableRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.enableRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#enableRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    Rule result = apiInstance.getRule(storeId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#getRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    RuleList result = apiInstance.getRules(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#getRules");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer pageNumber = 1; // Integer | The page to retrieve
Integer pageSize = 10; // Integer | The count of rule history to retrieve
try {
    RuleExecutionReportings result = apiInstance.getRulesExecutions(storeId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#getRulesExecutions");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveDownRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#moveDownRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.moveUpRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#moveUpRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
try {
    apiInstance.runRule(storeId, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#runRule");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.runRules(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#runRules");
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
//import io.swagger.client.api.RulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

RulesApi apiInstance = new RulesApi();
String storeId = "storeId_example"; // String | Your store identifier
String ruleId = "ruleId_example"; // String | Your rule identifier
UpdateRuleRequest request = new UpdateRuleRequest(); // UpdateRuleRequest | 
try {
    apiInstance.updateRule(storeId, ruleId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#updateRule");
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

