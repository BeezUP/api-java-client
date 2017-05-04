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
import io.swagger.client.model.BonusType;

/**
 * BonusInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:03:05.460Z")
public class BonusInfo {
  @SerializedName("bonusType")
  private BonusType bonusType = null;

  @SerializedName("amount")
  private Double amount = null;

  public BonusInfo bonusType(BonusType bonusType) {
    this.bonusType = bonusType;
    return this;
  }

   /**
   * Get bonusType
   * @return bonusType
  **/
  @ApiModelProperty(example = "null", value = "")
  public BonusType getBonusType() {
    return bonusType;
  }

  public void setBonusType(BonusType bonusType) {
    this.bonusType = bonusType;
  }

  public BonusInfo amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "12.34", value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BonusInfo bonusInfo = (BonusInfo) o;
    return Objects.equals(this.bonusType, bonusInfo.bonusType) &&
        Objects.equals(this.amount, bonusInfo.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonusType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BonusInfo {\n");
    
    sb.append("    bonusType: ").append(toIndentedString(bonusType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

