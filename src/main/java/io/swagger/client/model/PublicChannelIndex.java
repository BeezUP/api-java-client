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
import io.swagger.client.model.LinksGetChannelsLink;
import io.swagger.client.model.PublicChannelIndexLinks;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PublicChannelIndex
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class PublicChannelIndex {
  @SerializedName("channels")
  private Map<String, LinksGetChannelsLink> channels = new HashMap<String, LinksGetChannelsLink>();

  @SerializedName("links")
  private PublicChannelIndexLinks links = null;

  public PublicChannelIndex channels(Map<String, LinksGetChannelsLink> channels) {
    this.channels = channels;
    return this;
  }

  public PublicChannelIndex putChannelsItem(String key, LinksGetChannelsLink channelsItem) {
    this.channels.put(key, channelsItem);
    return this;
  }

   /**
   * The key is the country iso code
   * @return channels
  **/
  @ApiModelProperty(example = "{&quot;FRA&quot;:{&quot;href&quot;:&quot;/v2/public/channels/FRA&quot;,&quot;method&quot;:&quot;GET&quot;},&quot;DEU&quot;:{&quot;href&quot;:&quot;/v2/public/channels/DEU&quot;,&quot;method&quot;:&quot;GET&quot;},&quot;ESP&quot;:{&quot;href&quot;:&quot;/v2/public/channels/ESP&#39;&quot;,&quot;method&quot;:&quot;GET&quot;},&quot;ITA&quot;:{&quot;href&quot;:&quot;/v2/public/channels/ITA&quot;,&quot;method&quot;:&quot;GET&quot;},&quot;GBR&quot;:{&quot;href&quot;:&quot;/v2/public/channels/GBR&quot;,&quot;method&quot;:&quot;GET&quot;}}", value = "The key is the country iso code")
  public Map<String, LinksGetChannelsLink> getChannels() {
    return channels;
  }

  public void setChannels(Map<String, LinksGetChannelsLink> channels) {
    this.channels = channels;
  }

  public PublicChannelIndex links(PublicChannelIndexLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public PublicChannelIndexLinks getLinks() {
    return links;
  }

  public void setLinks(PublicChannelIndexLinks links) {
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
    PublicChannelIndex publicChannelIndex = (PublicChannelIndex) o;
    return Objects.equals(this.channels, publicChannelIndex.channels) &&
        Objects.equals(this.links, publicChannelIndex.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicChannelIndex {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

