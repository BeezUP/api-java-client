# GroupsApi

All URIs are relative to *https://api.beezup.com/v2/public/lov*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPublicListGroup**](GroupsApi.md#getPublicListGroup) | **GET** /groups/{listGroupName} | Get list of values related to this group name
[**getPublicListGroupNames**](GroupsApi.md#getPublicListGroupNames) | **GET** /groups | Get list of group of list name


<a name="getPublicListGroup"></a>
# **getPublicListGroup**
> List&lt;BeezUPCommonLOVLink2&gt; getPublicListGroup(listGroupName)

Get list of values related to this group name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String listGroupName = "listGroupName_example"; // String | The list group name your want to get
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getPublicListGroup(listGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getPublicListGroup");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPublicListGroupNames"></a>
# **getPublicListGroupNames**
> List&lt;BeezUPCommonLOVLink2&gt; getPublicListGroupNames()

Get list of group of list name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
try {
    List<BeezUPCommonLOVLink2> result = apiInstance.getPublicListGroupNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getPublicListGroupNames");
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

