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

/**
 * Indicates the differents actions you can do on a channel product
 */
@ApiModel(description = "Indicates the differents actions you can do on a channel product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:07:10.326Z")
public class ChannelCatalogProductInfoLinks {
  @SerializedName("override")
  private BeezUPCommonLink2 override = null;

  @SerializedName("disable")
  private BeezUPCommonLink2 disable = null;

  @SerializedName("reenable")
  private BeezUPCommonLink2 reenable = null;

  public ChannelCatalogProductInfoLinks override(BeezUPCommonLink2 override) {
    this.override = override;
    return this;
  }

   /**
   * Get override
   * @return override
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLink2 getOverride() {
    return override;
  }

  public void setOverride(BeezUPCommonLink2 override) {
    this.override = override;
  }

  public ChannelCatalogProductInfoLinks disable(BeezUPCommonLink2 disable) {
    this.disable = disable;
    return this;
  }

   /**
   * Get disable
   * @return disable
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLink2 getDisable() {
    return disable;
  }

  public void setDisable(BeezUPCommonLink2 disable) {
    this.disable = disable;
  }

  public ChannelCatalogProductInfoLinks reenable(BeezUPCommonLink2 reenable) {
    this.reenable = reenable;
    return this;
  }

   /**
   * Get reenable
   * @return reenable
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLink2 getReenable() {
    return reenable;
  }

  public void setReenable(BeezUPCommonLink2 reenable) {
    this.reenable = reenable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogProductInfoLinks channelCatalogProductInfoLinks = (ChannelCatalogProductInfoLinks) o;
    return Objects.equals(this.override, channelCatalogProductInfoLinks.override) &&
        Objects.equals(this.disable, channelCatalogProductInfoLinks.disable) &&
        Objects.equals(this.reenable, channelCatalogProductInfoLinks.reenable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(override, disable, reenable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogProductInfoLinks {\n");
    
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    reenable: ").append(toIndentedString(reenable)).append("\n");
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

