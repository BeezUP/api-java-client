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
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonChannelName;
import io.swagger.client.model.BeezUPCommonHttpUrl;

/**
 * The basic info related to a channel
 */
@ApiModel(description = "The basic info related to a channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:32:45.871Z")
public class BeezUPCommonChannelBasicInfo {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("channelName")
  private BeezUPCommonChannelName channelName = null;

  @SerializedName("channelImageUrl")
  private BeezUPCommonHttpUrl channelImageUrl = null;

  public BeezUPCommonChannelBasicInfo channelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelId getChannelId() {
    return channelId;
  }

  public void setChannelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
  }

  public BeezUPCommonChannelBasicInfo channelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelName getChannelName() {
    return channelName;
  }

  public void setChannelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
  }

  public BeezUPCommonChannelBasicInfo channelImageUrl(BeezUPCommonHttpUrl channelImageUrl) {
    this.channelImageUrl = channelImageUrl;
    return this;
  }

   /**
   * Get channelImageUrl
   * @return channelImageUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonHttpUrl getChannelImageUrl() {
    return channelImageUrl;
  }

  public void setChannelImageUrl(BeezUPCommonHttpUrl channelImageUrl) {
    this.channelImageUrl = channelImageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonChannelBasicInfo beezUPCommonChannelBasicInfo = (BeezUPCommonChannelBasicInfo) o;
    return Objects.equals(this.channelId, beezUPCommonChannelBasicInfo.channelId) &&
        Objects.equals(this.channelName, beezUPCommonChannelBasicInfo.channelName) &&
        Objects.equals(this.channelImageUrl, beezUPCommonChannelBasicInfo.channelImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, channelImageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonChannelBasicInfo {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelImageUrl: ").append(toIndentedString(channelImageUrl)).append("\n");
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

