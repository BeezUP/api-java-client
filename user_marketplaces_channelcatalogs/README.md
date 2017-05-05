# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MarketplacesChannelCatalogsGlobalApi;

import java.io.File;
import java.util.*;

public class MarketplacesChannelCatalogsGlobalApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        MarketplacesChannelCatalogsGlobalApi apiInstance = new MarketplacesChannelCatalogsGlobalApi();
        try {
            MarketplaceChannelCatalogList result = apiInstance.getMarketplaceAccountStores();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplacesChannelCatalogsGlobalApi#getMarketplaceAccountStores");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/marketplaces/channelcatalogs*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MarketplacesChannelCatalogsGlobalApi* | [**getMarketplaceAccountStores**](docs/MarketplacesChannelCatalogsGlobalApi.md#getMarketplaceAccountStores) | **GET** / | Get  you marketplace channel catalog list
*MarketplacesChannelCatalogsPublicationsApi* | [**getPublications**](docs/MarketplacesChannelCatalogsPublicationsApi.md#getPublications) | **GET** /publications/{marketplaceTechnicalCode}/{accountId}/history | Fetch the publication history for an account, sorted by descending start date
*MarketplacesChannelCatalogsSettingsApi* | [**getChannelCatalogMarketplaceProperties**](docs/MarketplacesChannelCatalogsSettingsApi.md#getChannelCatalogMarketplaceProperties) | **GET** /{channelCatalogId}/properties | Get the marketplace properties for a channel catalog
*MarketplacesChannelCatalogsSettingsApi* | [**getChannelCatalogMarketplaceSettings**](docs/MarketplacesChannelCatalogsSettingsApi.md#getChannelCatalogMarketplaceSettings) | **GET** /{channelCatalogId}/settings | Get the marketplace settings for a channel catalog
*MarketplacesChannelCatalogsSettingsApi* | [**setChannelCatalogMarketplaceSettings**](docs/MarketplacesChannelCatalogsSettingsApi.md#setChannelCatalogMarketplaceSettings) | **POST** /{channelCatalogId}/settings | Save new marketplace settings for a channel catalog


## Documentation for Models

 - [AccountPublications](docs/AccountPublications.md)
 - [AccountPublicationsLinks](docs/AccountPublicationsLinks.md)
 - [BeezUPCommonChannelCatalogId](docs/BeezUPCommonChannelCatalogId.md)
 - [BeezUPCommonChannelId](docs/BeezUPCommonChannelId.md)
 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
 - [BeezUPCommonErrorResponseMessage](docs/BeezUPCommonErrorResponseMessage.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLOVLink3](docs/BeezUPCommonLOVLink3.md)
 - [BeezUPCommonLink3](docs/BeezUPCommonLink3.md)
 - [BeezUPCommonLinkParameter3](docs/BeezUPCommonLinkParameter3.md)
 - [BeezUPCommonMarketplaceAccountId](docs/BeezUPCommonMarketplaceAccountId.md)
 - [BeezUPCommonMarketplaceBusinessCode](docs/BeezUPCommonMarketplaceBusinessCode.md)
 - [BeezUPCommonMarketplaceTechnicalCode](docs/BeezUPCommonMarketplaceTechnicalCode.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonStoreId](docs/BeezUPCommonStoreId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [ChannelCatalogMarketplaceProperties](docs/ChannelCatalogMarketplaceProperties.md)
 - [ChannelCatalogMarketplacePropertiesLinks](docs/ChannelCatalogMarketplacePropertiesLinks.md)
 - [ChannelCatalogMarketplaceProperty](docs/ChannelCatalogMarketplaceProperty.md)
 - [ChannelCatalogMarketplacePropertyGroup](docs/ChannelCatalogMarketplacePropertyGroup.md)
 - [ChannelCatalogMarketplaceSetting](docs/ChannelCatalogMarketplaceSetting.md)
 - [ChannelCatalogMarketplaceSettingArray](docs/ChannelCatalogMarketplaceSettingArray.md)
 - [ChannelCatalogMarketplaceSettings](docs/ChannelCatalogMarketplaceSettings.md)
 - [ChannelCatalogMarketplaceSettingsLinks](docs/ChannelCatalogMarketplaceSettingsLinks.md)
 - [FeedType](docs/FeedType.md)
 - [LinksGetChannelCatalogMarketplacePropertiesLink](docs/LinksGetChannelCatalogMarketplacePropertiesLink.md)
 - [LinksGetChannelCatalogMarketplaceSettingsLink](docs/LinksGetChannelCatalogMarketplaceSettingsLink.md)
 - [LinksGetMarketplaceAccountStoresLink](docs/LinksGetMarketplaceAccountStoresLink.md)
 - [LinksGetPublicationsLink](docs/LinksGetPublicationsLink.md)
 - [LinksSetChannelCatalogMarketplaceSettingsLink](docs/LinksSetChannelCatalogMarketplaceSettingsLink.md)
 - [MarketplaceChannelCatalog](docs/MarketplaceChannelCatalog.md)
 - [MarketplaceChannelCatalogLinks](docs/MarketplaceChannelCatalogLinks.md)
 - [MarketplaceChannelCatalogList](docs/MarketplaceChannelCatalogList.md)
 - [MarketplaceChannelCatalogListLinks](docs/MarketplaceChannelCatalogListLinks.md)
 - [MarketplaceChannelCatalogLovLinks](docs/MarketplaceChannelCatalogLovLinks.md)
 - [PublicationFeedReporting](docs/PublicationFeedReporting.md)
 - [PublicationReporting](docs/PublicationReporting.md)
 - [PublicationType](docs/PublicationType.md)
 - [SetChannelCatalogMarketplaceSettingsRequest](docs/SetChannelCatalogMarketplaceSettingsRequest.md)
 - [Type](docs/Type.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Ocp-Apim-Subscription-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@beezup.com

