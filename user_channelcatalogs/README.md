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
import io.swagger.client.api.ChannelCatalogsCategoryMappingsApi;

import java.io.File;
import java.util.*;

public class ChannelCatalogsCategoryMappingsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ChannelCatalogsCategoryMappingsApi apiInstance = new ChannelCatalogsCategoryMappingsApi();
        String channelCatalogId = "6d6b04de-406b-4539-8e7e-bf3e8da5dfb0"; // String | The channel catalog identifier
        try {
            ChannelCatalogCategoryMappings result = apiInstance.getChannelCatalogCategories(channelCatalogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelCatalogsCategoryMappingsApi#getChannelCatalogCategories");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/channelCatalogs*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChannelCatalogsCategoryMappingsApi* | [**getChannelCatalogCategories**](docs/ChannelCatalogsCategoryMappingsApi.md#getChannelCatalogCategories) | **GET** /{channelCatalogId}/categoryMappings | Get channel catalog categories
*ChannelCatalogsCategoryMappingsApi* | [**mapChannelCatalogCategory**](docs/ChannelCatalogsCategoryMappingsApi.md#mapChannelCatalogCategory) | **POST** /{channelCatalogId}/categoryMappings/map | Map channel catalog category
*ChannelCatalogsCategoryMappingsApi* | [**unmapChannelCatalogCategory**](docs/ChannelCatalogsCategoryMappingsApi.md#unmapChannelCatalogCategory) | **POST** /{channelCatalogId}/categoryMappings/unmap | Unmap channel catalog category
*ChannelCatalogsColumnMappingsApi* | [**mapChannelCatalogColumns**](docs/ChannelCatalogsColumnMappingsApi.md#mapChannelCatalogColumns) | **PUT** /{channelCatalogId}/columnMappings | Configure channel catalog column mappings
*ChannelCatalogsExclusionFiltersApi* | [**configureChannelCatalogExclusionFilters**](docs/ChannelCatalogsExclusionFiltersApi.md#configureChannelCatalogExclusionFilters) | **PUT** /{channelCatalogId}/exclusionFilters | Configure channel catalog exclusion filters
*ChannelCatalogsExclusionFiltersApi* | [**getChannelCatalogExclusionFilterOperators**](docs/ChannelCatalogsExclusionFiltersApi.md#getChannelCatalogExclusionFilterOperators) | **GET** /exclusionFilterOperators | Get channel catalog exclusion filter operators
*ChannelCatalogsGlobalApi* | [**createChannelCatalog**](docs/ChannelCatalogsGlobalApi.md#createChannelCatalog) | **POST** / | Create a new channel catalog
*ChannelCatalogsGlobalApi* | [**deleteChannelCatalog**](docs/ChannelCatalogsGlobalApi.md#deleteChannelCatalog) | **DELETE** /{channelCatalogId} | Delete the channel catalog
*ChannelCatalogsGlobalApi* | [**getChannelCatalog**](docs/ChannelCatalogsGlobalApi.md#getChannelCatalog) | **GET** /{channelCatalogId} | Get the channel catalog information
*ChannelCatalogsGlobalApi* | [**getChannelCatalogs**](docs/ChannelCatalogsGlobalApi.md#getChannelCatalogs) | **GET** / | List all your current channel catalogs
*ChannelCatalogsProductsApi* | [**getChannelCatalogProductInfo**](docs/ChannelCatalogsProductsApi.md#getChannelCatalogProductInfo) | **GET** /{channelCatalogId}/products/{productId} | Get channel catalog product information
*ChannelCatalogsProductsApi* | [**getChannelCatalogProductInfoList**](docs/ChannelCatalogsProductsApi.md#getChannelCatalogProductInfoList) | **POST** /{channelCatalogId}/products | Get channel catalog product information list
*ChannelCatalogsProductsOptimisationApi* | [**disableChannelCatalogProduct**](docs/ChannelCatalogsProductsOptimisationApi.md#disableChannelCatalogProduct) | **POST** /{channelCatalogId}/products/{productId}/disable | Disable channel catalog product
*ChannelCatalogsProductsOptimisationApi* | [**reenableChannelCatalogProduct**](docs/ChannelCatalogsProductsOptimisationApi.md#reenableChannelCatalogProduct) | **POST** /{channelCatalogId}/products/{productId}/reenable | Reenable channel catalog product
*ChannelCatalogsProductsOverridesApi* | [**deleteChannelCatalogProductValueOverride**](docs/ChannelCatalogsProductsOverridesApi.md#deleteChannelCatalogProductValueOverride) | **DELETE** /{channelCatalogId}/products/{productId}/overrides/{channelColumnId} | Delete a specific channel catalog product value override
*ChannelCatalogsProductsOverridesApi* | [**overrideChannelCatalogProductOverrides**](docs/ChannelCatalogsProductsOverridesApi.md#overrideChannelCatalogProductOverrides) | **PUT** /{channelCatalogId}/products/{productId}/overrides | Override channel catalog product values
*ChannelCatalogsSettingsApi* | [**configureChannelCatalogCostSettings**](docs/ChannelCatalogsSettingsApi.md#configureChannelCatalogCostSettings) | **POST** /{channelCatalogId}/settings/cost | Disable a channel catalog
*ChannelCatalogsSettingsApi* | [**configureChannelCatalogGeneralSettings**](docs/ChannelCatalogsSettingsApi.md#configureChannelCatalogGeneralSettings) | **POST** /{channelCatalogId}/settings/general | Disable a channel catalog
*ChannelCatalogsSettingsApi* | [**disableChannelCatalog**](docs/ChannelCatalogsSettingsApi.md#disableChannelCatalog) | **POST** /{channelCatalogId}/disable | Disable a channel catalog
*ChannelCatalogsSettingsApi* | [**enableChannelCatalog**](docs/ChannelCatalogsSettingsApi.md#enableChannelCatalog) | **POST** /{channelCatalogId}/enable | Enable a channel catalog


## Documentation for Models

 - [ApiSettingStatus](docs/ApiSettingStatus.md)
 - [BeezUPCommonCatalogCategoryPath](docs/BeezUPCommonCatalogCategoryPath.md)
 - [BeezUPCommonCatalogColumnId](docs/BeezUPCommonCatalogColumnId.md)
 - [BeezUPCommonCatalogColumnUserName](docs/BeezUPCommonCatalogColumnUserName.md)
 - [BeezUPCommonChannelBasicInfo](docs/BeezUPCommonChannelBasicInfo.md)
 - [BeezUPCommonChannelCatalogId](docs/BeezUPCommonChannelCatalogId.md)
 - [BeezUPCommonChannelCategoryPath](docs/BeezUPCommonChannelCategoryPath.md)
 - [BeezUPCommonChannelColumnId](docs/BeezUPCommonChannelColumnId.md)
 - [BeezUPCommonChannelColumnName](docs/BeezUPCommonChannelColumnName.md)
 - [BeezUPCommonChannelId](docs/BeezUPCommonChannelId.md)
 - [BeezUPCommonChannelName](docs/BeezUPCommonChannelName.md)
 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonHttpUrl](docs/BeezUPCommonHttpUrl.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLink2](docs/BeezUPCommonLink2.md)
 - [BeezUPCommonLink3](docs/BeezUPCommonLink3.md)
 - [BeezUPCommonLinkParameter2](docs/BeezUPCommonLinkParameter2.md)
 - [BeezUPCommonLinkParameter3](docs/BeezUPCommonLinkParameter3.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonProductBasicInfo](docs/BeezUPCommonProductBasicInfo.md)
 - [BeezUPCommonStoreId](docs/BeezUPCommonStoreId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [CategoryMappingState](docs/CategoryMappingState.md)
 - [CategoryMappingStatus](docs/CategoryMappingStatus.md)
 - [ChannelCatalog](docs/ChannelCatalog.md)
 - [ChannelCatalogCategoryMapping](docs/ChannelCatalogCategoryMapping.md)
 - [ChannelCatalogCategoryMappingInfo](docs/ChannelCatalogCategoryMappingInfo.md)
 - [ChannelCatalogCategoryMappings](docs/ChannelCatalogCategoryMappings.md)
 - [ChannelCatalogList](docs/ChannelCatalogList.md)
 - [ChannelCatalogProductInfo](docs/ChannelCatalogProductInfo.md)
 - [ChannelCatalogProductInfoLinks](docs/ChannelCatalogProductInfoLinks.md)
 - [ChannelCatalogProductInfoList](docs/ChannelCatalogProductInfoList.md)
 - [ChannelCatalogProductInfoListLinks](docs/ChannelCatalogProductInfoListLinks.md)
 - [ChannelCatalogState](docs/ChannelCatalogState.md)
 - [ColumnMapping](docs/ColumnMapping.md)
 - [ColumnMappingList](docs/ColumnMappingList.md)
 - [ColumnMappingStatus](docs/ColumnMappingStatus.md)
 - [ColumnMappingWithName](docs/ColumnMappingWithName.md)
 - [ColumnMappingWithNameList](docs/ColumnMappingWithNameList.md)
 - [CostSettings](docs/CostSettings.md)
 - [CostType](docs/CostType.md)
 - [CreateChannelCatalogRequest](docs/CreateChannelCatalogRequest.md)
 - [ExclusionFilter](docs/ExclusionFilter.md)
 - [ExclusionFilterName](docs/ExclusionFilterName.md)
 - [ExclusionFilterOperator](docs/ExclusionFilterOperator.md)
 - [ExclusionFilterOperatorDataType](docs/ExclusionFilterOperatorDataType.md)
 - [ExclusionFilterOperatorName](docs/ExclusionFilterOperatorName.md)
 - [ExclusionFilters](docs/ExclusionFilters.md)
 - [GeneralSettings](docs/GeneralSettings.md)
 - [GetChannelCatalogProductInfoListRequest](docs/GetChannelCatalogProductInfoListRequest.md)
 - [LinksGetChannelCatalogProductInfo](docs/LinksGetChannelCatalogProductInfo.md)
 - [MapCategoryRequest](docs/MapCategoryRequest.md)
 - [ProductOverrideWithCatalogValue](docs/ProductOverrideWithCatalogValue.md)
 - [ProductOverrides](docs/ProductOverrides.md)
 - [ProductOverridesWithCatalogValues](docs/ProductOverridesWithCatalogValues.md)
 - [UnmapCategoryRequest](docs/UnmapCategoryRequest.md)
 - [UpgradeOfferRequired](docs/UpgradeOfferRequired.md)


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

