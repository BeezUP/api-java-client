
# ExclusionFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ExclusionFilterName**](ExclusionFilterName.md) |  | 
**position** | **Integer** | The position of the exclusion filter | 
**groupId** | **String** | Indicate the filter&#39;s group. All filters in the same group means an \&quot;AND\&quot; operation in the filter group | 
**positionInGroup** | **Integer** | Indicate the filter group position. This information is used for the UI purpose and must be unique in the filter group. | 
**channelColumnId** | [**BeezUPCommonChannelColumnId**](BeezUPCommonChannelColumnId.md) |  | 
**operatorName** | [**ExclusionFilterOperatorName**](ExclusionFilterOperatorName.md) |  | 
**value** | **String** | The value indicate by the user when the filter operation requires it. |  [optional]
**enabled** | **Boolean** | indicates if the filter is currently active. | 



