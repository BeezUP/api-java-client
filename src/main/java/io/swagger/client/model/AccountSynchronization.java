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
import io.swagger.client.model.BeezUPCommonMarketplaceBusinessCode;
import io.swagger.client.model.BeezUPCommonMarketplaceTechnicalCode;
import org.joda.time.DateTime;

/**
 * AccountSynchronization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class AccountSynchronization {
  @SerializedName("accountId")
  private AccountId accountId = null;

  @SerializedName("completedHarvestSynchroUtcDate")
  private DateTime completedHarvestSynchroUtcDate = null;

  @SerializedName("marketplaceBusinessCode")
  private BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode = null;

  @SerializedName("marketplaceTechnicalCode")
  private BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode = null;

  public AccountSynchronization accountId(AccountId accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountId getAccountId() {
    return accountId;
  }

  public void setAccountId(AccountId accountId) {
    this.accountId = accountId;
  }

  public AccountSynchronization completedHarvestSynchroUtcDate(DateTime completedHarvestSynchroUtcDate) {
    this.completedHarvestSynchroUtcDate = completedHarvestSynchroUtcDate;
    return this;
  }

   /**
   * Get completedHarvestSynchroUtcDate
   * @return completedHarvestSynchroUtcDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCompletedHarvestSynchroUtcDate() {
    return completedHarvestSynchroUtcDate;
  }

  public void setCompletedHarvestSynchroUtcDate(DateTime completedHarvestSynchroUtcDate) {
    this.completedHarvestSynchroUtcDate = completedHarvestSynchroUtcDate;
  }

  public AccountSynchronization marketplaceBusinessCode(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
    return this;
  }

   /**
   * Get marketplaceBusinessCode
   * @return marketplaceBusinessCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonMarketplaceBusinessCode getMarketplaceBusinessCode() {
    return marketplaceBusinessCode;
  }

  public void setMarketplaceBusinessCode(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
  }

  public AccountSynchronization marketplaceTechnicalCode(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
    return this;
  }

   /**
   * Get marketplaceTechnicalCode
   * @return marketplaceTechnicalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonMarketplaceTechnicalCode getMarketplaceTechnicalCode() {
    return marketplaceTechnicalCode;
  }

  public void setMarketplaceTechnicalCode(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSynchronization accountSynchronization = (AccountSynchronization) o;
    return Objects.equals(this.accountId, accountSynchronization.accountId) &&
        Objects.equals(this.completedHarvestSynchroUtcDate, accountSynchronization.completedHarvestSynchroUtcDate) &&
        Objects.equals(this.marketplaceBusinessCode, accountSynchronization.marketplaceBusinessCode) &&
        Objects.equals(this.marketplaceTechnicalCode, accountSynchronization.marketplaceTechnicalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, completedHarvestSynchroUtcDate, marketplaceBusinessCode, marketplaceTechnicalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSynchronization {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    completedHarvestSynchroUtcDate: ").append(toIndentedString(completedHarvestSynchroUtcDate)).append("\n");
    sb.append("    marketplaceBusinessCode: ").append(toIndentedString(marketplaceBusinessCode)).append("\n");
    sb.append("    marketplaceTechnicalCode: ").append(toIndentedString(marketplaceTechnicalCode)).append("\n");
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

