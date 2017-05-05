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
import io.swagger.client.model.BeezUPCommonCatalogCategoryPath;
import io.swagger.client.model.BeezUPCommonChannelCategoryPath;
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.ChannelCatalogCategoryMapping;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogCategoryMappingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:17:16.769Z")
public class ChannelCatalogCategoryMappingInfo {
  @SerializedName("catalogCategoryPath")
  private BeezUPCommonCatalogCategoryPath catalogCategoryPath = null;

  @SerializedName("channelCategoryPath")
  private BeezUPCommonChannelCategoryPath channelCategoryPath = null;

  @SerializedName("costValue")
  private BigDecimal costValue = null;

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  public ChannelCatalogCategoryMappingInfo catalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
    this.catalogCategoryPath = catalogCategoryPath;
    return this;
  }

   /**
   * Get catalogCategoryPath
   * @return catalogCategoryPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCatalogCategoryPath getCatalogCategoryPath() {
    return catalogCategoryPath;
  }

  public void setCatalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
    this.catalogCategoryPath = catalogCategoryPath;
  }

  public ChannelCatalogCategoryMappingInfo channelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
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

  public ChannelCatalogCategoryMappingInfo costValue(BigDecimal costValue) {
    this.costValue = costValue;
    return this;
  }

   /**
   * In case of CPC_ByCategory or CPA_ByCategory cost type, you have to indicate the cost value.
   * @return costValue
  **/
  @ApiModelProperty(example = "10.21", value = "In case of CPC_ByCategory or CPA_ByCategory cost type, you have to indicate the cost value.")
  public BigDecimal getCostValue() {
    return costValue;
  }

  public void setCostValue(BigDecimal costValue) {
    this.costValue = costValue;
  }

  public ChannelCatalogCategoryMappingInfo links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ChannelCatalogCategoryMappingInfo addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;rel&quot;:&quot;unmapCategory&quot;,&quot;operationId&quot;:&quot;MapChannelCatalogCategory&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}/categoryMappings/unmap&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;},{&quot;name&quot;:&quot;request&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;object&quot;,&quot;required&quot;:true,&quot;value&quot;:{&quot;catalogCategoryPath&quot;:[&quot;VÃªtements&quot;,&quot;Femmes&quot;,&quot;Chaussures&quot;]}}]}]", required = true, value = "")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
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
    ChannelCatalogCategoryMappingInfo channelCatalogCategoryMappingInfo = (ChannelCatalogCategoryMappingInfo) o;
    return Objects.equals(this.catalogCategoryPath, channelCatalogCategoryMappingInfo.catalogCategoryPath) &&
        Objects.equals(this.channelCategoryPath, channelCatalogCategoryMappingInfo.channelCategoryPath) &&
        Objects.equals(this.costValue, channelCatalogCategoryMappingInfo.costValue) &&
        Objects.equals(this.links, channelCatalogCategoryMappingInfo.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogCategoryPath, channelCategoryPath, costValue, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogCategoryMappingInfo {\n");
    
    sb.append("    catalogCategoryPath: ").append(toIndentedString(catalogCategoryPath)).append("\n");
    sb.append("    channelCategoryPath: ").append(toIndentedString(channelCategoryPath)).append("\n");
    sb.append("    costValue: ").append(toIndentedString(costValue)).append("\n");
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

