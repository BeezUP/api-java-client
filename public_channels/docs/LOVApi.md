# LOVApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPublicListNames**](LOVApi.md#getPublicListNames) | **GET** /v2/public/lov/ | Get all list names
[**getPublicListOfValues**](LOVApi.md#getPublicListOfValues) | **GET** /v2/public/lov/{listName} | Get the list of values related to this list name
[**getUserListNames**](LOVApi.md#getUserListNames) | **GET** /v2/user/lov/ | Get all list names
[**getUserListOfValues**](LOVApi.md#getUserListOfValues) | **GET** /v2/user/lov/{listName} | Get the list of values related to this list name


<a name="getPublicListNames"></a>
# **getPublicListNames**
> List&lt;BeezUPCommonLOVLink2&gt; getPublicListNames()

Get all list names

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LOVApi;


LOVApi apiInstance = new LOVApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getPublicListNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LOVApi#getPublicListNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLOVLink2&gt;**](BeezUPCommonLOVLink2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPublicListOfValues"></a>
# **getPublicListOfValues**
> List&lt;BeezUPCommonListOfValueItem&gt; getPublicListOfValues(listName, acceptLanguage)

Get the list of values related to this list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LOVApi;


LOVApi apiInstance = new LOVApi();
String listName = "listName_example"; // String | The list of value name your want to get
List<String> acceptLanguage = Arrays.asList("acceptLanguage_example"); // List<String> | Indicates that the client accepts the following languages.
try {
    List<BeezUPCommonListOfValueItem> result = apiInstance.getPublicListOfValues(listName, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LOVApi#getPublicListOfValues");
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

No authorization required

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
//import io.swagger.client.api.LOVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LOVApi apiInstance = new LOVApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getUserListNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LOVApi#getUserListNames");
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
//import io.swagger.client.api.LOVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LOVApi apiInstance = new LOVApi();
String listName = "listName_example"; // String | The list of value name your want to get
List<String> acceptLanguage = Arrays.asList("acceptLanguage_example"); // List<String> | Indicates that the client accepts the following languages.
try {
    List<BeezUPCommonListOfValueItem> result = apiInstance.getUserListOfValues(listName, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LOVApi#getUserListOfValues");
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

