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
import io.swagger.client.api.ChannelsGlobalApi;

import java.io.File;
import java.util.*;

public class ChannelsGlobalApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ChannelsGlobalApi apiInstance = new ChannelsGlobalApi();
        String storeId = "04730364-9826-4ff3-92e4-51fccd02bf10"; // String | The store identifier
        try {
            List<ChannelHeader> result = apiInstance.getAvailableChannels(storeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsGlobalApi#getAvailableChannels");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/channels*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChannelsGlobalApi* | [**getAvailableChannels**](docs/ChannelsGlobalApi.md#getAvailableChannels) | **GET** / | List all available channel for this store
*ChannelsGlobalApi* | [**getChannelCategories**](docs/ChannelsGlobalApi.md#getChannelCategories) | **GET** /{channelId}/categories | Get channel categories
*ChannelsGlobalApi* | [**getChannelColumns**](docs/ChannelsGlobalApi.md#getChannelColumns) | **POST** /{channelId}/columns | Get channel columns
*ChannelsGlobalApi* | [**getChannelInfo**](docs/ChannelsGlobalApi.md#getChannelInfo) | **GET** /{channelId} | Get channel information


## Documentation for Models

 - [BeezUPCommonBeezUPColumnName](docs/BeezUPCommonBeezUPColumnName.md)
 - [BeezUPCommonChannelCategoryId](docs/BeezUPCommonChannelCategoryId.md)
 - [BeezUPCommonChannelCategoryPath](docs/BeezUPCommonChannelCategoryPath.md)
 - [BeezUPCommonChannelColumnId](docs/BeezUPCommonChannelColumnId.md)
 - [BeezUPCommonChannelColumnName](docs/BeezUPCommonChannelColumnName.md)
 - [BeezUPCommonChannelId](docs/BeezUPCommonChannelId.md)
 - [BeezUPCommonChannelName](docs/BeezUPCommonChannelName.md)
 - [BeezUPCommonColumnDataType](docs/BeezUPCommonColumnDataType.md)
 - [BeezUPCommonColumnImportance](docs/BeezUPCommonColumnImportance.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonHttpUrl](docs/BeezUPCommonHttpUrl.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLink2](docs/BeezUPCommonLink2.md)
 - [BeezUPCommonLinkParameter2](docs/BeezUPCommonLinkParameter2.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [ChannelCategory](docs/ChannelCategory.md)
 - [ChannelCategoryChannelCode](docs/ChannelCategoryChannelCode.md)
 - [ChannelCategoryColumnOverride](docs/ChannelCategoryColumnOverride.md)
 - [ChannelCategoryColumnOverrides](docs/ChannelCategoryColumnOverrides.md)
 - [ChannelCategoryDefaultCost](docs/ChannelCategoryDefaultCost.md)
 - [ChannelCategoryLevel](docs/ChannelCategoryLevel.md)
 - [ChannelColumn](docs/ChannelColumn.md)
 - [ChannelColumnConfiguration](docs/ChannelColumnConfiguration.md)
 - [ChannelColumnDescription](docs/ChannelColumnDescription.md)
 - [ChannelColumnRestrictedValues](docs/ChannelColumnRestrictedValues.md)
 - [ChannelColumnShowInMapping](docs/ChannelColumnShowInMapping.md)
 - [ChannelFirstLevelCategory](docs/ChannelFirstLevelCategory.md)
 - [ChannelHeader](docs/ChannelHeader.md)
 - [ChannelHeaderLinks](docs/ChannelHeaderLinks.md)
 - [ChannelInfo](docs/ChannelInfo.md)
 - [ChannelInfoDetails](docs/ChannelInfoDetails.md)
 - [ChannelInfoKeyNumbers](docs/ChannelInfoKeyNumbers.md)
 - [ChannelInfoSalesContact](docs/ChannelInfoSalesContact.md)
 - [ChannelInfoTechnicalContact](docs/ChannelInfoTechnicalContact.md)
 - [ChannelRootCategory](docs/ChannelRootCategory.md)


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

