/*
 * BeezUP API
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
import io.swagger.client.model.AccountId;
import io.swagger.client.model.AutomaticTransition;
import io.swagger.client.model.AutomaticTransitionInfoLinks;
import io.swagger.client.model.BeezUPCommonMarketplaceBusinessCode;
import io.swagger.client.model.BeezUPCommonMarketplaceTechnicalCode;
import io.swagger.client.model.BeezUPOrderStatus;
import io.swagger.client.model.BusinessOperationType;

/**
 * AutomaticTransitionInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class AutomaticTransitionInfo {
  @SerializedName("marketplaceTechnicalCode")
  private BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode = null;

  @SerializedName("accountId")
  private AccountId accountId = null;

  @SerializedName("orderStatusTransitionId")
  private Integer orderStatusTransitionId = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("marketplaceBusinessCode")
  private BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode = null;

  @SerializedName("beezUPOrderStatus")
  private BeezUPOrderStatus beezUPOrderStatus = null;

  @SerializedName("businessOperationType")
  private BusinessOperationType businessOperationType = null;

  @SerializedName("links")
  private AutomaticTransitionInfoLinks links = null;

  public AutomaticTransitionInfo marketplaceTechnicalCode(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
    return this;
  }

   /**
   * Get marketplaceTechnicalCode
   * @return marketplaceTechnicalCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonMarketplaceTechnicalCode getMarketplaceTechnicalCode() {
    return marketplaceTechnicalCode;
  }

  public void setMarketplaceTechnicalCode(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
  }

  public AutomaticTransitionInfo accountId(AccountId accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AccountId getAccountId() {
    return accountId;
  }

  public void setAccountId(AccountId accountId) {
    this.accountId = accountId;
  }

  public AutomaticTransitionInfo orderStatusTransitionId(Integer orderStatusTransitionId) {
    this.orderStatusTransitionId = orderStatusTransitionId;
    return this;
  }

   /**
   * Get orderStatusTransitionId
   * @return orderStatusTransitionId
  **/
  @ApiModelProperty(example = "1234", required = true, value = "")
  public Integer getOrderStatusTransitionId() {
    return orderStatusTransitionId;
  }

  public void setOrderStatusTransitionId(Integer orderStatusTransitionId) {
    this.orderStatusTransitionId = orderStatusTransitionId;
  }

  public AutomaticTransitionInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AutomaticTransitionInfo marketplaceBusinessCode(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
    return this;
  }

   /**
   * Get marketplaceBusinessCode
   * @return marketplaceBusinessCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonMarketplaceBusinessCode getMarketplaceBusinessCode() {
    return marketplaceBusinessCode;
  }

  public void setMarketplaceBusinessCode(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
  }

  public AutomaticTransitionInfo beezUPOrderStatus(BeezUPOrderStatus beezUPOrderStatus) {
    this.beezUPOrderStatus = beezUPOrderStatus;
    return this;
  }

   /**
   * Get beezUPOrderStatus
   * @return beezUPOrderStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPOrderStatus getBeezUPOrderStatus() {
    return beezUPOrderStatus;
  }

  public void setBeezUPOrderStatus(BeezUPOrderStatus beezUPOrderStatus) {
    this.beezUPOrderStatus = beezUPOrderStatus;
  }

  public AutomaticTransitionInfo businessOperationType(BusinessOperationType businessOperationType) {
    this.businessOperationType = businessOperationType;
    return this;
  }

   /**
   * Get businessOperationType
   * @return businessOperationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BusinessOperationType getBusinessOperationType() {
    return businessOperationType;
  }

  public void setBusinessOperationType(BusinessOperationType businessOperationType) {
    this.businessOperationType = businessOperationType;
  }

  public AutomaticTransitionInfo links(AutomaticTransitionInfoLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public AutomaticTransitionInfoLinks getLinks() {
    return links;
  }

  public void setLinks(AutomaticTransitionInfoLinks links) {
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
    AutomaticTransitionInfo automaticTransitionInfo = (AutomaticTransitionInfo) o;
    return Objects.equals(this.marketplaceTechnicalCode, automaticTransitionInfo.marketplaceTechnicalCode) &&
        Objects.equals(this.accountId, automaticTransitionInfo.accountId) &&
        Objects.equals(this.orderStatusTransitionId, automaticTransitionInfo.orderStatusTransitionId) &&
        Objects.equals(this.enabled, automaticTransitionInfo.enabled) &&
        Objects.equals(this.marketplaceBusinessCode, automaticTransitionInfo.marketplaceBusinessCode) &&
        Objects.equals(this.beezUPOrderStatus, automaticTransitionInfo.beezUPOrderStatus) &&
        Objects.equals(this.businessOperationType, automaticTransitionInfo.businessOperationType) &&
        Objects.equals(this.links, automaticTransitionInfo.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceTechnicalCode, accountId, orderStatusTransitionId, enabled, marketplaceBusinessCode, beezUPOrderStatus, businessOperationType, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticTransitionInfo {\n");
    
    sb.append("    marketplaceTechnicalCode: ").append(toIndentedString(marketplaceTechnicalCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    orderStatusTransitionId: ").append(toIndentedString(orderStatusTransitionId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    marketplaceBusinessCode: ").append(toIndentedString(marketplaceBusinessCode)).append("\n");
    sb.append("    beezUPOrderStatus: ").append(toIndentedString(beezUPOrderStatus)).append("\n");
    sb.append("    businessOperationType: ").append(toIndentedString(businessOperationType)).append("\n");
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

