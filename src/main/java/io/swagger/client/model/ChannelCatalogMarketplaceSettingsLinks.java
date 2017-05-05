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
import io.swagger.client.model.LinksGetChannelCatalogMarketplaceSettingsLink;
import io.swagger.client.model.LinksSetChannelCatalogMarketplaceSettingsLink;

/**
 * ChannelCatalogMarketplaceSettingsLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:22:45.227Z")
public class ChannelCatalogMarketplaceSettingsLinks {
  @SerializedName("self")
  private LinksGetChannelCatalogMarketplaceSettingsLink self = null;

  @SerializedName("save")
  private LinksSetChannelCatalogMarketplaceSettingsLink save = null;

  public ChannelCatalogMarketplaceSettingsLinks self(LinksGetChannelCatalogMarketplaceSettingsLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetChannelCatalogMarketplaceSettingsLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetChannelCatalogMarketplaceSettingsLink self) {
    this.self = self;
  }

  public ChannelCatalogMarketplaceSettingsLinks save(LinksSetChannelCatalogMarketplaceSettingsLink save) {
    this.save = save;
    return this;
  }

   /**
   * Get save
   * @return save
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSetChannelCatalogMarketplaceSettingsLink getSave() {
    return save;
  }

  public void setSave(LinksSetChannelCatalogMarketplaceSettingsLink save) {
    this.save = save;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogMarketplaceSettingsLinks channelCatalogMarketplaceSettingsLinks = (ChannelCatalogMarketplaceSettingsLinks) o;
    return Objects.equals(this.self, channelCatalogMarketplaceSettingsLinks.self) &&
        Objects.equals(this.save, channelCatalogMarketplaceSettingsLinks.save);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, save);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogMarketplaceSettingsLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
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

