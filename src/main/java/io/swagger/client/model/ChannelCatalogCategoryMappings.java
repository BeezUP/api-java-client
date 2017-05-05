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
import io.swagger.client.model.ChannelCatalogCategoryMappingInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogCategoryMappings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:26:33.625Z")
public class ChannelCatalogCategoryMappings {
  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  @SerializedName("channelCatalogCategoryMappings")
  private List<ChannelCatalogCategoryMappingInfo> channelCatalogCategoryMappings = new ArrayList<ChannelCatalogCategoryMappingInfo>();

  public ChannelCatalogCategoryMappings links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ChannelCatalogCategoryMappings addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;rel&quot;:&quot;mapCategory&quot;,&quot;operationId&quot;:&quot;MapChannelCatalogCategory&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/map&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;}]}]", required = true, value = "")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
    this.links = links;
  }

  public ChannelCatalogCategoryMappings channelCatalogCategoryMappings(List<ChannelCatalogCategoryMappingInfo> channelCatalogCategoryMappings) {
    this.channelCatalogCategoryMappings = channelCatalogCategoryMappings;
    return this;
  }

  public ChannelCatalogCategoryMappings addChannelCatalogCategoryMappingsItem(ChannelCatalogCategoryMappingInfo channelCatalogCategoryMappingsItem) {
    this.channelCatalogCategoryMappings.add(channelCatalogCategoryMappingsItem);
    return this;
  }

   /**
   * Get channelCatalogCategoryMappings
   * @return channelCatalogCategoryMappings
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ChannelCatalogCategoryMappingInfo> getChannelCatalogCategoryMappings() {
    return channelCatalogCategoryMappings;
  }

  public void setChannelCatalogCategoryMappings(List<ChannelCatalogCategoryMappingInfo> channelCatalogCategoryMappings) {
    this.channelCatalogCategoryMappings = channelCatalogCategoryMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogCategoryMappings channelCatalogCategoryMappings = (ChannelCatalogCategoryMappings) o;
    return Objects.equals(this.links, channelCatalogCategoryMappings.links) &&
        Objects.equals(this.channelCatalogCategoryMappings, channelCatalogCategoryMappings.channelCatalogCategoryMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, channelCatalogCategoryMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogCategoryMappings {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    channelCatalogCategoryMappings: ").append(toIndentedString(channelCatalogCategoryMappings)).append("\n");
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

