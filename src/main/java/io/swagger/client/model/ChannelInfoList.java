/*
 * BeezUP API
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
import io.swagger.client.model.ChannelInfo;
import io.swagger.client.model.ChannelInfoListLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelInfoList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class ChannelInfoList {
  @SerializedName("links")
  private ChannelInfoListLinks links = null;

  @SerializedName("channels")
  private List<ChannelInfo> channels = new ArrayList<ChannelInfo>();

  public ChannelInfoList links(ChannelInfoListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelInfoListLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelInfoListLinks links) {
    this.links = links;
  }

  public ChannelInfoList channels(List<ChannelInfo> channels) {
    this.channels = channels;
    return this;
  }

  public ChannelInfoList addChannelsItem(ChannelInfo channelsItem) {
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelInfo> getChannels() {
    return channels;
  }

  public void setChannels(List<ChannelInfo> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfoList channelInfoList = (ChannelInfoList) o;
    return Objects.equals(this.links, channelInfoList.links) &&
        Objects.equals(this.channels, channelInfoList.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, channels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfoList {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

