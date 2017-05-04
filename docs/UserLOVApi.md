# UserLOVApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListGroup**](UserLOVApi.md#getUserListGroup) | **GET** /v2/user/lov/groups/{listGroupName} | Get list of values related to this group name
[**getUserListGroupNames**](UserLOVApi.md#getUserListGroupNames) | **GET** /v2/user/lov/groups | Get list of group of list name
[**getUserListNames**](UserLOVApi.md#getUserListNames) | **GET** /v2/user/lov/ | Get all list names
[**getUserListOfValues**](UserLOVApi.md#getUserListOfValues) | **GET** /v2/user/lov/{listName} | Get the list of values related to this list name


<a name="getUserListGroup"></a>
# **getUserListGroup**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListGroup(listGroupName)

Get list of values related to this group name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserLOVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserLOVApi apiInstance = new UserLOVApi();
String listGroupName = "listGroupName_example"; // String | The list group name your want to get
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListGroup(listGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserLOVApi#getUserListGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listGroupName** | **String**| The list group name your want to get |

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListGroupNames"></a>
# **getUserListGroupNames**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListGroupNames()

Get list of group of list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserLOVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserLOVApi apiInstance = new UserLOVApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListGroupNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserLOVApi#getUserListGroupNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListNames"></a>
# **getUserListNames**
> List&lt;BeezUPCommonLOVLink2&gt; getUserListNames()

Get all list names

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserLOVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserLOVApi apiInstance = new UserLOVApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserLOVApi#getUserListNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserListOfValues"></a>
# **getUserListOfValues**
> List&lt;BeezUPCommonListOfValueItem&gt; getUserListOfValues(listName, acceptLanguage)

Get the list of values related to this list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserLOVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserLOVApi apiInstance = new UserLOVApi();
String listName = "listName_example"; // String | The list of value name your want to get
List<String> acceptLanguage = Arrays.asList("acceptLanguage_example"); // List<String> | Indicates that the client accepts the following languages.
try {
    List<BeezUPCommonListOfValueItem> result = apiInstance.getUserListOfValues(listName, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserLOVApi#getUserListOfValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listName** | **String**| The list of value name your want to get |
 **acceptLanguage** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts the following languages. | [optional]

### Return type

[**List&lt;BeezUPCommonListOfValueItem&gt;**](BeezUPCommonListOfValueItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

