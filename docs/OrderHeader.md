
# OrderHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceTechnicalCode** | [**BeezUPCommonMarketplaceTechnicalCode**](BeezUPCommonMarketplaceTechnicalCode.md) |  | 
**accountId** | [**AccountId**](AccountId.md) |  | 
**beezUPOrderId** | [**BeezUPOrderId**](BeezUPOrderId.md) |  | 
**beezUPOrderUrl** | [**BeezUPCommonHttpUrl**](BeezUPCommonHttpUrl.md) |  |  [optional]
**marketplaceBusinessCode** | [**BeezUPCommonMarketplaceBusinessCode**](BeezUPCommonMarketplaceBusinessCode.md) |  | 
**orderMarketplaceOrderId** | [**MarketplaceOrderId**](MarketplaceOrderId.md) |  | 
**orderStatusBeezUPOrderStatus** | [**BeezUPOrderStatus**](BeezUPOrderStatus.md) |  | 
**orderStatusMarketplaceOrderStatus** | [**MarketplaceOrderStatus**](MarketplaceOrderStatus.md) |  |  [optional]
**orderMerchantOrderId** | [**OrderMerchantOrderId**](OrderMerchantOrderId.md) |  |  [optional]
**orderMerchantECommerceSoftwareName** | [**OrderMerchantECommerceSoftwareName**](OrderMerchantECommerceSoftwareName.md) |  |  [optional]
**orderMerchantECommerceSoftwareVersion** | [**OrderMerchantECommerceSoftwareVersion**](OrderMerchantECommerceSoftwareVersion.md) |  |  [optional]
**orderPurchaseUtcDate** | [**DateTime**](DateTime.md) | The purchase date of this order | 
**orderLastModificationUtcDate** | [**DateTime**](DateTime.md) | The last modification UTC date done by BeezUP of this order | 
**orderMarketplaceLastModificationUtcDate** | [**DateTime**](DateTime.md) | The last modification UTC date done by the marketplace on this order | 
**orderBuyerName** | [**OrderBuyerName**](OrderBuyerName.md) |  |  [optional]
**orderTotalPrice** | [**BigDecimal**](BigDecimal.md) | The total price of this order (corresponding to the amount paid by the customer) |  [optional]
**orderCurrencyCode** | [**BeezUPCommonCurrencyCode**](BeezUPCommonCurrencyCode.md) |  |  [optional]
**processing** | [**Processing**](Processing.md) |  | 
**etag** | [**Etag**](Etag.md) |  | 
**links** | [**OrderHeaderLinks**](OrderHeaderLinks.md) |  | 



