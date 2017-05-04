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
import io.swagger.client.model.BeezUPCommonCatalogColumnId;
import io.swagger.client.model.BeezUPCommonCatalogColumnUserName;
import io.swagger.client.model.BeezUPCommonChannelCategoryPath;
import io.swagger.client.model.BeezUPCommonChannelColumnId;
import io.swagger.client.model.BeezUPCommonChannelColumnName;
import io.swagger.client.model.ColumnMapping;

/**
 * ColumnMappingWithName
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T19:25:59.922Z")
public class ColumnMappingWithName {
  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("channelCategoryPath")
  private BeezUPCommonChannelCategoryPath channelCategoryPath = null;

  @SerializedName("catalogColumnId")
  private BeezUPCommonCatalogColumnId catalogColumnId = null;

  @SerializedName("channelColumnName")
  private BeezUPCommonChannelColumnName channelColumnName = null;

  @SerializedName("catalogColumnName")
  private BeezUPCommonCatalogColumnUserName catalogColumnName = null;

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
        Objects.equals(this.catalogColumnName, columnMappingWithName.catalogColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelColumnId, channelCategoryPath, catalogColumnId, channelColumnName, catalogColumnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnMappingWithName {\n");
    
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    channelCategoryPath: ").append(toIndentedString(channelCategoryPath)).append("\n");
    sb.append("    catalogColumnId: ").append(toIndentedString(catalogColumnId)).append("\n");
    sb.append("    channelColumnName: ").append(toIndentedString(channelColumnName)).append("\n");
    sb.append("    catalogColumnName: ").append(toIndentedString(catalogColumnName)).append("\n");
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

