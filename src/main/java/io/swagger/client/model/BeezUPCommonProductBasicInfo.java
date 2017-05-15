/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T11:46:19.000Z")
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
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the product still exists in your catalog")
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

