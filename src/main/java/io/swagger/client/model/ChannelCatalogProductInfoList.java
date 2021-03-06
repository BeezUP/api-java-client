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
import io.swagger.client.model.ChannelCatalogProductInfo;
import io.swagger.client.model.ChannelCatalogProductInfoListLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * The channel catalog product info list
 */
@ApiModel(description = "The channel catalog product info list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ChannelCatalogProductInfoList {
  @SerializedName("links")
  private ChannelCatalogProductInfoListLinks links = null;

  @SerializedName("productInfos")
  private List<ChannelCatalogProductInfo> productInfos = new ArrayList<ChannelCatalogProductInfo>();

  public ChannelCatalogProductInfoList links(ChannelCatalogProductInfoListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCatalogProductInfoListLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelCatalogProductInfoListLinks links) {
    this.links = links;
  }

  public ChannelCatalogProductInfoList productInfos(List<ChannelCatalogProductInfo> productInfos) {
    this.productInfos = productInfos;
    return this;
  }

  public ChannelCatalogProductInfoList addProductInfosItem(ChannelCatalogProductInfo productInfosItem) {
    this.productInfos.add(productInfosItem);
    return this;
  }

   /**
   * Get productInfos
   * @return productInfos
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelCatalogProductInfo> getProductInfos() {
    return productInfos;
  }

  public void setProductInfos(List<ChannelCatalogProductInfo> productInfos) {
    this.productInfos = productInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogProductInfoList channelCatalogProductInfoList = (ChannelCatalogProductInfoList) o;
    return Objects.equals(this.links, channelCatalogProductInfoList.links) &&
        Objects.equals(this.productInfos, channelCatalogProductInfoList.productInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, productInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogProductInfoList {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
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

