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
import io.swagger.client.model.BeezUPCommonBeezUPColumnName;
import io.swagger.client.model.BeezUPCommonColumnDataType;
import io.swagger.client.model.BeezUPCommonColumnImportance;
import io.swagger.client.model.CanBeTruncated;
import io.swagger.client.model.ColumnCultureName;
import io.swagger.client.model.ColumnFormat;
import io.swagger.client.model.DisplayGroupName;

/**
 * Indicates the configuration applied on the column (catalog or custom) during the importation process.
 */
@ApiModel(description = "Indicates the configuration applied on the column (catalog or custom) during the importation process.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:15:40.708Z")
public class ColumnConfiguration {
  @SerializedName("beezUPColumnName")
  private BeezUPCommonBeezUPColumnName beezUPColumnName = null;

  @SerializedName("columnImportance")
  private BeezUPCommonColumnImportance columnImportance = null;

  @SerializedName("columnDataType")
  private BeezUPCommonColumnDataType columnDataType = null;

  @SerializedName("columnCultureName")
  private ColumnCultureName columnCultureName = null;

  @SerializedName("columnFormat")
  private ColumnFormat columnFormat = null;

  @SerializedName("canBeTruncated")
  private CanBeTruncated canBeTruncated = null;

  @SerializedName("displayGroupName")
  private DisplayGroupName displayGroupName = null;

  public ColumnConfiguration beezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
    return this;
  }

   /**
   * Get beezUPColumnName
   * @return beezUPColumnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonBeezUPColumnName getBeezUPColumnName() {
    return beezUPColumnName;
  }

  public void setBeezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
  }

  public ColumnConfiguration columnImportance(BeezUPCommonColumnImportance columnImportance) {
    this.columnImportance = columnImportance;
    return this;
  }

   /**
   * Get columnImportance
   * @return columnImportance
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonColumnImportance getColumnImportance() {
    return columnImportance;
  }

  public void setColumnImportance(BeezUPCommonColumnImportance columnImportance) {
    this.columnImportance = columnImportance;
  }

  public ColumnConfiguration columnDataType(BeezUPCommonColumnDataType columnDataType) {
    this.columnDataType = columnDataType;
    return this;
  }

   /**
   * Get columnDataType
   * @return columnDataType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonColumnDataType getColumnDataType() {
    return columnDataType;
  }

  public void setColumnDataType(BeezUPCommonColumnDataType columnDataType) {
    this.columnDataType = columnDataType;
  }

  public ColumnConfiguration columnCultureName(ColumnCultureName columnCultureName) {
    this.columnCultureName = columnCultureName;
    return this;
  }

   /**
   * Get columnCultureName
   * @return columnCultureName
  **/
  @ApiModelProperty(example = "null", value = "")
  public ColumnCultureName getColumnCultureName() {
    return columnCultureName;
  }

  public void setColumnCultureName(ColumnCultureName columnCultureName) {
    this.columnCultureName = columnCultureName;
  }

  public ColumnConfiguration columnFormat(ColumnFormat columnFormat) {
    this.columnFormat = columnFormat;
    return this;
  }

   /**
   * Get columnFormat
   * @return columnFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public ColumnFormat getColumnFormat() {
    return columnFormat;
  }

  public void setColumnFormat(ColumnFormat columnFormat) {
    this.columnFormat = columnFormat;
  }

  public ColumnConfiguration canBeTruncated(CanBeTruncated canBeTruncated) {
    this.canBeTruncated = canBeTruncated;
    return this;
  }

   /**
   * Get canBeTruncated
   * @return canBeTruncated
  **/
  @ApiModelProperty(example = "null", value = "")
  public CanBeTruncated getCanBeTruncated() {
    return canBeTruncated;
  }

  public void setCanBeTruncated(CanBeTruncated canBeTruncated) {
    this.canBeTruncated = canBeTruncated;
  }

  public ColumnConfiguration displayGroupName(DisplayGroupName displayGroupName) {
    this.displayGroupName = displayGroupName;
    return this;
  }

   /**
   * Get displayGroupName
   * @return displayGroupName
  **/
  @ApiModelProperty(example = "null", value = "")
  public DisplayGroupName getDisplayGroupName() {
    return displayGroupName;
  }

  public void setDisplayGroupName(DisplayGroupName displayGroupName) {
    this.displayGroupName = displayGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnConfiguration columnConfiguration = (ColumnConfiguration) o;
    return Objects.equals(this.beezUPColumnName, columnConfiguration.beezUPColumnName) &&
        Objects.equals(this.columnImportance, columnConfiguration.columnImportance) &&
        Objects.equals(this.columnDataType, columnConfiguration.columnDataType) &&
        Objects.equals(this.columnCultureName, columnConfiguration.columnCultureName) &&
        Objects.equals(this.columnFormat, columnConfiguration.columnFormat) &&
        Objects.equals(this.canBeTruncated, columnConfiguration.canBeTruncated) &&
        Objects.equals(this.displayGroupName, columnConfiguration.displayGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beezUPColumnName, columnImportance, columnDataType, columnCultureName, columnFormat, canBeTruncated, displayGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnConfiguration {\n");
    
    sb.append("    beezUPColumnName: ").append(toIndentedString(beezUPColumnName)).append("\n");
    sb.append("    columnImportance: ").append(toIndentedString(columnImportance)).append("\n");
    sb.append("    columnDataType: ").append(toIndentedString(columnDataType)).append("\n");
    sb.append("    columnCultureName: ").append(toIndentedString(columnCultureName)).append("\n");
    sb.append("    columnFormat: ").append(toIndentedString(columnFormat)).append("\n");
    sb.append("    canBeTruncated: ").append(toIndentedString(canBeTruncated)).append("\n");
    sb.append("    displayGroupName: ").append(toIndentedString(displayGroupName)).append("\n");
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

