# ContractsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContract**](ContractsApi.md#createContract) | **POST** /v2/user/customer/contracts | Create a new contract
[**deleteNextContract**](ContractsApi.md#deleteNextContract) | **DELETE** /v2/user/customer/contracts/next | Delete your next contract
[**getBillingPeriods**](ContractsApi.md#getBillingPeriods) | **GET** /v2/user/customer/billingPeriods | Get billing periods conditions
[**getContractsLinks**](ContractsApi.md#getContractsLinks) | **GET** /v2/user/customer/contracts | Get contracts links
[**getCurrentContract**](ContractsApi.md#getCurrentContract) | **GET** /v2/user/customer/contracts/current | Get the conditions of your current contract
[**getNextContract**](ContractsApi.md#getNextContract) | **GET** /v2/user/customer/contracts/next | Get the conditions of your next contract
[**getOffer**](ContractsApi.md#getOffer) | **POST** /v2/user/customer/offers | Get offer pricing
[**getStandardOffers**](ContractsApi.md#getStandardOffers) | **GET** /v2/user/customer/offers | Get all standard offers
[**reactivateCurrentContract**](ContractsApi.md#reactivateCurrentContract) | **POST** /v2/user/customer/contracts/current/reenableAutoRenewal | Reactivate your terminated contract.
[**terminateCurrentContract**](ContractsApi.md#terminateCurrentContract) | **POST** /v2/user/customer/contracts/current/disableAutoRenewal | Schedule termination of your current contract at the end of the commitment.


<a name="createContract"></a>
# **createContract**
> BeezUPCommonInfoSummaries createContract(request)

Create a new contract

Now you are ready to create your contract. Before that, please ensure that you check the offer with the same request parameterts. /offers 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
CreateContract request = new CreateContract(); // CreateContract | 
try {
    BeezUPCommonInfoSummaries result = apiInstance.createContract(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#createContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateContract**](CreateContract.md)|  |

### Return type

[**BeezUPCommonInfoSummaries**](BeezUPCommonInfoSummaries.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNextContract"></a>
# **deleteNextContract**
> deleteNextContract()

Delete your next contract

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    apiInstance.deleteNextContract();
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#deleteNextContract");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBillingPeriods"></a>
# **getBillingPeriods**
> BillingPeriods getBillingPeriods()

Get billing periods conditions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    BillingPeriods result = apiInstance.getBillingPeriods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getBillingPeriods");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingPeriods**](BillingPeriods.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContractsLinks"></a>
# **getContractsLinks**
> List&lt;BeezUPCommonLink2&gt; getContractsLinks()

Get contracts links

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    List<BeezUPCommonLink2> result = apiInstance.getContractsLinks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getContractsLinks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeezUPCommonLink2&gt;**](BeezUPCommonLink2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentContract"></a>
# **getCurrentContract**
> ContractInfo getCurrentContract()

Get the conditions of your current contract

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    ContractInfo result = apiInstance.getCurrentContract();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getCurrentContract");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContractInfo**](ContractInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNextContract"></a>
# **getNextContract**
> ContractInfo getNextContract()

Get the conditions of your next contract

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    ContractInfo result = apiInstance.getNextContract();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getNextContract");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContractInfo**](ContractInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOffer"></a>
# **getOffer**
> Offer getOffer(request)

Get offer pricing

Get the offer pricing then you can create your contract with the same request parameters. /v2/user/customer/contracts 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
OfferRequest request = new OfferRequest(); // OfferRequest | 
try {
    Offer result = apiInstance.getOffer(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**OfferRequest**](OfferRequest.md)|  |

### Return type

[**Offer**](Offer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStandardOffers"></a>
# **getStandardOffers**
> StandardOffers getStandardOffers()

Get all standard offers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    StandardOffers result = apiInstance.getStandardOffers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getStandardOffers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StandardOffers**](StandardOffers.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reactivateCurrentContract"></a>
# **reactivateCurrentContract**
> reactivateCurrentContract()

Reactivate your terminated contract.

By calling this operation you can re-enable the auto renewal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
try {
    apiInstance.reactivateCurrentContract();
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#reactivateCurrentContract");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terminateCurrentContract"></a>
# **terminateCurrentContract**
> terminateCurrentContract(request)

Schedule termination of your current contract at the end of the commitment.

By default your contract are automatically renew. By calling this operation you can disable the auto renewal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ContractsApi apiInstance = new ContractsApi();
TerminateContract request = new TerminateContract(); // TerminateContract | Indicate the termination reason
try {
    apiInstance.terminateCurrentContract(request);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#terminateCurrentContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TerminateContract**](TerminateContract.md)| Indicate the termination reason |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

