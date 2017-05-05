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
import io.swagger.client.model.LinksGetChannelCatalogMarketplacePropertiesLink;
import io.swagger.client.model.LinksGetChannelCatalogMarketplaceSettingsLink;
import io.swagger.client.model.LinksGetPublicationsLink;

/**
 * Indicate the actions you can do on a channel catalog. If the settings are valid, you will be able to access to the publication history.
 */
@ApiModel(description = "Indicate the actions you can do on a channel catalog. If the settings are valid, you will be able to access to the publication history.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:47:15.399Z")
public class MarketplaceChannelCatalogLinks {
  @SerializedName("properties")
  private LinksGetChannelCatalogMarketplacePropertiesLink properties = null;

  @SerializedName("settings")
  private LinksGetChannelCatalogMarketplaceSettingsLink settings = null;

  @SerializedName("publications")
  private LinksGetPublicationsLink publications = null;

  public MarketplaceChannelCatalogLinks properties(LinksGetChannelCatalogMarketplacePropertiesLink properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetChannelCatalogMarketplacePropertiesLink getProperties() {
    return properties;
  }

  public void setProperties(LinksGetChannelCatalogMarketplacePropertiesLink properties) {
    this.properties = properties;
  }

  public MarketplaceChannelCatalogLinks settings(LinksGetChannelCatalogMarketplaceSettingsLink settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetChannelCatalogMarketplaceSettingsLink getSettings() {
    return settings;
  }

  public void setSettings(LinksGetChannelCatalogMarketplaceSettingsLink settings) {
    this.settings = settings;
  }

  public MarketplaceChannelCatalogLinks publications(LinksGetPublicationsLink publications) {
    this.publications = publications;
    return this;
  }

   /**
   * Get publications
   * @return publications
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetPublicationsLink getPublications() {
    return publications;
  }

  public void setPublications(LinksGetPublicationsLink publications) {
    this.publications = publications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceChannelCatalogLinks marketplaceChannelCatalogLinks = (MarketplaceChannelCatalogLinks) o;
    return Objects.equals(this.properties, marketplaceChannelCatalogLinks.properties) &&
        Objects.equals(this.settings, marketplaceChannelCatalogLinks.settings) &&
        Objects.equals(this.publications, marketplaceChannelCatalogLinks.publications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, settings, publications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceChannelCatalogLinks {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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

