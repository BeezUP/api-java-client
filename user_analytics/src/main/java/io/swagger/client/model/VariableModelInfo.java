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
import io.swagger.client.model.ClickIncludedAndVariablePrice;
import java.util.ArrayList;
import java.util.List;

/**
 * Internal usage: Old offer type. Describe the fix and variable model information
 */
@ApiModel(description = "Internal usage: Old offer type. Describe the fix and variable model information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class VariableModelInfo {
  @SerializedName("clickIncludedAndVariablePrices")
  private List<ClickIncludedAndVariablePrice> clickIncludedAndVariablePrices = new ArrayList<ClickIncludedAndVariablePrice>();

  @SerializedName("overflowClickCount")
  private Integer overflowClickCount = null;

  @SerializedName("overflowClickPrice")
  private Double overflowClickPrice = null;

  public VariableModelInfo clickIncludedAndVariablePrices(List<ClickIncludedAndVariablePrice> clickIncludedAndVariablePrices) {
    this.clickIncludedAndVariablePrices = clickIncludedAndVariablePrices;
    return this;
  }

  public VariableModelInfo addClickIncludedAndVariablePricesItem(ClickIncludedAndVariablePrice clickIncludedAndVariablePricesItem) {
    this.clickIncludedAndVariablePrices.add(clickIncludedAndVariablePricesItem);
    return this;
  }

   /**
   * Click included with variable pricing information
   * @return clickIncludedAndVariablePrices
  **/
  @ApiModelProperty(example = "null", value = "Click included with variable pricing information")
  public List<ClickIncludedAndVariablePrice> getClickIncludedAndVariablePrices() {
    return clickIncludedAndVariablePrices;
  }

  public void setClickIncludedAndVariablePrices(List<ClickIncludedAndVariablePrice> clickIncludedAndVariablePrices) {
    this.clickIncludedAndVariablePrices = clickIncludedAndVariablePrices;
  }

  public VariableModelInfo overflowClickCount(Integer overflowClickCount) {
    this.overflowClickCount = overflowClickCount;
    return this;
  }

   /**
   * The overflow click count
   * @return overflowClickCount
  **/
  @ApiModelProperty(example = "null", value = "The overflow click count")
  public Integer getOverflowClickCount() {
    return overflowClickCount;
  }

  public void setOverflowClickCount(Integer overflowClickCount) {
    this.overflowClickCount = overflowClickCount;
  }

  public VariableModelInfo overflowClickPrice(Double overflowClickPrice) {
    this.overflowClickPrice = overflowClickPrice;
    return this;
  }

   /**
   * The overflow click price
   * @return overflowClickPrice
  **/
  @ApiModelProperty(example = "null", value = "The overflow click price")
  public Double getOverflowClickPrice() {
    return overflowClickPrice;
  }

  public void setOverflowClickPrice(Double overflowClickPrice) {
    this.overflowClickPrice = overflowClickPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableModelInfo variableModelInfo = (VariableModelInfo) o;
    return Objects.equals(this.clickIncludedAndVariablePrices, variableModelInfo.clickIncludedAndVariablePrices) &&
        Objects.equals(this.overflowClickCount, variableModelInfo.overflowClickCount) &&
        Objects.equals(this.overflowClickPrice, variableModelInfo.overflowClickPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickIncludedAndVariablePrices, overflowClickCount, overflowClickPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableModelInfo {\n");
    
    sb.append("    clickIncludedAndVariablePrices: ").append(toIndentedString(clickIncludedAndVariablePrices)).append("\n");
    sb.append("    overflowClickCount: ").append(toIndentedString(overflowClickCount)).append("\n");
    sb.append("    overflowClickPrice: ").append(toIndentedString(overflowClickPrice)).append("\n");
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
