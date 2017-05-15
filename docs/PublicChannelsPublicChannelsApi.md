# PublicChannelsPublicChannelsApi

All URIs are relative to *https://api.beezup.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChannels**](PublicChannelsPublicChannelsApi.md#getChannels) | **GET** /public/channels/{countryIsoCode} | The channel list for one country
[**getChannelsIndex**](PublicChannelsPublicChannelsApi.md#getChannelsIndex) | **GET** /public/channels/ | Get public channel index


<a name="getChannels"></a>
# **getChannels**
> ChannelInfoList getChannels(countryIsoCode, acceptEncoding)

The channel list for one country

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicChannelsPublicChannelsApi;


PublicChannelsPublicChannelsApi apiInstance = new PublicChannelsPublicChannelsApi();
String countryIsoCode = "countryIsoCode_example"; // String | The country iso code alpha 3 based on this: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Decoding_table \\ To know which country are available you have to use the operation: GetChannelsByCountry 
List<String> acceptEncoding = Arrays.asList("acceptEncoding_example"); // List<String> | Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size.
try {
    ChannelInfoList result = apiInstance.getChannels(countryIsoCode, acceptEncoding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicChannelsPublicChannelsApi#getChannels");
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

<a name="getChannelsIndex"></a>
# **getChannelsIndex**
> PublicChannelIndex getChannelsIndex()

Get public channel index

Use this operation to get the correct link to the channels and to the list of values

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PublicChannelsPublicChannelsApi;


PublicChannelsPublicChannelsApi apiInstance = new PublicChannelsPublicChannelsApi();
try {
    PublicChannelIndex result = apiInstance.getChannelsIndex();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicChannelsPublicChannelsApi#getChannelsIndex");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PublicChannelIndex**](PublicChannelIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

