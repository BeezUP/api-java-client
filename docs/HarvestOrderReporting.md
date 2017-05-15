
# HarvestOrderReporting

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionUUID** | [**ExecutionUUID**](ExecutionUUID.md) |  |  [optional]
**creationUtcDate** | [**DateTime**](DateTime.md) | The creation UTC date of the execution |  [optional]
**processingStatus** | **String** | The processing status of the execution |  [optional]
**lastUpdateUtcDate** | [**DateTime**](DateTime.md) | The last update UTC date of the execution |  [optional]
**errorMessage** | **String** | The warning message during the execution |  [optional]
**warningMessage** | **String** | The warning message during the execution |  [optional]
**beezUPStatus** | [**BeezUPOrderStatus**](BeezUPOrderStatus.md) |  |  [optional]
**marketplaceStatus** | **String** | The order marketplace status |  [optional]
**beezUPForcedStatus** | **String** | The marketplace order status forced by BeezUP during the order change oepration. This could happend when there is no status on the marketplace side. |  [optional]



