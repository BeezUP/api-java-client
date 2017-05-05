# PublicChannelsApi

All URIs are relative to *https://api.beezup.comv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannels**](PublicChannelsApi.md#getChannels) | **GET** /BeezUP/public_channels/2.0/{countryIsoCode} | The channel list for one country
[**getChannelsByCountry**](PublicChannelsApi.md#getChannelsByCountry) | **GET** /BeezUP/public_channels/2.0/ | The channel list regrouped by country


<a name="getChannels"></a>
# **getChannels**
> ChannelInfoList getChannels(countryIsoCode, acceptEncoding)

The channel list for one country

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicChannelsApi;


PublicChannelsApi apiInstance = new PublicChannelsApi();
String countryIsoCode = "countryIsoCode_example"; // String | The country iso code alpha 3 based on this: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Decoding_table \\ To know which country are available you have to use the operation: GetChannelsByCountry 
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size.
try {
    ChannelInfoList result = apiInstance.getChannels(countryIsoCode, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicChannelsApi#getChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryIsoCode** | **String**| The country iso code alpha 3 based on this: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Decoding_table \\ To know which country are available you have to use the operation: GetChannelsByCountry  |
 **acceptEncoding** | [**List&lt;String&gt;**](String.md)| Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size. |

### Return type

[**ChannelInfoList**](ChannelInfoList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelsByCountry"></a>
# **getChannelsByCountry**
> Map&lt;String, String&gt; getChannelsByCountry()

The channel list regrouped by country

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicChannelsApi;


PublicChannelsApi apiInstance = new PublicChannelsApi();
try {
    Map<String, String> result = apiInstance.getChannelsByCountry();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicChannelsApi#getChannelsByCountry");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

