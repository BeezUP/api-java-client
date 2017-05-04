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
import io.swagger.client.model.ChannelCatalogMarketplaceProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogMarketplacePropertyGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:15:46.573Z")
public class ChannelCatalogMarketplacePropertyGroup {
  @SerializedName("displayGroupCode")
  private String displayGroupCode = null;

  @SerializedName("displayGroupPosition")
  private Integer displayGroupPosition = null;

  @SerializedName("properties")
  private List<ChannelCatalogMarketplaceProperty> properties = new ArrayList<ChannelCatalogMarketplaceProperty>();

  public ChannelCatalogMarketplacePropertyGroup displayGroupCode(String displayGroupCode) {
    this.displayGroupCode = displayGroupCode;
    return this;
  }

   /**
   * Indicate the code identifier of the group
   * @return displayGroupCode
  **/
  @ApiModelProperty(example = "AccountInformations", required = true, value = "Indicate the code identifier of the group")
  public String getDisplayGroupCode() {
    return displayGroupCode;
  }

  public void setDisplayGroupCode(String displayGroupCode) {
    this.displayGroupCode = displayGroupCode;
  }

  public ChannelCatalogMarketplacePropertyGroup displayGroupPosition(Integer displayGroupPosition) {
    this.displayGroupPosition = displayGroupPosition;
    return this;
  }

   /**
   * Indicate the position of the group
   * minimum: 1
   * @return displayGroupPosition
  **/
  @ApiModelProperty(example = "1", required = true, value = "Indicate the position of the group")
  public Integer getDisplayGroupPosition() {
    return displayGroupPosition;
  }

  public void setDisplayGroupPosition(Integer displayGroupPosition) {
    this.displayGroupPosition = displayGroupPosition;
  }

  public ChannelCatalogMarketplacePropertyGroup properties(List<ChannelCatalogMarketplaceProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ChannelCatalogMarketplacePropertyGroup addPropertiesItem(ChannelCatalogMarketplaceProperty propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "[{&quot;name&quot;:&quot;EbayToken&quot;,&quot;position&quot;:1,&quot;readOnly&quot;:true,&quot;values&quot;:[&quot;AgAAAA**AQAAAA**aAAAAA**2VFhVg**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6AElISgCJaLpwWdj6x9nY+seQ**OEsBAA**AAMAAA**jzsVAMwj1dPBsyCEp0Fuj/toSBrfZF2JpKKDrrXIirMzgvgbsyxnA2h1wl7WjFD+TfdCmaBq3CAFLOog/433G5gsse1DLTT6uXFajdiHnPVfnL7QtKIpQEIwL8ZO5Tx1dGl0XQLsU7knPwbGHn5X6Z3JzXrCGvvpw2+MIzDNhasYlqPfOEr8Lct5dcsIIdhXl/qgrzALe5++v76/XjaXvP6eic3uCWBEXBiXC1uisjEtOqaNIPkFaiICBaXsQUzVZdM68bQatBg5bwf6hxvqOyNJRw4pttGStovcXXjL+aszw7ejbxLv1lJ6qeTMj5oRwTPl0AzBAejcY+DTBrLEmgdzrvWHLvMOa1ijGOGzVodBoDGimiqadCPQpAVZr0e7HvQIVbOlbmKpuCUFJ4RPCv0NxpkCm1/nxZWeS9H8gd/SfLf9Chgd115dcKzgxFBoSh7myJcw+MRM7szPQ2Pwv980dTRyHvbI8XR4OieYvXmU4H7Nl51N8B3qkjYFkdcp6J06eqs4dO68lDNdWZfXHkjwI3dY6umDUp4y82IdQl8IykPty3/DZfUAfqafgiAwMHZvXjewp5HhPjDi2zgf+5EcDlvf6rNMzjsghjdWUQi4WldDk+LXgkos6jswIQaNPdpW1D4KyPYWtGYknx0Xzzuc6WmBoVwGFalgMvCWWI9Gs2w6PG5GqB9zm1Fnr3svtPbNYPQ6q3VQpkKL2SWQXy383O1cp6ZMLI9GwZe0FnrqCxb/wc4XJUVw2RoR3qiX&quot;]},{&quot;name&quot;:&quot;PaypalAddress&quot;,&quot;position&quot;:2,&quot;required&quot;:true,&quot;pattern&quot;:&quot;(?:[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+(?:\\.[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+)*|\&quot;(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\&quot;)@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])&quot;,&quot;x-pattern&quot;:&quot;(?:[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+(?:\\.[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+)*|\&quot;(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\&quot;)@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])&quot;}]", required = true, value = "")
  public List<ChannelCatalogMarketplaceProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<ChannelCatalogMarketplaceProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogMarketplacePropertyGroup channelCatalogMarketplacePropertyGroup = (ChannelCatalogMarketplacePropertyGroup) o;
    return Objects.equals(this.displayGroupCode, channelCatalogMarketplacePropertyGroup.displayGroupCode) &&
        Objects.equals(this.displayGroupPosition, channelCatalogMarketplacePropertyGroup.displayGroupPosition) &&
        Objects.equals(this.properties, channelCatalogMarketplacePropertyGroup.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayGroupCode, displayGroupPosition, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogMarketplacePropertyGroup {\n");
    
    sb.append("    displayGroupCode: ").append(toIndentedString(displayGroupCode)).append("\n");
    sb.append("    displayGroupPosition: ").append(toIndentedString(displayGroupPosition)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

