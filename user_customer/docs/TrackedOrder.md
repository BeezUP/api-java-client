
# TrackedOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**utcDate** | [**DateTime**](DateTime.md) | The utc date of the order. | 
**channel** | [**BeezUPCommonChannelBasicInfo**](BeezUPCommonChannelBasicInfo.md) |  | 
**merchantOrderId** | **String** | The merchant order identifier | 
**totalAmount** | [**BigDecimal**](BigDecimal.md) | The total amount related to the order. | 
**currencyCode** | [**BeezUPCommonCurrencyCode**](BeezUPCommonCurrencyCode.md) |  | 
**paymentValidated** | **Boolean** | Indicate if the payment of this order has been validated or not. | 
**products** | [**List&lt;TrackedOrderProduct&gt;**](TrackedOrderProduct.md) | the product list related to this order. | 



