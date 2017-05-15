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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:10:42.368Z")
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

