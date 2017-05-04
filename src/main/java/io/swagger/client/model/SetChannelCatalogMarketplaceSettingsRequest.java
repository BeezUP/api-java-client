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
import io.swagger.client.model.ChannelCatalogMarketplaceSettingArray;

/**
 * The channel catalog marketplace settings to save
 */
@ApiModel(description = "The channel catalog marketplace settings to save")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:49:32.058Z")
public class SetChannelCatalogMarketplaceSettingsRequest {
  @SerializedName("settings")
  private ChannelCatalogMarketplaceSettingArray settings = null;

  public SetChannelCatalogMarketplaceSettingsRequest settings(ChannelCatalogMarketplaceSettingArray settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogMarketplaceSettingArray getSettings() {
    return settings;
  }

  public void setSettings(ChannelCatalogMarketplaceSettingArray settings) {
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
    SetChannelCatalogMarketplaceSettingsRequest setChannelCatalogMarketplaceSettingsRequest = (SetChannelCatalogMarketplaceSettingsRequest) o;
    return Objects.equals(this.settings, setChannelCatalogMarketplaceSettingsRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetChannelCatalogMarketplaceSettingsRequest {\n");
    
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

