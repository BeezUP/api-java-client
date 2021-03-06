
# TrackedExternalOrderProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productSku** | **String** | The product sku received related to the external order. | 
**productTitle** | **String** | We tried to get the catalog product title based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog. |  [optional]
**productImageUrl** | **String** | We tried to get the catalog product image Url based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog. |  [optional]
**productActive** | **Boolean** | We tried to get the catalog product if it&#39;s still active based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog. |  [optional]
**productId** | **String** | We tried to get the catalog product identifier based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog. |  [optional]
**unitPrice** | **String** | The product&#39;s unit price related to this external order. This property is voluntarily a string because the value could be an invalid one. |  [optional]
**quantity** | **String** | Indicate the product&#39;s quantity ordered. This property is voluntarily a string because the value could be an invalid one |  [optional]
**margin** | **String** | Indicate the product&#39;s margin related to this order. This property is voluntarily a string because the value could be an invalid one |  [optional]



