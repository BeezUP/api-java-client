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
 * The basic information related to a product
 */
@ApiModel(description = "The basic information related to a product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:27:23.109Z")
public class BeezUPCommonProductBasicInfo {
  @SerializedName("productId")
  private String productId = null;

  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("productTitle")
  private String productTitle = null;

  @SerializedName("productImageUrl")
  private String productImageUrl = null;

  @SerializedName("productActive")
  private Boolean productActive = null;

  public BeezUPCommonProductBasicInfo productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The product identifier
   * @return productId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The product identifier")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public BeezUPCommonProductBasicInfo productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * The product SKU
   * @return productSku
  **/
  @ApiModelProperty(example = "SKU1234", required = true, value = "The product SKU")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public BeezUPCommonProductBasicInfo productTitle(String productTitle) {
    this.productTitle = productTitle;
    return this;
  }

   /**
   * The product tile
   * @return productTitle
  **/
  @ApiModelProperty(example = "My supert product", required = true, value = "The product tile")
  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }

  public BeezUPCommonProductBasicInfo productImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
    return this;
  }

   /**
   * The product image Url
   * @return productImageUrl
  **/
  @ApiModelProperty(example = "http://i2.cdscdn.com/pdt2/3/9/0/1/550x550/hai6901018043390/rw/haier-b20fwrss-refrigerateur-americain.jpg", required = true, value = "The product image Url")
  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  public BeezUPCommonProductBasicInfo productActive(Boolean productActive) {
    this.productActive = productActive;
    return this;
  }

   /**
   * Indicates if the product still exists in your catalog
   * @return productActive
  **/
  @ApiModelProperty(example = "true", value = "Indicates if the product still exists in your catalog")
  public Boolean getProductActive() {
    return productActive;
  }

  public void setProductActive(Boolean productActive) {
    this.productActive = productActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonProductBasicInfo beezUPCommonProductBasicInfo = (BeezUPCommonProductBasicInfo) o;
    return Objects.equals(this.productId, beezUPCommonProductBasicInfo.productId) &&
        Objects.equals(this.productSku, beezUPCommonProductBasicInfo.productSku) &&
        Objects.equals(this.productTitle, beezUPCommonProductBasicInfo.productTitle) &&
        Objects.equals(this.productImageUrl, beezUPCommonProductBasicInfo.productImageUrl) &&
        Objects.equals(this.productActive, beezUPCommonProductBasicInfo.productActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productSku, productTitle, productImageUrl, productActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonProductBasicInfo {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
    sb.append("    productActive: ").append(toIndentedString(productActive)).append("\n");
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

