/*
 * Marketplaces - Orders
 * The features exposed in this API are centered around managing Orders harvested from your configured marketplaces.\\ This includes: - fetching current information (as known by BeezUP) for a single or multiple Orders, - requesting Order harvest to synchronize your marketplaces and BeezUP accounts, - changing BeezUP data and requesting changes to your marketplaces (accepting, shipping, etc), - configuring automatic changes to marketplace based our newly fetched data, - creating and exporting reports for your Orders. 
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
import io.swagger.client.model.MarketplaceTechnicalCode;

/**
 * AutomaticTransition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:20:15.254Z")
public class AutomaticTransition {
  @SerializedName("marketplaceTechnicalCode")
  private MarketplaceTechnicalCode marketplaceTechnicalCode = null;

  @SerializedName("accountId")
  private AccountId accountId = null;

  @SerializedName("orderStatusTransitionId")
  private Integer orderStatusTransitionId = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public AutomaticTransition marketplaceTechnicalCode(MarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
    return this;
  }

   /**
   * Get marketplaceTechnicalCode
   * @return marketplaceTechnicalCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceTechnicalCode getMarketplaceTechnicalCode() {
    return marketplaceTechnicalCode;
  }

  public void setMarketplaceTechnicalCode(MarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
  }

  public AutomaticTransition accountId(AccountId accountId) {
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

  public AutomaticTransition orderStatusTransitionId(Integer orderStatusTransitionId) {
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

  public AutomaticTransition enabled(Boolean enabled) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomaticTransition automaticTransition = (AutomaticTransition) o;
    return Objects.equals(this.marketplaceTechnicalCode, automaticTransition.marketplaceTechnicalCode) &&
        Objects.equals(this.accountId, automaticTransition.accountId) &&
        Objects.equals(this.orderStatusTransitionId, automaticTransition.orderStatusTransitionId) &&
        Objects.equals(this.enabled, automaticTransition.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceTechnicalCode, accountId, orderStatusTransitionId, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticTransition {\n");
    
    sb.append("    marketplaceTechnicalCode: ").append(toIndentedString(marketplaceTechnicalCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    orderStatusTransitionId: ").append(toIndentedString(orderStatusTransitionId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

