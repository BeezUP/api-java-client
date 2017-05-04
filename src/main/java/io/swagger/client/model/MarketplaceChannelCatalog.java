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
import io.swagger.client.model.BeezUPCommonChannelCatalogId;
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonMarketplaceAccountId;
import io.swagger.client.model.BeezUPCommonMarketplaceBusinessCode;
import io.swagger.client.model.BeezUPCommonMarketplaceTechnicalCode;
import io.swagger.client.model.BeezUPCommonStoreId;
import io.swagger.client.model.MarketplaceChannelCatalogLinks;
import io.swagger.client.model.MarketplaceChannelCatalogLovLinks;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This object indicates you the association between a channel catalog and a marketplace. The account identifier will be automatically defined based on your marketplace merchant identfier.
 */
@ApiModel(description = "This object indicates you the association between a channel catalog and a marketplace. The account identifier will be automatically defined based on your marketplace merchant identfier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:49:32.058Z")
public class MarketplaceChannelCatalog {
  @SerializedName("marketplaceTechnicalCode")
  private BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode = null;

  @SerializedName("marketplaceBusinessCode")
  private BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode = null;

  @SerializedName("marketplaceMarketPlaceId")
  private String marketplaceMarketPlaceId = null;

  @SerializedName("marketplaceIsoCountryCodeAlpha2")
  private String marketplaceIsoCountryCodeAlpha2 = null;

  @SerializedName("beezUPChannelId")
  private BeezUPCommonChannelId beezUPChannelId = null;

  @SerializedName("beezUPChannelCatalogId")
  private BeezUPCommonChannelCatalogId beezUPChannelCatalogId = null;

  @SerializedName("beezUPStoreId")
  private BeezUPCommonStoreId beezUPStoreId = null;

  @SerializedName("beezUPStoreName")
  private String beezUPStoreName = null;

  @SerializedName("marketplaceMerchantIdentifiers")
  private Map<String, String> marketplaceMerchantIdentifiers = new HashMap<String, String>();

  @SerializedName("marketplaceAccountId")
  private BeezUPCommonMarketplaceAccountId marketplaceAccountId = null;

  @SerializedName("lovLinks")
  private MarketplaceChannelCatalogLovLinks lovLinks = null;

  @SerializedName("links")
  private MarketplaceChannelCatalogLinks links = null;

  public MarketplaceChannelCatalog marketplaceTechnicalCode(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
    return this;
  }

   /**
   * Get marketplaceTechnicalCode
   * @return marketplaceTechnicalCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonMarketplaceTechnicalCode getMarketplaceTechnicalCode() {
    return marketplaceTechnicalCode;
  }

  public void setMarketplaceTechnicalCode(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
  }

  public MarketplaceChannelCatalog marketplaceBusinessCode(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
    return this;
  }

   /**
   * Get marketplaceBusinessCode
   * @return marketplaceBusinessCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonMarketplaceBusinessCode getMarketplaceBusinessCode() {
    return marketplaceBusinessCode;
  }

  public void setMarketplaceBusinessCode(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
  }

  public MarketplaceChannelCatalog marketplaceMarketPlaceId(String marketplaceMarketPlaceId) {
    this.marketplaceMarketPlaceId = marketplaceMarketPlaceId;
    return this;
  }

   /**
   * The marketplace identifier in the marketplace
   * @return marketplaceMarketPlaceId
  **/
  @ApiModelProperty(example = "71", required = true, value = "The marketplace identifier in the marketplace")
  public String getMarketplaceMarketPlaceId() {
    return marketplaceMarketPlaceId;
  }

  public void setMarketplaceMarketPlaceId(String marketplaceMarketPlaceId) {
    this.marketplaceMarketPlaceId = marketplaceMarketPlaceId;
  }

  public MarketplaceChannelCatalog marketplaceIsoCountryCodeAlpha2(String marketplaceIsoCountryCodeAlpha2) {
    this.marketplaceIsoCountryCodeAlpha2 = marketplaceIsoCountryCodeAlpha2;
    return this;
  }

   /**
   * The marketplace country iso code alpha 2 (see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table for more details)
   * @return marketplaceIsoCountryCodeAlpha2
  **/
  @ApiModelProperty(example = "FR", required = true, value = "The marketplace country iso code alpha 2 (see http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Decoding_table for more details)")
  public String getMarketplaceIsoCountryCodeAlpha2() {
    return marketplaceIsoCountryCodeAlpha2;
  }

  public void setMarketplaceIsoCountryCodeAlpha2(String marketplaceIsoCountryCodeAlpha2) {
    this.marketplaceIsoCountryCodeAlpha2 = marketplaceIsoCountryCodeAlpha2;
  }

  public MarketplaceChannelCatalog beezUPChannelId(BeezUPCommonChannelId beezUPChannelId) {
    this.beezUPChannelId = beezUPChannelId;
    return this;
  }

   /**
   * Get beezUPChannelId
   * @return beezUPChannelId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelId getBeezUPChannelId() {
    return beezUPChannelId;
  }

  public void setBeezUPChannelId(BeezUPCommonChannelId beezUPChannelId) {
    this.beezUPChannelId = beezUPChannelId;
  }

  public MarketplaceChannelCatalog beezUPChannelCatalogId(BeezUPCommonChannelCatalogId beezUPChannelCatalogId) {
    this.beezUPChannelCatalogId = beezUPChannelCatalogId;
    return this;
  }

   /**
   * Get beezUPChannelCatalogId
   * @return beezUPChannelCatalogId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelCatalogId getBeezUPChannelCatalogId() {
    return beezUPChannelCatalogId;
  }

  public void setBeezUPChannelCatalogId(BeezUPCommonChannelCatalogId beezUPChannelCatalogId) {
    this.beezUPChannelCatalogId = beezUPChannelCatalogId;
  }

  public MarketplaceChannelCatalog beezUPStoreId(BeezUPCommonStoreId beezUPStoreId) {
    this.beezUPStoreId = beezUPStoreId;
    return this;
  }

   /**
   * Get beezUPStoreId
   * @return beezUPStoreId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonStoreId getBeezUPStoreId() {
    return beezUPStoreId;
  }

  public void setBeezUPStoreId(BeezUPCommonStoreId beezUPStoreId) {
    this.beezUPStoreId = beezUPStoreId;
  }

  public MarketplaceChannelCatalog beezUPStoreName(String beezUPStoreName) {
    this.beezUPStoreName = beezUPStoreName;
    return this;
  }

   /**
   * The store name
   * @return beezUPStoreName
  **/
  @ApiModelProperty(example = "My Store 1", required = true, value = "The store name")
  public String getBeezUPStoreName() {
    return beezUPStoreName;
  }

  public void setBeezUPStoreName(String beezUPStoreName) {
    this.beezUPStoreName = beezUPStoreName;
  }

  public MarketplaceChannelCatalog marketplaceMerchantIdentifiers(Map<String, String> marketplaceMerchantIdentifiers) {
    this.marketplaceMerchantIdentifiers = marketplaceMerchantIdentifiers;
    return this;
  }

  public MarketplaceChannelCatalog putMarketplaceMerchantIdentifiersItem(String key, String marketplaceMerchantIdentifiersItem) {
    this.marketplaceMerchantIdentifiers.put(key, marketplaceMerchantIdentifiersItem);
    return this;
  }

   /**
   * The marketplace merchant identifier list
   * @return marketplaceMerchantIdentifiers
  **/
  @ApiModelProperty(example = "{&quot;Ebay_PayPalEmailAddress&quot;:&quot;yourEbayId@paypal.com&quot;}", value = "The marketplace merchant identifier list")
  public Map<String, String> getMarketplaceMerchantIdentifiers() {
    return marketplaceMerchantIdentifiers;
  }

  public void setMarketplaceMerchantIdentifiers(Map<String, String> marketplaceMerchantIdentifiers) {
    this.marketplaceMerchantIdentifiers = marketplaceMerchantIdentifiers;
  }

  public MarketplaceChannelCatalog marketplaceAccountId(BeezUPCommonMarketplaceAccountId marketplaceAccountId) {
    this.marketplaceAccountId = marketplaceAccountId;
    return this;
  }

   /**
   * Get marketplaceAccountId
   * @return marketplaceAccountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonMarketplaceAccountId getMarketplaceAccountId() {
    return marketplaceAccountId;
  }

  public void setMarketplaceAccountId(BeezUPCommonMarketplaceAccountId marketplaceAccountId) {
    this.marketplaceAccountId = marketplaceAccountId;
  }

  public MarketplaceChannelCatalog lovLinks(MarketplaceChannelCatalogLovLinks lovLinks) {
    this.lovLinks = lovLinks;
    return this;
  }

   /**
   * Get lovLinks
   * @return lovLinks
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceChannelCatalogLovLinks getLovLinks() {
    return lovLinks;
  }

  public void setLovLinks(MarketplaceChannelCatalogLovLinks lovLinks) {
    this.lovLinks = lovLinks;
  }

  public MarketplaceChannelCatalog links(MarketplaceChannelCatalogLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceChannelCatalogLinks getLinks() {
    return links;
  }

  public void setLinks(MarketplaceChannelCatalogLinks links) {
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
    MarketplaceChannelCatalog marketplaceChannelCatalog = (MarketplaceChannelCatalog) o;
    return Objects.equals(this.marketplaceTechnicalCode, marketplaceChannelCatalog.marketplaceTechnicalCode) &&
        Objects.equals(this.marketplaceBusinessCode, marketplaceChannelCatalog.marketplaceBusinessCode) &&
        Objects.equals(this.marketplaceMarketPlaceId, marketplaceChannelCatalog.marketplaceMarketPlaceId) &&
        Objects.equals(this.marketplaceIsoCountryCodeAlpha2, marketplaceChannelCatalog.marketplaceIsoCountryCodeAlpha2) &&
        Objects.equals(this.beezUPChannelId, marketplaceChannelCatalog.beezUPChannelId) &&
        Objects.equals(this.beezUPChannelCatalogId, marketplaceChannelCatalog.beezUPChannelCatalogId) &&
        Objects.equals(this.beezUPStoreId, marketplaceChannelCatalog.beezUPStoreId) &&
        Objects.equals(this.beezUPStoreName, marketplaceChannelCatalog.beezUPStoreName) &&
        Objects.equals(this.marketplaceMerchantIdentifiers, marketplaceChannelCatalog.marketplaceMerchantIdentifiers) &&
        Objects.equals(this.marketplaceAccountId, marketplaceChannelCatalog.marketplaceAccountId) &&
        Objects.equals(this.lovLinks, marketplaceChannelCatalog.lovLinks) &&
        Objects.equals(this.links, marketplaceChannelCatalog.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceTechnicalCode, marketplaceBusinessCode, marketplaceMarketPlaceId, marketplaceIsoCountryCodeAlpha2, beezUPChannelId, beezUPChannelCatalogId, beezUPStoreId, beezUPStoreName, marketplaceMerchantIdentifiers, marketplaceAccountId, lovLinks, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceChannelCatalog {\n");
    
    sb.append("    marketplaceTechnicalCode: ").append(toIndentedString(marketplaceTechnicalCode)).append("\n");
    sb.append("    marketplaceBusinessCode: ").append(toIndentedString(marketplaceBusinessCode)).append("\n");
    sb.append("    marketplaceMarketPlaceId: ").append(toIndentedString(marketplaceMarketPlaceId)).append("\n");
    sb.append("    marketplaceIsoCountryCodeAlpha2: ").append(toIndentedString(marketplaceIsoCountryCodeAlpha2)).append("\n");
    sb.append("    beezUPChannelId: ").append(toIndentedString(beezUPChannelId)).append("\n");
    sb.append("    beezUPChannelCatalogId: ").append(toIndentedString(beezUPChannelCatalogId)).append("\n");
    sb.append("    beezUPStoreId: ").append(toIndentedString(beezUPStoreId)).append("\n");
    sb.append("    beezUPStoreName: ").append(toIndentedString(beezUPStoreName)).append("\n");
    sb.append("    marketplaceMerchantIdentifiers: ").append(toIndentedString(marketplaceMerchantIdentifiers)).append("\n");
    sb.append("    marketplaceAccountId: ").append(toIndentedString(marketplaceAccountId)).append("\n");
    sb.append("    lovLinks: ").append(toIndentedString(lovLinks)).append("\n");
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

