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
import io.swagger.client.model.AccountId;
import io.swagger.client.model.BeezUPOrderId;
import io.swagger.client.model.MarketplaceTechnicalCode;

/**
 * OrderIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:05:37.723Z")
public class OrderIdentifier {
  @SerializedName("marketplaceTechnicalCode")
  private MarketplaceTechnicalCode marketplaceTechnicalCode = null;

  @SerializedName("accountId")
  private AccountId accountId = null;

  @SerializedName("beezUPOrderId")
  private BeezUPOrderId beezUPOrderId = null;

  public OrderIdentifier marketplaceTechnicalCode(MarketplaceTechnicalCode marketplaceTechnicalCode) {
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

  public OrderIdentifier accountId(AccountId accountId) {
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

  public OrderIdentifier beezUPOrderId(BeezUPOrderId beezUPOrderId) {
    this.beezUPOrderId = beezUPOrderId;
    return this;
  }

   /**
   * Get beezUPOrderId
   * @return beezUPOrderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPOrderId getBeezUPOrderId() {
    return beezUPOrderId;
  }

  public void setBeezUPOrderId(BeezUPOrderId beezUPOrderId) {
    this.beezUPOrderId = beezUPOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIdentifier orderIdentifier = (OrderIdentifier) o;
    return Objects.equals(this.marketplaceTechnicalCode, orderIdentifier.marketplaceTechnicalCode) &&
        Objects.equals(this.accountId, orderIdentifier.accountId) &&
        Objects.equals(this.beezUPOrderId, orderIdentifier.beezUPOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceTechnicalCode, accountId, beezUPOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIdentifier {\n");
    
    sb.append("    marketplaceTechnicalCode: ").append(toIndentedString(marketplaceTechnicalCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beezUPOrderId: ").append(toIndentedString(beezUPOrderId)).append("\n");
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

