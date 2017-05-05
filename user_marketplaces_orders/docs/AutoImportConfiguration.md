
# AutoImportConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**InputConfiguration**](InputConfiguration.md) |  | 
**inputConfiguredByUserId** | [**BeezUPCommonUserId**](BeezUPCommonUserId.md) |  | 
**schedulingType** | [**SchedulingType**](SchedulingType.md) |  | 
**scheduledByUserId** | [**BeezUPCommonUserId**](BeezUPCommonUserId.md) |  |  [optional]
**schedulingValue** | **List&lt;String&gt;** | Indicate the scheduling value. If the scheduling type is Interval then the value will be a duration otherwise the values will be the time. | 
**paused** | **Boolean** | Indicate if the auto import is in pause or not. | 
**pauseStatusChangedByUserId** | [**BeezUPCommonUserId**](BeezUPCommonUserId.md) |  |  [optional]
**pauseStatusChangedUtcDate** | [**DateTime**](DateTime.md) | Indicate when the pause status has changed in UTC date. |  [optional]
**duplicateProductConfiguration** | [**DuplicateProductValueConfiguration**](DuplicateProductValueConfiguration.md) |  | 
**schedulingLocalTimeZoneName** | **String** | Indicate the time zone name of the scheduling. If the scheduling type is \&quot;Schedule\&quot; |  [optional]



