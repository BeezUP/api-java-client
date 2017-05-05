# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        AccountApi apiInstance = new AccountApi();
        String emailActivationId = "emailActivationId_example"; // String | The email activation id received by email.
        try {
            apiInstance.activateUserAccount(emailActivationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#activateUserAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.beezup.com/v2/user/customer*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**activateUserAccount**](docs/AccountApi.md#activateUserAccount) | **POST** /account/activate | Activate the user account
*AccountApi* | [**changePassword**](docs/AccountApi.md#changePassword) | **POST** /account/changePassword | Change user password
*AccountApi* | [**getCreditCardInfo**](docs/AccountApi.md#getCreditCardInfo) | **GET** /account/creditCardInfo | Get credit card information
*AccountApi* | [**getProfilePictureInfo**](docs/AccountApi.md#getProfilePictureInfo) | **GET** /account/profilePictureInfo | Get profile picture information
*AccountApi* | [**getUserAccountInfo**](docs/AccountApi.md#getUserAccountInfo) | **GET** /account | Get user account information
*AccountApi* | [**resendEmailActivation**](docs/AccountApi.md#resendEmailActivation) | **POST** /account/resendEmailActivation | Resend email activation
*AccountApi* | [**saveCompanyInfo**](docs/AccountApi.md#saveCompanyInfo) | **PUT** /account/companyInfo | Change company information
*AccountApi* | [**saveCreditCardInfo**](docs/AccountApi.md#saveCreditCardInfo) | **PUT** /account/creditCardInfo | Save user credit card info
*AccountApi* | [**savePersonalInfo**](docs/AccountApi.md#savePersonalInfo) | **PUT** /account/personalInfo | Save user personal information
*AccountApi* | [**saveProfilePictureInfo**](docs/AccountApi.md#saveProfilePictureInfo) | **PUT** /account/profilePictureInfo | Change user picture information
*AlertsApi* | [**getStoreAlerts**](docs/AlertsApi.md#getStoreAlerts) | **GET** /stores/{storeId}/alerts | Get store&#39;s alerts
*AlertsApi* | [**saveStoreAlert**](docs/AlertsApi.md#saveStoreAlert) | **PUT** /stores/{storeId}/alerts/{alertId} | Save store alert
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /contracts | Create a new contract
*ContractsApi* | [**deleteNextContract**](docs/ContractsApi.md#deleteNextContract) | **DELETE** /contracts/next | Delete your next contract
*ContractsApi* | [**getBillingPeriods**](docs/ContractsApi.md#getBillingPeriods) | **GET** /billingPeriods | Get billing periods conditions
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /contracts | Get contract list
*ContractsApi* | [**getOffer**](docs/ContractsApi.md#getOffer) | **POST** /offers | Get offer pricing
*ContractsApi* | [**getStandardOffers**](docs/ContractsApi.md#getStandardOffers) | **GET** /offers | Get all standard offers
*ContractsApi* | [**reactivateCurrentContract**](docs/ContractsApi.md#reactivateCurrentContract) | **POST** /contracts/current/reenableAutoRenewal | Reactivate your terminated contract.
*ContractsApi* | [**terminateCurrentContract**](docs/ContractsApi.md#terminateCurrentContract) | **POST** /contracts/current/disableAutoRenewal | Schedule termination of your current contract at the end of the commitment.
*FriendsApi* | [**getFriendInfo**](docs/FriendsApi.md#getFriendInfo) | **GET** /friends/{userId} | Get friend information
*InvoicesApi* | [**getInvoices**](docs/InvoicesApi.md#getInvoices) | **GET** /invoices | Get all your invoices
*RightsApi* | [**getRights**](docs/RightsApi.md#getRights) | **POST** /stores/{storeId}/rights | Get store&#39;s rights
*SecurityApi* | [**logout**](docs/SecurityApi.md#logout) | **POST** /security/logout | Log out the current user from go2
*SharesApi* | [**deleteShare**](docs/SharesApi.md#deleteShare) | **DELETE** /stores/{storeId}/shares/{userId} | Delete a share to another user
*SharesApi* | [**getShares**](docs/SharesApi.md#getShares) | **GET** /stores/{storeId}/shares | Get shares related to this store
*SharesApi* | [**share**](docs/SharesApi.md#share) | **POST** /stores/{storeId}/shares | Share a store to another user
*StoresApi* | [**createStore**](docs/StoresApi.md#createStore) | **POST** /stores | Create a new store
*StoresApi* | [**deleteStore**](docs/StoresApi.md#deleteStore) | **DELETE** /stores/{storeId} | Delete a store
*StoresApi* | [**getStore**](docs/StoresApi.md#getStore) | **GET** /stores/{storeId} | Get store&#39;s information
*StoresApi* | [**getStores**](docs/StoresApi.md#getStores) | **GET** /stores | Get store list
*StoresApi* | [**updateStore**](docs/StoresApi.md#updateStore) | **PATCH** /stores/{storeId} | Update some store&#39;s information.


## Documentation for Models

 - [AccountInfo](docs/AccountInfo.md)
 - [AccountInfoLinks](docs/AccountInfoLinks.md)
 - [AccountStatus](docs/AccountStatus.md)
 - [AccountingEmails](docs/AccountingEmails.md)
 - [Address](docs/Address.md)
 - [AlertId](docs/AlertId.md)
 - [AlertIsActive](docs/AlertIsActive.md)
 - [AlertName](docs/AlertName.md)
 - [AlertPropertyId](docs/AlertPropertyId.md)
 - [AlertPropertyValue](docs/AlertPropertyValue.md)
 - [BeezUPCommonCountryIsoCodeAlpha3](docs/BeezUPCommonCountryIsoCodeAlpha3.md)
 - [BeezUPCommonCurrencyCode](docs/BeezUPCommonCurrencyCode.md)
 - [BeezUPCommonDocUrl](docs/BeezUPCommonDocUrl.md)
 - [BeezUPCommonEmail](docs/BeezUPCommonEmail.md)
 - [BeezUPCommonErrorResponseMessage](docs/BeezUPCommonErrorResponseMessage.md)
 - [BeezUPCommonErrorSummary](docs/BeezUPCommonErrorSummary.md)
 - [BeezUPCommonExceptionDetail](docs/BeezUPCommonExceptionDetail.md)
 - [BeezUPCommonHref](docs/BeezUPCommonHref.md)
 - [BeezUPCommonHttpMethod](docs/BeezUPCommonHttpMethod.md)
 - [BeezUPCommonInfoSummaries](docs/BeezUPCommonInfoSummaries.md)
 - [BeezUPCommonInfoSummary](docs/BeezUPCommonInfoSummary.md)
 - [BeezUPCommonLOVLink2](docs/BeezUPCommonLOVLink2.md)
 - [BeezUPCommonLink3](docs/BeezUPCommonLink3.md)
 - [BeezUPCommonLinkParameter3](docs/BeezUPCommonLinkParameter3.md)
 - [BeezUPCommonOperationId](docs/BeezUPCommonOperationId.md)
 - [BeezUPCommonStoreId](docs/BeezUPCommonStoreId.md)
 - [BeezUPCommonSuccessSummary](docs/BeezUPCommonSuccessSummary.md)
 - [BeezUPCommonUserErrorMessage](docs/BeezUPCommonUserErrorMessage.md)
 - [BeezUPCommonUserErrorMessageArguments](docs/BeezUPCommonUserErrorMessageArguments.md)
 - [BeezUPCommonUserId](docs/BeezUPCommonUserId.md)
 - [BeezUPCommonWarningSummary](docs/BeezUPCommonWarningSummary.md)
 - [BeezUPTimeZoneId](docs/BeezUPTimeZoneId.md)
 - [BillingPeriod](docs/BillingPeriod.md)
 - [BillingPeriodInMonth](docs/BillingPeriodInMonth.md)
 - [BillingPeriods](docs/BillingPeriods.md)
 - [BonusInfo](docs/BonusInfo.md)
 - [BonusType](docs/BonusType.md)
 - [CardNumber](docs/CardNumber.md)
 - [CardVerificationCode](docs/CardVerificationCode.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [City](docs/City.md)
 - [ClickIncludedAndAdditionalClickPrice](docs/ClickIncludedAndAdditionalClickPrice.md)
 - [ClickIncludedAndVariablePrice](docs/ClickIncludedAndVariablePrice.md)
 - [Company](docs/Company.md)
 - [CompanyInfo](docs/CompanyInfo.md)
 - [ContractBillingPeriodInfo](docs/ContractBillingPeriodInfo.md)
 - [ContractBonusInfo](docs/ContractBonusInfo.md)
 - [ContractClickInfo](docs/ContractClickInfo.md)
 - [ContractCommitmentInfo](docs/ContractCommitmentInfo.md)
 - [ContractDiscountInfo](docs/ContractDiscountInfo.md)
 - [ContractId](docs/ContractId.md)
 - [ContractInfo](docs/ContractInfo.md)
 - [ContractMoneyInfo](docs/ContractMoneyInfo.md)
 - [ContractStoreInfo](docs/ContractStoreInfo.md)
 - [ContractTerminationReason](docs/ContractTerminationReason.md)
 - [ContractTerminationReasonType](docs/ContractTerminationReasonType.md)
 - [Contracts](docs/Contracts.md)
 - [ContractsLinks](docs/ContractsLinks.md)
 - [CouponDiscountCode](docs/CouponDiscountCode.md)
 - [CouponOfferCode](docs/CouponOfferCode.md)
 - [CreateContract](docs/CreateContract.md)
 - [CreateStoreRequest](docs/CreateStoreRequest.md)
 - [CreditCardInfo](docs/CreditCardInfo.md)
 - [CreditCardInfoResponse](docs/CreditCardInfoResponse.md)
 - [CreditCardInfoResponseLinks](docs/CreditCardInfoResponseLinks.md)
 - [CreditCardInfoWithCardType](docs/CreditCardInfoWithCardType.md)
 - [CurrentContractInfo](docs/CurrentContractInfo.md)
 - [CurrentContractInfoLinks](docs/CurrentContractInfoLinks.md)
 - [ExpirationMonth](docs/ExpirationMonth.md)
 - [ExpirationYear](docs/ExpirationYear.md)
 - [FirstName](docs/FirstName.md)
 - [FixedAndVariableClickModelInfo](docs/FixedAndVariableClickModelInfo.md)
 - [FriendCountryIsoCodeAlpha3](docs/FriendCountryIsoCodeAlpha3.md)
 - [FriendEmail](docs/FriendEmail.md)
 - [FriendProfilePictureUrl](docs/FriendProfilePictureUrl.md)
 - [Functionality](docs/Functionality.md)
 - [FunctionalityRightInfo](docs/FunctionalityRightInfo.md)
 - [GravatarProfilePictureUrl](docs/GravatarProfilePictureUrl.md)
 - [InitialsProfilePictureUrl](docs/InitialsProfilePictureUrl.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceNumber](docs/InvoiceNumber.md)
 - [InvoicePaymentStatus](docs/InvoicePaymentStatus.md)
 - [Invoices](docs/Invoices.md)
 - [LastName](docs/LastName.md)
 - [LinksChangePasswordLink](docs/LinksChangePasswordLink.md)
 - [LinksCreateContractLink](docs/LinksCreateContractLink.md)
 - [LinksCreateStoreLink](docs/LinksCreateStoreLink.md)
 - [LinksDeleteNextContractLink](docs/LinksDeleteNextContractLink.md)
 - [LinksDeleteShareLink](docs/LinksDeleteShareLink.md)
 - [LinksDeleteStoreLink](docs/LinksDeleteStoreLink.md)
 - [LinksGetContractsLink](docs/LinksGetContractsLink.md)
 - [LinksGetCreditCardInfoLink](docs/LinksGetCreditCardInfoLink.md)
 - [LinksGetProfilePictureInfoLink](docs/LinksGetProfilePictureInfoLink.md)
 - [LinksGetSharesLink](docs/LinksGetSharesLink.md)
 - [LinksGetStoreLink](docs/LinksGetStoreLink.md)
 - [LinksGetStoresLink](docs/LinksGetStoresLink.md)
 - [LinksReactivateCurrentContractLink](docs/LinksReactivateCurrentContractLink.md)
 - [LinksSaveCompanyInfoLink](docs/LinksSaveCompanyInfoLink.md)
 - [LinksSaveCreditCardInfoLink](docs/LinksSaveCreditCardInfoLink.md)
 - [LinksSavePersonalInfoLink](docs/LinksSavePersonalInfoLink.md)
 - [LinksSaveProfilePictureInfoLink](docs/LinksSaveProfilePictureInfoLink.md)
 - [LinksSaveStoreAlertLink](docs/LinksSaveStoreAlertLink.md)
 - [LinksShareLink](docs/LinksShareLink.md)
 - [LinksTerminateCurrentContractLink](docs/LinksTerminateCurrentContractLink.md)
 - [LinksUpdateStoreLink](docs/LinksUpdateStoreLink.md)
 - [NextContractInfo](docs/NextContractInfo.md)
 - [NextContractInfoLinks](docs/NextContractInfoLinks.md)
 - [Offer](docs/Offer.md)
 - [OfferContent](docs/OfferContent.md)
 - [OfferFunctionality](docs/OfferFunctionality.md)
 - [OfferId](docs/OfferId.md)
 - [OfferLinks](docs/OfferLinks.md)
 - [OfferRequest](docs/OfferRequest.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PersonalInfo](docs/PersonalInfo.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PostalCode](docs/PostalCode.md)
 - [PreviousFixPeriodInvoiceProrataInfo](docs/PreviousFixPeriodInvoiceProrataInfo.md)
 - [ProfilePictureInfo](docs/ProfilePictureInfo.md)
 - [ProfilePictureInfoResponse](docs/ProfilePictureInfoResponse.md)
 - [ProfilePictureInfoResponseLinks](docs/ProfilePictureInfoResponseLinks.md)
 - [ProfilePictureInfoWithDefault](docs/ProfilePictureInfoWithDefault.md)
 - [ProfilePictureSelected](docs/ProfilePictureSelected.md)
 - [ProfilePictureUrl](docs/ProfilePictureUrl.md)
 - [PromotionalCodeValidity](docs/PromotionalCodeValidity.md)
 - [SaveStoreAlertRequest](docs/SaveStoreAlertRequest.md)
 - [StandardOffer](docs/StandardOffer.md)
 - [StandardOffers](docs/StandardOffers.md)
 - [Store](docs/Store.md)
 - [StoreAlert](docs/StoreAlert.md)
 - [StoreAlertLinks](docs/StoreAlertLinks.md)
 - [StoreAlertProperty](docs/StoreAlertProperty.md)
 - [StoreAlertPropertyInfo](docs/StoreAlertPropertyInfo.md)
 - [StoreAlerts](docs/StoreAlerts.md)
 - [StoreCount](docs/StoreCount.md)
 - [StoreCountryIsoCodeAlpha3](docs/StoreCountryIsoCodeAlpha3.md)
 - [StoreHeader](docs/StoreHeader.md)
 - [StoreHeaderLinks](docs/StoreHeaderLinks.md)
 - [StoreName](docs/StoreName.md)
 - [StoreSector](docs/StoreSector.md)
 - [StoreSectors](docs/StoreSectors.md)
 - [StoreShare](docs/StoreShare.md)
 - [StoreShareLinks](docs/StoreShareLinks.md)
 - [StoreShares](docs/StoreShares.md)
 - [StoreSharesLinks](docs/StoreSharesLinks.md)
 - [StoreStatus](docs/StoreStatus.md)
 - [StoreUrl](docs/StoreUrl.md)
 - [StoreUserRole](docs/StoreUserRole.md)
 - [Stores](docs/Stores.md)
 - [StoresLinks](docs/StoresLinks.md)
 - [TerminateContract](docs/TerminateContract.md)
 - [UpdateStoreRequest](docs/UpdateStoreRequest.md)
 - [UserFriendInfo](docs/UserFriendInfo.md)
 - [VariableModelInfo](docs/VariableModelInfo.md)
 - [VatNumber](docs/VatNumber.md)
 - [WhatIDo](docs/WhatIDo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Ocp-Apim-Subscription-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@beezup.com

