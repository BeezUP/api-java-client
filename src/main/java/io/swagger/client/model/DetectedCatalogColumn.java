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
import io.swagger.client.model.CatalogColumn;
import io.swagger.client.model.CatalogColumnName;
import io.swagger.client.model.ColumnConfiguration;
import io.swagger.client.model.ColumnId;
import io.swagger.client.model.DuplicateProductValueConfiguration;
import io.swagger.client.model.ExistingCatalogColumnConfiguration;
import io.swagger.client.model.UserColumName;

/**
 * DetectedCatalogColumn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:36:43.626Z")
public class DetectedCatalogColumn {
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

  @SerializedName("columnId")
  private ColumnId columnId = null;

  @SerializedName("detected")
  private Boolean detected = null;

  @SerializedName("existingConfiguration")
  private ExistingCatalogColumnConfiguration existingConfiguration = null;

  public DetectedCatalogColumn ignored(Boolean ignored) {
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

  public DetectedCatalogColumn duplicateProductValueConfiguration(DuplicateProductValueConfiguration duplicateProductValueConfiguration) {
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

  public DetectedCatalogColumn id(ColumnId id) {
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

  public DetectedCatalogColumn catalogColumnName(CatalogColumnName catalogColumnName) {
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

  public DetectedCatalogColumn userColumName(UserColumName userColumName) {
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

  public DetectedCatalogColumn _configuration(ColumnConfiguration _configuration) {
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

  public DetectedCatalogColumn columnId(ColumnId columnId) {
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ColumnId getColumnId() {
    return columnId;
  }

  public void setColumnId(ColumnId columnId) {
    this.columnId = columnId;
  }

  public DetectedCatalogColumn detected(Boolean detected) {
    this.detected = detected;
    return this;
  }

   /**
   * Indicates if the column is detected or is from the current catalog
   * @return detected
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the column is detected or is from the current catalog")
  public Boolean getDetected() {
    return detected;
  }

  public void setDetected(Boolean detected) {
    this.detected = detected;
  }

  public DetectedCatalogColumn existingConfiguration(ExistingCatalogColumnConfiguration existingConfiguration) {
    this.existingConfiguration = existingConfiguration;
    return this;
  }

   /**
   * Get existingConfiguration
   * @return existingConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExistingCatalogColumnConfiguration getExistingConfiguration() {
    return existingConfiguration;
  }

  public void setExistingConfiguration(ExistingCatalogColumnConfiguration existingConfiguration) {
    this.existingConfiguration = existingConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedCatalogColumn detectedCatalogColumn = (DetectedCatalogColumn) o;
    return Objects.equals(this.ignored, detectedCatalogColumn.ignored) &&
        Objects.equals(this.duplicateProductValueConfiguration, detectedCatalogColumn.duplicateProductValueConfiguration) &&
        Objects.equals(this.id, detectedCatalogColumn.id) &&
        Objects.equals(this.catalogColumnName, detectedCatalogColumn.catalogColumnName) &&
        Objects.equals(this.userColumName, detectedCatalogColumn.userColumName) &&
        Objects.equals(this._configuration, detectedCatalogColumn._configuration) &&
        Objects.equals(this.columnId, detectedCatalogColumn.columnId) &&
        Objects.equals(this.detected, detectedCatalogColumn.detected) &&
        Objects.equals(this.existingConfiguration, detectedCatalogColumn.existingConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignored, duplicateProductValueConfiguration, id, catalogColumnName, userColumName, _configuration, columnId, detected, existingConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedCatalogColumn {\n");
    
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    duplicateProductValueConfiguration: ").append(toIndentedString(duplicateProductValueConfiguration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    catalogColumnName: ").append(toIndentedString(catalogColumnName)).append("\n");
    sb.append("    userColumName: ").append(toIndentedString(userColumName)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    detected: ").append(toIndentedString(detected)).append("\n");
    sb.append("    existingConfiguration: ").append(toIndentedString(existingConfiguration)).append("\n");
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

