# CatalogApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogChangeCatalogColumnUserName**](CatalogApi.md#catalogChangeCatalogColumnUserName) | **POST** /v2/user/catalogs/{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
[**catalogChangeCustomColumnExpression**](CatalogApi.md#catalogChangeCustomColumnExpression) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Change custom column expression
[**catalogChangeCustomColumnUserName**](CatalogApi.md#catalogChangeCustomColumnUserName) | **POST** /v2/user/catalogs/{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
[**catalogComputeExpression**](CatalogApi.md#catalogComputeExpression) | **POST** /v2/user/catalogs/{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
[**catalogDeleteCustomColumn**](CatalogApi.md#catalogDeleteCustomColumn) | **DELETE** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Delete custom column
[**catalogGetCatalogColumns**](CatalogApi.md#catalogGetCatalogColumns) | **GET** /v2/user/catalogs/{storeId}/catalogColumns | Get catalog column list
[**catalogGetCategories**](CatalogApi.md#catalogGetCategories) | **GET** /v2/user/catalogs/{storeId}/categories | Get category list
[**catalogGetCustomColumnExpression**](CatalogApi.md#catalogGetCustomColumnExpression) | **GET** /v2/user/catalogs/{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
[**catalogGetCustomColumns**](CatalogApi.md#catalogGetCustomColumns) | **GET** /v2/user/catalogs/{storeId}/customColumns | Get custom column list
[**catalogGetProduct**](CatalogApi.md#catalogGetProduct) | **GET** /v2/user/catalogs/{storeId}/products/{productId} | Get product
[**catalogGetProducts**](CatalogApi.md#catalogGetProducts) | **POST** /v2/user/catalogs/{storeId}/products | Get product list
[**catalogGetRandomProducts**](CatalogApi.md#catalogGetRandomProducts) | **GET** /v2/user/catalogs/{storeId}/products/random | Get random product list
[**catalogSaveCustomColumn**](CatalogApi.md#catalogSaveCustomColumn) | **PUT** /v2/user/catalogs/{storeId}/customColumns/{columnId} | Create or replace a custom column
[**importationGetManualUpdateLastInputConfig**](CatalogApi.md#importationGetManualUpdateLastInputConfig) | **GET** /v2/user/catalogs/{storeId}/inputConfiguration | Get the last input configuration


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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The catalog column identifier
ChangeUserColumnNameRequest request = new ChangeUserColumnNameRequest(); // ChangeUserColumnNameRequest | 
try {
    apiInstance.catalogChangeCatalogColumnUserName(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogChangeCatalogColumnUserName");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
ChangeCustomColumnExpressionRequest request = new ChangeCustomColumnExpressionRequest(); // ChangeCustomColumnExpressionRequest | 
try {
    apiInstance.catalogChangeCustomColumnExpression(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogChangeCustomColumnExpression");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
ChangeUserColumnNameRequest request = new ChangeUserColumnNameRequest(); // ChangeUserColumnNameRequest | 
try {
    apiInstance.catalogChangeCustomColumnUserName(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogChangeCustomColumnUserName");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
ComputeExpressionRequest request = new ComputeExpressionRequest(); // ComputeExpressionRequest | 
try {
    String result = apiInstance.catalogComputeExpression(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogComputeExpression");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
try {
    apiInstance.catalogDeleteCustomColumn(storeId, columnId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogDeleteCustomColumn");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    CatalogColumns result = apiInstance.catalogGetCatalogColumns(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetCatalogColumns");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Indicates that the client accepts that the response will be compressed to reduce traffic size.
try {
    Categories result = apiInstance.catalogGetCategories(storeId, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetCategories");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
try {
    String result = apiInstance.catalogGetCustomColumnExpression(storeId, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetCustomColumnExpression");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    CustomColumns result = apiInstance.catalogGetCustomColumns(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetCustomColumns");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String productId = "productId_example"; // String | The product identifier you want to get
try {
    Product result = apiInstance.catalogGetProduct(storeId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetProduct");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
GetProductsRequest request = new GetProductsRequest(); // GetProductsRequest | 
try {
    Products result = apiInstance.catalogGetProducts(storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetProducts");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
Integer count = 100; // Integer | The count of random product you want to get
try {
    Products result = apiInstance.catalogGetRandomProducts(storeId, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGetRandomProducts");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
String columnId = "columnId_example"; // String | The custom column identifier
CreateCustomColumnRequest request = new CreateCustomColumnRequest(); // CreateCustomColumnRequest | 
try {
    apiInstance.catalogSaveCustomColumn(storeId, columnId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogSaveCustomColumn");
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
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

CatalogApi apiInstance = new CatalogApi();
String storeId = "storeId_example"; // String | Your store identifier
try {
    LastManualImportInputConfiguration result = apiInstance.importationGetManualUpdateLastInputConfig(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#importationGetManualUpdateLastInputConfig");
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

