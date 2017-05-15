/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T13:43:05.416Z")
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

