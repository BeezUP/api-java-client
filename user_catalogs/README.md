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
import io.swagger.client.api.AutoApi;

import java.io.File;
import java.util.*;

public class AutoApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AutoApi apiInstance = new AutoApi();
        String storeId = "storeId_example"; // String | Your store identifier
        ConfigureAutoImportIntervalRequest request = new ConfigureAutoImportIntervalRequest(); // ConfigureAutoImportIntervalRequest | 
        try {
            apiInstance.autoConfigureAutoImportInterval(storeId, request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutoApi#autoConfigureAutoImportInterval");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/catalogs*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AutoApi* | [**autoConfigureAutoImportInterval**](docs/AutoApi.md#autoConfigureAutoImportInterval) | **POST** /{storeId}/autoImport/scheduling/interval | Configure Auto Import Interval
*AutoApi* | [**autoDeleteAutoImport**](docs/AutoApi.md#autoDeleteAutoImport) | **DELETE** /{storeId}/autoImport | Delete Auto Import
*AutoApi* | [**autoGetAutoImportConfiguration**](docs/AutoApi.md#autoGetAutoImportConfiguration) | **GET** /{storeId}/autoImport | Get the auto import configuration
*AutoApi* | [**autoPauseAutoImport**](docs/AutoApi.md#autoPauseAutoImport) | **POST** /{storeId}/autoImport/pause | Pause Auto Import
*AutoApi* | [**autoResumeAutoImport**](docs/AutoApi.md#autoResumeAutoImport) | **POST** /{storeId}/autoImport/resume | Resume Auto Import
*AutoApi* | [**autoScheduleAutoImport**](docs/AutoApi.md#autoScheduleAutoImport) | **POST** /{storeId}/autoImport/scheduling/schedules | Configure Auto Import Schedules
*AutoApi* | [**autoStartAutoImport**](docs/AutoApi.md#autoStartAutoImport) | **POST** /{storeId}/autoImport/start | Start Auto Import Manually
*AutoApi* | [**importationActivateAutoImport**](docs/AutoApi.md#importationActivateAutoImport) | **POST** /{storeId}/autoImport | Activate the auto importation of the last successful manual catalog importation.
*CatalogApi* | [**catalogChangeCatalogColumnUserName**](docs/CatalogApi.md#catalogChangeCatalogColumnUserName) | **POST** /{storeId}/catalogColumns/{columnId}/rename | Change Catalog Column User Name
*CatalogApi* | [**catalogChangeCustomColumnExpression**](docs/CatalogApi.md#catalogChangeCustomColumnExpression) | **PUT** /{storeId}/customColumns/{columnId}/expression | Change custom column expression
*CatalogApi* | [**catalogChangeCustomColumnUserName**](docs/CatalogApi.md#catalogChangeCustomColumnUserName) | **POST** /{storeId}/customColumns/{columnId}/rename | Change Custom Column User Name
*CatalogApi* | [**catalogComputeExpression**](docs/CatalogApi.md#catalogComputeExpression) | **POST** /{storeId}/customColumns/computeExpression | Compute the expression for this catalog.
*CatalogApi* | [**catalogDeleteCustomColumn**](docs/CatalogApi.md#catalogDeleteCustomColumn) | **DELETE** /{storeId}/customColumns/{columnId} | Delete custom column
*CatalogApi* | [**catalogGetCatalogColumns**](docs/CatalogApi.md#catalogGetCatalogColumns) | **GET** /{storeId}/catalogColumns | Get catalog column list
*CatalogApi* | [**catalogGetCategories**](docs/CatalogApi.md#catalogGetCategories) | **GET** /{storeId}/categories | Get category list
*CatalogApi* | [**catalogGetCustomColumnExpression**](docs/CatalogApi.md#catalogGetCustomColumnExpression) | **GET** /{storeId}/customColumns/{columnId}/expression | Get the encrypted custom column expression
*CatalogApi* | [**catalogGetCustomColumns**](docs/CatalogApi.md#catalogGetCustomColumns) | **GET** /{storeId}/customColumns | Get custom column list
*CatalogApi* | [**catalogGetProduct**](docs/CatalogApi.md#catalogGetProduct) | **GET** /{storeId}/products/{productId} | Get product
*CatalogApi* | [**catalogGetProducts**](docs/CatalogApi.md#catalogGetProducts) | **POST** /{storeId}/products | Get product list
*CatalogApi* | [**catalogGetRandomProducts**](docs/CatalogApi.md#catalogGetRandomProducts) | **GET** /{storeId}/products/random | Get random product list
*CatalogApi* | [**catalogSaveCustomColumn**](docs/CatalogApi.md#catalogSaveCustomColumn) | **PUT** /{storeId}/customColumns/{columnId} | Create or replace a custom column
*CatalogApi* | [**importationGetManualUpdateLastInputConfig**](docs/CatalogApi.md#importationGetManualUpdateLastInputConfig) | **GET** /{storeId}/inputConfiguration | Get the last input configuration
*GlobalApi* | [**catalogGetBeezUPColumns**](docs/GlobalApi.md#catalogGetBeezUPColumns) | **GET** /beezupColumns | Get the BeezUP columns
*ImportationCatalogInfoApi* | [**importationConfigureCatalogColumn**](docs/ImportationCatalogInfoApi.md#importationConfigureCatalogColumn) | **POST** /{storeId}/importations/{executionId}/catalogColumns/{columnId} | Configure catalog column
*ImportationCatalogInfoApi* | [**importationDeleteCustomColumn**](docs/ImportationCatalogInfoApi.md#importationDeleteCustomColumn) | **DELETE** /{storeId}/importations/{executionId}/customColumns/{columnId} | Delete Custom Column
*ImportationCatalogInfoApi* | [**importationGetCustomColumnExpression**](docs/ImportationCatalogInfoApi.md#importationGetCustomColumnExpression) | **GET** /{storeId}/importations/{executionId}/customColumns/{columnId}/expression | Get the encrypted custom column expression in this importation
*ImportationCatalogInfoApi* | [**importationGetCustomColumns**](docs/ImportationCatalogInfoApi.md#importationGetCustomColumns) | **GET** /{storeId}/importations/{executionId}/customColumns | Get custom columns currently place in this importation
*ImportationCatalogInfoApi* | [**importationGetDetectedCatalogColumns**](docs/ImportationCatalogInfoApi.md#importationGetDetectedCatalogColumns) | **GET** /{storeId}/importations/{executionId}/catalogColumns | Get detected catalog columns during this importation.
*ImportationCatalogInfoApi* | [**importationGetProductSample**](docs/ImportationCatalogInfoApi.md#importationGetProductSample) | **GET** /{storeId}/importations/{executionId}/productSamples/{productSampleIndex} | Get the product sample related to this importation with all columns (catalog and custom)
*ImportationCatalogInfoApi* | [**importationGetProductSampleCustomColumnValue**](docs/ImportationCatalogInfoApi.md#importationGetProductSampleCustomColumnValue) | **GET** /{storeId}/importations/{executionId}/productSamples/{productSampleIndex}/customColumns/{columnId} | Get product sample custom column value related to this importation.
*ImportationCatalogInfoApi* | [**importationIgnoreColumn**](docs/ImportationCatalogInfoApi.md#importationIgnoreColumn) | **POST** /{storeId}/importations/{executionId}/catalogColumns/{columnId}/ignore | Ignore Column
*ImportationCatalogInfoApi* | [**importationMapCatalogColumn**](docs/ImportationCatalogInfoApi.md#importationMapCatalogColumn) | **POST** /{storeId}/importations/{executionId}/catalogColumns/{columnId}/map | Map catalog column to a BeezUP column
*ImportationCatalogInfoApi* | [**importationMapCustomColumn**](docs/ImportationCatalogInfoApi.md#importationMapCustomColumn) | **POST** /{storeId}/importations/{executionId}/customColumns/{columnId}/map | Map custom column to a BeezUP column
*ImportationCatalogInfoApi* | [**importationReattendColumn**](docs/ImportationCatalogInfoApi.md#importationReattendColumn) | **POST** /{storeId}/importations/{executionId}/catalogColumns/{columnId}/reattend | Reattend Column
*ImportationCatalogInfoApi* | [**importationSaveCustomColumn**](docs/ImportationCatalogInfoApi.md#importationSaveCustomColumn) | **PUT** /{storeId}/importations/{executionId}/customColumns/{columnId} | Create or replace a custom column
*ImportationCatalogInfoApi* | [**importationUnmapCatalogColumn**](docs/ImportationCatalogInfoApi.md#importationUnmapCatalogColumn) | **POST** /{storeId}/importations/{executionId}/catalogColumns/{columnId}/unmap | Unmap catalog column
*ImportationCatalogInfoApi* | [**importationUnmapCustomColumn**](docs/ImportationCatalogInfoApi.md#importationUnmapCustomColumn) | **POST** /{storeId}/importations/{executionId}/customColumns/{columnId}/unmap | Unmap custom column
*ImportationProcessApi* | [**importationCancel**](docs/ImportationProcessApi.md#importationCancel) | **DELETE** /{storeId}/importations/{executionId} | Cancel importation
*ImportationProcessApi* | [**importationCommit**](docs/ImportationProcessApi.md#importationCommit) | **POST** /{storeId}/importations/{executionId}/commit | Commit Importation
*ImportationProcessApi* | [**importationCommitColumns**](docs/ImportationProcessApi.md#importationCommitColumns) | **POST** /{storeId}/importations/{executionId}/commitColumns | Commit columns
*ImportationProcessApi* | [**importationConfigureRemainingCatalogColumns**](docs/ImportationProcessApi.md#importationConfigureRemainingCatalogColumns) | **POST** /{storeId}/importations/{executionId}/configureRemainingCatalogColumns | Configure remaining catalog columns
*ImportationProcessApi* | [**importationGetImportationMonitoring**](docs/ImportationProcessApi.md#importationGetImportationMonitoring) | **GET** /{storeId}/importations/{executionId} | Get the importation status
*ImportationProcessApi* | [**importationGetReportings**](docs/ImportationProcessApi.md#importationGetReportings) | **GET** /{storeId}/importations | Get the latest catalog importation reporting
*ImportationProcessApi* | [**importationStartManualUpdate**](docs/ImportationProcessApi.md#importationStartManualUpdate) | **POST** /{storeId}/importations | Start Manual Import
*ImportationProcessApi* | [**importationTechnicalProgression**](docs/ImportationProcessApi.md#importationTechnicalProgression) | **GET** /{storeId}/importations/{executionId}/technicalProgression | Get technical progression


## Documentation for Models

 - [AutoImportConfiguration](docs/AutoImportConfiguration.md)
 - [BeezUPColumnConfiguration](docs/BeezUPColumnConfiguration.md)
 - [BeezUPCommonBeezUPColumnName](docs/BeezUPCommonBeezUPColumnName.md)
 - [BeezUPCommonCatalogCategoryId](docs/BeezUPCommonCatalogCategoryId.md)
 - [BeezUPCommonCatalogCategoryPath](docs/BeezUPCommonCatalogCategoryPath.md)
 - [BeezUPCommonColumnDataType](docs/BeezUPCommonColumnDataType.md)
 - [BeezUPCommonColumnImportance](docs/BeezUPCommonColumnImportance.md)
 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
 - [BeezUPCommonErrorResponseMessage](docs/BeezUPCommonErrorResponseMessage.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLink2](docs/BeezUPCommonLink2.md)
 - [BeezUPCommonLinkParameter2](docs/BeezUPCommonLinkParameter2.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonProductId](docs/BeezUPCommonProductId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonUserId](docs/BeezUPCommonUserId.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [CanBeTruncated](docs/CanBeTruncated.md)
 - [CatalogColumn](docs/CatalogColumn.md)
 - [CatalogColumnName](docs/CatalogColumnName.md)
 - [CatalogColumns](docs/CatalogColumns.md)
 - [Categories](docs/Categories.md)
 - [Category](docs/Category.md)
 - [ChangeCustomColumnExpressionRequest](docs/ChangeCustomColumnExpressionRequest.md)
 - [ChangeCustomColumnRequest](docs/ChangeCustomColumnRequest.md)
 - [ChangeUserColumnNameRequest](docs/ChangeUserColumnNameRequest.md)
 - [ColumnConfiguration](docs/ColumnConfiguration.md)
 - [ColumnCultureName](docs/ColumnCultureName.md)
 - [ColumnFormat](docs/ColumnFormat.md)
 - [ColumnId](docs/ColumnId.md)
 - [CompareOptions](docs/CompareOptions.md)
 - [CompressionFormatStrategy](docs/CompressionFormatStrategy.md)
 - [ComputeExpressionRequest](docs/ComputeExpressionRequest.md)
 - [ConfigureAutoImportIntervalRequest](docs/ConfigureAutoImportIntervalRequest.md)
 - [ConfigureCatalogColumnCatalogRequest](docs/ConfigureCatalogColumnCatalogRequest.md)
 - [CreateCustomColumnRequest](docs/CreateCustomColumnRequest.md)
 - [Credential](docs/Credential.md)
 - [CustomColumn](docs/CustomColumn.md)
 - [CustomColumns](docs/CustomColumns.md)
 - [DetectedCatalogColumn](docs/DetectedCatalogColumn.md)
 - [DetectedCatalogColumns](docs/DetectedCatalogColumns.md)
 - [DisplayGroupName](docs/DisplayGroupName.md)
 - [DownloadCatalogStrategy](docs/DownloadCatalogStrategy.md)
 - [DuplicateProductValueConfiguration](docs/DuplicateProductValueConfiguration.md)
 - [DuplicateProductValueStrategy](docs/DuplicateProductValueStrategy.md)
 - [EncryptedBlocklyExpression](docs/EncryptedBlocklyExpression.md)
 - [EncryptedExpression](docs/EncryptedExpression.md)
 - [ExecutionId](docs/ExecutionId.md)
 - [ExistingCatalogColumnConfiguration](docs/ExistingCatalogColumnConfiguration.md)
 - [FileFormatStrategy](docs/FileFormatStrategy.md)
 - [GetProductsRequest](docs/GetProductsRequest.md)
 - [ImportationMonitoring](docs/ImportationMonitoring.md)
 - [ImportationReporting](docs/ImportationReporting.md)
 - [ImportationTechnicalProgression](docs/ImportationTechnicalProgression.md)
 - [InlineResponse409](docs/InlineResponse409.md)
 - [InputConfiguration](docs/InputConfiguration.md)
 - [InputFileConfiguration](docs/InputFileConfiguration.md)
 - [InputFileFetchConfiguration](docs/InputFileFetchConfiguration.md)
 - [InputFileReadConfiguration](docs/InputFileReadConfiguration.md)
 - [InputFileReadCsvConfiguration](docs/InputFileReadCsvConfiguration.md)
 - [InputFileReadXmlConfiguration](docs/InputFileReadXmlConfiguration.md)
 - [LastManualImportInputConfiguration](docs/LastManualImportInputConfiguration.md)
 - [MapBeezUPColumnRequest](docs/MapBeezUPColumnRequest.md)
 - [Product](docs/Product.md)
 - [ProductSample](docs/ProductSample.md)
 - [ProductValues](docs/ProductValues.md)
 - [Products](docs/Products.md)
 - [ScheduleAutoImportRequest](docs/ScheduleAutoImportRequest.md)
 - [SchedulingType](docs/SchedulingType.md)
 - [StartManualImportRequest](docs/StartManualImportRequest.md)
 - [UserColumName](docs/UserColumName.md)


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

