
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceTechnicalCode** | [**MarketplaceTechnicalCode**](MarketplaceTechnicalCode.md) |  | 
**accountId** | [**AccountId**](AccountId.md) |  | 
**beezUPOrderId** | [**BeezUPOrderId**](BeezUPOrderId.md) |  | 
**beezUPOrderUrl** | [**BeezUPCommonHttpUrl**](BeezUPCommonHttpUrl.md) |  |  [optional]
**marketplaceBusinessCode** | [**MarketplaceBusinessCode**](MarketplaceBusinessCode.md) |  | 
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
**links** | [**DefinitionsorderHeaderLinks**](DefinitionsorderHeaderLinks.md) |  | 
**orderMarketPlaceChannel** | **String** | Useful to identify the origin of the order. For example in Amazon. |  [optional]
**orderTotalTax** | [**BigDecimal**](BigDecimal.md) | The total tax of this order |  [optional]
**orderTotalCommission** | [**BigDecimal**](BigDecimal.md) | The total commission of this order |  [optional]
**orderPaymentMethod** | **String** | The payment method of this order |  [optional]
**orderPayingUtcDate** | [**DateTime**](DateTime.md) | The UTC date of the payment of this order |  [optional]
**orderComment** | **String** | The comment associated to this order |  [optional]
**orderShippingCivility** | **String** | The civility of the person in the shipping address for this order |  [optional]
**orderShippingCompanyName** | **String** | The company name of the shipping address for this order |  [optional]
**orderShippingAddressName** | **String** | The name of the person in the shipping address for this order |  [optional]
**orderShippingEmail** | **String** | The email of the person in the shipping address for this order |  [optional]
**orderShippingAddressLine1** | **String** | The shipping address line 1 of this order |  [optional]
**orderShippingAddressLine2** | **String** | The shipping address line 2 of this order |  [optional]
**orderShippingAddressLine3** | **String** | The shipping address line 3 of this order |  [optional]
**orderShippingAddressPostalCode** | **String** | The shipping address postal code of this order |  [optional]
**orderShippingAddressCity** | **String** | The shipping address city of this order |  [optional]
**orderShippingAddressStateOrRegion** | **String** | The shipping address state or region of this order |  [optional]
**orderShippingAddressCountryName** | **String** | The shipping address country name |  [optional]
**orderShippingAddressCountryIsoCodeAlpha2** | **String** | The shipping address country iso code alpha 2 (see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table for more details) |  [optional]
**orderShippingPhone** | **String** | The phone number of the person in the shipping address for this order |  [optional]
**orderShippingMobilePhone** | **String** | The mobile phone number of the person in the shipping address for this order |  [optional]
**orderShippingPrice** | [**BigDecimal**](BigDecimal.md) | The shipping price of this order |  [optional]
**orderShippingMethod** | **String** | The shipping method of this order |  [optional]
**orderShippingShippingTax** | [**BigDecimal**](BigDecimal.md) | The shipping tax for this order |  [optional]
**orderShippingEarliestShipUtcDate** | [**DateTime**](DateTime.md) | The UTC date of the earliest ship for this order |  [optional]
**orderShippingLatestShipUtcDate** | [**DateTime**](DateTime.md) | The UTC date of the latest ship for this order |  [optional]
**orderBuyerIdentifier** | **String** | The buyer identifier for this order |  [optional]
**orderBuyerCivility** | **String** | The buyer civility for this order |  [optional]
**orderBuyerCompanyName** | **String** | The buyer company name for this order |  [optional]
**orderBuyerEmail** | **String** | The email of the buyer for this order |  [optional]
**orderBuyerAddressLine1** | **String** | The Buyer address line 1 of this order |  [optional]
**orderBuyerAddressLine2** | **String** | The Buyer address line 2 of this order |  [optional]
**orderBuyerAddressLine3** | **String** | The Buyer address line 3 of this order |  [optional]
**orderBuyerAddressPostalCode** | **String** | The Buyer address postal code of this order |  [optional]
**orderBuyerAddressCity** | **String** | The Buyer address city of this order |  [optional]
**orderBuyerAddressStateOrRegion** | **String** | The Buyer address state or region of this order |  [optional]
**orderBuyerAddressCountryName** | **String** | The Buyer address country name |  [optional]
**orderBuyerAddressCountryIsoCodeAlpha2** | **String** | The Buyer address country iso code alpha 2 (see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table for more details) |  [optional]
**orderBuyerPhone** | **String** | The phone number of the buyer for this order |  [optional]
**orderBuyerMobilePhone** | **String** | The mobile phone number of the buyer for this order |  [optional]
**orderOrderSourceUri** | **String** | Technical information: The url to the source of this order. We received this information from the marketplace.  |  [optional]
**orderOrderItemsSourceUri** | **String** | Technical information: The url to the source of this order items. We received this information from the marketplace.  |  [optional]
**orderItems** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  | 
**transitionLinks** | [**OrderTransitionLinks**](OrderTransitionLinks.md) |  | 



