/*
 * Public - Security
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
 * The channel column
 */
@ApiModel(description = "The channel column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:30:06.948Z")
public class ChannelColumn {
  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("channelColumnName")
  private BeezUPCommonChannelColumnName channelColumnName = null;

  @SerializedName("channelColumnDescription")
  private ChannelColumnDescription channelColumnDescription = null;

  @SerializedName("showInMapping")
  private ChannelColumnShowInMapping showInMapping = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("configuration")
  private ChannelColumnConfiguration _configuration = null;

  @SerializedName("restrictedValues")
  private ChannelColumnRestrictedValues restrictedValues = null;

  public ChannelColumn channelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
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

  public ChannelColumn channelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
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

  public ChannelColumn channelColumnDescription(ChannelColumnDescription channelColumnDescription) {
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

  public ChannelColumn showInMapping(ChannelColumnShowInMapping showInMapping) {
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

  public ChannelColumn position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The position of the column starting from 1
   * @return position
  **/
  @ApiModelProperty(example = "1", required = true, value = "The position of the column starting from 1")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ChannelColumn _configuration(ChannelColumnConfiguration _configuration) {
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

  public ChannelColumn restrictedValues(ChannelColumnRestrictedValues restrictedValues) {
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
    ChannelColumn channelColumn = (ChannelColumn) o;
    return Objects.equals(this.channelColumnId, channelColumn.channelColumnId) &&
        Objects.equals(this.channelColumnName, channelColumn.channelColumnName) &&
        Objects.equals(this.channelColumnDescription, channelColumn.channelColumnDescription) &&
        Objects.equals(this.showInMapping, channelColumn.showInMapping) &&
        Objects.equals(this.position, channelColumn.position) &&
        Objects.equals(this._configuration, channelColumn._configuration) &&
        Objects.equals(this.restrictedValues, channelColumn.restrictedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelColumnId, channelColumnName, channelColumnDescription, showInMapping, position, _configuration, restrictedValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelColumn {\n");
    
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    channelColumnName: ").append(toIndentedString(channelColumnName)).append("\n");
    sb.append("    channelColumnDescription: ").append(toIndentedString(channelColumnDescription)).append("\n");
    sb.append("    showInMapping: ").append(toIndentedString(showInMapping)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

