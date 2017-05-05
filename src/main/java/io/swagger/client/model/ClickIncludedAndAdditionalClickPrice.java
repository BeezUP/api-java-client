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
 * ClickIncludedAndAdditionalClickPrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:58:49.009Z")
public class ClickIncludedAndAdditionalClickPrice {
  @SerializedName("clickIncluded")
  private Integer clickIncluded = null;

  @SerializedName("additionalClickPrice")
  private Double additionalClickPrice = null;

  public ClickIncludedAndAdditionalClickPrice clickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
    return this;
  }

   /**
   * The click included
   * @return clickIncluded
  **/
  @ApiModelProperty(example = "null", value = "The click included")
  public Integer getClickIncluded() {
    return clickIncluded;
  }

  public void setClickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
  }

  public ClickIncludedAndAdditionalClickPrice additionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
    return this;
  }

   /**
   * The additional click price
   * @return additionalClickPrice
  **/
  @ApiModelProperty(example = "null", value = "The additional click price")
  public Double getAdditionalClickPrice() {
    return additionalClickPrice;
  }

  public void setAdditionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickIncludedAndAdditionalClickPrice clickIncludedAndAdditionalClickPrice = (ClickIncludedAndAdditionalClickPrice) o;
    return Objects.equals(this.clickIncluded, clickIncludedAndAdditionalClickPrice.clickIncluded) &&
        Objects.equals(this.additionalClickPrice, clickIncludedAndAdditionalClickPrice.additionalClickPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickIncluded, additionalClickPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickIncludedAndAdditionalClickPrice {\n");
    
    sb.append("    clickIncluded: ").append(toIndentedString(clickIncluded)).append("\n");
    sb.append("    additionalClickPrice: ").append(toIndentedString(additionalClickPrice)).append("\n");
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

