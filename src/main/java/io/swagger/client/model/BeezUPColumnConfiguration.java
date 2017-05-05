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
import io.swagger.client.model.DisplayGroupName;

/**
 * Describe a BeezUP column
 */
@ApiModel(description = "Describe a BeezUP column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T09:06:41.520Z")
public class BeezUPColumnConfiguration {
  @SerializedName("beezUPColumnName")
  private BeezUPCommonBeezUPColumnName beezUPColumnName = null;

  @SerializedName("unique")
  private Boolean unique = false;

  @SerializedName("columnImportance")
  private BeezUPCommonColumnImportance columnImportance = null;

  @SerializedName("columnDataType")
  private BeezUPCommonColumnDataType columnDataType = null;

  @SerializedName("canBeTruncated")
  private CanBeTruncated canBeTruncated = null;

  @SerializedName("displayGroupName")
  private DisplayGroupName displayGroupName = null;

  @SerializedName("description")
  private String description = null;

  public BeezUPColumnConfiguration beezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
    return this;
  }

   /**
   * Get beezUPColumnName
   * @return beezUPColumnName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonBeezUPColumnName getBeezUPColumnName() {
    return beezUPColumnName;
  }

  public void setBeezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
  }

  public BeezUPColumnConfiguration unique(Boolean unique) {
    this.unique = unique;
    return this;
  }

   /**
   * /!\\ ONLY AVAILABLE ON CATALOG COLUMN NOT ON CUSTOM COLUMNS!!  If true, an error happen at the second occurence of the same value for this column  This information will be used during the importation process and later for mapping proposal
   * @return unique
  **/
  @ApiModelProperty(example = "false", value = "/!\\ ONLY AVAILABLE ON CATALOG COLUMN NOT ON CUSTOM COLUMNS!!  If true, an error happen at the second occurence of the same value for this column  This information will be used during the importation process and later for mapping proposal")
  public Boolean getUnique() {
    return unique;
  }

  public void setUnique(Boolean unique) {
    this.unique = unique;
  }

  public BeezUPColumnConfiguration columnImportance(BeezUPCommonColumnImportance columnImportance) {
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

  public BeezUPColumnConfiguration columnDataType(BeezUPCommonColumnDataType columnDataType) {
    this.columnDataType = columnDataType;
    return this;
  }

   /**
   * Get columnDataType
   * @return columnDataType
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonColumnDataType getColumnDataType() {
    return columnDataType;
  }

  public void setColumnDataType(BeezUPCommonColumnDataType columnDataType) {
    this.columnDataType = columnDataType;
  }

  public BeezUPColumnConfiguration canBeTruncated(CanBeTruncated canBeTruncated) {
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

  public BeezUPColumnConfiguration displayGroupName(DisplayGroupName displayGroupName) {
    this.displayGroupName = displayGroupName;
    return this;
  }

   /**
   * Get displayGroupName
   * @return displayGroupName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DisplayGroupName getDisplayGroupName() {
    return displayGroupName;
  }

  public void setDisplayGroupName(DisplayGroupName displayGroupName) {
    this.displayGroupName = displayGroupName;
  }

  public BeezUPColumnConfiguration description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Describe the BeezUP column
   * @return description
  **/
  @ApiModelProperty(example = "Use for big text, like description", value = "Describe the BeezUP column")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPColumnConfiguration beezUPColumnConfiguration = (BeezUPColumnConfiguration) o;
    return Objects.equals(this.beezUPColumnName, beezUPColumnConfiguration.beezUPColumnName) &&
        Objects.equals(this.unique, beezUPColumnConfiguration.unique) &&
        Objects.equals(this.columnImportance, beezUPColumnConfiguration.columnImportance) &&
        Objects.equals(this.columnDataType, beezUPColumnConfiguration.columnDataType) &&
        Objects.equals(this.canBeTruncated, beezUPColumnConfiguration.canBeTruncated) &&
        Objects.equals(this.displayGroupName, beezUPColumnConfiguration.displayGroupName) &&
        Objects.equals(this.description, beezUPColumnConfiguration.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beezUPColumnName, unique, columnImportance, columnDataType, canBeTruncated, displayGroupName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPColumnConfiguration {\n");
    
    sb.append("    beezUPColumnName: ").append(toIndentedString(beezUPColumnName)).append("\n");
    sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
    sb.append("    columnImportance: ").append(toIndentedString(columnImportance)).append("\n");
    sb.append("    columnDataType: ").append(toIndentedString(columnDataType)).append("\n");
    sb.append("    canBeTruncated: ").append(toIndentedString(canBeTruncated)).append("\n");
    sb.append("    displayGroupName: ").append(toIndentedString(displayGroupName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

