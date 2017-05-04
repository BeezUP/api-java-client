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

/**
 * BillingPeriod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:49:32.058Z")
public class BillingPeriod {
  @SerializedName("billingPeriodInMonth")
  private Integer billingPeriodInMonth = null;

  @SerializedName("discountPercentage")
  private Double discountPercentage = null;

  public BillingPeriod billingPeriodInMonth(Integer billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
    return this;
  }

   /**
   * The billing period in month
   * @return billingPeriodInMonth
  **/
  @ApiModelProperty(example = "12", required = true, value = "The billing period in month")
  public Integer getBillingPeriodInMonth() {
    return billingPeriodInMonth;
  }

  public void setBillingPeriodInMonth(Integer billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
  }

  public BillingPeriod discountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

   /**
   * The discount percentage related to this billing period
   * @return discountPercentage
  **/
  @ApiModelProperty(example = "20.0", required = true, value = "The discount percentage related to this billing period")
  public Double getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPeriod billingPeriod = (BillingPeriod) o;
    return Objects.equals(this.billingPeriodInMonth, billingPeriod.billingPeriodInMonth) &&
        Objects.equals(this.discountPercentage, billingPeriod.discountPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriodInMonth, discountPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPeriod {\n");
    
    sb.append("    billingPeriodInMonth: ").append(toIndentedString(billingPeriodInMonth)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
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

