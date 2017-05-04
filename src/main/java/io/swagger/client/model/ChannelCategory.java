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
import io.swagger.client.model.BeezUPCommonChannelCategoryId;
import io.swagger.client.model.BeezUPCommonChannelCategoryPath;
import io.swagger.client.model.ChannelCategoryChannelCode;
import io.swagger.client.model.ChannelCategoryColumnOverrides;
import io.swagger.client.model.ChannelCategoryDefaultCost;
import io.swagger.client.model.ChannelCategoryLevel;

/**
 * The channel category
 */
@ApiModel(description = "The channel category")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:55:43.788Z")
public class ChannelCategory {
  @SerializedName("channelCategoryId")
  private BeezUPCommonChannelCategoryId channelCategoryId = null;

  @SerializedName("channelCategoryPath")
  private BeezUPCommonChannelCategoryPath channelCategoryPath = null;

  @SerializedName("channelCategoryLevel")
  private ChannelCategoryLevel channelCategoryLevel = null;

  @SerializedName("channelCategoryDefaultCost")
  private ChannelCategoryDefaultCost channelCategoryDefaultCost = null;

  @SerializedName("channelCategoryChannelCode")
  private ChannelCategoryChannelCode channelCategoryChannelCode = null;

  @SerializedName("channelCategoryColumnOverrides")
  private ChannelCategoryColumnOverrides channelCategoryColumnOverrides = null;

  public ChannelCategory channelCategoryId(BeezUPCommonChannelCategoryId channelCategoryId) {
    this.channelCategoryId = channelCategoryId;
    return this;
  }

   /**
   * Get channelCategoryId
   * @return channelCategoryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelCategoryId getChannelCategoryId() {
    return channelCategoryId;
  }

  public void setChannelCategoryId(BeezUPCommonChannelCategoryId channelCategoryId) {
    this.channelCategoryId = channelCategoryId;
  }

  public ChannelCategory channelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
    this.channelCategoryPath = channelCategoryPath;
    return this;
  }

   /**
   * Get channelCategoryPath
   * @return channelCategoryPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelCategoryPath getChannelCategoryPath() {
    return channelCategoryPath;
  }

  public void setChannelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
    this.channelCategoryPath = channelCategoryPath;
  }

  public ChannelCategory channelCategoryLevel(ChannelCategoryLevel channelCategoryLevel) {
    this.channelCategoryLevel = channelCategoryLevel;
    return this;
  }

   /**
   * Get channelCategoryLevel
   * @return channelCategoryLevel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCategoryLevel getChannelCategoryLevel() {
    return channelCategoryLevel;
  }

  public void setChannelCategoryLevel(ChannelCategoryLevel channelCategoryLevel) {
    this.channelCategoryLevel = channelCategoryLevel;
  }

  public ChannelCategory channelCategoryDefaultCost(ChannelCategoryDefaultCost channelCategoryDefaultCost) {
    this.channelCategoryDefaultCost = channelCategoryDefaultCost;
    return this;
  }

   /**
   * Get channelCategoryDefaultCost
   * @return channelCategoryDefaultCost
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCategoryDefaultCost getChannelCategoryDefaultCost() {
    return channelCategoryDefaultCost;
  }

  public void setChannelCategoryDefaultCost(ChannelCategoryDefaultCost channelCategoryDefaultCost) {
    this.channelCategoryDefaultCost = channelCategoryDefaultCost;
  }

  public ChannelCategory channelCategoryChannelCode(ChannelCategoryChannelCode channelCategoryChannelCode) {
    this.channelCategoryChannelCode = channelCategoryChannelCode;
    return this;
  }

   /**
   * Get channelCategoryChannelCode
   * @return channelCategoryChannelCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCategoryChannelCode getChannelCategoryChannelCode() {
    return channelCategoryChannelCode;
  }

  public void setChannelCategoryChannelCode(ChannelCategoryChannelCode channelCategoryChannelCode) {
    this.channelCategoryChannelCode = channelCategoryChannelCode;
  }

  public ChannelCategory channelCategoryColumnOverrides(ChannelCategoryColumnOverrides channelCategoryColumnOverrides) {
    this.channelCategoryColumnOverrides = channelCategoryColumnOverrides;
    return this;
  }

   /**
   * Get channelCategoryColumnOverrides
   * @return channelCategoryColumnOverrides
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCategoryColumnOverrides getChannelCategoryColumnOverrides() {
    return channelCategoryColumnOverrides;
  }

  public void setChannelCategoryColumnOverrides(ChannelCategoryColumnOverrides channelCategoryColumnOverrides) {
    this.channelCategoryColumnOverrides = channelCategoryColumnOverrides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCategory channelCategory = (ChannelCategory) o;
    return Objects.equals(this.channelCategoryId, channelCategory.channelCategoryId) &&
        Objects.equals(this.channelCategoryPath, channelCategory.channelCategoryPath) &&
        Objects.equals(this.channelCategoryLevel, channelCategory.channelCategoryLevel) &&
        Objects.equals(this.channelCategoryDefaultCost, channelCategory.channelCategoryDefaultCost) &&
        Objects.equals(this.channelCategoryChannelCode, channelCategory.channelCategoryChannelCode) &&
        Objects.equals(this.channelCategoryColumnOverrides, channelCategory.channelCategoryColumnOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelCategoryId, channelCategoryPath, channelCategoryLevel, channelCategoryDefaultCost, channelCategoryChannelCode, channelCategoryColumnOverrides);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCategory {\n");
    
    sb.append("    channelCategoryId: ").append(toIndentedString(channelCategoryId)).append("\n");
    sb.append("    channelCategoryPath: ").append(toIndentedString(channelCategoryPath)).append("\n");
    sb.append("    channelCategoryLevel: ").append(toIndentedString(channelCategoryLevel)).append("\n");
    sb.append("    channelCategoryDefaultCost: ").append(toIndentedString(channelCategoryDefaultCost)).append("\n");
    sb.append("    channelCategoryChannelCode: ").append(toIndentedString(channelCategoryChannelCode)).append("\n");
    sb.append("    channelCategoryColumnOverrides: ").append(toIndentedString(channelCategoryColumnOverrides)).append("\n");
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

