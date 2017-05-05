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
import io.swagger.client.model.BeezUPCommonChannelCategoryPath;
import io.swagger.client.model.BeezUPCommonChannelColumnId;

/**
 * Represent a mapping between a channel column considering channel category mapping and a catalog column
 */
@ApiModel(description = "Represent a mapping between a channel column considering channel category mapping and a catalog column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:22:45.227Z")
public class ColumnMapping {
  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("channelCategoryPath")
  private BeezUPCommonChannelCategoryPath channelCategoryPath = null;

  @SerializedName("catalogColumnId")
  private BeezUPCommonCatalogColumnId catalogColumnId = null;

  public ColumnMapping channelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
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

  public ColumnMapping channelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
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

  public ColumnMapping catalogColumnId(BeezUPCommonCatalogColumnId catalogColumnId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnMapping columnMapping = (ColumnMapping) o;
    return Objects.equals(this.channelColumnId, columnMapping.channelColumnId) &&
        Objects.equals(this.channelCategoryPath, columnMapping.channelCategoryPath) &&
        Objects.equals(this.catalogColumnId, columnMapping.catalogColumnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelColumnId, channelCategoryPath, catalogColumnId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnMapping {\n");
    
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    channelCategoryPath: ").append(toIndentedString(channelCategoryPath)).append("\n");
    sb.append("    catalogColumnId: ").append(toIndentedString(catalogColumnId)).append("\n");
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

