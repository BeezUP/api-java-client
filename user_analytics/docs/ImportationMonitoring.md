
# ImportationMonitoring

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | [**BeezUPCommonUserId**](BeezUPCommonUserId.md) |  |  [optional]
**success** | **Boolean** | Indicates if the importation was successfully completed or not | 
**executionId** | [**ExecutionId**](ExecutionId.md) |  | 
**lastUpdateUtcDate** | [**DateTime**](DateTime.md) | The last update of the reporting | 
**beginUtcDate** | [**DateTime**](DateTime.md) | The start date of the importation | 
**errors** | [**List&lt;BeezUPCommonUserErrorMessage&gt;**](BeezUPCommonUserErrorMessage.md) | In case of error a description will be indicated |  [optional]
**steps** | **Map&lt;String, Boolean&gt;** | Contains all steps of the importation process with a boolean. If true the step has been passed, false the step is not complete | 



