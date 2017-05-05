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
import io.swagger.client.model.BeezUPCommonInfoSummaries;
import io.swagger.client.model.ChannelCatalogMarketplacePropertiesLinks;
import io.swagger.client.model.ChannelCatalogMarketplacePropertyGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogMarketplaceProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class ChannelCatalogMarketplaceProperties {
  @SerializedName("info")
  private BeezUPCommonInfoSummaries info = null;

  @SerializedName("links")
  private ChannelCatalogMarketplacePropertiesLinks links = null;

  @SerializedName("propertyGroups")
  private List<ChannelCatalogMarketplacePropertyGroup> propertyGroups = new ArrayList<ChannelCatalogMarketplacePropertyGroup>();

  public ChannelCatalogMarketplaceProperties info(BeezUPCommonInfoSummaries info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonInfoSummaries getInfo() {
    return info;
  }

  public void setInfo(BeezUPCommonInfoSummaries info) {
    this.info = info;
  }

  public ChannelCatalogMarketplaceProperties links(ChannelCatalogMarketplacePropertiesLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogMarketplacePropertiesLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelCatalogMarketplacePropertiesLinks links) {
    this.links = links;
  }

  public ChannelCatalogMarketplaceProperties propertyGroups(List<ChannelCatalogMarketplacePropertyGroup> propertyGroups) {
    this.propertyGroups = propertyGroups;
    return this;
  }

  public ChannelCatalogMarketplaceProperties addPropertyGroupsItem(ChannelCatalogMarketplacePropertyGroup propertyGroupsItem) {
    this.propertyGroups.add(propertyGroupsItem);
    return this;
  }

   /**
   * The groups settings with constraints
   * @return propertyGroups
  **/
  @ApiModelProperty(example = "[{&quot;displayGroupCode&quot;:&quot;AccountInformations&quot;,&quot;displayGroupPosition&quot;:1,&quot;properties&quot;:[{&quot;name&quot;:&quot;EbayToken&quot;,&quot;position&quot;:1,&quot;readOnly&quot;:true,&quot;values&quot;:[&quot;AgAAAA**AQAAAA**aAAAAA**2VFhVg**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6AElISgCJaLpwWdj6x9nY+seQ**OEsBAA**AAMAAA**jzsVAMwj1dPBsyCEp0Fuj/toSBrfZF2JpKKDrrXIirMzgvgbsyxnA2h1wl7WjFD+TfdCmaBq3CAFLOog/433G5gsse1DLTT6uXFajdiHnPVfnL7QtKIpQEIwL8ZO5Tx1dGl0XQLsU7knPwbGHn5X6Z3JzXrCGvvpw2+MIzDNhasYlqPfOEr8Lct5dcsIIdhXl/qgrzALe5++v76/XjaXvP6eic3uCWBEXBiXC1uisjEtOqaNIPkFaiICBaXsQUzVZdM68bQatBg5bwf6hxvqOyNJRw4pttGStovcXXjL+aszw7ejbxLv1lJ6qeTMj5oRwTPl0AzBAejcY+DTBrLEmgdzrvWHLvMOa1ijGOGzVodBoDGimiqadCPQpAVZr0e7HvQIVbOlbmKpuCUFJ4RPCv0NxpkCm1/nxZWeS9H8gd/SfLf9Chgd115dcKzgxFBoSh7myJcw+MRM7szPQ2Pwv980dTRyHvbI8XR4OieYvXmU4H7Nl51N8B3qkjYFkdcp6J06eqs4dO68lDNdWZfXHkjwI3dY6umDUp4y82IdQl8IykPty3/DZfUAfqafgiAwMHZvXjewp5HhPjDi2zgf+5EcDlvf6rNMzjsghjdWUQi4WldDk+LXgkos6jswIQaNPdpW1D4KyPYWtGYknx0Xzzuc6WmBoVwGFalgMvCWWI9Gs2w6PG5GqB9zm1Fnr3svtPbNYPQ6q3VQpkKL2SWQXy383O1cp6ZMLI9GwZe0FnrqCxb/wc4XJUVw2RoR3qiX&quot;]},{&quot;name&quot;:&quot;PayPalEmailAddress&quot;,&quot;position&quot;:2,&quot;required&quot;:true,&quot;pattern&quot;:&quot;(?:[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+(?:\\.[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+)*|\&quot;(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\&quot;)@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])&quot;,&quot;x-pattern&quot;:&quot;(?:[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+(?:\\.[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+)*|\&quot;(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\&quot;)@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])&quot;}]},{&quot;displayGroupCode&quot;:&quot;AnnounceTitle&quot;,&quot;displayGroupPosition&quot;:2,&quot;properties&quot;:[{&quot;name&quot;:&quot;Postalcode&quot;,&quot;required&quot;:true,&quot;position&quot;:1},{&quot;name&quot;:&quot;Country&quot;,&quot;position&quot;:2,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/Country_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;ReturnsWithinOption&quot;,&quot;position&quot;:3,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/ReturnsWithinDuration_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;ShippingService&quot;,&quot;position&quot;:4,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/FRA_ShippingService_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;Currency&quot;,&quot;position&quot;:5,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/Currency_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;PaymentMethods&quot;,&quot;position&quot;:6,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/PaymentMethods_eBay&quot;},&quot;lovRequired&quot;:true,&quot;minItems&quot;:1,&quot;maxItems&quot;:2}]},{&quot;displayGroupCode&quot;:&quot;SalesConditions&quot;,&quot;displayGroupPosition&quot;:3,&quot;properties&quot;:[{&quot;name&quot;:&quot;ReturnsAcceptedOption&quot;,&quot;position&quot;:1,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/ReturnsAcceptedOption_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;ShippingCostPaidByOption&quot;,&quot;position&quot;:2,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/ShippingCostPaidByOption_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;RefundOption&quot;,&quot;position&quot;:3,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/RefundOption_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;ReturnsWithinOption&quot;,&quot;position&quot;:4,&quot;required&quot;:true,&quot;lovLink&quot;:{&quot;href&quot;:&quot;/v2/user/lov/ReturnsWithinDuration_eBay&quot;},&quot;lovRequired&quot;:true},{&quot;name&quot;:&quot;ReturnDescription&quot;,&quot;position&quot;:5,&quot;required&quot;:false,&quot;maxLength&quot;:5000}]},{&quot;displayGroupCode&quot;:&quot;HTML&quot;,&quot;displayGroupPosition&quot;:4,&quot;properties&quot;:[{&quot;name&quot;:&quot;Template_HTML&quot;,&quot;position&quot;:1,&quot;required&quot;:false,&quot;maxLength&quot;:50000}]},{&quot;displayGroupCode&quot;:&quot;OrdersRetrievalOptions&quot;,&quot;displayGroupPosition&quot;:5,&quot;properties&quot;:[{&quot;name&quot;:&quot;RetrieveOnlyOneCountry&quot;,&quot;description&quot;:&quot;If true allows to retireve one marketplace country only&quot;,&quot;position&quot;:1,&quot;type&quot;:&quot;boolean&quot;,&quot;required&quot;:false}]}]", required = true, value = "The groups settings with constraints")
  public List<ChannelCatalogMarketplacePropertyGroup> getPropertyGroups() {
    return propertyGroups;
  }

  public void setPropertyGroups(List<ChannelCatalogMarketplacePropertyGroup> propertyGroups) {
    this.propertyGroups = propertyGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogMarketplaceProperties channelCatalogMarketplaceProperties = (ChannelCatalogMarketplaceProperties) o;
    return Objects.equals(this.info, channelCatalogMarketplaceProperties.info) &&
        Objects.equals(this.links, channelCatalogMarketplaceProperties.links) &&
        Objects.equals(this.propertyGroups, channelCatalogMarketplaceProperties.propertyGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, links, propertyGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogMarketplaceProperties {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    propertyGroups: ").append(toIndentedString(propertyGroups)).append("\n");
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

