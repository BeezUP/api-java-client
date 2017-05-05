# ImportationProcessApi

All URIs are relative to *https://api.beezup.com/v2/user/catalogs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**importationCancel**](ImportationProcessApi.md#importationCancel) | **DELETE** /{storeId}/importations/{executionId} | Cancel importation
[**importationCommit**](ImportationProcessApi.md#importationCommit) | **POST** /{storeId}/importations/{executionId}/commit | Commit Importation
[**importationCommitColumns**](ImportationProcessApi.md#importationCommitColumns) | **POST** /{storeId}/importations/{executionId}/commitColumns | Commit columns
[**importationConfigureRemainingCatalogColumns**](ImportationProcessApi.md#importationConfigureRemainingCatalogColumns) | **POST** /{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
[**importationGetImportationMonitoring**](ImportationProcessApi.md#importationGetImportationMonitoring) | **GET** /{storeId}/importations/{executionId} | Get the importation status
[**importationGetReportings**](ImportationProcessApi.md#importationGetReportings) | **GET** /{storeId}/importations | Get the latest catalog importation reporting
[**importationStartManualUpdate**](ImportationProcessApi.md#importationStartManualUpdate) | **POST** /{storeId}/importations | Start Manual Import
[**importationTechnicalProgression**](ImportationProcessApi.md#importationTechnicalProgression) | **GET** /{storeId}/importations/{executionId}/technicalProgression | Get technical progression


<a name="importationCancel"></a>
# **importationCancel**
> importationCancel(storeId, executionId)

Cancel importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCancel(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationCommit"></a>
# **importationCommit**
> importationCommit(storeId, executionId)

Commit Importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCommit(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationCommitColumns"></a>
# **importationCommitColumns**
> importationCommitColumns(storeId, executionId)

Commit columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCommitColumns(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationCommitColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationConfigureRemainingCatalogColumns"></a>
# **importationConfigureRemainingCatalogColumns**
> importationConfigureRemainingCatalogColumns(storeId, executionId)

Configure remaining catalog columns

This operation should be used after you have mapped the required BeezUP Columns

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationConfigureRemainingCatalogColumns(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationConfigureRemainingCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetImportationMonitoring"></a>
# **importationGetImportationMonitoring**
> ImportationMonitoring importationGetImportationMonitoring(storeId, executionId)

Get the importation status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    ImportationMonitoring result = apiInstance.importationGetImportationMonitoring(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationGetImportationMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**ImportationMonitoring**](ImportationMonitoring.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetReportings"></a>
# **importationGetReportings**
> List&lt;ImportationReporting&gt; importationGetReportings(storeId)

Get the latest catalog importation reporting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    List<ImportationReporting> result = apiInstance.importationGetReportings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationGetReportings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**List&lt;ImportationReporting&gt;**](ImportationReporting.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationStartManualUpdate"></a>
# **importationStartManualUpdate**
> List&lt;BeezUPCommonLink2&gt; importationStartManualUpdate(storeId, request)

Start Manual Import

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
StartManualImportRequest request = new StartManualImportRequest(); // StartManualImportRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.importationStartManualUpdate(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationStartManualUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**StartManualImportRequest**](StartManualImportRequest.md)|  |

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationTechnicalProgression"></a>
# **importationTechnicalProgression**
> ImportationTechnicalProgression importationTechnicalProgression(storeId, executionId)

Get technical progression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImportationProcessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ImportationProcessApi apiInstance = new ImportationProcessApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    ImportationTechnicalProgression result = apiInstance.importationTechnicalProgression(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportationProcessApi#importationTechnicalProgression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**ImportationTechnicalProgression**](ImportationTechnicalProgression.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

