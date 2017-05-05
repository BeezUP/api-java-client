
# OrderListRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceTechnicalCodes** | [**List&lt;MarketplaceTechnicalCode&gt;**](MarketplaceTechnicalCode.md) |  |  [optional]
**marketplaceBusinessCodes** | [**List&lt;MarketplaceBusinessCode&gt;**](MarketplaceBusinessCode.md) |  |  [optional]
**accountIds** | [**List&lt;AccountId&gt;**](AccountId.md) | Account id list |  [optional]
**beezUPOrderStatuses** | [**List&lt;BeezUPOrderStatus&gt;**](BeezUPOrderStatus.md) |  |  [optional]
**dateSearchType** | [**DateSearchType**](DateSearchType.md) |  |  [optional]
**beginPeriodUtcDate** | [**DateTime**](DateTime.md) | The begin period you want to make the search. The period MUST not be greater than 30 days. If null, the current date minus 30 days will be used. |  [optional]
**endPeriodUtcDate** | [**DateTime**](DateTime.md) | The end period of you search. The period MUST not be greater than 30 days. If null the current date will be used. |  [optional]
**orderBuyerName** | [**OrderBuyerName**](OrderBuyerName.md) |  |  [optional]
**marketplaceOrderIds** | [**List&lt;MarketplaceOrderId&gt;**](MarketplaceOrderId.md) |  |  [optional]
**orderMerchantOrderIds** | [**List&lt;OrderMerchantOrderId&gt;**](OrderMerchantOrderId.md) | Merchant order id list |  [optional]
**pageSize** | [**PageSize**](PageSize.md) |  |  [optional]
**pageNumber** | [**PageNumber**](PageNumber.md) |  |  [optional]



