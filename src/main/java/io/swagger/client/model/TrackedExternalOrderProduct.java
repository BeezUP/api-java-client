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
 * TrackedExternalOrderProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class TrackedExternalOrderProduct {
  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("productTitle")
  private String productTitle = null;

  @SerializedName("productImageUrl")
  private String productImageUrl = null;

  @SerializedName("productActive")
  private Boolean productActive = null;

  @SerializedName("productId")
  private String productId = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("quantity")
  private String quantity = null;

  @SerializedName("margin")
  private String margin = null;

  public TrackedExternalOrderProduct productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * The product sku received related to the external order.
   * @return productSku
  **/
  @ApiModelProperty(example = "something", required = true, value = "The product sku received related to the external order.")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public TrackedExternalOrderProduct productTitle(String productTitle) {
    this.productTitle = productTitle;
    return this;
  }

   /**
   * We tried to get the catalog product title based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.
   * @return productTitle
  **/
  @ApiModelProperty(example = "Something great", value = "We tried to get the catalog product title based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.")
  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }

  public TrackedExternalOrderProduct productImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
    return this;
  }

   /**
   * We tried to get the catalog product image Url based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.
   * @return productImageUrl
  **/
  @ApiModelProperty(example = "http://cdn3.sarenza.net/static/_img/productsV4/0000010744/MD_0000010744_29411_09.jpg?201308142051", value = "We tried to get the catalog product image Url based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.")
  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  public TrackedExternalOrderProduct productActive(Boolean productActive) {
    this.productActive = productActive;
    return this;
  }

   /**
   * We tried to get the catalog product if it's still active based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.
   * @return productActive
  **/
  @ApiModelProperty(example = "true", value = "We tried to get the catalog product if it's still active based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.")
  public Boolean getProductActive() {
    return productActive;
  }

  public void setProductActive(Boolean productActive) {
    this.productActive = productActive;
  }

  public TrackedExternalOrderProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * We tried to get the catalog product identifier based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.
   * @return productId
  **/
  @ApiModelProperty(example = "6d469a54-8426-4855-abc2-9e062e2056b9", value = "We tried to get the catalog product identifier based on the product SKU. This property can be null, if we cannot found the product. This is possible if the product is not referenced in the imported catalog.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public TrackedExternalOrderProduct unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The product's unit price related to this external order. This property is voluntarily a string because the value could be an invalid one.
   * @return unitPrice
  **/
  @ApiModelProperty(example = "101.42", value = "The product's unit price related to this external order. This property is voluntarily a string because the value could be an invalid one.")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public TrackedExternalOrderProduct quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Indicate the product's quantity ordered. This property is voluntarily a string because the value could be an invalid one
   * @return quantity
  **/
  @ApiModelProperty(example = "1.00", value = "Indicate the product's quantity ordered. This property is voluntarily a string because the value could be an invalid one")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public TrackedExternalOrderProduct margin(String margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Indicate the product's margin related to this order. This property is voluntarily a string because the value could be an invalid one
   * @return margin
  **/
  @ApiModelProperty(example = "9.66", value = "Indicate the product's margin related to this order. This property is voluntarily a string because the value could be an invalid one")
  public String getMargin() {
    return margin;
  }

  public void setMargin(String margin) {
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
    TrackedExternalOrderProduct trackedExternalOrderProduct = (TrackedExternalOrderProduct) o;
    return Objects.equals(this.productSku, trackedExternalOrderProduct.productSku) &&
        Objects.equals(this.productTitle, trackedExternalOrderProduct.productTitle) &&
        Objects.equals(this.productImageUrl, trackedExternalOrderProduct.productImageUrl) &&
        Objects.equals(this.productActive, trackedExternalOrderProduct.productActive) &&
        Objects.equals(this.productId, trackedExternalOrderProduct.productId) &&
        Objects.equals(this.unitPrice, trackedExternalOrderProduct.unitPrice) &&
        Objects.equals(this.quantity, trackedExternalOrderProduct.quantity) &&
        Objects.equals(this.margin, trackedExternalOrderProduct.margin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSku, productTitle, productImageUrl, productActive, productId, unitPrice, quantity, margin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedExternalOrderProduct {\n");
    
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
    sb.append("    productActive: ").append(toIndentedString(productActive)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

