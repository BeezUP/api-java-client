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
import io.swagger.client.model.BillingPeriodInMonth;

/**
 * Describe the billing period information related to the offer.
 */
@ApiModel(description = "Describe the billing period information related to the offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:19:12.808Z")
public class ContractBillingPeriodInfo {
  @SerializedName("amountBillingPeriodDiscount")
  private Double amountBillingPeriodDiscount = null;

  @SerializedName("billingPeriodPercentDiscount")
  private Double billingPeriodPercentDiscount = null;

  @SerializedName("billingPeriodInMonth")
  private BillingPeriodInMonth billingPeriodInMonth = null;

  public ContractBillingPeriodInfo amountBillingPeriodDiscount(Double amountBillingPeriodDiscount) {
    this.amountBillingPeriodDiscount = amountBillingPeriodDiscount;
    return this;
  }

   /**
   * The amount discounted related to the billing period
   * @return amountBillingPeriodDiscount
  **/
  @ApiModelProperty(example = "null", value = "The amount discounted related to the billing period")
  public Double getAmountBillingPeriodDiscount() {
    return amountBillingPeriodDiscount;
  }

  public void setAmountBillingPeriodDiscount(Double amountBillingPeriodDiscount) {
    this.amountBillingPeriodDiscount = amountBillingPeriodDiscount;
  }

  public ContractBillingPeriodInfo billingPeriodPercentDiscount(Double billingPeriodPercentDiscount) {
    this.billingPeriodPercentDiscount = billingPeriodPercentDiscount;
    return this;
  }

   /**
   * The discount percent related to the billing period
   * @return billingPeriodPercentDiscount
  **/
  @ApiModelProperty(example = "null", value = "The discount percent related to the billing period")
  public Double getBillingPeriodPercentDiscount() {
    return billingPeriodPercentDiscount;
  }

  public void setBillingPeriodPercentDiscount(Double billingPeriodPercentDiscount) {
    this.billingPeriodPercentDiscount = billingPeriodPercentDiscount;
  }

  public ContractBillingPeriodInfo billingPeriodInMonth(BillingPeriodInMonth billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
    return this;
  }

   /**
   * Get billingPeriodInMonth
   * @return billingPeriodInMonth
  **/
  @ApiModelProperty(example = "null", value = "")
  public BillingPeriodInMonth getBillingPeriodInMonth() {
    return billingPeriodInMonth;
  }

  public void setBillingPeriodInMonth(BillingPeriodInMonth billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractBillingPeriodInfo contractBillingPeriodInfo = (ContractBillingPeriodInfo) o;
    return Objects.equals(this.amountBillingPeriodDiscount, contractBillingPeriodInfo.amountBillingPeriodDiscount) &&
        Objects.equals(this.billingPeriodPercentDiscount, contractBillingPeriodInfo.billingPeriodPercentDiscount) &&
        Objects.equals(this.billingPeriodInMonth, contractBillingPeriodInfo.billingPeriodInMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountBillingPeriodDiscount, billingPeriodPercentDiscount, billingPeriodInMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractBillingPeriodInfo {\n");
    
    sb.append("    amountBillingPeriodDiscount: ").append(toIndentedString(amountBillingPeriodDiscount)).append("\n");
    sb.append("    billingPeriodPercentDiscount: ").append(toIndentedString(billingPeriodPercentDiscount)).append("\n");
    sb.append("    billingPeriodInMonth: ").append(toIndentedString(billingPeriodInMonth)).append("\n");
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

