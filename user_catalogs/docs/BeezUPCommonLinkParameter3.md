
# BeezUPCommonLinkParameter3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value of the parameter |  [optional]
**required** | **Boolean** |  |  [optional]
**in** | [**InEnum**](#InEnum) | * path: if the parameter must be pass in the path uri * header: if the parameter must be passed in http header * query: if the parameter must be passed in querystring * body: if the paramter must be passed in the body  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The value type of the parameter |  [optional]
**lovLink** | [**BeezUPCommonLOVLink2**](BeezUPCommonLOVLink2.md) | This parameter expect the values indicated in this list of values. |  [optional]
**lovRequired** | **Boolean** | If true, you MUST use indicate a value from the list of values otherwise it&#39;s a freetext |  [optional]
**description** | **String** | description of the parameter |  [optional]
**schema** | **String** | schema of the parameter |  [optional]


<a name="InEnum"></a>
## Enum: InEnum
Name | Value
---- | -----
PATH | &quot;path&quot;
HEADER | &quot;header&quot;
QUERY | &quot;query&quot;
BODY | &quot;body&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
STRING | &quot;string&quot;
INTEGER | &quot;integer&quot;
NUMBER | &quot;number&quot;
BOOLEAN | &quot;boolean&quot;
OBJECT | &quot;object&quot;
ARRAY | &quot;array&quot;
DATE | &quot;date&quot;
DATE_TIME | &quot;date-time&quot;



