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
import io.swagger.client.model.LinkClickToOrderType;
import io.swagger.client.model.MargingType;
import io.swagger.client.model.PerformanceIndicatorFormula;

/**
 * ReportAdvancedFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class ReportAdvancedFilters {
  @SerializedName("margingType")
  private MargingType margingType = null;

  @SerializedName("globalMarginPercent")
  private Integer globalMarginPercent = null;

  @SerializedName("linkClickToOrderType")
  private LinkClickToOrderType linkClickToOrderType = null;

  @SerializedName("linkClickToOrderMaxDay")
  private Integer linkClickToOrderMaxDay = null;

  @SerializedName("onlyPaymentValidatedOrders")
  private Boolean onlyPaymentValidatedOrders = null;

  @SerializedName("onlyDirectSales")
  private Boolean onlyDirectSales = null;

  @SerializedName("performanceIndicatorFormula")
  private PerformanceIndicatorFormula performanceIndicatorFormula = null;

  public ReportAdvancedFilters margingType(MargingType margingType) {
    this.margingType = margingType;
    return this;
  }

   /**
   * Get margingType
   * @return margingType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MargingType getMargingType() {
    return margingType;
  }

  public void setMargingType(MargingType margingType) {
    this.margingType = margingType;
  }

  public ReportAdvancedFilters globalMarginPercent(Integer globalMarginPercent) {
    this.globalMarginPercent = globalMarginPercent;
    return this;
  }

   /**
   * If the margin type is 'Global', indicate the percentage of sale price.
   * @return globalMarginPercent
  **/
  @ApiModelProperty(example = "10", value = "If the margin type is 'Global', indicate the percentage of sale price.")
  public Integer getGlobalMarginPercent() {
    return globalMarginPercent;
  }

  public void setGlobalMarginPercent(Integer globalMarginPercent) {
    this.globalMarginPercent = globalMarginPercent;
  }

  public ReportAdvancedFilters linkClickToOrderType(LinkClickToOrderType linkClickToOrderType) {
    this.linkClickToOrderType = linkClickToOrderType;
    return this;
  }

   /**
   * Get linkClickToOrderType
   * @return linkClickToOrderType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinkClickToOrderType getLinkClickToOrderType() {
    return linkClickToOrderType;
  }

  public void setLinkClickToOrderType(LinkClickToOrderType linkClickToOrderType) {
    this.linkClickToOrderType = linkClickToOrderType;
  }

  public ReportAdvancedFilters linkClickToOrderMaxDay(Integer linkClickToOrderMaxDay) {
    this.linkClickToOrderMaxDay = linkClickToOrderMaxDay;
    return this;
  }

   /**
   * If the linkOrderType is OnClickDate, indicate the max day to search the click from the order
   * @return linkClickToOrderMaxDay
  **/
  @ApiModelProperty(example = "5", value = "If the linkOrderType is OnClickDate, indicate the max day to search the click from the order")
  public Integer getLinkClickToOrderMaxDay() {
    return linkClickToOrderMaxDay;
  }

  public void setLinkClickToOrderMaxDay(Integer linkClickToOrderMaxDay) {
    this.linkClickToOrderMaxDay = linkClickToOrderMaxDay;
  }

  public ReportAdvancedFilters onlyPaymentValidatedOrders(Boolean onlyPaymentValidatedOrders) {
    this.onlyPaymentValidatedOrders = onlyPaymentValidatedOrders;
    return this;
  }

   /**
   * If true, you will get the only the orders with payment validated. Otherwise, you will get all orders validated or not.
   * @return onlyPaymentValidatedOrders
  **/
  @ApiModelProperty(example = "true", required = true, value = "If true, you will get the only the orders with payment validated. Otherwise, you will get all orders validated or not.")
  public Boolean getOnlyPaymentValidatedOrders() {
    return onlyPaymentValidatedOrders;
  }

  public void setOnlyPaymentValidatedOrders(Boolean onlyPaymentValidatedOrders) {
    this.onlyPaymentValidatedOrders = onlyPaymentValidatedOrders;
  }

  public ReportAdvancedFilters onlyDirectSales(Boolean onlyDirectSales) {
    this.onlyDirectSales = onlyDirectSales;
    return this;
  }

   /**
   * If true, you will get only direct sales. Otherwise the indirect sales will be included.
   * @return onlyDirectSales
  **/
  @ApiModelProperty(example = "true", required = true, value = "If true, you will get only direct sales. Otherwise the indirect sales will be included.")
  public Boolean getOnlyDirectSales() {
    return onlyDirectSales;
  }

  public void setOnlyDirectSales(Boolean onlyDirectSales) {
    this.onlyDirectSales = onlyDirectSales;
  }

  public ReportAdvancedFilters performanceIndicatorFormula(PerformanceIndicatorFormula performanceIndicatorFormula) {
    this.performanceIndicatorFormula = performanceIndicatorFormula;
    return this;
  }

   /**
   * Get performanceIndicatorFormula
   * @return performanceIndicatorFormula
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PerformanceIndicatorFormula getPerformanceIndicatorFormula() {
    return performanceIndicatorFormula;
  }

  public void setPerformanceIndicatorFormula(PerformanceIndicatorFormula performanceIndicatorFormula) {
    this.performanceIndicatorFormula = performanceIndicatorFormula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAdvancedFilters reportAdvancedFilters = (ReportAdvancedFilters) o;
    return Objects.equals(this.margingType, reportAdvancedFilters.margingType) &&
        Objects.equals(this.globalMarginPercent, reportAdvancedFilters.globalMarginPercent) &&
        Objects.equals(this.linkClickToOrderType, reportAdvancedFilters.linkClickToOrderType) &&
        Objects.equals(this.linkClickToOrderMaxDay, reportAdvancedFilters.linkClickToOrderMaxDay) &&
        Objects.equals(this.onlyPaymentValidatedOrders, reportAdvancedFilters.onlyPaymentValidatedOrders) &&
        Objects.equals(this.onlyDirectSales, reportAdvancedFilters.onlyDirectSales) &&
        Objects.equals(this.performanceIndicatorFormula, reportAdvancedFilters.performanceIndicatorFormula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(margingType, globalMarginPercent, linkClickToOrderType, linkClickToOrderMaxDay, onlyPaymentValidatedOrders, onlyDirectSales, performanceIndicatorFormula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAdvancedFilters {\n");
    
    sb.append("    margingType: ").append(toIndentedString(margingType)).append("\n");
    sb.append("    globalMarginPercent: ").append(toIndentedString(globalMarginPercent)).append("\n");
    sb.append("    linkClickToOrderType: ").append(toIndentedString(linkClickToOrderType)).append("\n");
    sb.append("    linkClickToOrderMaxDay: ").append(toIndentedString(linkClickToOrderMaxDay)).append("\n");
    sb.append("    onlyPaymentValidatedOrders: ").append(toIndentedString(onlyPaymentValidatedOrders)).append("\n");
    sb.append("    onlyDirectSales: ").append(toIndentedString(onlyDirectSales)).append("\n");
    sb.append("    performanceIndicatorFormula: ").append(toIndentedString(performanceIndicatorFormula)).append("\n");
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
