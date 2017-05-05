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
import io.swagger.client.model.BeezUPCommonChannelBasicInfo;
import io.swagger.client.model.BeezUPCommonLink2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByChannel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class ReportByChannel {
  @SerializedName("channel")
  private BeezUPCommonChannelBasicInfo channel = null;

  @SerializedName("enabledProductCount")
  private Integer enabledProductCount = null;

  @SerializedName("catalogProductCount")
  private Integer catalogProductCount = null;

  @SerializedName("clickCount")
  private Integer clickCount = null;

  @SerializedName("cost")
  private BigDecimal cost = null;

  @SerializedName("orderCount")
  private Integer orderCount = null;

  @SerializedName("turnOver")
  private BigDecimal turnOver = null;

  @SerializedName("margin")
  private BigDecimal margin = null;

  @SerializedName("performanceIndicator")
  private BigDecimal performanceIndicator = null;

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  public ReportByChannel channel(BeezUPCommonChannelBasicInfo channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelBasicInfo getChannel() {
    return channel;
  }

  public void setChannel(BeezUPCommonChannelBasicInfo channel) {
    this.channel = channel;
  }

  public ReportByChannel enabledProductCount(Integer enabledProductCount) {
    this.enabledProductCount = enabledProductCount;
    return this;
  }

   /**
   * The enabled product count for this channel
   * @return enabledProductCount
  **/
  @ApiModelProperty(example = "101", required = true, value = "The enabled product count for this channel")
  public Integer getEnabledProductCount() {
    return enabledProductCount;
  }

  public void setEnabledProductCount(Integer enabledProductCount) {
    this.enabledProductCount = enabledProductCount;
  }

  public ReportByChannel catalogProductCount(Integer catalogProductCount) {
    this.catalogProductCount = catalogProductCount;
    return this;
  }

   /**
   * The catalog product count for this channel
   * @return catalogProductCount
  **/
  @ApiModelProperty(example = "101", required = true, value = "The catalog product count for this channel")
  public Integer getCatalogProductCount() {
    return catalogProductCount;
  }

  public void setCatalogProductCount(Integer catalogProductCount) {
    this.catalogProductCount = catalogProductCount;
  }

  public ReportByChannel clickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

   /**
   * The click count for this channel
   * @return clickCount
  **/
  @ApiModelProperty(example = "1024", required = true, value = "The click count for this channel")
  public Integer getClickCount() {
    return clickCount;
  }

  public void setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
  }

  public ReportByChannel cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost for this channel
   * @return cost
  **/
  @ApiModelProperty(example = "1234.12", required = true, value = "The cost for this channel")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ReportByChannel orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * The order count for this channel
   * @return orderCount
  **/
  @ApiModelProperty(example = "42", required = true, value = "The order count for this channel")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public ReportByChannel turnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
    return this;
  }

   /**
   * The Turnover for this channel
   * @return turnOver
  **/
  @ApiModelProperty(example = "42.42", required = true, value = "The Turnover for this channel")
  public BigDecimal getTurnOver() {
    return turnOver;
  }

  public void setTurnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
  }

  public ReportByChannel margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

   /**
   * The margin for this channel
   * @return margin
  **/
  @ApiModelProperty(example = "23.1", required = true, value = "The margin for this channel")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public ReportByChannel performanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

   /**
   * The performance indicator based on the performance indicator formula indicated in the request for this channel
   * @return performanceIndicator
  **/
  @ApiModelProperty(example = "12.21", required = true, value = "The performance indicator based on the performance indicator formula indicated in the request for this channel")
  public BigDecimal getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }

  public ReportByChannel links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ReportByChannel addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * The action list on this channel
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName}&quot;,&quot;operationId&quot;:&quot;OptimiseByChannel&quot;,&quot;rel&quot;:&quot;EnableProducts&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;8f95eb1a-3691-4750-950d-a13c4a8a9bcc&quot;},{&quot;name&quot;:&quot;channelId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;a2d38563-50f0-43f1-be2b-b16e7ec4f007&quot;},{&quot;name&quot;:&quot;actionName&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;reenable&quot;}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/optimisations/bychannel/{channelId}/{actionName}&quot;,&quot;operationId&quot;:&quot;OptimiseByChannel&quot;,&quot;rel&quot;:&quot;DisableProducts&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;8f95eb1a-3691-4750-950d-a13c4a8a9bcc&quot;},{&quot;name&quot;:&quot;channelId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;a2d38563-50f0-43f1-be2b-b16e7ec4f007&quot;},{&quot;name&quot;:&quot;actionName&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;disable&quot;}]}]", value = "The action list on this channel")
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
    ReportByChannel reportByChannel = (ReportByChannel) o;
    return Objects.equals(this.channel, reportByChannel.channel) &&
        Objects.equals(this.enabledProductCount, reportByChannel.enabledProductCount) &&
        Objects.equals(this.catalogProductCount, reportByChannel.catalogProductCount) &&
        Objects.equals(this.clickCount, reportByChannel.clickCount) &&
        Objects.equals(this.cost, reportByChannel.cost) &&
        Objects.equals(this.orderCount, reportByChannel.orderCount) &&
        Objects.equals(this.turnOver, reportByChannel.turnOver) &&
        Objects.equals(this.margin, reportByChannel.margin) &&
        Objects.equals(this.performanceIndicator, reportByChannel.performanceIndicator) &&
        Objects.equals(this.links, reportByChannel.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, enabledProductCount, catalogProductCount, clickCount, cost, orderCount, turnOver, margin, performanceIndicator, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByChannel {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    enabledProductCount: ").append(toIndentedString(enabledProductCount)).append("\n");
    sb.append("    catalogProductCount: ").append(toIndentedString(catalogProductCount)).append("\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    turnOver: ").append(toIndentedString(turnOver)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    performanceIndicator: ").append(toIndentedString(performanceIndicator)).append("\n");
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
