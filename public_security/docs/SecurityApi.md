# SecurityApi

All URIs are relative to *https://api.beezup.com/v2/public/security*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](SecurityApi.md#login) | **POST** /login | Login
[**lostPassword**](SecurityApi.md#lostPassword) | **POST** /lostpassword | Lost password
[**register**](SecurityApi.md#register) | **POST** /register | User Registration


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
 **request** | [**LoginRequest**](LoginRequest.md)|  |

### Return type

[**ApiCredentials**](ApiCredentials.md)

### Authorization

No authorization required

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
BeezUPCommonEmail email = new BeezUPCommonEmail(); // BeezUPCommonEmail | Your email
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
 **email** | [**BeezUPCommonEmail**](BeezUPCommonEmail.md)| Your email |

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
 **request** | [**RegisterRequest**](RegisterRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

