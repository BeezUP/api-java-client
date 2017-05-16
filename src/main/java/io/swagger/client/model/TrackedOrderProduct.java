/*
 * BeezUP API
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
import io.swagger.client.model.BeezUPCommonProductBasicInfo;
import java.math.BigDecimal;

/**
 * TrackedOrderProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:23:29.795Z")
public class TrackedOrderProduct {
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

  @SerializedName("unitPrice")
  private BigDecimal unitPrice = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("margin")
  private BigDecimal margin = null;

  public TrackedOrderProduct productId(String productId) {
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

  public TrackedOrderProduct productSku(String productSku) {
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

  public TrackedOrderProduct productTitle(String productTitle) {
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

  public TrackedOrderProduct productImageUrl(String productImageUrl) {
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

  public TrackedOrderProduct productActive(Boolean productActive) {
    this.productActive = productActive;
    return this;
  }

   /**
   * Indicates if the product still exists in your catalog
   * @return productActive
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the product still exists in your catalog")
  public Boolean getProductActive() {
    return productActive;
  }

  public void setProductActive(Boolean productActive) {
    this.productActive = productActive;
  }

  public TrackedOrderProduct unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The product's unit price related to this order
   * @return unitPrice
  **/
  @ApiModelProperty(example = "101.42", required = true, value = "The product's unit price related to this order")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public TrackedOrderProduct quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Indicate the product's quantity ordered.
   * @return quantity
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "Indicate the product's quantity ordered.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public TrackedOrderProduct margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Indicate the product's margin related to this order.
   * @return margin
  **/
  @ApiModelProperty(example = "9.66", required = true, value = "Indicate the product's margin related to this order.")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedOrderProduct trackedOrderProduct = (TrackedOrderProduct) o;
    return Objects.equals(this.productId, trackedOrderProduct.productId) &&
        Objects.equals(this.productSku, trackedOrderProduct.productSku) &&
        Objects.equals(this.productTitle, trackedOrderProduct.productTitle) &&
        Objects.equals(this.productImageUrl, trackedOrderProduct.productImageUrl) &&
        Objects.equals(this.productActive, trackedOrderProduct.productActive) &&
        Objects.equals(this.unitPrice, trackedOrderProduct.unitPrice) &&
        Objects.equals(this.quantity, trackedOrderProduct.quantity) &&
        Objects.equals(this.margin, trackedOrderProduct.margin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productSku, productTitle, productImageUrl, productActive, unitPrice, quantity, margin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedOrderProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
    sb.append("    productActive: ").append(toIndentedString(productActive)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
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

