/*
 * Analytics
 * This API will help you to manage the tracking of your clicks and your sales, get reporting on this trackings and put in place rules based on this reporting to automatically optimize your channel catalogs. \\ Also, you will be able to consult the rule execution reporting. 
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
import java.math.BigDecimal;

/**
 * ReportByDayAllChannels
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:12:33.618Z")
public class ReportByDayAllChannels {
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

  public ReportByDayAllChannels clickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

   /**
   * The click count for this channel
   * @return clickCount
  **/
  @ApiModelProperty(example = "101", required = true, value = "The click count for this channel")
  public Integer getClickCount() {
    return clickCount;
  }

  public void setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
  }

  public ReportByDayAllChannels cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost for this channel
   * @return cost
  **/
  @ApiModelProperty(example = "10.42", required = true, value = "The cost for this channel")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ReportByDayAllChannels orderCount(Integer orderCount) {
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

  public ReportByDayAllChannels turnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
    return this;
  }

   /**
   * The Turnover for this channel
   * @return turnOver
  **/
  @ApiModelProperty(example = "23.11", required = true, value = "The Turnover for this channel")
  public BigDecimal getTurnOver() {
    return turnOver;
  }

  public void setTurnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
  }

  public ReportByDayAllChannels margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

   /**
   * The margin for this channel
   * @return margin
  **/
  @ApiModelProperty(example = "42.42", required = true, value = "The margin for this channel")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public ReportByDayAllChannels performanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

   /**
   * The performance indicator based on the performance indicator formula indicated in the request for this channel
   * @return performanceIndicator
  **/
  @ApiModelProperty(example = "23.09", required = true, value = "The performance indicator based on the performance indicator formula indicated in the request for this channel")
  public BigDecimal getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByDayAllChannels reportByDayAllChannels = (ReportByDayAllChannels) o;
    return Objects.equals(this.clickCount, reportByDayAllChannels.clickCount) &&
        Objects.equals(this.cost, reportByDayAllChannels.cost) &&
        Objects.equals(this.orderCount, reportByDayAllChannels.orderCount) &&
        Objects.equals(this.turnOver, reportByDayAllChannels.turnOver) &&
        Objects.equals(this.margin, reportByDayAllChannels.margin) &&
        Objects.equals(this.performanceIndicator, reportByDayAllChannels.performanceIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCount, cost, orderCount, turnOver, margin, performanceIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByDayAllChannels {\n");
    
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    turnOver: ").append(toIndentedString(turnOver)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    performanceIndicator: ").append(toIndentedString(performanceIndicator)).append("\n");
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
