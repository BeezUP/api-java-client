
# ContractCommitmentInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitmentCalculatedFinishDate** | [**DateTime**](DateTime.md) | The commitment end date related to the offer |  [optional]
**newContractStartDate** | [**DateTime**](DateTime.md) | The start date related to the offer |  [optional]
**commitmentPeriodInMonth** | **Integer** | The commitment period in month related to the offer |  [optional]
**trialPeriodInMonth** | **Integer** | The trial period in month related to the offer |  [optional]
**trialPeriodFinishDate** | [**DateTime**](DateTime.md) | The trial period end date related to the offer |  [optional]
**paymentDelayInDays** | **Integer** | The payment delay in days related to the offer |  [optional]
**offerId** | [**OfferId**](OfferId.md) |  |  [optional]
**offerName** | **String** | The offer Name |  [optional]
**currentContractId** | **String** | Your current contract id |  [optional]
**commercialUserId** | **String** | Your current commercial user id |  [optional]
**model** | **String** | Interal usage: Old offer type. The model description |  [optional]
**currentContractTerminationDate** | [**LocalDate**](LocalDate.md) | The current contract termination date |  [optional]
**requestedPaymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**currentCustomerPaymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**contractType** | **Integer** | Internal usage: Old offer type. Your contract type |  [optional]
**isModelMustBeTransmittedInNewContract** | **Boolean** | Internal usage: Old offer type. Is the current contract model needs to be converted into a new contract type |  [optional]
**fixedAndVariableClickInfo** | [**FixedAndVariableClickModelInfo**](FixedAndVariableClickModelInfo.md) |  |  [optional]
**variableModelInfo** | [**VariableModelInfo**](VariableModelInfo.md) |  |  [optional]
**paymentMethodAuthorized** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**couponOfferCode** | [**CouponOfferCode**](CouponOfferCode.md) |  |  [optional]
**commercialCreatorUserId** | **String** | The commercial that is responsible of the creation of your account |  [optional]
**minBillingPeriodInMonths** | **Integer** | The minimum billing period in month authorized for this offer. |  [optional]
**isCustomerWantsToTerminateHisContract** | **Boolean** | If true, this means you want to leave us and that&#39;s sad... :&#39;-( |  [optional]



