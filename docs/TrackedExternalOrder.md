
# TrackedExternalOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**utcDate** | [**DateTime**](DateTime.md) | The utc date of the external order. | 
**merchantOrderId** | **String** | The merchant order identifier | 
**visitorId** | **String** | Can be null. The visitor identifier related to this external order |  [optional]
**totalAmount** | [**BigDecimal**](BigDecimal.md) | The total amount related to the external order. | 
**currencyCode** | [**BeezUPCommonCurrencyCode**](BeezUPCommonCurrencyCode.md) |  | 
**paymentValidated** | **Boolean** | Indicate if the payment of this external order has been validated or not. | 
**products** | [**List&lt;TrackedExternalOrderProduct&gt;**](TrackedExternalOrderProduct.md) | Can be null. the product list related to this external order. |  [optional]



