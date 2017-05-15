
# BeezUPCommonLinkParameter3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **Object** | The value of the parameter. It can be an integer a string or an object. |  [optional]
**required** | **Boolean** |  |  [optional]
**in** | [**BeezUPCommonParameterIn**](BeezUPCommonParameterIn.md) |  | 
**type** | [**BeezUPCommonParameterType**](BeezUPCommonParameterType.md) |  |  [optional]
**lovLink** | [**BeezUPCommonLOVLink3**](BeezUPCommonLOVLink3.md) |  |  [optional]
**lovRequired** | **Boolean** | If true, you MUST indicate a value from the list of values otherwise it&#39;s a freetext |  [optional]
**description** | **String** | description of the parameter |  [optional]
**schema** | **String** | schema of the parameter |  [optional]
**properties** | [**Map&lt;String, BeezUPCommonLinkParameterProperty3&gt;**](BeezUPCommonLinkParameterProperty3.md) | If the parameter is an object with flexible properties (additionProperties/dictionary), we will describe the properties of the object. |  [optional]



