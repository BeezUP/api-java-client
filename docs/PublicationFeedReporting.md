
# PublicationFeedReporting

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedType** | [**FeedType**](FeedType.md) |  | 
**startUtcDate** | [**DateTime**](DateTime.md) | The feed publication start time (UTC timezone) | 
**endUtcDate** | [**DateTime**](DateTime.md) | The feed publication end time (UTC timezone) |  [optional]
**processingStatus** | **String** | The processing status | 
**exportedProducts** | **Integer** | The product count downloaded from BeezUP Export |  [optional]
**transmittedItems** | **Integer** | The item count (products or offers) sent to the marketplace |  [optional]
**publishedItems** | **Integer** | The item count (products or offers) the marketplace flagged as successful |  [optional]
**publishedItemsWithWarning** | **Integer** | The item count (products or offers) the marketplace flagged as successful with warnings |  [optional]
**failedItems** | **Integer** | The item count (products or offers) the marketplace flagged as failed |  [optional]
**errorMessage** | **String** | The error message |  [optional]
**htmlReportUrl** | **String** | The Url for the Html Report generated |  [optional]
**htmlReportGenerationErrorMessage** | **String** | The error message if the Html Report generation failed |  [optional]
**completed** | **Boolean** | Indicates if the publication is completed or not |  [optional]



