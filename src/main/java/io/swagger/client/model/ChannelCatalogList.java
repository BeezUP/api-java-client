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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.ChannelCatalog;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:54:35.212Z")
public class ChannelCatalogList {
  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  @SerializedName("channelCatalogs")
  private List<ChannelCatalog> channelCatalogs = new ArrayList<ChannelCatalog>();

  public ChannelCatalogList links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ChannelCatalogList addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Indicates how to create a channel catalog and how to get the channel catalog list
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "Indicates how to create a channel catalog and how to get the channel catalog list")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
    this.links = links;
  }

  public ChannelCatalogList channelCatalogs(List<ChannelCatalog> channelCatalogs) {
    this.channelCatalogs = channelCatalogs;
    return this;
  }

  public ChannelCatalogList addChannelCatalogsItem(ChannelCatalog channelCatalogsItem) {
    this.channelCatalogs.add(channelCatalogsItem);
    return this;
  }

   /**
   * Get channelCatalogs
   * @return channelCatalogs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelCatalog> getChannelCatalogs() {
    return channelCatalogs;
  }

  public void setChannelCatalogs(List<ChannelCatalog> channelCatalogs) {
    this.channelCatalogs = channelCatalogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogList channelCatalogList = (ChannelCatalogList) o;
    return Objects.equals(this.links, channelCatalogList.links) &&
        Objects.equals(this.channelCatalogs, channelCatalogList.channelCatalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, channelCatalogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogList {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    channelCatalogs: ").append(toIndentedString(channelCatalogs)).append("\n");
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

