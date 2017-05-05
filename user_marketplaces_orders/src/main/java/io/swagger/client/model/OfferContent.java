/*
 * Customer
 * This API will gives you the ability to : - manage your account - manage your stores - shares your stores with your friends - manage your contracts - access to your invoices 
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
import io.swagger.client.model.ContractBillingPeriodInfo;
import io.swagger.client.model.ContractBonusInfo;
import io.swagger.client.model.ContractClickInfo;
import io.swagger.client.model.ContractCommitmentInfo;
import io.swagger.client.model.ContractDiscountInfo;
import io.swagger.client.model.ContractMoneyInfo;
import io.swagger.client.model.ContractStoreInfo;
import io.swagger.client.model.ContractTerminationReason;
import io.swagger.client.model.ContractTerminationReasonType;
import io.swagger.client.model.PreviousFixPeriodInvoiceProrataInfo;

/**
 * OfferContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:15:59.675Z")
public class OfferContent {
  @SerializedName("previousFixPeriodInvoiceProrataInfo")
  private PreviousFixPeriodInvoiceProrataInfo previousFixPeriodInvoiceProrataInfo = null;

  @SerializedName("contractBillingPeriodInfo")
  private ContractBillingPeriodInfo contractBillingPeriodInfo = null;

  @SerializedName("contractClickInfo")
  private ContractClickInfo contractClickInfo = null;

  @SerializedName("contractCommitmentInfo")
  private ContractCommitmentInfo contractCommitmentInfo = null;

  @SerializedName("contractDiscountInfo")
  private ContractDiscountInfo contractDiscountInfo = null;

  @SerializedName("contractMoneyInfo")
  private ContractMoneyInfo contractMoneyInfo = null;

  @SerializedName("contractStoreInfo")
  private ContractStoreInfo contractStoreInfo = null;

  @SerializedName("contractBonusInfo")
  private ContractBonusInfo contractBonusInfo = null;

  @SerializedName("contractTerminationReasonType")
  private ContractTerminationReasonType contractTerminationReasonType = null;

  @SerializedName("contractTerminationReason")
  private ContractTerminationReason contractTerminationReason = null;

  @SerializedName("notifyVatExemption")
  private Boolean notifyVatExemption = null;

  public OfferContent previousFixPeriodInvoiceProrataInfo(PreviousFixPeriodInvoiceProrataInfo previousFixPeriodInvoiceProrataInfo) {
    this.previousFixPeriodInvoiceProrataInfo = previousFixPeriodInvoiceProrataInfo;
    return this;
  }

   /**
   * Get previousFixPeriodInvoiceProrataInfo
   * @return previousFixPeriodInvoiceProrataInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PreviousFixPeriodInvoiceProrataInfo getPreviousFixPeriodInvoiceProrataInfo() {
    return previousFixPeriodInvoiceProrataInfo;
  }

  public void setPreviousFixPeriodInvoiceProrataInfo(PreviousFixPeriodInvoiceProrataInfo previousFixPeriodInvoiceProrataInfo) {
    this.previousFixPeriodInvoiceProrataInfo = previousFixPeriodInvoiceProrataInfo;
  }

  public OfferContent contractBillingPeriodInfo(ContractBillingPeriodInfo contractBillingPeriodInfo) {
    this.contractBillingPeriodInfo = contractBillingPeriodInfo;
    return this;
  }

   /**
   * Get contractBillingPeriodInfo
   * @return contractBillingPeriodInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractBillingPeriodInfo getContractBillingPeriodInfo() {
    return contractBillingPeriodInfo;
  }

  public void setContractBillingPeriodInfo(ContractBillingPeriodInfo contractBillingPeriodInfo) {
    this.contractBillingPeriodInfo = contractBillingPeriodInfo;
  }

  public OfferContent contractClickInfo(ContractClickInfo contractClickInfo) {
    this.contractClickInfo = contractClickInfo;
    return this;
  }

   /**
   * Get contractClickInfo
   * @return contractClickInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractClickInfo getContractClickInfo() {
    return contractClickInfo;
  }

  public void setContractClickInfo(ContractClickInfo contractClickInfo) {
    this.contractClickInfo = contractClickInfo;
  }

  public OfferContent contractCommitmentInfo(ContractCommitmentInfo contractCommitmentInfo) {
    this.contractCommitmentInfo = contractCommitmentInfo;
    return this;
  }

   /**
   * Get contractCommitmentInfo
   * @return contractCommitmentInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractCommitmentInfo getContractCommitmentInfo() {
    return contractCommitmentInfo;
  }

  public void setContractCommitmentInfo(ContractCommitmentInfo contractCommitmentInfo) {
    this.contractCommitmentInfo = contractCommitmentInfo;
  }

  public OfferContent contractDiscountInfo(ContractDiscountInfo contractDiscountInfo) {
    this.contractDiscountInfo = contractDiscountInfo;
    return this;
  }

   /**
   * Get contractDiscountInfo
   * @return contractDiscountInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractDiscountInfo getContractDiscountInfo() {
    return contractDiscountInfo;
  }

  public void setContractDiscountInfo(ContractDiscountInfo contractDiscountInfo) {
    this.contractDiscountInfo = contractDiscountInfo;
  }

  public OfferContent contractMoneyInfo(ContractMoneyInfo contractMoneyInfo) {
    this.contractMoneyInfo = contractMoneyInfo;
    return this;
  }

   /**
   * Get contractMoneyInfo
   * @return contractMoneyInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractMoneyInfo getContractMoneyInfo() {
    return contractMoneyInfo;
  }

  public void setContractMoneyInfo(ContractMoneyInfo contractMoneyInfo) {
    this.contractMoneyInfo = contractMoneyInfo;
  }

  public OfferContent contractStoreInfo(ContractStoreInfo contractStoreInfo) {
    this.contractStoreInfo = contractStoreInfo;
    return this;
  }

   /**
   * Get contractStoreInfo
   * @return contractStoreInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractStoreInfo getContractStoreInfo() {
    return contractStoreInfo;
  }

  public void setContractStoreInfo(ContractStoreInfo contractStoreInfo) {
    this.contractStoreInfo = contractStoreInfo;
  }

  public OfferContent contractBonusInfo(ContractBonusInfo contractBonusInfo) {
    this.contractBonusInfo = contractBonusInfo;
    return this;
  }

   /**
   * Get contractBonusInfo
   * @return contractBonusInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractBonusInfo getContractBonusInfo() {
    return contractBonusInfo;
  }

  public void setContractBonusInfo(ContractBonusInfo contractBonusInfo) {
    this.contractBonusInfo = contractBonusInfo;
  }

  public OfferContent contractTerminationReasonType(ContractTerminationReasonType contractTerminationReasonType) {
    this.contractTerminationReasonType = contractTerminationReasonType;
    return this;
  }

   /**
   * Get contractTerminationReasonType
   * @return contractTerminationReasonType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContractTerminationReasonType getContractTerminationReasonType() {
    return contractTerminationReasonType;
  }

  public void setContractTerminationReasonType(ContractTerminationReasonType contractTerminationReasonType) {
    this.contractTerminationReasonType = contractTerminationReasonType;
  }

  public OfferContent contractTerminationReason(ContractTerminationReason contractTerminationReason) {
    this.contractTerminationReason = contractTerminationReason;
    return this;
  }

   /**
   * Get contractTerminationReason
   * @return contractTerminationReason
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContractTerminationReason getContractTerminationReason() {
    return contractTerminationReason;
  }

  public void setContractTerminationReason(ContractTerminationReason contractTerminationReason) {
    this.contractTerminationReason = contractTerminationReason;
  }

  public OfferContent notifyVatExemption(Boolean notifyVatExemption) {
    this.notifyVatExemption = notifyVatExemption;
    return this;
  }

   /**
   * Internal usage: Indicates if we have to notify you about VAT exemption.
   * @return notifyVatExemption
  **/
  @ApiModelProperty(example = "true", required = true, value = "Internal usage: Indicates if we have to notify you about VAT exemption.")
  public Boolean getNotifyVatExemption() {
    return notifyVatExemption;
  }

  public void setNotifyVatExemption(Boolean notifyVatExemption) {
    this.notifyVatExemption = notifyVatExemption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferContent offerContent = (OfferContent) o;
    return Objects.equals(this.previousFixPeriodInvoiceProrataInfo, offerContent.previousFixPeriodInvoiceProrataInfo) &&
        Objects.equals(this.contractBillingPeriodInfo, offerContent.contractBillingPeriodInfo) &&
        Objects.equals(this.contractClickInfo, offerContent.contractClickInfo) &&
        Objects.equals(this.contractCommitmentInfo, offerContent.contractCommitmentInfo) &&
        Objects.equals(this.contractDiscountInfo, offerContent.contractDiscountInfo) &&
        Objects.equals(this.contractMoneyInfo, offerContent.contractMoneyInfo) &&
        Objects.equals(this.contractStoreInfo, offerContent.contractStoreInfo) &&
        Objects.equals(this.contractBonusInfo, offerContent.contractBonusInfo) &&
        Objects.equals(this.contractTerminationReasonType, offerContent.contractTerminationReasonType) &&
        Objects.equals(this.contractTerminationReason, offerContent.contractTerminationReason) &&
        Objects.equals(this.notifyVatExemption, offerContent.notifyVatExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousFixPeriodInvoiceProrataInfo, contractBillingPeriodInfo, contractClickInfo, contractCommitmentInfo, contractDiscountInfo, contractMoneyInfo, contractStoreInfo, contractBonusInfo, contractTerminationReasonType, contractTerminationReason, notifyVatExemption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferContent {\n");
    
    sb.append("    previousFixPeriodInvoiceProrataInfo: ").append(toIndentedString(previousFixPeriodInvoiceProrataInfo)).append("\n");
    sb.append("    contractBillingPeriodInfo: ").append(toIndentedString(contractBillingPeriodInfo)).append("\n");
    sb.append("    contractClickInfo: ").append(toIndentedString(contractClickInfo)).append("\n");
    sb.append("    contractCommitmentInfo: ").append(toIndentedString(contractCommitmentInfo)).append("\n");
    sb.append("    contractDiscountInfo: ").append(toIndentedString(contractDiscountInfo)).append("\n");
    sb.append("    contractMoneyInfo: ").append(toIndentedString(contractMoneyInfo)).append("\n");
    sb.append("    contractStoreInfo: ").append(toIndentedString(contractStoreInfo)).append("\n");
    sb.append("    contractBonusInfo: ").append(toIndentedString(contractBonusInfo)).append("\n");
    sb.append("    contractTerminationReasonType: ").append(toIndentedString(contractTerminationReasonType)).append("\n");
    sb.append("    contractTerminationReason: ").append(toIndentedString(contractTerminationReason)).append("\n");
    sb.append("    notifyVatExemption: ").append(toIndentedString(notifyVatExemption)).append("\n");
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
