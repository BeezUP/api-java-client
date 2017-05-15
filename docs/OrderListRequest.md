
# OrderListRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceTechnicalCodes** | [**List&lt;BeezUPCommonMarketplaceTechnicalCode&gt;**](BeezUPCommonMarketplaceTechnicalCode.md) |  |  [optional]
**marketplaceBusinessCodes** | [**List&lt;BeezUPCommonMarketplaceBusinessCode&gt;**](BeezUPCommonMarketplaceBusinessCode.md) |  |  [optional]
**accountIds** | [**List&lt;AccountId&gt;**](AccountId.md) | Account id list |  [optional]
**beezUPOrderStatuses** | [**List&lt;BeezUPOrderStatus&gt;**](BeezUPOrderStatus.md) |  |  [optional]
**dateSearchType** | [**DateSearchType**](DateSearchType.md) |  | 
**beginPeriodUtcDate** | [**DateTime**](DateTime.md) | The begin period you want to make the search. \\ The period MUST not be greater than 30 days. The begin period MUST be lower than the end period.   | 
**endPeriodUtcDate** | [**DateTime**](DateTime.md) | The end period of you search. \\ The period MUST not be greater than 30 days. \\ The end period MUST be greater than the begin period.  The end period MUST be lower to the current date.  | 
**orderBuyerName** | [**OrderBuyerName**](OrderBuyerName.md) |  |  [optional]
**marketplaceOrderIds** | [**List&lt;MarketplaceOrderId&gt;**](MarketplaceOrderId.md) |  |  [optional]
**orderMerchantOrderIds** | [**List&lt;OrderMerchantOrderId&gt;**](OrderMerchantOrderId.md) | Merchant order id list |  [optional]
**pageSize** | [**PageSize**](PageSize.md) |  | 
**pageNumber** | [**PageNumber**](PageNumber.md) |  | 



