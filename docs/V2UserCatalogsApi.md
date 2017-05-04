# V2UserCatalogsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autoConfigureAutoImportInterval**](V2UserCatalogsApi.md#autoConfigureAutoImportInterval) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
[**autoDeleteAutoImport**](V2UserCatalogsApi.md#autoDeleteAutoImport) | **DELETE** /v2/user/catalogs/{storeId}/autoImport | Delete Auto Import
[**autoGetAutoImportConfiguration**](V2UserCatalogsApi.md#autoGetAutoImportConfiguration) | **GET** /v2/user/catalogs/{storeId}/autoImport | Get the auto import configuration
[**autoPauseAutoImport**](V2UserCatalogsApi.md#autoPauseAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/pause | Pause Auto Import
[**autoResumeAutoImport**](V2UserCatalogsApi.md#autoResumeAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/resume | Resume Auto Import
[**autoScheduleAutoImport**](V2UserCatalogsApi.md#autoScheduleAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
[**autoStartAutoImport**](V2UserCatalogsApi.md#autoStartAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport/start | Start Auto Import Manually
[**catalogChangeCatalogColumnUserName**](V2UserCatalogsApi.md#catalogChangeCatalogColumnUserName) | **POST** /v2/user/catalogs/{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
[**catalogChangeCustomColumnExpression**](V2UserCatalogsApi.md#catalogChangeCustomColumnExpression) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Change custom column expression
[**catalogChangeCustomColumnUserName**](V2UserCatalogsApi.md#catalogChangeCustomColumnUserName) | **POST** /v2/user/catalogs/{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
[**catalogComputeExpression**](V2UserCatalogsApi.md#catalogComputeExpression) | **POST** /v2/user/catalogs/{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
[**catalogDeleteCustomColumn**](V2UserCatalogsApi.md#catalogDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Delete custom column
[**catalogGetBeezUPColumns**](V2UserCatalogsApi.md#catalogGetBeezUPColumns) | **GET** /v2/user/catalogs/beezupColumns | Get the BeezUP columns
[**catalogGetCatalogColumns**](V2UserCatalogsApi.md#catalogGetCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/catalogColumns | Get catalog column list
[**catalogGetCategories**](V2UserCatalogsApi.md#catalogGetCategories) | **GET** /v2/user/catalogs/{storeId}/categories | Get category list
[**catalogGetCustomColumnExpression**](V2UserCatalogsApi.md#catalogGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
[**catalogGetCustomColumns**](V2UserCatalogsApi.md#catalogGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/customColumns | Get custom column list
[**catalogGetProduct**](V2UserCatalogsApi.md#catalogGetProduct) | **GET** /v2/user/catalogs/{storeId}/products/{productId} | Get product
[**catalogGetProducts**](V2UserCatalogsApi.md#catalogGetProducts) | **POST** /v2/user/catalogs/{storeId}/products | Get product list
[**catalogGetRandomProducts**](V2UserCatalogsApi.md#catalogGetRandomProducts) | **GET** /v2/user/catalogs/{storeId}/products/random | Get random product list
[**catalogSaveCustomColumn**](V2UserCatalogsApi.md#catalogSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Create or replace a custom column
[**importationActivateAutoImport**](V2UserCatalogsApi.md#importationActivateAutoImport) | **POST** /v2/user/catalogs/{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.
[**importationCancel**](V2UserCatalogsApi.md#importationCancel) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId} | Cancel importation
[**importationCommit**](V2UserCatalogsApi.md#importationCommit) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commit | Commit Importation
[**importationCommitColumns**](V2UserCatalogsApi.md#importationCommitColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/commitColumns | Commit columns
[**importationConfigureCatalogColumn**](V2UserCatalogsApi.md#importationConfigureCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId} | Configure catalog column
[**importationConfigureRemainingCatalogColumns**](V2UserCatalogsApi.md#importationConfigureRemainingCatalogColumns) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
[**importationDeleteCustomColumn**](V2UserCatalogsApi.md#importationDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Delete Custom Column
[**importationGetCustomColumnExpression**](V2UserCatalogsApi.md#importationGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/expression | Get the encrypted custom column expression in this importation
[**importationGetCustomColumns**](V2UserCatalogsApi.md#importationGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns | Get custom columns currently place in this importation
[**importationGetDetectedCatalogColumns**](V2UserCatalogsApi.md#importationGetDetectedCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns | Get detected catalog columns during this importation.
[**importationGetImportationMonitoring**](V2UserCatalogsApi.md#importationGetImportationMonitoring) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId} | Get the importation status
[**importationGetManualUpdateLastInputConfig**](V2UserCatalogsApi.md#importationGetManualUpdateLastInputConfig) | **GET** /v2/user/catalogs/{storeId}/inputConfiguration | Get the last input configuration
[**importationGetProductSample**](V2UserCatalogsApi.md#importationGetProductSample) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex} | Get the product sample related to this importation with all columns (catalog and custom)
[**importationGetProductSampleCustomColumnValue**](V2UserCatalogsApi.md#importationGetProductSampleCustomColumnValue) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/productSamples/{productSampleIndex}/customColumns/{columnId} | Get product sample custom column value related to this importation.
[**importationGetReportings**](V2UserCatalogsApi.md#importationGetReportings) | **GET** /v2/user/catalogs/{storeId}/importations | Get the latest catalog importation reporting
[**importationIgnoreColumn**](V2UserCatalogsApi.md#importationIgnoreColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/ignore | Ignore Column
[**importationMapCatalogColumn**](V2UserCatalogsApi.md#importationMapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/map | Map catalog column to a BeezUP column
[**importationMapCustomColumn**](V2UserCatalogsApi.md#importationMapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/map | Map custom column to a BeezUP column
[**importationReattendColumn**](V2UserCatalogsApi.md#importationReattendColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/reattend | Reattend Column
[**importationSaveCustomColumn**](V2UserCatalogsApi.md#importationSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId} | Create or replace a custom column
[**importationStartManualUpdate**](V2UserCatalogsApi.md#importationStartManualUpdate) | **POST** /v2/user/catalogs/{storeId}/importations | Start Manual Import
[**importationTechnicalProgression**](V2UserCatalogsApi.md#importationTechnicalProgression) | **GET** /v2/user/catalogs/{storeId}/importations/{executionId}/technicalProgression | Get technical progression
[**importationUnmapCatalogColumn**](V2UserCatalogsApi.md#importationUnmapCatalogColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/catalogColumns/{columnId}/unmap | Unmap catalog column
[**importationUnmapCustomColumn**](V2UserCatalogsApi.md#importationUnmapCustomColumn) | **POST** /v2/user/catalogs/{storeId}/importations/{executionId}/customColumns/{columnId}/unmap | Unmap custom column


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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
ConfigureAutoImportIntervalRequest request = new ConfigureAutoImportIntervalRequest(); // ConfigureAutoImportIntervalRequest | 
try {
    apiInstance.autoConfigureAutoImportInterval(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoConfigureAutoImportInterval");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoDeleteAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoDeleteAutoImport");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    AutoImportConfiguration result = apiInstance.autoGetAutoImportConfiguration(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoGetAutoImportConfiguration");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoPauseAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoPauseAutoImport");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.autoResumeAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoResumeAutoImport");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
ScheduleAutoImportRequest request = new ScheduleAutoImportRequest(); // ScheduleAutoImportRequest | 
try {
    apiInstance.autoScheduleAutoImport(storeId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoScheduleAutoImport");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    List<BeezUPCommonLink2> result = apiInstance.autoStartAutoImport(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#autoStartAutoImport");
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

<a name="catalogChangeCatalogColumnUserName"></a>
# **catalogChangeCatalogColumnUserName**
> catalogChangeCatalogColumnUserName(storeId, columnId, request)

Change Catalog Column User Name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The catalog column identifier
ChangeUserColumnNameRequest request = new ChangeUserColumnNameRequest(); // ChangeUserColumnNameRequest | 
try {
    apiInstance.catalogChangeCatalogColumnUserName(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogChangeCatalogColumnUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The catalog column identifier |
 **request** | [**ChangeUserColumnNameRequest**](ChangeUserColumnNameRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogChangeCustomColumnExpression"></a>
# **catalogChangeCustomColumnExpression**
> catalogChangeCustomColumnExpression(storeId, columnId, request)

Change custom column expression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
ChangeCustomColumnExpressionRequest request = new ChangeCustomColumnExpressionRequest(); // ChangeCustomColumnExpressionRequest | 
try {
    apiInstance.catalogChangeCustomColumnExpression(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogChangeCustomColumnExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ChangeCustomColumnExpressionRequest**](ChangeCustomColumnExpressionRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogChangeCustomColumnUserName"></a>
# **catalogChangeCustomColumnUserName**
> catalogChangeCustomColumnUserName(storeId, columnId, request)

Change Custom Column User Name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
ChangeUserColumnNameRequest request = new ChangeUserColumnNameRequest(); // ChangeUserColumnNameRequest | 
try {
    apiInstance.catalogChangeCustomColumnUserName(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogChangeCustomColumnUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ChangeUserColumnNameRequest**](ChangeUserColumnNameRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogComputeExpression"></a>
# **catalogComputeExpression**
> String catalogComputeExpression(storeId, request)

Compute the expression for this catalog.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
ComputeExpressionRequest request = new ComputeExpressionRequest(); // ComputeExpressionRequest | 
try {
    String result = apiInstance.catalogComputeExpression(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogComputeExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**ComputeExpressionRequest**](ComputeExpressionRequest.md)|  |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogDeleteCustomColumn"></a>
# **catalogDeleteCustomColumn**
> catalogDeleteCustomColumn(storeId, columnId)

Delete custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.catalogDeleteCustomColumn(storeId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogDeleteCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetBeezUPColumns"></a>
# **catalogGetBeezUPColumns**
> List&lt;BeezUPColumnConfiguration&gt; catalogGetBeezUPColumns()

Get the BeezUP columns

Get the BeezUP columns, this columns are used for mapping during the manual catalog importation process.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
try {
    List<BeezUPColumnConfiguration> result = apiInstance.catalogGetBeezUPColumns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetBeezUPColumns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPColumnConfiguration&gt;**](BeezUPColumnConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCatalogColumns"></a>
# **catalogGetCatalogColumns**
> CatalogColumns catalogGetCatalogColumns(storeId)

Get catalog column list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    CatalogColumns result = apiInstance.catalogGetCatalogColumns(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**CatalogColumns**](CatalogColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCategories"></a>
# **catalogGetCategories**
> Categories catalogGetCategories(storeId, acceptEncoding)

Get category list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
try {
    Categories result = apiInstance.catalogGetCategories(storeId, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Indicates that the client accepts that the response will be compressed to reduce traffic size. |

### Return type

[**Categories**](Categories.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCustomColumnExpression"></a>
# **catalogGetCustomColumnExpression**
> String catalogGetCustomColumnExpression(storeId, columnId)

Get the encrypted custom column expression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.catalogGetCustomColumnExpression(storeId, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetCustomColumnExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetCustomColumns"></a>
# **catalogGetCustomColumns**
> CustomColumns catalogGetCustomColumns(storeId)

Get custom column list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    CustomColumns result = apiInstance.catalogGetCustomColumns(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetCustomColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**CustomColumns**](CustomColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetProduct"></a>
# **catalogGetProduct**
> Product catalogGetProduct(storeId, productId)

Get product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String productId = "productId_example"; // String | The product identifier you want to get
try {
    Product result = apiInstance.catalogGetProduct(storeId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **productId** | **String**| The product identifier you want to get |

### Return type

[**Product**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetProducts"></a>
# **catalogGetProducts**
> Products catalogGetProducts(storeId, request)

Get product list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
GetProductsRequest request = new GetProductsRequest(); // GetProductsRequest | 
try {
    Products result = apiInstance.catalogGetProducts(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **request** | [**GetProductsRequest**](GetProductsRequest.md)|  | [optional]

### Return type

[**Products**](Products.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogGetRandomProducts"></a>
# **catalogGetRandomProducts**
> Products catalogGetRandomProducts(storeId, count)

Get random product list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The count of random product you want to get
try {
    Products result = apiInstance.catalogGetRandomProducts(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogGetRandomProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **count** | **Integer**| The count of random product you want to get | [optional] [default to 100]

### Return type

[**Products**](Products.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogSaveCustomColumn"></a>
# **catalogSaveCustomColumn**
> catalogSaveCustomColumn(storeId, columnId, request)

Create or replace a custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
CreateCustomColumnRequest request = new CreateCustomColumnRequest(); // CreateCustomColumnRequest | 
try {
    apiInstance.catalogSaveCustomColumn(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#catalogSaveCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **columnId** | **String**| The custom column identifier |
 **request** | [**CreateCustomColumnRequest**](CreateCustomColumnRequest.md)|  |

### Return type

null (empty response body)

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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    apiInstance.importationActivateAutoImport(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationActivateAutoImport");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCancel(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationCancel");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCommit(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationCommit");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationCommitColumns(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationCommitColumns");
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

<a name="importationConfigureCatalogColumn"></a>
# **importationConfigureCatalogColumn**
> importationConfigureCatalogColumn(storeId, executionId, columnId, request)

Configure catalog column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
ConfigureCatalogColumnCatalogRequest request = new ConfigureCatalogColumnCatalogRequest(); // ConfigureCatalogColumnCatalogRequest | 
try {
    apiInstance.importationConfigureCatalogColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationConfigureCatalogColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ConfigureCatalogColumnCatalogRequest**](ConfigureCatalogColumnCatalogRequest.md)|  |

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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    apiInstance.importationConfigureRemainingCatalogColumns(storeId, executionId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationConfigureRemainingCatalogColumns");
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

<a name="importationDeleteCustomColumn"></a>
# **importationDeleteCustomColumn**
> importationDeleteCustomColumn(storeId, executionId, columnId)

Delete Custom Column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationDeleteCustomColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationDeleteCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetCustomColumnExpression"></a>
# **importationGetCustomColumnExpression**
> String importationGetCustomColumnExpression(storeId, executionId, columnId)

Get the encrypted custom column expression in this importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.importationGetCustomColumnExpression(storeId, executionId, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetCustomColumnExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetCustomColumns"></a>
# **importationGetCustomColumns**
> CustomColumns importationGetCustomColumns(storeId, executionId)

Get custom columns currently place in this importation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    CustomColumns result = apiInstance.importationGetCustomColumns(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetCustomColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**CustomColumns**](CustomColumns.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetDetectedCatalogColumns"></a>
# **importationGetDetectedCatalogColumns**
> DetectedCatalogColumns importationGetDetectedCatalogColumns(storeId, executionId)

Get detected catalog columns during this importation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    DetectedCatalogColumns result = apiInstance.importationGetDetectedCatalogColumns(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetDetectedCatalogColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |

### Return type

[**DetectedCatalogColumns**](DetectedCatalogColumns.md)

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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    ImportationMonitoring result = apiInstance.importationGetImportationMonitoring(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetImportationMonitoring");
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

<a name="importationGetManualUpdateLastInputConfig"></a>
# **importationGetManualUpdateLastInputConfig**
> LastManualImportInputConfiguration importationGetManualUpdateLastInputConfig(storeId)

Get the last input configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    LastManualImportInputConfiguration result = apiInstance.importationGetManualUpdateLastInputConfig(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetManualUpdateLastInputConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |

### Return type

[**LastManualImportInputConfiguration**](LastManualImportInputConfiguration.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetProductSample"></a>
# **importationGetProductSample**
> ProductSample importationGetProductSample(storeId, executionId, productSampleIndex)

Get the product sample related to this importation with all columns (catalog and custom)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
Integer productSampleIndex = 56; // Integer | Index of the product sample. Starting from 0 to 99.
try {
    ProductSample result = apiInstance.importationGetProductSample(storeId, executionId, productSampleIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetProductSample");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **productSampleIndex** | **Integer**| Index of the product sample. Starting from 0 to 99. |

### Return type

[**ProductSample**](ProductSample.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationGetProductSampleCustomColumnValue"></a>
# **importationGetProductSampleCustomColumnValue**
> String importationGetProductSampleCustomColumnValue(storeId, executionId, productSampleIndex, columnId)

Get product sample custom column value related to this importation.

/!\\ Use this operation only when you just changed the custom column expression and you want to get a precise the property value. Otherwise use the operation Importation_GetProductSample which will give you all property values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
Integer productSampleIndex = 56; // Integer | Index of the product sample. Starting from 0 to 99.
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.importationGetProductSampleCustomColumnValue(storeId, executionId, productSampleIndex, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetProductSampleCustomColumnValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **productSampleIndex** | **Integer**| Index of the product sample. Starting from 0 to 99. |
 **columnId** | **String**| The custom column identifier |

### Return type

**String**

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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    List<ImportationReporting> result = apiInstance.importationGetReportings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationGetReportings");
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

<a name="importationIgnoreColumn"></a>
# **importationIgnoreColumn**
> importationIgnoreColumn(storeId, executionId, columnId)

Ignore Column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationIgnoreColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationIgnoreColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationMapCatalogColumn"></a>
# **importationMapCatalogColumn**
> importationMapCatalogColumn(storeId, executionId, columnId, request)

Map catalog column to a BeezUP column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The catalog column identifier
MapBeezUPColumnRequest request = new MapBeezUPColumnRequest(); // MapBeezUPColumnRequest | 
try {
    apiInstance.importationMapCatalogColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationMapCatalogColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The catalog column identifier |
 **request** | [**MapBeezUPColumnRequest**](MapBeezUPColumnRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationMapCustomColumn"></a>
# **importationMapCustomColumn**
> importationMapCustomColumn(storeId, executionId, columnId, request)

Map custom column to a BeezUP column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
MapBeezUPColumnRequest request = new MapBeezUPColumnRequest(); // MapBeezUPColumnRequest | 
try {
    apiInstance.importationMapCustomColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationMapCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |
 **request** | [**MapBeezUPColumnRequest**](MapBeezUPColumnRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationReattendColumn"></a>
# **importationReattendColumn**
> importationReattendColumn(storeId, executionId, columnId)

Reattend Column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationReattendColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationReattendColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationSaveCustomColumn"></a>
# **importationSaveCustomColumn**
> importationSaveCustomColumn(storeId, executionId, columnId, request)

Create or replace a custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
ChangeCustomColumnRequest request = new ChangeCustomColumnRequest(); // ChangeCustomColumnRequest | 
try {
    apiInstance.importationSaveCustomColumn(storeId, executionId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationSaveCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |
 **request** | [**ChangeCustomColumnRequest**](ChangeCustomColumnRequest.md)|  |

### Return type

null (empty response body)

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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
StartManualImportRequest request = new StartManualImportRequest(); // StartManualImportRequest | 
try {
    List<BeezUPCommonLink2> result = apiInstance.importationStartManualUpdate(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationStartManualUpdate");
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
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
try {
    ImportationTechnicalProgression result = apiInstance.importationTechnicalProgression(storeId, executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationTechnicalProgression");
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

<a name="importationUnmapCatalogColumn"></a>
# **importationUnmapCatalogColumn**
> importationUnmapCatalogColumn(storeId, executionId, columnId)

Unmap catalog column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The catalog column identifier
try {
    apiInstance.importationUnmapCatalogColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationUnmapCatalogColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The catalog column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importationUnmapCustomColumn"></a>
# **importationUnmapCustomColumn**
> importationUnmapCustomColumn(storeId, executionId, columnId)

Unmap custom column

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.V2UserCatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

V2UserCatalogsApi apiInstance = new V2UserCatalogsApi();
String storeId = "storeId_example"; // String | Your store identifier
String executionId = "executionId_example"; // String | The execution identifier of you catalog importation
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.importationUnmapCustomColumn(storeId, executionId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling V2UserCatalogsApi#importationUnmapCustomColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Your store identifier |
 **executionId** | **String**| The execution identifier of you catalog importation |
 **columnId** | **String**| The custom column identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

