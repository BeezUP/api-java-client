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
import io.swagger.client.model.ChannelCatalogMarketplaceSetting;
import io.swagger.client.model.ChannelCatalogMarketplaceSettingsLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * The channel catalog marketplace settings
 */
@ApiModel(description = "The channel catalog marketplace settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class ChannelCatalogMarketplaceSettings {
  @SerializedName("links")
  private ChannelCatalogMarketplaceSettingsLinks links = null;

  @SerializedName("settings")
  private List<ChannelCatalogMarketplaceSetting> settings = new ArrayList<ChannelCatalogMarketplaceSetting>();

  public ChannelCatalogMarketplaceSettings links(ChannelCatalogMarketplaceSettingsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogMarketplaceSettingsLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelCatalogMarketplaceSettingsLinks links) {
    this.links = links;
  }

  public ChannelCatalogMarketplaceSettings settings(List<ChannelCatalogMarketplaceSetting> settings) {
    this.settings = settings;
    return this;
  }

  public ChannelCatalogMarketplaceSettings addSettingsItem(ChannelCatalogMarketplaceSetting settingsItem) {
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(example = "[{&quot;name&quot;:&quot;Country&quot;,&quot;values&quot;:[&quot;FR&quot;]},{&quot;name&quot;:&quot;Currency&quot;,&quot;values&quot;:[&quot;EUR&quot;]},{&quot;name&quot;:&quot;ListingDuration&quot;,&quot;values&quot;:[&quot;GTC&quot;]},{&quot;name&quot;:&quot;PaymentMethods&quot;,&quot;values&quot;:[&quot;CCAccepted&quot;]},{&quot;name&quot;:&quot;PayPalEmailAddress&quot;,&quot;values&quot;:[&quot;pascal@ixeoline.com&quot;]},{&quot;name&quot;:&quot;PostalCode&quot;,&quot;values&quot;:[&quot;69630&quot;]},{&quot;name&quot;:&quot;RefundOption&quot;,&quot;values&quot;:[&quot;MoneyBackOrExchange&quot;]},{&quot;name&quot;:&quot;ReturnsAcceptedOption&quot;,&quot;values&quot;:[&quot;ReturnsAccepted&quot;]},{&quot;name&quot;:&quot;ReturnsWithinOption&quot;,&quot;values&quot;:[&quot;Days_10&quot;]},{&quot;name&quot;:&quot;ShippingCostPaidByOption&quot;,&quot;values&quot;:[&quot;Buyer&quot;]},{&quot;name&quot;:&quot;ShippingService&quot;,&quot;values&quot;:[&quot;FR_ColiposteColissimo&quot;]}]", required = true, value = "")
  public List<ChannelCatalogMarketplaceSetting> getSettings() {
    return settings;
  }

  public void setSettings(List<ChannelCatalogMarketplaceSetting> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogMarketplaceSettings channelCatalogMarketplaceSettings = (ChannelCatalogMarketplaceSettings) o;
    return Objects.equals(this.links, channelCatalogMarketplaceSettings.links) &&
        Objects.equals(this.settings, channelCatalogMarketplaceSettings.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogMarketplaceSettings {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
