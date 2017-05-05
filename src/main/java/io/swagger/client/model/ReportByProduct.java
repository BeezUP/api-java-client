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
import io.swagger.client.model.BeezUPCommonProductBasicInfo;
import io.swagger.client.model.ReportByProductLinks;
import java.math.BigDecimal;

/**
 * ReportByProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:13:16.265Z")
public class ReportByProduct {
  @SerializedName("product")
  private BeezUPCommonProductBasicInfo product = null;

  @SerializedName("enabledOnChannelCount")
  private Integer enabledOnChannelCount = null;

  @SerializedName("channelCount")
  private Integer channelCount = null;

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
  private ReportByProductLinks links = null;

  public ReportByProduct product(BeezUPCommonProductBasicInfo product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonProductBasicInfo getProduct() {
    return product;
  }

  public void setProduct(BeezUPCommonProductBasicInfo product) {
    this.product = product;
  }

  public ReportByProduct enabledOnChannelCount(Integer enabledOnChannelCount) {
    this.enabledOnChannelCount = enabledOnChannelCount;
    return this;
  }

   /**
   * The count of channel where this product is enabled
   * @return enabledOnChannelCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The count of channel where this product is enabled")
  public Integer getEnabledOnChannelCount() {
    return enabledOnChannelCount;
  }

  public void setEnabledOnChannelCount(Integer enabledOnChannelCount) {
    this.enabledOnChannelCount = enabledOnChannelCount;
  }

  public ReportByProduct channelCount(Integer channelCount) {
    this.channelCount = channelCount;
    return this;
  }

   /**
   * The channel count where this product can be enabled
   * @return channelCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "The channel count where this product can be enabled")
  public Integer getChannelCount() {
    return channelCount;
  }

  public void setChannelCount(Integer channelCount) {
    this.channelCount = channelCount;
  }

  public ReportByProduct clickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

   /**
   * The click count for this product
   * @return clickCount
  **/
  @ApiModelProperty(example = "1234", required = true, value = "The click count for this product")
  public Integer getClickCount() {
    return clickCount;
  }

  public void setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
  }

  public ReportByProduct cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost for this product
   * @return cost
  **/
  @ApiModelProperty(example = "101.42", required = true, value = "The cost for this product")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ReportByProduct orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * The order count for this product
   * @return orderCount
  **/
  @ApiModelProperty(example = "234.42", required = true, value = "The order count for this product")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public ReportByProduct turnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
    return this;
  }

   /**
   * The Turnover for this product
   * @return turnOver
  **/
  @ApiModelProperty(example = "42.01", required = true, value = "The Turnover for this product")
  public BigDecimal getTurnOver() {
    return turnOver;
  }

  public void setTurnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
  }

  public ReportByProduct margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

   /**
   * The margin for this product
   * @return margin
  **/
  @ApiModelProperty(example = "50.0", required = true, value = "The margin for this product")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public ReportByProduct performanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

   /**
   * The performance indicator based on the performance indicator formula indicated in the request for this product
   * @return performanceIndicator
  **/
  @ApiModelProperty(example = "10.12", required = true, value = "The performance indicator based on the performance indicator formula indicated in the request for this product")
  public BigDecimal getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }

  public ReportByProduct links(ReportByProductLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportByProductLinks getLinks() {
    return links;
  }

  public void setLinks(ReportByProductLinks links) {
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
    ReportByProduct reportByProduct = (ReportByProduct) o;
    return Objects.equals(this.product, reportByProduct.product) &&
        Objects.equals(this.enabledOnChannelCount, reportByProduct.enabledOnChannelCount) &&
        Objects.equals(this.channelCount, reportByProduct.channelCount) &&
        Objects.equals(this.clickCount, reportByProduct.clickCount) &&
        Objects.equals(this.cost, reportByProduct.cost) &&
        Objects.equals(this.orderCount, reportByProduct.orderCount) &&
        Objects.equals(this.turnOver, reportByProduct.turnOver) &&
        Objects.equals(this.margin, reportByProduct.margin) &&
        Objects.equals(this.performanceIndicator, reportByProduct.performanceIndicator) &&
        Objects.equals(this.links, reportByProduct.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, enabledOnChannelCount, channelCount, clickCount, cost, orderCount, turnOver, margin, performanceIndicator, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByProduct {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    enabledOnChannelCount: ").append(toIndentedString(enabledOnChannelCount)).append("\n");
    sb.append("    channelCount: ").append(toIndentedString(channelCount)).append("\n");
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

