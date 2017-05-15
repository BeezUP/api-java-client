
# ChannelCatalogExportationReporting

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exportationUtcDate** | [**DateTime**](DateTime.md) | The exportation UTC date | 
**exportationDuration** | **String** | The exportation duration. \\ &#39;00:01:00&#39; measn 1 minute.  |  [optional]
**cacheStatus** | [**CacheStatusEnum**](#CacheStatusEnum) | The cache status during the exportation |  [optional]
**exportedProductCount** | **Integer** | The exportated product count during this exportation |  [optional]
**clientIpAddress** | **String** | The IP address of the client who requests this exportation | 
**clientUserAgent** | **String** | The http header User-Agent sent by the client who requests this operation | 


<a name="CacheStatusEnum"></a>
## Enum: CacheStatusEnum
Name | Value
---- | -----
ERROR | &quot;Error&quot;
AVAILABLE | &quot;Available&quot;
GENERATEDMANUALLY | &quot;GeneratedManually&quot;



