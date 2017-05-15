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
import io.swagger.client.model.BeezUPCommonBeezUPColumnName;
import io.swagger.client.model.BeezUPCommonCatalogColumnId;
import io.swagger.client.model.BeezUPCommonCatalogColumnUserName;
import io.swagger.client.model.BeezUPCommonChannelCategoryPath;
import io.swagger.client.model.BeezUPCommonChannelColumnId;
import io.swagger.client.model.BeezUPCommonChannelColumnName;
import io.swagger.client.model.ColumnMapping;

/**
 * ColumnMappingWithName
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:10:42.368Z")
public class ColumnMappingWithName {
  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("channelCategoryPath")
  private BeezUPCommonChannelCategoryPath channelCategoryPath = null;

  @SerializedName("catalogColumnId")
  private BeezUPCommonCatalogColumnId catalogColumnId = null;

  @SerializedName("channelColumnName")
  private BeezUPCommonChannelColumnName channelColumnName = null;

  @SerializedName("channelBeezUPColumnName")
  private BeezUPCommonBeezUPColumnName channelBeezUPColumnName = null;

  @SerializedName("catalogColumnName")
  private BeezUPCommonCatalogColumnUserName catalogColumnName = null;

  @SerializedName("catalogBeezUPColumnName")
  private BeezUPCommonBeezUPColumnName catalogBeezUPColumnName = null;

  public ColumnMappingWithName channelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
    return this;
  }

   /**
   * Get channelColumnId
   * @return channelColumnId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelColumnId getChannelColumnId() {
    return channelColumnId;
  }

  public void setChannelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
  }

  public ColumnMappingWithName channelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
    this.channelCategoryPath = channelCategoryPath;
    return this;
  }

   /**
   * Get channelCategoryPath
   * @return channelCategoryPath
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelCategoryPath getChannelCategoryPath() {
    return channelCategoryPath;
  }

  public void setChannelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
    this.channelCategoryPath = channelCategoryPath;
  }

  public ColumnMappingWithName catalogColumnId(BeezUPCommonCatalogColumnId catalogColumnId) {
    this.catalogColumnId = catalogColumnId;
    return this;
  }

   /**
   * Get catalogColumnId
   * @return catalogColumnId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCatalogColumnId getCatalogColumnId() {
    return catalogColumnId;
  }

  public void setCatalogColumnId(BeezUPCommonCatalogColumnId catalogColumnId) {
    this.catalogColumnId = catalogColumnId;
  }

  public ColumnMappingWithName channelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
    this.channelColumnName = channelColumnName;
    return this;
  }

   /**
   * Get channelColumnName
   * @return channelColumnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelColumnName getChannelColumnName() {
    return channelColumnName;
  }

  public void setChannelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
    this.channelColumnName = channelColumnName;
  }

  public ColumnMappingWithName channelBeezUPColumnName(BeezUPCommonBeezUPColumnName channelBeezUPColumnName) {
    this.channelBeezUPColumnName = channelBeezUPColumnName;
    return this;
  }

   /**
   * Get channelBeezUPColumnName
   * @return channelBeezUPColumnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonBeezUPColumnName getChannelBeezUPColumnName() {
    return channelBeezUPColumnName;
  }

  public void setChannelBeezUPColumnName(BeezUPCommonBeezUPColumnName channelBeezUPColumnName) {
    this.channelBeezUPColumnName = channelBeezUPColumnName;
  }

  public ColumnMappingWithName catalogColumnName(BeezUPCommonCatalogColumnUserName catalogColumnName) {
    this.catalogColumnName = catalogColumnName;
    return this;
  }

   /**
   * Get catalogColumnName
   * @return catalogColumnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCatalogColumnUserName getCatalogColumnName() {
    return catalogColumnName;
  }

  public void setCatalogColumnName(BeezUPCommonCatalogColumnUserName catalogColumnName) {
    this.catalogColumnName = catalogColumnName;
  }

  public ColumnMappingWithName catalogBeezUPColumnName(BeezUPCommonBeezUPColumnName catalogBeezUPColumnName) {
    this.catalogBeezUPColumnName = catalogBeezUPColumnName;
    return this;
  }

   /**
   * Get catalogBeezUPColumnName
   * @return catalogBeezUPColumnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonBeezUPColumnName getCatalogBeezUPColumnName() {
    return catalogBeezUPColumnName;
  }

  public void setCatalogBeezUPColumnName(BeezUPCommonBeezUPColumnName catalogBeezUPColumnName) {
    this.catalogBeezUPColumnName = catalogBeezUPColumnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnMappingWithName columnMappingWithName = (ColumnMappingWithName) o;
    return Objects.equals(this.channelColumnId, columnMappingWithName.channelColumnId) &&
        Objects.equals(this.channelCategoryPath, columnMappingWithName.channelCategoryPath) &&
        Objects.equals(this.catalogColumnId, columnMappingWithName.catalogColumnId) &&
        Objects.equals(this.channelColumnName, columnMappingWithName.channelColumnName) &&
        Objects.equals(this.channelBeezUPColumnName, columnMappingWithName.channelBeezUPColumnName) &&
        Objects.equals(this.catalogColumnName, columnMappingWithName.catalogColumnName) &&
        Objects.equals(this.catalogBeezUPColumnName, columnMappingWithName.catalogBeezUPColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelColumnId, channelCategoryPath, catalogColumnId, channelColumnName, channelBeezUPColumnName, catalogColumnName, catalogBeezUPColumnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnMappingWithName {\n");
    
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    channelCategoryPath: ").append(toIndentedString(channelCategoryPath)).append("\n");
    sb.append("    catalogColumnId: ").append(toIndentedString(catalogColumnId)).append("\n");
    sb.append("    channelColumnName: ").append(toIndentedString(channelColumnName)).append("\n");
    sb.append("    channelBeezUPColumnName: ").append(toIndentedString(channelBeezUPColumnName)).append("\n");
    sb.append("    catalogColumnName: ").append(toIndentedString(catalogColumnName)).append("\n");
    sb.append("    catalogBeezUPColumnName: ").append(toIndentedString(catalogBeezUPColumnName)).append("\n");
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

