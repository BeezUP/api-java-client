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
 * Represents the general settings of your channel catalog
 */
@ApiModel(description = "Represents the general settings of your channel catalog")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:10:42.368Z")
public class GeneralSettings {
  @SerializedName("acceptToPublishInfo")
  private Boolean acceptToPublishInfo = null;

  @SerializedName("useBid")
  private Boolean useBid = null;

  @SerializedName("noCategoryMapping")
  private Boolean noCategoryMapping = null;

  @SerializedName("doNotExportOutOfStockProducts")
  private Boolean doNotExportOutOfStockProducts = null;

  @SerializedName("activeBeezUPTracking")
  private Boolean activeBeezUPTracking = true;

  public GeneralSettings acceptToPublishInfo(Boolean acceptToPublishInfo) {
    this.acceptToPublishInfo = acceptToPublishInfo;
    return this;
  }

   /**
   * If true then you authorize disclosure of my statistics generated from clicks and sales
   * @return acceptToPublishInfo
  **/
  @ApiModelProperty(example = "true", required = true, value = "If true then you authorize disclosure of my statistics generated from clicks and sales")
  public Boolean getAcceptToPublishInfo() {
    return acceptToPublishInfo;
  }

  public void setAcceptToPublishInfo(Boolean acceptToPublishInfo) {
    this.acceptToPublishInfo = acceptToPublishInfo;
  }

  public GeneralSettings useBid(Boolean useBid) {
    this.useBid = useBid;
    return this;
  }

   /**
   * Activate bidding for this channel
   * @return useBid
  **/
  @ApiModelProperty(example = "false", required = true, value = "Activate bidding for this channel")
  public Boolean getUseBid() {
    return useBid;
  }

  public void setUseBid(Boolean useBid) {
    this.useBid = useBid;
  }

  public GeneralSettings noCategoryMapping(Boolean noCategoryMapping) {
    this.noCategoryMapping = noCategoryMapping;
    return this;
  }

   /**
   * Indicates that the channel authorize you to do not map your categories with their categories
   * @return noCategoryMapping
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicates that the channel authorize you to do not map your categories with their categories")
  public Boolean getNoCategoryMapping() {
    return noCategoryMapping;
  }

  public void setNoCategoryMapping(Boolean noCategoryMapping) {
    this.noCategoryMapping = noCategoryMapping;
  }

  public GeneralSettings doNotExportOutOfStockProducts(Boolean doNotExportOutOfStockProducts) {
    this.doNotExportOutOfStockProducts = doNotExportOutOfStockProducts;
    return this;
  }

   /**
   * Do not export \"out of stock\" products. Note: this option is not taken into account by the counter. 
   * @return doNotExportOutOfStockProducts
  **/
  @ApiModelProperty(example = "true", required = true, value = "Do not export \"out of stock\" products. Note: this option is not taken into account by the counter. ")
  public Boolean getDoNotExportOutOfStockProducts() {
    return doNotExportOutOfStockProducts;
  }

  public void setDoNotExportOutOfStockProducts(Boolean doNotExportOutOfStockProducts) {
    this.doNotExportOutOfStockProducts = doNotExportOutOfStockProducts;
  }

  public GeneralSettings activeBeezUPTracking(Boolean activeBeezUPTracking) {
    this.activeBeezUPTracking = activeBeezUPTracking;
    return this;
  }

   /**
   * Activate BeezUP tracking for my statistics (checked by default)
   * @return activeBeezUPTracking
  **/
  @ApiModelProperty(example = "true", required = true, value = "Activate BeezUP tracking for my statistics (checked by default)")
  public Boolean getActiveBeezUPTracking() {
    return activeBeezUPTracking;
  }

  public void setActiveBeezUPTracking(Boolean activeBeezUPTracking) {
    this.activeBeezUPTracking = activeBeezUPTracking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralSettings generalSettings = (GeneralSettings) o;
    return Objects.equals(this.acceptToPublishInfo, generalSettings.acceptToPublishInfo) &&
        Objects.equals(this.useBid, generalSettings.useBid) &&
        Objects.equals(this.noCategoryMapping, generalSettings.noCategoryMapping) &&
        Objects.equals(this.doNotExportOutOfStockProducts, generalSettings.doNotExportOutOfStockProducts) &&
        Objects.equals(this.activeBeezUPTracking, generalSettings.activeBeezUPTracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptToPublishInfo, useBid, noCategoryMapping, doNotExportOutOfStockProducts, activeBeezUPTracking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralSettings {\n");
    
    sb.append("    acceptToPublishInfo: ").append(toIndentedString(acceptToPublishInfo)).append("\n");
    sb.append("    useBid: ").append(toIndentedString(useBid)).append("\n");
    sb.append("    noCategoryMapping: ").append(toIndentedString(noCategoryMapping)).append("\n");
    sb.append("    doNotExportOutOfStockProducts: ").append(toIndentedString(doNotExportOutOfStockProducts)).append("\n");
    sb.append("    activeBeezUPTracking: ").append(toIndentedString(activeBeezUPTracking)).append("\n");
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

