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
import io.swagger.client.api.PublicChannelsApi;

import java.io.File;
import java.util.*;

public class PublicChannelsApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/BeezUP/public_channels/2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PublicChannelsApi* | [**getChannels**](docs/PublicChannelsApi.md#getChannels) | **GET** /{countryIsoCode} | The channel list for one country
*PublicChannelsApi* | [**getChannelsIndex**](docs/PublicChannelsApi.md#getChannelsIndex) | **GET** / | Get public channel index


## Documentation for Models

 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
 - [BeezUPCommonErrorResponseMessage](docs/BeezUPCommonErrorResponseMessage.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLink3](docs/BeezUPCommonLink3.md)
 - [BeezUPCommonLinkParameter3](docs/BeezUPCommonLinkParameter3.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [ChannelInfo](docs/ChannelInfo.md)
 - [ChannelInfoList](docs/ChannelInfoList.md)
 - [ChannelInfoListLinks](docs/ChannelInfoListLinks.md)
 - [LinksGetChannelsIndexLink](docs/LinksGetChannelsIndexLink.md)
 - [LinksGetChannelsLink](docs/LinksGetChannelsLink.md)
 - [LinksGetPublicListOfValuesLink](docs/LinksGetPublicListOfValuesLink.md)
 - [PublicChannelIndex](docs/PublicChannelIndex.md)
 - [PublicChannelIndexLinks](docs/PublicChannelIndexLinks.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@beezup.com

