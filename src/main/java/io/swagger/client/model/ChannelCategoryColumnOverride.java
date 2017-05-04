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
import io.swagger.client.model.BeezUPCommonChannelColumnId;
import io.swagger.client.model.BeezUPCommonChannelColumnName;
import io.swagger.client.model.ChannelColumnConfiguration;
import io.swagger.client.model.ChannelColumnDescription;
import io.swagger.client.model.ChannelColumnRestrictedValues;
import io.swagger.client.model.ChannelColumnShowInMapping;

/**
 * ChannelCategoryColumnOverride
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:55:43.788Z")
public class ChannelCategoryColumnOverride {
  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("channelColumnName")
  private BeezUPCommonChannelColumnName channelColumnName = null;

  @SerializedName("channelColumnDescription")
  private ChannelColumnDescription channelColumnDescription = null;

  @SerializedName("showInMapping")
  private ChannelColumnShowInMapping showInMapping = null;

  @SerializedName("configuration")
  private ChannelColumnConfiguration _configuration = null;

  @SerializedName("restrictedValues")
  private ChannelColumnRestrictedValues restrictedValues = null;

  public ChannelCategoryColumnOverride channelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
    return this;
  }

   /**
   * Get channelColumnId
   * @return channelColumnId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelColumnId getChannelColumnId() {
    return channelColumnId;
  }

  public void setChannelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
  }

  public ChannelCategoryColumnOverride channelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
    this.channelColumnName = channelColumnName;
    return this;
  }

   /**
   * Get channelColumnName
   * @return channelColumnName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelColumnName getChannelColumnName() {
    return channelColumnName;
  }

  public void setChannelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
    this.channelColumnName = channelColumnName;
  }

  public ChannelCategoryColumnOverride channelColumnDescription(ChannelColumnDescription channelColumnDescription) {
    this.channelColumnDescription = channelColumnDescription;
    return this;
  }

   /**
   * Get channelColumnDescription
   * @return channelColumnDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelColumnDescription getChannelColumnDescription() {
    return channelColumnDescription;
  }

  public void setChannelColumnDescription(ChannelColumnDescription channelColumnDescription) {
    this.channelColumnDescription = channelColumnDescription;
  }

  public ChannelCategoryColumnOverride showInMapping(ChannelColumnShowInMapping showInMapping) {
    this.showInMapping = showInMapping;
    return this;
  }

   /**
   * Get showInMapping
   * @return showInMapping
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelColumnShowInMapping getShowInMapping() {
    return showInMapping;
  }

  public void setShowInMapping(ChannelColumnShowInMapping showInMapping) {
    this.showInMapping = showInMapping;
  }

  public ChannelCategoryColumnOverride _configuration(ChannelColumnConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelColumnConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(ChannelColumnConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public ChannelCategoryColumnOverride restrictedValues(ChannelColumnRestrictedValues restrictedValues) {
    this.restrictedValues = restrictedValues;
    return this;
  }

   /**
   * Get restrictedValues
   * @return restrictedValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelColumnRestrictedValues getRestrictedValues() {
    return restrictedValues;
  }

  public void setRestrictedValues(ChannelColumnRestrictedValues restrictedValues) {
    this.restrictedValues = restrictedValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCategoryColumnOverride channelCategoryColumnOverride = (ChannelCategoryColumnOverride) o;
    return Objects.equals(this.channelColumnId, channelCategoryColumnOverride.channelColumnId) &&
        Objects.equals(this.channelColumnName, channelCategoryColumnOverride.channelColumnName) &&
        Objects.equals(this.channelColumnDescription, channelCategoryColumnOverride.channelColumnDescription) &&
        Objects.equals(this.showInMapping, channelCategoryColumnOverride.showInMapping) &&
        Objects.equals(this._configuration, channelCategoryColumnOverride._configuration) &&
        Objects.equals(this.restrictedValues, channelCategoryColumnOverride.restrictedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelColumnId, channelColumnName, channelColumnDescription, showInMapping, _configuration, restrictedValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCategoryColumnOverride {\n");
    
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    channelColumnName: ").append(toIndentedString(channelColumnName)).append("\n");
    sb.append("    channelColumnDescription: ").append(toIndentedString(channelColumnDescription)).append("\n");
    sb.append("    showInMapping: ").append(toIndentedString(showInMapping)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    restrictedValues: ").append(toIndentedString(restrictedValues)).append("\n");
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

