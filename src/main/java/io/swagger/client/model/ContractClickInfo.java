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
 * Describe the click information related to the offer.
 */
@ApiModel(description = "Describe the click information related to the offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class ContractClickInfo {
  @SerializedName("additionalClickPrice")
  private Double additionalClickPrice = null;

  @SerializedName("clickIncluded")
  private Integer clickIncluded = null;

  @SerializedName("initialOfferClickIncluded")
  private Integer initialOfferClickIncluded = null;

  public ContractClickInfo additionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
    return this;
  }

   /**
   * The addition click price in the offer
   * @return additionalClickPrice
  **/
  @ApiModelProperty(example = "null", value = "The addition click price in the offer")
  public Double getAdditionalClickPrice() {
    return additionalClickPrice;
  }

  public void setAdditionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
  }

  public ContractClickInfo clickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
    return this;
  }

   /**
   * The click included in the offer
   * @return clickIncluded
  **/
  @ApiModelProperty(example = "null", value = "The click included in the offer")
  public Integer getClickIncluded() {
    return clickIncluded;
  }

  public void setClickIncluded(Integer clickIncluded) {
    this.clickIncluded = clickIncluded;
  }

  public ContractClickInfo initialOfferClickIncluded(Integer initialOfferClickIncluded) {
    this.initialOfferClickIncluded = initialOfferClickIncluded;
    return this;
  }

   /**
   * The click included in your current contract
   * @return initialOfferClickIncluded
  **/
  @ApiModelProperty(example = "null", value = "The click included in your current contract")
  public Integer getInitialOfferClickIncluded() {
    return initialOfferClickIncluded;
  }

  public void setInitialOfferClickIncluded(Integer initialOfferClickIncluded) {
    this.initialOfferClickIncluded = initialOfferClickIncluded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractClickInfo contractClickInfo = (ContractClickInfo) o;
    return Objects.equals(this.additionalClickPrice, contractClickInfo.additionalClickPrice) &&
        Objects.equals(this.clickIncluded, contractClickInfo.clickIncluded) &&
        Objects.equals(this.initialOfferClickIncluded, contractClickInfo.initialOfferClickIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalClickPrice, clickIncluded, initialOfferClickIncluded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractClickInfo {\n");
    
    sb.append("    additionalClickPrice: ").append(toIndentedString(additionalClickPrice)).append("\n");
    sb.append("    clickIncluded: ").append(toIndentedString(clickIncluded)).append("\n");
    sb.append("    initialOfferClickIncluded: ").append(toIndentedString(initialOfferClickIncluded)).append("\n");
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

