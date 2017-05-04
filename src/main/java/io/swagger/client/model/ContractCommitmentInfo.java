/*
 * BeezUP API
 * This is the RESTful API of BeezUP which allows you to manage everything related to BeezUP
 *
 * OpenAPI spec version: 2.0
 * Contact: support@beezup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CouponOfferCode;
import io.swagger.client.model.FixedAndVariableClickModelInfo;
import io.swagger.client.model.OfferId;
import io.swagger.client.model.PaymentMethod;
import io.swagger.client.model.VariableModelInfo;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Describe the commitment information related to the offer.
 */
@ApiModel(description = "Describe the commitment information related to the offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:05:37.723Z")
public class ContractCommitmentInfo {
  @SerializedName("commitmentCalculatedFinishDate")
  private DateTime commitmentCalculatedFinishDate = null;

  @SerializedName("newContractStartDate")
  private DateTime newContractStartDate = null;

  @SerializedName("commitmentPeriodInMonth")
  private Integer commitmentPeriodInMonth = null;

  @SerializedName("trialPeriodInMonth")
  private Integer trialPeriodInMonth = null;

  @SerializedName("trialPeriodFinishDate")
  private DateTime trialPeriodFinishDate = null;

  @SerializedName("paymentDelayInDays")
  private Integer paymentDelayInDays = null;

  @SerializedName("offerId")
  private OfferId offerId = null;

  @SerializedName("offerName")
  private String offerName = null;

  @SerializedName("currentContractId")
  private String currentContractId = null;

  @SerializedName("commercialUserId")
  private String commercialUserId = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("currentContractTerminationDate")
  private LocalDate currentContractTerminationDate = null;

  @SerializedName("requestedPaymentMethod")
  private PaymentMethod requestedPaymentMethod = null;

  @SerializedName("currentCustomerPaymentMethod")
  private PaymentMethod currentCustomerPaymentMethod = null;

  @SerializedName("contractType")
  private Integer contractType = null;

  @SerializedName("isModelMustBeTransmittedInNewContract")
  private Boolean isModelMustBeTransmittedInNewContract = null;

  @SerializedName("fixedAndVariableClickInfo")
  private FixedAndVariableClickModelInfo fixedAndVariableClickInfo = null;

  @SerializedName("variableModelInfo")
  private VariableModelInfo variableModelInfo = null;

  @SerializedName("paymentMethodAuthorized")
  private PaymentMethod paymentMethodAuthorized = null;

  @SerializedName("couponOfferCode")
  private CouponOfferCode couponOfferCode = null;

  @SerializedName("commercialCreatorUserId")
  private String commercialCreatorUserId = null;

  @SerializedName("minBillingPeriodInMonths")
  private Integer minBillingPeriodInMonths = null;

  @SerializedName("isCustomerWantsToTerminateHisContract")
  private Boolean isCustomerWantsToTerminateHisContract = null;

  public ContractCommitmentInfo commitmentCalculatedFinishDate(DateTime commitmentCalculatedFinishDate) {
    this.commitmentCalculatedFinishDate = commitmentCalculatedFinishDate;
    return this;
  }

   /**
   * The commitment end date related to the offer
   * @return commitmentCalculatedFinishDate
  **/
  @ApiModelProperty(example = "null", value = "The commitment end date related to the offer")
  public DateTime getCommitmentCalculatedFinishDate() {
    return commitmentCalculatedFinishDate;
  }

  public void setCommitmentCalculatedFinishDate(DateTime commitmentCalculatedFinishDate) {
    this.commitmentCalculatedFinishDate = commitmentCalculatedFinishDate;
  }

  public ContractCommitmentInfo newContractStartDate(DateTime newContractStartDate) {
    this.newContractStartDate = newContractStartDate;
    return this;
  }

   /**
   * The start date related to the offer
   * @return newContractStartDate
  **/
  @ApiModelProperty(example = "null", value = "The start date related to the offer")
  public DateTime getNewContractStartDate() {
    return newContractStartDate;
  }

  public void setNewContractStartDate(DateTime newContractStartDate) {
    this.newContractStartDate = newContractStartDate;
  }

  public ContractCommitmentInfo commitmentPeriodInMonth(Integer commitmentPeriodInMonth) {
    this.commitmentPeriodInMonth = commitmentPeriodInMonth;
    return this;
  }

   /**
   * The commitment period in month related to the offer
   * @return commitmentPeriodInMonth
  **/
  @ApiModelProperty(example = "null", value = "The commitment period in month related to the offer")
  public Integer getCommitmentPeriodInMonth() {
    return commitmentPeriodInMonth;
  }

  public void setCommitmentPeriodInMonth(Integer commitmentPeriodInMonth) {
    this.commitmentPeriodInMonth = commitmentPeriodInMonth;
  }

  public ContractCommitmentInfo trialPeriodInMonth(Integer trialPeriodInMonth) {
    this.trialPeriodInMonth = trialPeriodInMonth;
    return this;
  }

   /**
   * The trial period in month related to the offer
   * @return trialPeriodInMonth
  **/
  @ApiModelProperty(example = "null", value = "The trial period in month related to the offer")
  public Integer getTrialPeriodInMonth() {
    return trialPeriodInMonth;
  }

  public void setTrialPeriodInMonth(Integer trialPeriodInMonth) {
    this.trialPeriodInMonth = trialPeriodInMonth;
  }

  public ContractCommitmentInfo trialPeriodFinishDate(DateTime trialPeriodFinishDate) {
    this.trialPeriodFinishDate = trialPeriodFinishDate;
    return this;
  }

   /**
   * The trial period end date related to the offer
   * @return trialPeriodFinishDate
  **/
  @ApiModelProperty(example = "null", value = "The trial period end date related to the offer")
  public DateTime getTrialPeriodFinishDate() {
    return trialPeriodFinishDate;
  }

  public void setTrialPeriodFinishDate(DateTime trialPeriodFinishDate) {
    this.trialPeriodFinishDate = trialPeriodFinishDate;
  }

  public ContractCommitmentInfo paymentDelayInDays(Integer paymentDelayInDays) {
    this.paymentDelayInDays = paymentDelayInDays;
    return this;
  }

   /**
   * The payment delay in days related to the offer
   * @return paymentDelayInDays
  **/
  @ApiModelProperty(example = "null", value = "The payment delay in days related to the offer")
  public Integer getPaymentDelayInDays() {
    return paymentDelayInDays;
  }

  public void setPaymentDelayInDays(Integer paymentDelayInDays) {
    this.paymentDelayInDays = paymentDelayInDays;
  }

  public ContractCommitmentInfo offerId(OfferId offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public OfferId getOfferId() {
    return offerId;
  }

  public void setOfferId(OfferId offerId) {
    this.offerId = offerId;
  }

  public ContractCommitmentInfo offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * The offer Name
   * @return offerName
  **/
  @ApiModelProperty(example = "null", value = "The offer Name")
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public ContractCommitmentInfo currentContractId(String currentContractId) {
    this.currentContractId = currentContractId;
    return this;
  }

   /**
   * Your current contract id
   * @return currentContractId
  **/
  @ApiModelProperty(example = "null", value = "Your current contract id")
  public String getCurrentContractId() {
    return currentContractId;
  }

  public void setCurrentContractId(String currentContractId) {
    this.currentContractId = currentContractId;
  }

  public ContractCommitmentInfo commercialUserId(String commercialUserId) {
    this.commercialUserId = commercialUserId;
    return this;
  }

   /**
   * Your current commercial user id
   * @return commercialUserId
  **/
  @ApiModelProperty(example = "null", value = "Your current commercial user id")
  public String getCommercialUserId() {
    return commercialUserId;
  }

  public void setCommercialUserId(String commercialUserId) {
    this.commercialUserId = commercialUserId;
  }

  public ContractCommitmentInfo model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Interal usage: Old offer type. The model description
   * @return model
  **/
  @ApiModelProperty(example = "null", value = "Interal usage: Old offer type. The model description")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ContractCommitmentInfo currentContractTerminationDate(LocalDate currentContractTerminationDate) {
    this.currentContractTerminationDate = currentContractTerminationDate;
    return this;
  }

   /**
   * The current contract termination date
   * @return currentContractTerminationDate
  **/
  @ApiModelProperty(example = "null", value = "The current contract termination date")
  public LocalDate getCurrentContractTerminationDate() {
    return currentContractTerminationDate;
  }

  public void setCurrentContractTerminationDate(LocalDate currentContractTerminationDate) {
    this.currentContractTerminationDate = currentContractTerminationDate;
  }

  public ContractCommitmentInfo requestedPaymentMethod(PaymentMethod requestedPaymentMethod) {
    this.requestedPaymentMethod = requestedPaymentMethod;
    return this;
  }

   /**
   * Get requestedPaymentMethod
   * @return requestedPaymentMethod
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentMethod getRequestedPaymentMethod() {
    return requestedPaymentMethod;
  }

  public void setRequestedPaymentMethod(PaymentMethod requestedPaymentMethod) {
    this.requestedPaymentMethod = requestedPaymentMethod;
  }

  public ContractCommitmentInfo currentCustomerPaymentMethod(PaymentMethod currentCustomerPaymentMethod) {
    this.currentCustomerPaymentMethod = currentCustomerPaymentMethod;
    return this;
  }

   /**
   * Get currentCustomerPaymentMethod
   * @return currentCustomerPaymentMethod
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentMethod getCurrentCustomerPaymentMethod() {
    return currentCustomerPaymentMethod;
  }

  public void setCurrentCustomerPaymentMethod(PaymentMethod currentCustomerPaymentMethod) {
    this.currentCustomerPaymentMethod = currentCustomerPaymentMethod;
  }

  public ContractCommitmentInfo contractType(Integer contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * Internal usage: Old offer type. Your contract type
   * @return contractType
  **/
  @ApiModelProperty(example = "1234", value = "Internal usage: Old offer type. Your contract type")
  public Integer getContractType() {
    return contractType;
  }

  public void setContractType(Integer contractType) {
    this.contractType = contractType;
  }

  public ContractCommitmentInfo isModelMustBeTransmittedInNewContract(Boolean isModelMustBeTransmittedInNewContract) {
    this.isModelMustBeTransmittedInNewContract = isModelMustBeTransmittedInNewContract;
    return this;
  }

   /**
   * Internal usage: Old offer type. Is the current contract model needs to be converted into a new contract type
   * @return isModelMustBeTransmittedInNewContract
  **/
  @ApiModelProperty(example = "null", value = "Internal usage: Old offer type. Is the current contract model needs to be converted into a new contract type")
  public Boolean getIsModelMustBeTransmittedInNewContract() {
    return isModelMustBeTransmittedInNewContract;
  }

  public void setIsModelMustBeTransmittedInNewContract(Boolean isModelMustBeTransmittedInNewContract) {
    this.isModelMustBeTransmittedInNewContract = isModelMustBeTransmittedInNewContract;
  }

  public ContractCommitmentInfo fixedAndVariableClickInfo(FixedAndVariableClickModelInfo fixedAndVariableClickInfo) {
    this.fixedAndVariableClickInfo = fixedAndVariableClickInfo;
    return this;
  }

   /**
   * Get fixedAndVariableClickInfo
   * @return fixedAndVariableClickInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public FixedAndVariableClickModelInfo getFixedAndVariableClickInfo() {
    return fixedAndVariableClickInfo;
  }

  public void setFixedAndVariableClickInfo(FixedAndVariableClickModelInfo fixedAndVariableClickInfo) {
    this.fixedAndVariableClickInfo = fixedAndVariableClickInfo;
  }

  public ContractCommitmentInfo variableModelInfo(VariableModelInfo variableModelInfo) {
    this.variableModelInfo = variableModelInfo;
    return this;
  }

   /**
   * Get variableModelInfo
   * @return variableModelInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public VariableModelInfo getVariableModelInfo() {
    return variableModelInfo;
  }

  public void setVariableModelInfo(VariableModelInfo variableModelInfo) {
    this.variableModelInfo = variableModelInfo;
  }

  public ContractCommitmentInfo paymentMethodAuthorized(PaymentMethod paymentMethodAuthorized) {
    this.paymentMethodAuthorized = paymentMethodAuthorized;
    return this;
  }

   /**
   * Get paymentMethodAuthorized
   * @return paymentMethodAuthorized
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentMethod getPaymentMethodAuthorized() {
    return paymentMethodAuthorized;
  }

  public void setPaymentMethodAuthorized(PaymentMethod paymentMethodAuthorized) {
    this.paymentMethodAuthorized = paymentMethodAuthorized;
  }

  public ContractCommitmentInfo couponOfferCode(CouponOfferCode couponOfferCode) {
    this.couponOfferCode = couponOfferCode;
    return this;
  }

   /**
   * Get couponOfferCode
   * @return couponOfferCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public CouponOfferCode getCouponOfferCode() {
    return couponOfferCode;
  }

  public void setCouponOfferCode(CouponOfferCode couponOfferCode) {
    this.couponOfferCode = couponOfferCode;
  }

  public ContractCommitmentInfo commercialCreatorUserId(String commercialCreatorUserId) {
    this.commercialCreatorUserId = commercialCreatorUserId;
    return this;
  }

   /**
   * The commercial that is responsible of the creation of your account
   * @return commercialCreatorUserId
  **/
  @ApiModelProperty(example = "null", value = "The commercial that is responsible of the creation of your account")
  public String getCommercialCreatorUserId() {
    return commercialCreatorUserId;
  }

  public void setCommercialCreatorUserId(String commercialCreatorUserId) {
    this.commercialCreatorUserId = commercialCreatorUserId;
  }

  public ContractCommitmentInfo minBillingPeriodInMonths(Integer minBillingPeriodInMonths) {
    this.minBillingPeriodInMonths = minBillingPeriodInMonths;
    return this;
  }

   /**
   * The minimum billing period in month authorized for this offer.
   * @return minBillingPeriodInMonths
  **/
  @ApiModelProperty(example = "1", value = "The minimum billing period in month authorized for this offer.")
  public Integer getMinBillingPeriodInMonths() {
    return minBillingPeriodInMonths;
  }

  public void setMinBillingPeriodInMonths(Integer minBillingPeriodInMonths) {
    this.minBillingPeriodInMonths = minBillingPeriodInMonths;
  }

  public ContractCommitmentInfo isCustomerWantsToTerminateHisContract(Boolean isCustomerWantsToTerminateHisContract) {
    this.isCustomerWantsToTerminateHisContract = isCustomerWantsToTerminateHisContract;
    return this;
  }

   /**
   * If true, this means you want to leave us and that's sad... :'-(
   * @return isCustomerWantsToTerminateHisContract
  **/
  @ApiModelProperty(example = "false", value = "If true, this means you want to leave us and that's sad... :'-(")
  public Boolean getIsCustomerWantsToTerminateHisContract() {
    return isCustomerWantsToTerminateHisContract;
  }

  public void setIsCustomerWantsToTerminateHisContract(Boolean isCustomerWantsToTerminateHisContract) {
    this.isCustomerWantsToTerminateHisContract = isCustomerWantsToTerminateHisContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractCommitmentInfo contractCommitmentInfo = (ContractCommitmentInfo) o;
    return Objects.equals(this.commitmentCalculatedFinishDate, contractCommitmentInfo.commitmentCalculatedFinishDate) &&
        Objects.equals(this.newContractStartDate, contractCommitmentInfo.newContractStartDate) &&
        Objects.equals(this.commitmentPeriodInMonth, contractCommitmentInfo.commitmentPeriodInMonth) &&
        Objects.equals(this.trialPeriodInMonth, contractCommitmentInfo.trialPeriodInMonth) &&
        Objects.equals(this.trialPeriodFinishDate, contractCommitmentInfo.trialPeriodFinishDate) &&
        Objects.equals(this.paymentDelayInDays, contractCommitmentInfo.paymentDelayInDays) &&
        Objects.equals(this.offerId, contractCommitmentInfo.offerId) &&
        Objects.equals(this.offerName, contractCommitmentInfo.offerName) &&
        Objects.equals(this.currentContractId, contractCommitmentInfo.currentContractId) &&
        Objects.equals(this.commercialUserId, contractCommitmentInfo.commercialUserId) &&
        Objects.equals(this.model, contractCommitmentInfo.model) &&
        Objects.equals(this.currentContractTerminationDate, contractCommitmentInfo.currentContractTerminationDate) &&
        Objects.equals(this.requestedPaymentMethod, contractCommitmentInfo.requestedPaymentMethod) &&
        Objects.equals(this.currentCustomerPaymentMethod, contractCommitmentInfo.currentCustomerPaymentMethod) &&
        Objects.equals(this.contractType, contractCommitmentInfo.contractType) &&
        Objects.equals(this.isModelMustBeTransmittedInNewContract, contractCommitmentInfo.isModelMustBeTransmittedInNewContract) &&
        Objects.equals(this.fixedAndVariableClickInfo, contractCommitmentInfo.fixedAndVariableClickInfo) &&
        Objects.equals(this.variableModelInfo, contractCommitmentInfo.variableModelInfo) &&
        Objects.equals(this.paymentMethodAuthorized, contractCommitmentInfo.paymentMethodAuthorized) &&
        Objects.equals(this.couponOfferCode, contractCommitmentInfo.couponOfferCode) &&
        Objects.equals(this.commercialCreatorUserId, contractCommitmentInfo.commercialCreatorUserId) &&
        Objects.equals(this.minBillingPeriodInMonths, contractCommitmentInfo.minBillingPeriodInMonths) &&
        Objects.equals(this.isCustomerWantsToTerminateHisContract, contractCommitmentInfo.isCustomerWantsToTerminateHisContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitmentCalculatedFinishDate, newContractStartDate, commitmentPeriodInMonth, trialPeriodInMonth, trialPeriodFinishDate, paymentDelayInDays, offerId, offerName, currentContractId, commercialUserId, model, currentContractTerminationDate, requestedPaymentMethod, currentCustomerPaymentMethod, contractType, isModelMustBeTransmittedInNewContract, fixedAndVariableClickInfo, variableModelInfo, paymentMethodAuthorized, couponOfferCode, commercialCreatorUserId, minBillingPeriodInMonths, isCustomerWantsToTerminateHisContract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractCommitmentInfo {\n");
    
    sb.append("    commitmentCalculatedFinishDate: ").append(toIndentedString(commitmentCalculatedFinishDate)).append("\n");
    sb.append("    newContractStartDate: ").append(toIndentedString(newContractStartDate)).append("\n");
    sb.append("    commitmentPeriodInMonth: ").append(toIndentedString(commitmentPeriodInMonth)).append("\n");
    sb.append("    trialPeriodInMonth: ").append(toIndentedString(trialPeriodInMonth)).append("\n");
    sb.append("    trialPeriodFinishDate: ").append(toIndentedString(trialPeriodFinishDate)).append("\n");
    sb.append("    paymentDelayInDays: ").append(toIndentedString(paymentDelayInDays)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    currentContractId: ").append(toIndentedString(currentContractId)).append("\n");
    sb.append("    commercialUserId: ").append(toIndentedString(commercialUserId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    currentContractTerminationDate: ").append(toIndentedString(currentContractTerminationDate)).append("\n");
    sb.append("    requestedPaymentMethod: ").append(toIndentedString(requestedPaymentMethod)).append("\n");
    sb.append("    currentCustomerPaymentMethod: ").append(toIndentedString(currentCustomerPaymentMethod)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    isModelMustBeTransmittedInNewContract: ").append(toIndentedString(isModelMustBeTransmittedInNewContract)).append("\n");
    sb.append("    fixedAndVariableClickInfo: ").append(toIndentedString(fixedAndVariableClickInfo)).append("\n");
    sb.append("    variableModelInfo: ").append(toIndentedString(variableModelInfo)).append("\n");
    sb.append("    paymentMethodAuthorized: ").append(toIndentedString(paymentMethodAuthorized)).append("\n");
    sb.append("    couponOfferCode: ").append(toIndentedString(couponOfferCode)).append("\n");
    sb.append("    commercialCreatorUserId: ").append(toIndentedString(commercialCreatorUserId)).append("\n");
    sb.append("    minBillingPeriodInMonths: ").append(toIndentedString(minBillingPeriodInMonths)).append("\n");
    sb.append("    isCustomerWantsToTerminateHisContract: ").append(toIndentedString(isCustomerWantsToTerminateHisContract)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

