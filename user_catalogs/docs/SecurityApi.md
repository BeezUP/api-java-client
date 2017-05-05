# SecurityApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](SecurityApi.md#login) | **POST** /v2/public/security/login | Login
[**logout**](SecurityApi.md#logout) | **POST** /v2/user/customer/security/logout | Log out the current user from go2
[**lostPassword**](SecurityApi.md#lostPassword) | **POST** /v2/public/security/lostpassword | Lost password
[**register**](SecurityApi.md#register) | **POST** /v2/public/security/register | User Registration


<a name="login"></a>
# **login**
> ApiCredentials login(request)

Login

User Login - The login will give your tokens

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
LoginRequest request = new LoginRequest(); // LoginRequest | 
try {
    ApiCredentials result = apiInstance.login(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LoginRequest**](LoginRequest.md)|  | [optional]

### Return type

[**ApiCredentials**](ApiCredentials.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout()

Log out the current user from go2

Log out the current user from go2

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SecurityApi apiInstance = new SecurityApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#logout");
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

<a name="lostPassword"></a>
# **lostPassword**
> lostPassword(email)

Lost password

Lost password - Your password will be regenerated and sent to your email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
Email email = new Email(); // Email | Your email
try {
    apiInstance.lostPassword(email);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#lostPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [**Email**](Email.md)| Your email | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="register"></a>
# **register**
> register(request)

User Registration

User Registration - Create a new user on BeezUP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
RegisterRequest request = new RegisterRequest(); // RegisterRequest | 
try {
    apiInstance.register(request);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RegisterRequest**](RegisterRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

