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
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.ProductFilters;
import io.swagger.client.model.ProductStateFilter;
import io.swagger.client.model.ReportAdvancedFilters;
import io.swagger.client.model.ReportCategoryFilter;
import io.swagger.client.model.ReportFilterCommonParameters;
import io.swagger.client.model.ReportIndicatorFilter;
import io.swagger.client.model.ReportType;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ReportFilterParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class ReportFilterParameters {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("beginPeriodUtcDate")
  private DateTime beginPeriodUtcDate = null;

  @SerializedName("endPeriodUtcDate")
  private DateTime endPeriodUtcDate = null;

  @SerializedName("categoryFilter")
  private ReportCategoryFilter categoryFilter = null;

  @SerializedName("indicatorFilters")
  private List<ReportIndicatorFilter> indicatorFilters = new ArrayList<ReportIndicatorFilter>();

  @SerializedName("advancedFilters")
  private ReportAdvancedFilters advancedFilters = null;

  @SerializedName("reportType")
  private ReportType reportType = null;

  @SerializedName("productState")
  private ProductStateFilter productState = null;

  @SerializedName("productFilters")
  private ProductFilters productFilters = null;

  public ReportFilterParameters channelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonChannelId getChannelId() {
    return channelId;
  }

  public void setChannelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
  }

  public ReportFilterParameters beginPeriodUtcDate(DateTime beginPeriodUtcDate) {
    this.beginPeriodUtcDate = beginPeriodUtcDate;
    return this;
  }

   /**
   * The begin date period you want to get the report
   * @return beginPeriodUtcDate
  **/
  @ApiModelProperty(example = "2006-11-20T00:00:00Z", required = true, value = "The begin date period you want to get the report")
  public DateTime getBeginPeriodUtcDate() {
    return beginPeriodUtcDate;
  }

  public void setBeginPeriodUtcDate(DateTime beginPeriodUtcDate) {
    this.beginPeriodUtcDate = beginPeriodUtcDate;
  }

  public ReportFilterParameters endPeriodUtcDate(DateTime endPeriodUtcDate) {
    this.endPeriodUtcDate = endPeriodUtcDate;
    return this;
  }

   /**
   * The end date period you want to get the report.
   * @return endPeriodUtcDate
  **/
  @ApiModelProperty(example = "2006-12-20T00:00:00Z", required = true, value = "The end date period you want to get the report.")
  public DateTime getEndPeriodUtcDate() {
    return endPeriodUtcDate;
  }

  public void setEndPeriodUtcDate(DateTime endPeriodUtcDate) {
    this.endPeriodUtcDate = endPeriodUtcDate;
  }

  public ReportFilterParameters categoryFilter(ReportCategoryFilter categoryFilter) {
    this.categoryFilter = categoryFilter;
    return this;
  }

   /**
   * Get categoryFilter
   * @return categoryFilter
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReportCategoryFilter getCategoryFilter() {
    return categoryFilter;
  }

  public void setCategoryFilter(ReportCategoryFilter categoryFilter) {
    this.categoryFilter = categoryFilter;
  }

  public ReportFilterParameters indicatorFilters(List<ReportIndicatorFilter> indicatorFilters) {
    this.indicatorFilters = indicatorFilters;
    return this;
  }

  public ReportFilterParameters addIndicatorFiltersItem(ReportIndicatorFilter indicatorFiltersItem) {
    this.indicatorFilters.add(indicatorFiltersItem);
    return this;
  }

   /**
   * Get indicatorFilters
   * @return indicatorFilters
  **/
  @ApiModelProperty(example = "[{&quot;indicator&quot;:&quot;Cost&quot;,&quot;operatorName&quot;:&quot;Equals&quot;,&quot;value&quot;:10.42}]", value = "")
  public List<ReportIndicatorFilter> getIndicatorFilters() {
    return indicatorFilters;
  }

  public void setIndicatorFilters(List<ReportIndicatorFilter> indicatorFilters) {
    this.indicatorFilters = indicatorFilters;
  }

  public ReportFilterParameters advancedFilters(ReportAdvancedFilters advancedFilters) {
    this.advancedFilters = advancedFilters;
    return this;
  }

   /**
   * Get advancedFilters
   * @return advancedFilters
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportAdvancedFilters getAdvancedFilters() {
    return advancedFilters;
  }

  public void setAdvancedFilters(ReportAdvancedFilters advancedFilters) {
    this.advancedFilters = advancedFilters;
  }

  public ReportFilterParameters reportType(ReportType reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportType getReportType() {
    return reportType;
  }

  public void setReportType(ReportType reportType) {
    this.reportType = reportType;
  }

  public ReportFilterParameters productState(ProductStateFilter productState) {
    this.productState = productState;
    return this;
  }

   /**
   * Get productState
   * @return productState
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProductStateFilter getProductState() {
    return productState;
  }

  public void setProductState(ProductStateFilter productState) {
    this.productState = productState;
  }

  public ReportFilterParameters productFilters(ProductFilters productFilters) {
    this.productFilters = productFilters;
    return this;
  }

   /**
   * Get productFilters
   * @return productFilters
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProductFilters getProductFilters() {
    return productFilters;
  }

  public void setProductFilters(ProductFilters productFilters) {
    this.productFilters = productFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportFilterParameters reportFilterParameters = (ReportFilterParameters) o;
    return Objects.equals(this.channelId, reportFilterParameters.channelId) &&
        Objects.equals(this.beginPeriodUtcDate, reportFilterParameters.beginPeriodUtcDate) &&
        Objects.equals(this.endPeriodUtcDate, reportFilterParameters.endPeriodUtcDate) &&
        Objects.equals(this.categoryFilter, reportFilterParameters.categoryFilter) &&
        Objects.equals(this.indicatorFilters, reportFilterParameters.indicatorFilters) &&
        Objects.equals(this.advancedFilters, reportFilterParameters.advancedFilters) &&
        Objects.equals(this.reportType, reportFilterParameters.reportType) &&
        Objects.equals(this.productState, reportFilterParameters.productState) &&
        Objects.equals(this.productFilters, reportFilterParameters.productFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, beginPeriodUtcDate, endPeriodUtcDate, categoryFilter, indicatorFilters, advancedFilters, reportType, productState, productFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFilterParameters {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    beginPeriodUtcDate: ").append(toIndentedString(beginPeriodUtcDate)).append("\n");
    sb.append("    endPeriodUtcDate: ").append(toIndentedString(endPeriodUtcDate)).append("\n");
    sb.append("    categoryFilter: ").append(toIndentedString(categoryFilter)).append("\n");
    sb.append("    indicatorFilters: ").append(toIndentedString(indicatorFilters)).append("\n");
    sb.append("    advancedFilters: ").append(toIndentedString(advancedFilters)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    productState: ").append(toIndentedString(productState)).append("\n");
    sb.append("    productFilters: ").append(toIndentedString(productFilters)).append("\n");
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
