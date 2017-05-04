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
import io.swagger.client.model.BeezUPCommonChannelCatalogId;
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonChannelName;
import io.swagger.client.model.BeezUPCommonStoreId;
import io.swagger.client.model.ChannelCatalogHeaderLinks;

/**
 * ChannelCatalogHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:07:10.326Z")
public class ChannelCatalogHeader {
  @SerializedName("channelCatalogId")
  private BeezUPCommonChannelCatalogId channelCatalogId = null;

  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("channelName")
  private BeezUPCommonChannelName channelName = null;

  @SerializedName("isMarketplace")
  private Boolean isMarketplace = null;

  @SerializedName("storeId")
  private BeezUPCommonStoreId storeId = null;

  @SerializedName("links")
  private ChannelCatalogHeaderLinks links = null;

  public ChannelCatalogHeader channelCatalogId(BeezUPCommonChannelCatalogId channelCatalogId) {
    this.channelCatalogId = channelCatalogId;
    return this;
  }

   /**
   * Get channelCatalogId
   * @return channelCatalogId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelCatalogId getChannelCatalogId() {
    return channelCatalogId;
  }

  public void setChannelCatalogId(BeezUPCommonChannelCatalogId channelCatalogId) {
    this.channelCatalogId = channelCatalogId;
  }

  public ChannelCatalogHeader channelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelId getChannelId() {
    return channelId;
  }

  public void setChannelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
  }

  public ChannelCatalogHeader channelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelName getChannelName() {
    return channelName;
  }

  public void setChannelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
  }

  public ChannelCatalogHeader isMarketplace(Boolean isMarketplace) {
    this.isMarketplace = isMarketplace;
    return this;
  }

   /**
   * Indicates if this channel catalog is related to a marketplace
   * @return isMarketplace
  **/
  @ApiModelProperty(example = "true", value = "Indicates if this channel catalog is related to a marketplace")
  public Boolean getIsMarketplace() {
    return isMarketplace;
  }

  public void setIsMarketplace(Boolean isMarketplace) {
    this.isMarketplace = isMarketplace;
  }

  public ChannelCatalogHeader storeId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonStoreId getStoreId() {
    return storeId;
  }

  public void setStoreId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
  }

  public ChannelCatalogHeader links(ChannelCatalogHeaderLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCatalogHeaderLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelCatalogHeaderLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogHeader channelCatalogHeader = (ChannelCatalogHeader) o;
    return Objects.equals(this.channelCatalogId, channelCatalogHeader.channelCatalogId) &&
        Objects.equals(this.channelId, channelCatalogHeader.channelId) &&
        Objects.equals(this.channelName, channelCatalogHeader.channelName) &&
        Objects.equals(this.isMarketplace, channelCatalogHeader.isMarketplace) &&
        Objects.equals(this.storeId, channelCatalogHeader.storeId) &&
        Objects.equals(this.links, channelCatalogHeader.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelCatalogId, channelId, channelName, isMarketplace, storeId, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogHeader {\n");
    
    sb.append("    channelCatalogId: ").append(toIndentedString(channelCatalogId)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    isMarketplace: ").append(toIndentedString(isMarketplace)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

