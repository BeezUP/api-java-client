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

/**
 * The channel column configuration. The BeezUP Column Name is optional. If the BeezUP column is mapped we will indicate the data type and column importance of the BeezUP column.
 */
@ApiModel(description = "The channel column configuration. The BeezUP Column Name is optional. If the BeezUP column is mapped we will indicate the data type and column importance of the BeezUP column.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:14:33.629Z")
public class ChannelColumnConfiguration {
  @SerializedName("columnImportance")
  private BeezUPCommonColumnImportance columnImportance = null;

  @SerializedName("columnDataType")
  private BeezUPCommonColumnDataType columnDataType = null;

  @SerializedName("beezUPColumnName")
  private BeezUPCommonBeezUPColumnName beezUPColumnName = null;

  public ChannelColumnConfiguration columnImportance(BeezUPCommonColumnImportance columnImportance) {
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

  public ChannelColumnConfiguration columnDataType(BeezUPCommonColumnDataType columnDataType) {
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

  public ChannelColumnConfiguration beezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelColumnConfiguration channelColumnConfiguration = (ChannelColumnConfiguration) o;
    return Objects.equals(this.columnImportance, channelColumnConfiguration.columnImportance) &&
        Objects.equals(this.columnDataType, channelColumnConfiguration.columnDataType) &&
        Objects.equals(this.beezUPColumnName, channelColumnConfiguration.beezUPColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnImportance, columnDataType, beezUPColumnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelColumnConfiguration {\n");
    
    sb.append("    columnImportance: ").append(toIndentedString(columnImportance)).append("\n");
    sb.append("    columnDataType: ").append(toIndentedString(columnDataType)).append("\n");
    sb.append("    beezUPColumnName: ").append(toIndentedString(beezUPColumnName)).append("\n");
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

