# AccountApi

All URIs are relative to *https://api.beezup.com/v2/user/customer*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateUserAccount**](AccountApi.md#activateUserAccount) | **POST** /account/activate | Activate the user account
[**changePassword**](AccountApi.md#changePassword) | **POST** /account/changePassword | Change user password
[**getCreditCardInfo**](AccountApi.md#getCreditCardInfo) | **GET** /account/creditCardInfo | Get credit card information
[**getProfilePictureInfo**](AccountApi.md#getProfilePictureInfo) | **GET** /account/profilePictureInfo | Get profile picture information
[**getUserAccountInfo**](AccountApi.md#getUserAccountInfo) | **GET** /account | Get user account information
[**resendEmailActivation**](AccountApi.md#resendEmailActivation) | **POST** /account/resendEmailActivation | Resend email activation
[**saveCompanyInfo**](AccountApi.md#saveCompanyInfo) | **PUT** /account/companyInfo | Change company information
[**saveCreditCardInfo**](AccountApi.md#saveCreditCardInfo) | **PUT** /account/creditCardInfo | Save user credit card info
[**savePersonalInfo**](AccountApi.md#savePersonalInfo) | **PUT** /account/personalInfo | Save user personal information
[**saveProfilePictureInfo**](AccountApi.md#saveProfilePictureInfo) | **PUT** /account/profilePictureInfo | Change user picture information


<a name="activateUserAccount"></a>
# **activateUserAccount**
> activateUserAccount(emailActivationId)

Activate the user account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
String emailActivationId = "emailActivationId_example"; // String | The email activation id received by email.
try {
    apiInstance.activateUserAccount(emailActivationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#activateUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailActivationId** | **String**| The email activation id received by email. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changePassword"></a>
# **changePassword**
> changePassword(request)

Change user password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
ChangePasswordRequest request = new ChangePasswordRequest(); // ChangePasswordRequest | 
try {
    apiInstance.changePassword(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCreditCardInfo"></a>
# **getCreditCardInfo**
> CreditCardInfoResponse getCreditCardInfo()

Get credit card information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
try {
    CreditCardInfoResponse result = apiInstance.getCreditCardInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getCreditCardInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreditCardInfoResponse**](CreditCardInfoResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfilePictureInfo"></a>
# **getProfilePictureInfo**
> ProfilePictureInfoResponse getProfilePictureInfo()

Get profile picture information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
try {
    ProfilePictureInfoResponse result = apiInstance.getProfilePictureInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getProfilePictureInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfilePictureInfoResponse**](ProfilePictureInfoResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserAccountInfo"></a>
# **getUserAccountInfo**
> AccountInfo getUserAccountInfo()

Get user account information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
try {
    AccountInfo result = apiInstance.getUserAccountInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getUserAccountInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountInfo**](AccountInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendEmailActivation"></a>
# **resendEmailActivation**
> resendEmailActivation()

Resend email activation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
try {
    apiInstance.resendEmailActivation();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#resendEmailActivation");
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

<a name="saveCompanyInfo"></a>
# **saveCompanyInfo**
> saveCompanyInfo(request)

Change company information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
CompanyInfo request = new CompanyInfo(); // CompanyInfo | 
try {
    apiInstance.saveCompanyInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#saveCompanyInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CompanyInfo**](CompanyInfo.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveCreditCardInfo"></a>
# **saveCreditCardInfo**
> saveCreditCardInfo(request)

Save user credit card info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
CreditCardInfo request = new CreditCardInfo(); // CreditCardInfo | Credit card info
try {
    apiInstance.saveCreditCardInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#saveCreditCardInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreditCardInfo**](CreditCardInfo.md)| Credit card info |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="savePersonalInfo"></a>
# **savePersonalInfo**
> savePersonalInfo(request)

Save user personal information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
PersonalInfo request = new PersonalInfo(); // PersonalInfo | 
try {
    apiInstance.savePersonalInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#savePersonalInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PersonalInfo**](PersonalInfo.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveProfilePictureInfo"></a>
# **saveProfilePictureInfo**
> saveProfilePictureInfo(request)

Change user picture information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
ProfilePictureInfo request = new ProfilePictureInfo(); // ProfilePictureInfo | 
try {
    apiInstance.saveProfilePictureInfo(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#saveProfilePictureInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ProfilePictureInfo**](ProfilePictureInfo.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

