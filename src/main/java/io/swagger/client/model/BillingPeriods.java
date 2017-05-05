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
import io.swagger.client.model.BillingPeriod;
import java.util.ArrayList;
import java.util.List;

/**
 * BillingPeriods
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:17:16.769Z")
public class BillingPeriods {
  @SerializedName("billingPeriods")
  private List<BillingPeriod> billingPeriods = new ArrayList<BillingPeriod>();

  public BillingPeriods billingPeriods(List<BillingPeriod> billingPeriods) {
    this.billingPeriods = billingPeriods;
    return this;
  }

  public BillingPeriods addBillingPeriodsItem(BillingPeriod billingPeriodsItem) {
    this.billingPeriods.add(billingPeriodsItem);
    return this;
  }

   /**
   * The billing period list
   * @return billingPeriods
  **/
  @ApiModelProperty(example = "[{&quot;billingPeriodInMonth&quot;:12,&quot;discountPercentage&quot;:20.0}]", required = true, value = "The billing period list")
  public List<BillingPeriod> getBillingPeriods() {
    return billingPeriods;
  }

  public void setBillingPeriods(List<BillingPeriod> billingPeriods) {
    this.billingPeriods = billingPeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPeriods billingPeriods = (BillingPeriods) o;
    return Objects.equals(this.billingPeriods, billingPeriods.billingPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPeriods {\n");
    
    sb.append("    billingPeriods: ").append(toIndentedString(billingPeriods)).append("\n");
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

