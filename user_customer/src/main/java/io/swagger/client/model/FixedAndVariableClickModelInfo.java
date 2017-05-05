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
import io.swagger.client.model.ClickIncludedAndAdditionalClickPrice;
import java.util.ArrayList;
import java.util.List;

/**
 * Internal usage: Old offer type. Describe the fix and variable model information
 */
@ApiModel(description = "Internal usage: Old offer type. Describe the fix and variable model information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:15:59.675Z")
public class FixedAndVariableClickModelInfo {
  @SerializedName("clickIncludedAndAdditionalClickPrices")
  private List<ClickIncludedAndAdditionalClickPrice> clickIncludedAndAdditionalClickPrices = new ArrayList<ClickIncludedAndAdditionalClickPrice>();

  public FixedAndVariableClickModelInfo clickIncludedAndAdditionalClickPrices(List<ClickIncludedAndAdditionalClickPrice> clickIncludedAndAdditionalClickPrices) {
    this.clickIncludedAndAdditionalClickPrices = clickIncludedAndAdditionalClickPrices;
    return this;
  }

  public FixedAndVariableClickModelInfo addClickIncludedAndAdditionalClickPricesItem(ClickIncludedAndAdditionalClickPrice clickIncludedAndAdditionalClickPricesItem) {
    this.clickIncludedAndAdditionalClickPrices.add(clickIncludedAndAdditionalClickPricesItem);
    return this;
  }

   /**
   * Get clickIncludedAndAdditionalClickPrices
   * @return clickIncludedAndAdditionalClickPrices
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ClickIncludedAndAdditionalClickPrice> getClickIncludedAndAdditionalClickPrices() {
    return clickIncludedAndAdditionalClickPrices;
  }

  public void setClickIncludedAndAdditionalClickPrices(List<ClickIncludedAndAdditionalClickPrice> clickIncludedAndAdditionalClickPrices) {
    this.clickIncludedAndAdditionalClickPrices = clickIncludedAndAdditionalClickPrices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedAndVariableClickModelInfo fixedAndVariableClickModelInfo = (FixedAndVariableClickModelInfo) o;
    return Objects.equals(this.clickIncludedAndAdditionalClickPrices, fixedAndVariableClickModelInfo.clickIncludedAndAdditionalClickPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickIncludedAndAdditionalClickPrices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedAndVariableClickModelInfo {\n");
    
    sb.append("    clickIncludedAndAdditionalClickPrices: ").append(toIndentedString(clickIncludedAndAdditionalClickPrices)).append("\n");
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

