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
import io.swagger.client.model.AvailableChannelLink;
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonChannelName;
import io.swagger.client.model.BeezUPCommonHttpUrl;

/**
 * The available channel
 */
@ApiModel(description = "The available channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:47:15.399Z")
public class ChannelHeader {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("channelName")
  private BeezUPCommonChannelName channelName = null;

  @SerializedName("channelLogoUrl")
  private BeezUPCommonHttpUrl channelLogoUrl = null;

  @SerializedName("links")
  private AvailableChannelLink links = null;

  public ChannelHeader channelId(BeezUPCommonChannelId channelId) {
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

  public ChannelHeader channelName(BeezUPCommonChannelName channelName) {
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

  public ChannelHeader channelLogoUrl(BeezUPCommonHttpUrl channelLogoUrl) {
    this.channelLogoUrl = channelLogoUrl;
    return this;
  }

   /**
   * Get channelLogoUrl
   * @return channelLogoUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonHttpUrl getChannelLogoUrl() {
    return channelLogoUrl;
  }

  public void setChannelLogoUrl(BeezUPCommonHttpUrl channelLogoUrl) {
    this.channelLogoUrl = channelLogoUrl;
  }

  public ChannelHeader links(AvailableChannelLink links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AvailableChannelLink getLinks() {
    return links;
  }

  public void setLinks(AvailableChannelLink links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelHeader channelHeader = (ChannelHeader) o;
    return Objects.equals(this.channelId, channelHeader.channelId) &&
        Objects.equals(this.channelName, channelHeader.channelName) &&
        Objects.equals(this.channelLogoUrl, channelHeader.channelLogoUrl) &&
        Objects.equals(this.links, channelHeader.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, channelLogoUrl, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelHeader {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelLogoUrl: ").append(toIndentedString(channelLogoUrl)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

