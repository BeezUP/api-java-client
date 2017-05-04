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
import io.swagger.client.model.MarketplaceChannelCatalog;
import io.swagger.client.model.MarketplaceChannelCatalogListLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * The marketplace channel catalog list
 */
@ApiModel(description = "The marketplace channel catalog list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:27:39.504Z")
public class MarketplaceChannelCatalogList {
  @SerializedName("links")
  private MarketplaceChannelCatalogListLinks links = null;

  @SerializedName("marketplaceChannelCatalogs")
  private List<MarketplaceChannelCatalog> marketplaceChannelCatalogs = new ArrayList<MarketplaceChannelCatalog>();

  public MarketplaceChannelCatalogList links(MarketplaceChannelCatalogListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceChannelCatalogListLinks getLinks() {
    return links;
  }

  public void setLinks(MarketplaceChannelCatalogListLinks links) {
    this.links = links;
  }

  public MarketplaceChannelCatalogList marketplaceChannelCatalogs(List<MarketplaceChannelCatalog> marketplaceChannelCatalogs) {
    this.marketplaceChannelCatalogs = marketplaceChannelCatalogs;
    return this;
  }

  public MarketplaceChannelCatalogList addMarketplaceChannelCatalogsItem(MarketplaceChannelCatalog marketplaceChannelCatalogsItem) {
    this.marketplaceChannelCatalogs.add(marketplaceChannelCatalogsItem);
    return this;
  }

   /**
   * The list of marketplace channel catalog
   * @return marketplaceChannelCatalogs
  **/
  @ApiModelProperty(example = "null", required = true, value = "The list of marketplace channel catalog")
  public List<MarketplaceChannelCatalog> getMarketplaceChannelCatalogs() {
    return marketplaceChannelCatalogs;
  }

  public void setMarketplaceChannelCatalogs(List<MarketplaceChannelCatalog> marketplaceChannelCatalogs) {
    this.marketplaceChannelCatalogs = marketplaceChannelCatalogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceChannelCatalogList marketplaceChannelCatalogList = (MarketplaceChannelCatalogList) o;
    return Objects.equals(this.links, marketplaceChannelCatalogList.links) &&
        Objects.equals(this.marketplaceChannelCatalogs, marketplaceChannelCatalogList.marketplaceChannelCatalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, marketplaceChannelCatalogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceChannelCatalogList {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    marketplaceChannelCatalogs: ").append(toIndentedString(marketplaceChannelCatalogs)).append("\n");
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

