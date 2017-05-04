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
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.ContractId;
import io.swagger.client.model.ContractInfo;
import io.swagger.client.model.CurrentContractInfoLinks;
import io.swagger.client.model.FixedAndVariableClickModelInfo;
import io.swagger.client.model.OfferId;
import io.swagger.client.model.StoreCount;
import io.swagger.client.model.VariableModelInfo;
import org.joda.time.DateTime;

/**
 * CurrentContractInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:15:46.573Z")
public class CurrentContractInfo {
  @SerializedName("trialPeriodInMonth")
  private Integer trialPeriodInMonth = null;

  @SerializedName("billingPeriodPercentDiscount")
  private Double billingPeriodPercentDiscount = null;

  @SerializedName("discountDurationInMonth")
  private Integer discountDurationInMonth = null;

  @SerializedName("percentDiscount")
  private Double percentDiscount = null;

  @SerializedName("offerId")
  private OfferId offerId = null;

  @SerializedName("storeCount")
  private StoreCount storeCount = null;

  @SerializedName("startUtcDate")
  private DateTime startUtcDate = null;

  @SerializedName("commitmentCalculatedFinishUtcDate")
  private DateTime commitmentCalculatedFinishUtcDate = null;

  @SerializedName("billingPeriodInMonth")
  private Integer billingPeriodInMonth = null;

  @SerializedName("fixedPrice")
  private Double fixedPrice = null;

  @SerializedName("offerName")
  private String offerName = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("contractId")
  private ContractId contractId = null;

  @SerializedName("commitmentPeriodInMonth")
  private Integer commitmentPeriodInMonth = null;

  @SerializedName("clickIncluded")
  private Integer clickIncluded = null;

  @SerializedName("additionalClickPrice")
  private Double additionalClickPrice = null;

  @SerializedName("ipUserCreation")
  private String ipUserCreation = null;

  @SerializedName("ipUserModification")
  private String ipUserModification = null;

  @SerializedName("fixedAndVariableClickInfo")
  private FixedAndVariableClickModelInfo fixedAndVariableClickInfo = null;

  @SerializedName("variableModelInfo")
  private VariableModelInfo variableModelInfo = null;

  @SerializedName("isCommitmentRenewalAutomatically")
  private Boolean isCommitmentRenewalAutomatically = null;

  @SerializedName("discountEndUtcDate")
  private DateTime discountEndUtcDate = null;

  @SerializedName("isModifiableContract")
  private Boolean isModifiableContract = null;

  @SerializedName("links")
  private CurrentContractInfoLinks links = null;

  public CurrentContractInfo trialPeriodInMonth(Integer trialPeriodInMonth) {
    this.trialPeriodInMonth = trialPeriodInMonth;
    return this;
  }

   /**
   * The trial period in month
   * @return trialPeriodInMonth
  **/
  @ApiModelProperty(example = "null", value = "The trial period in month")
  public Integer getTrialPeriodInMonth() {
    return trialPeriodInMonth;
  }

  public void setTrialPeriodInMonth(Integer trialPeriodInMonth) {
    this.trialPeriodInMonth = trialPeriodInMonth;
  }

  public CurrentContractInfo billingPeriodPercentDiscount(Double billingPeriodPercentDiscount) {
    this.billingPeriodPercentDiscount = billingPeriodPercentDiscount;
    return this;
  }

   /**
   * The percent discount related to the billing period
   * @return billingPeriodPercentDiscount
  **/
  @ApiModelProperty(example = "null", value = "The percent discount related to the billing period")
  public Double getBillingPeriodPercentDiscount() {
    return billingPeriodPercentDiscount;
  }

  public void setBillingPeriodPercentDiscount(Double billingPeriodPercentDiscount) {
    this.billingPeriodPercentDiscount = billingPeriodPercentDiscount;
  }

  public CurrentContractInfo discountDurationInMonth(Integer discountDurationInMonth) {
    this.discountDurationInMonth = discountDurationInMonth;
    return this;
  }

   /**
   * The discount duration in month
   * @return discountDurationInMonth
  **/
  @ApiModelProperty(example = "null", value = "The discount duration in month")
  public Integer getDiscountDurationInMonth() {
    return discountDurationInMonth;
  }

  public void setDiscountDurationInMonth(Integer discountDurationInMonth) {
    this.discountDurationInMonth = discountDurationInMonth;
  }

  public CurrentContractInfo percentDiscount(Double percentDiscount) {
    this.percentDiscount = percentDiscount;
    return this;
  }

   /**
   * The percent of the discount
   * @return percentDiscount
  **/
  @ApiModelProperty(example = "null", value = "The percent of the discount")
  public Double getPercentDiscount() {
    return percentDiscount;
  }

  public void setPercentDiscount(Double percentDiscount) {
    this.percentDiscount = percentDiscount;
  }

  public CurrentContractInfo offerId(OfferId offerId) {
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

  public CurrentContractInfo storeCount(StoreCount storeCount) {
    this.storeCount = storeCount;
    return this;
  }

   /**
   * Get storeCount
   * @return storeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoreCount getStoreCount() {
    return storeCount;
  }

  public void setStoreCount(StoreCount storeCount) {
    this.storeCount = storeCount;
  }

  public CurrentContractInfo startUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
    return this;
  }

   /**
   * The start date of your contract
   * @return startUtcDate
  **/
  @ApiModelProperty(example = "null", value = "The start date of your contract")
  public DateTime getStartUtcDate() {
    return startUtcDate;
  }

  public void setStartUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
  }

  public CurrentContractInfo commitmentCalculatedFinishUtcDate(DateTime commitmentCalculatedFinishUtcDate) {
    this.commitmentCalculatedFinishUtcDate = commitmentCalculatedFinishUtcDate;
    return this;
  }

   /**
   * The calculated end date of commitment
   * @return commitmentCalculatedFinishUtcDate
  **/
  @ApiModelProperty(example = "null", value = "The calculated end date of commitment")
  public DateTime getCommitmentCalculatedFinishUtcDate() {
    return commitmentCalculatedFinishUtcDate;
  }

  public void setCommitmentCalculatedFinishUtcDate(DateTime commitmentCalculatedFinishUtcDate) {
    this.commitmentCalculatedFinishUtcDate = commitmentCalculatedFinishUtcDate;
  }

  public CurrentContractInfo billingPeriodInMonth(Integer billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
    return this;
  }

   /**
   * The billing period in month
   * @return billingPeriodInMonth
  **/
  @ApiModelProperty(example = "null", value = "The billing period in month")
  public Integer getBillingPeriodInMonth() {
    return billingPeriodInMonth;
  }

  public void setBillingPeriodInMonth(Integer billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
  }

  public CurrentContractInfo fixedPrice(Double fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

   /**
   * The fixed price of your contract
   * @return fixedPrice
  **/
  @ApiModelProperty(example = "null", value = "The fixed price of your contract")
  public Double getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(Double fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public CurrentContractInfo offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * The offer name based on /offers
   * @return offerName
  **/
  @ApiModelProperty(example = "null", value = "The offer name based on /offers")
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public CurrentContractInfo currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CurrentContractInfo contractId(ContractId contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContractId getContractId() {
    return contractId;
  }

  public void setContractId(ContractId contractId) {
    this.contractId = contractId;
  }

  public CurrentContractInfo commitmentPeriodInMonth(Integer commitmentPeriodInMonth) {
    this.commitmentPeriodInMonth = commitmentPeriodInMonth;
    return this;
  }

   /**
   * The commitment period in month
   * @return commitmentPeriodInMonth
  **/
  @ApiModelProperty(example = "null", value = "The commitment period in month")
  public Integer getCommitmentPeriodInMonth() {
    return commitmentPeriodInMonth;
  }

  public void setCommitmentPeriodInMonth(Integer commitmentPeriodInMonth) {
    this.commitmentPeriodInMonth = commitmentPeriodInMonth;
  }

  public CurrentContractInfo clickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
    return this;
  }

   /**
   * The click included
   * @return clickIncluded
  **/
  @ApiModelProperty(example = "null", value = "The click included")
  public Integer getClickIncluded() {
    return clickIncluded;
  }

  public void setClickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
  }

  public CurrentContractInfo additionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
    return this;
  }

   /**
   * Additional click price
   * @return additionalClickPrice
  **/
  @ApiModelProperty(example = "null", value = "Additional click price")
  public Double getAdditionalClickPrice() {
    return additionalClickPrice;
  }

  public void setAdditionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
  }

  public CurrentContractInfo ipUserCreation(String ipUserCreation) {
    this.ipUserCreation = ipUserCreation;
    return this;
  }

   /**
   * The IP of the user who creates the contract
   * @return ipUserCreation
  **/
  @ApiModelProperty(example = "null", value = "The IP of the user who creates the contract")
  public String getIpUserCreation() {
    return ipUserCreation;
  }

  public void setIpUserCreation(String ipUserCreation) {
    this.ipUserCreation = ipUserCreation;
  }

  public CurrentContractInfo ipUserModification(String ipUserModification) {
    this.ipUserModification = ipUserModification;
    return this;
  }

   /**
   * The IP of the user who modified the contract
   * @return ipUserModification
  **/
  @ApiModelProperty(example = "null", value = "The IP of the user who modified the contract")
  public String getIpUserModification() {
    return ipUserModification;
  }

  public void setIpUserModification(String ipUserModification) {
    this.ipUserModification = ipUserModification;
  }

  public CurrentContractInfo fixedAndVariableClickInfo(FixedAndVariableClickModelInfo fixedAndVariableClickInfo) {
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

  public CurrentContractInfo variableModelInfo(VariableModelInfo variableModelInfo) {
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

  public CurrentContractInfo isCommitmentRenewalAutomatically(Boolean isCommitmentRenewalAutomatically) {
    this.isCommitmentRenewalAutomatically = isCommitmentRenewalAutomatically;
    return this;
  }

   /**
   * Is commitment is automatically renewed
   * @return isCommitmentRenewalAutomatically
  **/
  @ApiModelProperty(example = "null", value = "Is commitment is automatically renewed")
  public Boolean getIsCommitmentRenewalAutomatically() {
    return isCommitmentRenewalAutomatically;
  }

  public void setIsCommitmentRenewalAutomatically(Boolean isCommitmentRenewalAutomatically) {
    this.isCommitmentRenewalAutomatically = isCommitmentRenewalAutomatically;
  }

  public CurrentContractInfo discountEndUtcDate(DateTime discountEndUtcDate) {
    this.discountEndUtcDate = discountEndUtcDate;
    return this;
  }

   /**
   * The end of your discount
   * @return discountEndUtcDate
  **/
  @ApiModelProperty(example = "null", value = "The end of your discount")
  public DateTime getDiscountEndUtcDate() {
    return discountEndUtcDate;
  }

  public void setDiscountEndUtcDate(DateTime discountEndUtcDate) {
    this.discountEndUtcDate = discountEndUtcDate;
  }

  public CurrentContractInfo isModifiableContract(Boolean isModifiableContract) {
    this.isModifiableContract = isModifiableContract;
    return this;
  }

   /**
   * Is the contract is modifiable ?
   * @return isModifiableContract
  **/
  @ApiModelProperty(example = "null", value = "Is the contract is modifiable ?")
  public Boolean getIsModifiableContract() {
    return isModifiableContract;
  }

  public void setIsModifiableContract(Boolean isModifiableContract) {
    this.isModifiableContract = isModifiableContract;
  }

  public CurrentContractInfo links(CurrentContractInfoLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CurrentContractInfoLinks getLinks() {
    return links;
  }

  public void setLinks(CurrentContractInfoLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentContractInfo currentContractInfo = (CurrentContractInfo) o;
    return Objects.equals(this.trialPeriodInMonth, currentContractInfo.trialPeriodInMonth) &&
        Objects.equals(this.billingPeriodPercentDiscount, currentContractInfo.billingPeriodPercentDiscount) &&
        Objects.equals(this.discountDurationInMonth, currentContractInfo.discountDurationInMonth) &&
        Objects.equals(this.percentDiscount, currentContractInfo.percentDiscount) &&
        Objects.equals(this.offerId, currentContractInfo.offerId) &&
        Objects.equals(this.storeCount, currentContractInfo.storeCount) &&
        Objects.equals(this.startUtcDate, currentContractInfo.startUtcDate) &&
        Objects.equals(this.commitmentCalculatedFinishUtcDate, currentContractInfo.commitmentCalculatedFinishUtcDate) &&
        Objects.equals(this.billingPeriodInMonth, currentContractInfo.billingPeriodInMonth) &&
        Objects.equals(this.fixedPrice, currentContractInfo.fixedPrice) &&
        Objects.equals(this.offerName, currentContractInfo.offerName) &&
        Objects.equals(this.currencyCode, currentContractInfo.currencyCode) &&
        Objects.equals(this.contractId, currentContractInfo.contractId) &&
        Objects.equals(this.commitmentPeriodInMonth, currentContractInfo.commitmentPeriodInMonth) &&
        Objects.equals(this.clickIncluded, currentContractInfo.clickIncluded) &&
        Objects.equals(this.additionalClickPrice, currentContractInfo.additionalClickPrice) &&
        Objects.equals(this.ipUserCreation, currentContractInfo.ipUserCreation) &&
        Objects.equals(this.ipUserModification, currentContractInfo.ipUserModification) &&
        Objects.equals(this.fixedAndVariableClickInfo, currentContractInfo.fixedAndVariableClickInfo) &&
        Objects.equals(this.variableModelInfo, currentContractInfo.variableModelInfo) &&
        Objects.equals(this.isCommitmentRenewalAutomatically, currentContractInfo.isCommitmentRenewalAutomatically) &&
        Objects.equals(this.discountEndUtcDate, currentContractInfo.discountEndUtcDate) &&
        Objects.equals(this.isModifiableContract, currentContractInfo.isModifiableContract) &&
        Objects.equals(this.links, currentContractInfo.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialPeriodInMonth, billingPeriodPercentDiscount, discountDurationInMonth, percentDiscount, offerId, storeCount, startUtcDate, commitmentCalculatedFinishUtcDate, billingPeriodInMonth, fixedPrice, offerName, currencyCode, contractId, commitmentPeriodInMonth, clickIncluded, additionalClickPrice, ipUserCreation, ipUserModification, fixedAndVariableClickInfo, variableModelInfo, isCommitmentRenewalAutomatically, discountEndUtcDate, isModifiableContract, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentContractInfo {\n");
    
    sb.append("    trialPeriodInMonth: ").append(toIndentedString(trialPeriodInMonth)).append("\n");
    sb.append("    billingPeriodPercentDiscount: ").append(toIndentedString(billingPeriodPercentDiscount)).append("\n");
    sb.append("    discountDurationInMonth: ").append(toIndentedString(discountDurationInMonth)).append("\n");
    sb.append("    percentDiscount: ").append(toIndentedString(percentDiscount)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    storeCount: ").append(toIndentedString(storeCount)).append("\n");
    sb.append("    startUtcDate: ").append(toIndentedString(startUtcDate)).append("\n");
    sb.append("    commitmentCalculatedFinishUtcDate: ").append(toIndentedString(commitmentCalculatedFinishUtcDate)).append("\n");
    sb.append("    billingPeriodInMonth: ").append(toIndentedString(billingPeriodInMonth)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    commitmentPeriodInMonth: ").append(toIndentedString(commitmentPeriodInMonth)).append("\n");
    sb.append("    clickIncluded: ").append(toIndentedString(clickIncluded)).append("\n");
    sb.append("    additionalClickPrice: ").append(toIndentedString(additionalClickPrice)).append("\n");
    sb.append("    ipUserCreation: ").append(toIndentedString(ipUserCreation)).append("\n");
    sb.append("    ipUserModification: ").append(toIndentedString(ipUserModification)).append("\n");
    sb.append("    fixedAndVariableClickInfo: ").append(toIndentedString(fixedAndVariableClickInfo)).append("\n");
    sb.append("    variableModelInfo: ").append(toIndentedString(variableModelInfo)).append("\n");
    sb.append("    isCommitmentRenewalAutomatically: ").append(toIndentedString(isCommitmentRenewalAutomatically)).append("\n");
    sb.append("    discountEndUtcDate: ").append(toIndentedString(discountEndUtcDate)).append("\n");
    sb.append("    isModifiableContract: ").append(toIndentedString(isModifiableContract)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

