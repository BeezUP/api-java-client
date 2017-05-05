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
import io.swagger.client.model.CatalogColumnName;
import io.swagger.client.model.ColumnConfiguration;
import io.swagger.client.model.ColumnId;
import io.swagger.client.model.DuplicateProductValueConfiguration;
import io.swagger.client.model.UserColumName;

/**
 * The catalog column configuration
 */
@ApiModel(description = "The catalog column configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class CatalogColumn {
  @SerializedName("ignored")
  private Boolean ignored = false;

  @SerializedName("duplicateProductValueConfiguration")
  private DuplicateProductValueConfiguration duplicateProductValueConfiguration = null;

  @SerializedName("id")
  private ColumnId id = null;

  @SerializedName("catalogColumnName")
  private CatalogColumnName catalogColumnName = null;

  @SerializedName("userColumName")
  private UserColumName userColumName = null;

  @SerializedName("configuration")
  private ColumnConfiguration _configuration = null;

  public CatalogColumn ignored(Boolean ignored) {
    this.ignored = ignored;
    return this;
  }

   /**
   * IF true, the product values of this column will be not taken in account during the importation process
   * @return ignored
  **/
  @ApiModelProperty(example = "null", value = "IF true, the product values of this column will be not taken in account during the importation process")
  public Boolean getIgnored() {
    return ignored;
  }

  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }

  public CatalogColumn duplicateProductValueConfiguration(DuplicateProductValueConfiguration duplicateProductValueConfiguration) {
    this.duplicateProductValueConfiguration = duplicateProductValueConfiguration;
    return this;
  }

   /**
   * Get duplicateProductValueConfiguration
   * @return duplicateProductValueConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public DuplicateProductValueConfiguration getDuplicateProductValueConfiguration() {
    return duplicateProductValueConfiguration;
  }

  public void setDuplicateProductValueConfiguration(DuplicateProductValueConfiguration duplicateProductValueConfiguration) {
    this.duplicateProductValueConfiguration = duplicateProductValueConfiguration;
  }

  public CatalogColumn id(ColumnId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ColumnId getId() {
    return id;
  }

  public void setId(ColumnId id) {
    this.id = id;
  }

  public CatalogColumn catalogColumnName(CatalogColumnName catalogColumnName) {
    this.catalogColumnName = catalogColumnName;
    return this;
  }

   /**
   * Get catalogColumnName
   * @return catalogColumnName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CatalogColumnName getCatalogColumnName() {
    return catalogColumnName;
  }

  public void setCatalogColumnName(CatalogColumnName catalogColumnName) {
    this.catalogColumnName = catalogColumnName;
  }

  public CatalogColumn userColumName(UserColumName userColumName) {
    this.userColumName = userColumName;
    return this;
  }

   /**
   * Get userColumName
   * @return userColumName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UserColumName getUserColumName() {
    return userColumName;
  }

  public void setUserColumName(UserColumName userColumName) {
    this.userColumName = userColumName;
  }

  public CatalogColumn _configuration(ColumnConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ColumnConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(ColumnConfiguration _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogColumn catalogColumn = (CatalogColumn) o;
    return Objects.equals(this.ignored, catalogColumn.ignored) &&
        Objects.equals(this.duplicateProductValueConfiguration, catalogColumn.duplicateProductValueConfiguration) &&
        Objects.equals(this.id, catalogColumn.id) &&
        Objects.equals(this.catalogColumnName, catalogColumn.catalogColumnName) &&
        Objects.equals(this.userColumName, catalogColumn.userColumName) &&
        Objects.equals(this._configuration, catalogColumn._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignored, duplicateProductValueConfiguration, id, catalogColumnName, userColumName, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogColumn {\n");
    
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    duplicateProductValueConfiguration: ").append(toIndentedString(duplicateProductValueConfiguration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogColumnName: ").append(toIndentedString(catalogColumnName)).append("\n");
    sb.append("    userColumName: ").append(toIndentedString(userColumName)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

