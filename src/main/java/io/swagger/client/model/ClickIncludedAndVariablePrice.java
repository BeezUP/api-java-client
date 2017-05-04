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
 * ClickIncludedAndVariablePrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:13:58.502Z")
public class ClickIncludedAndVariablePrice {
  @SerializedName("clickIncluded")
  private Integer clickIncluded = null;

  @SerializedName("variablePrice")
  private Double variablePrice = null;

  public ClickIncludedAndVariablePrice clickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
    return this;
  }

   /**
   * Click included
   * @return clickIncluded
  **/
  @ApiModelProperty(example = "null", value = "Click included")
  public Integer getClickIncluded() {
    return clickIncluded;
  }

  public void setClickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
  }

  public ClickIncludedAndVariablePrice variablePrice(Double variablePrice) {
    this.variablePrice = variablePrice;
    return this;
  }

   /**
   * The pricing applied for this range
   * @return variablePrice
  **/
  @ApiModelProperty(example = "null", value = "The pricing applied for this range")
  public Double getVariablePrice() {
    return variablePrice;
  }

  public void setVariablePrice(Double variablePrice) {
    this.variablePrice = variablePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickIncludedAndVariablePrice clickIncludedAndVariablePrice = (ClickIncludedAndVariablePrice) o;
    return Objects.equals(this.clickIncluded, clickIncludedAndVariablePrice.clickIncluded) &&
        Objects.equals(this.variablePrice, clickIncludedAndVariablePrice.variablePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickIncluded, variablePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickIncludedAndVariablePrice {\n");
    
    sb.append("    clickIncluded: ").append(toIndentedString(clickIncluded)).append("\n");
    sb.append("    variablePrice: ").append(toIndentedString(variablePrice)).append("\n");
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

