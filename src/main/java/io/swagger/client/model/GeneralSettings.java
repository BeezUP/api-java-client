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
 * Represents the general settings of your channel catalog
 */
@ApiModel(description = "Represents the general settings of your channel catalog")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:18:37.107Z")
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

