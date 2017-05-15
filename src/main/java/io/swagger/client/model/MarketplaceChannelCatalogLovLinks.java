/*
 * Public - Security
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
import io.swagger.client.model.BeezUPCommonLOVLink3;

/**
 * Indicates the List Of Values related to the marketplace
 */
@ApiModel(description = "Indicates the List Of Values related to the marketplace")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:30:06.948Z")
public class MarketplaceChannelCatalogLovLinks {
  @SerializedName("shippingMethodLOV")
  private BeezUPCommonLOVLink3 shippingMethodLOV = null;

  @SerializedName("carrierCodeLOV")
  private BeezUPCommonLOVLink3 carrierCodeLOV = null;

  @SerializedName("cancelationReasonCodeLOV")
  private BeezUPCommonLOVLink3 cancelationReasonCodeLOV = null;

  @SerializedName("refundReasonCodeLOV")
  private BeezUPCommonLOVLink3 refundReasonCodeLOV = null;

  public MarketplaceChannelCatalogLovLinks shippingMethodLOV(BeezUPCommonLOVLink3 shippingMethodLOV) {
    this.shippingMethodLOV = shippingMethodLOV;
    return this;
  }

   /**
   * Get shippingMethodLOV
   * @return shippingMethodLOV
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLOVLink3 getShippingMethodLOV() {
    return shippingMethodLOV;
  }

  public void setShippingMethodLOV(BeezUPCommonLOVLink3 shippingMethodLOV) {
    this.shippingMethodLOV = shippingMethodLOV;
  }

  public MarketplaceChannelCatalogLovLinks carrierCodeLOV(BeezUPCommonLOVLink3 carrierCodeLOV) {
    this.carrierCodeLOV = carrierCodeLOV;
    return this;
  }

   /**
   * Get carrierCodeLOV
   * @return carrierCodeLOV
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLOVLink3 getCarrierCodeLOV() {
    return carrierCodeLOV;
  }

  public void setCarrierCodeLOV(BeezUPCommonLOVLink3 carrierCodeLOV) {
    this.carrierCodeLOV = carrierCodeLOV;
  }

  public MarketplaceChannelCatalogLovLinks cancelationReasonCodeLOV(BeezUPCommonLOVLink3 cancelationReasonCodeLOV) {
    this.cancelationReasonCodeLOV = cancelationReasonCodeLOV;
    return this;
  }

   /**
   * Get cancelationReasonCodeLOV
   * @return cancelationReasonCodeLOV
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLOVLink3 getCancelationReasonCodeLOV() {
    return cancelationReasonCodeLOV;
  }

  public void setCancelationReasonCodeLOV(BeezUPCommonLOVLink3 cancelationReasonCodeLOV) {
    this.cancelationReasonCodeLOV = cancelationReasonCodeLOV;
  }

  public MarketplaceChannelCatalogLovLinks refundReasonCodeLOV(BeezUPCommonLOVLink3 refundReasonCodeLOV) {
    this.refundReasonCodeLOV = refundReasonCodeLOV;
    return this;
  }

   /**
   * Get refundReasonCodeLOV
   * @return refundReasonCodeLOV
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLOVLink3 getRefundReasonCodeLOV() {
    return refundReasonCodeLOV;
  }

  public void setRefundReasonCodeLOV(BeezUPCommonLOVLink3 refundReasonCodeLOV) {
    this.refundReasonCodeLOV = refundReasonCodeLOV;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceChannelCatalogLovLinks marketplaceChannelCatalogLovLinks = (MarketplaceChannelCatalogLovLinks) o;
    return Objects.equals(this.shippingMethodLOV, marketplaceChannelCatalogLovLinks.shippingMethodLOV) &&
        Objects.equals(this.carrierCodeLOV, marketplaceChannelCatalogLovLinks.carrierCodeLOV) &&
        Objects.equals(this.cancelationReasonCodeLOV, marketplaceChannelCatalogLovLinks.cancelationReasonCodeLOV) &&
        Objects.equals(this.refundReasonCodeLOV, marketplaceChannelCatalogLovLinks.refundReasonCodeLOV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingMethodLOV, carrierCodeLOV, cancelationReasonCodeLOV, refundReasonCodeLOV);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceChannelCatalogLovLinks {\n");
    
    sb.append("    shippingMethodLOV: ").append(toIndentedString(shippingMethodLOV)).append("\n");
    sb.append("    carrierCodeLOV: ").append(toIndentedString(carrierCodeLOV)).append("\n");
    sb.append("    cancelationReasonCodeLOV: ").append(toIndentedString(cancelationReasonCodeLOV)).append("\n");
    sb.append("    refundReasonCodeLOV: ").append(toIndentedString(refundReasonCodeLOV)).append("\n");
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

