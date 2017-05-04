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
import io.swagger.client.model.PageNumber;
import io.swagger.client.model.PageSize;
import io.swagger.client.model.PaginationRequestParameters;
import io.swagger.client.model.ReportAdvancedFilters;
import io.swagger.client.model.ReportCategoryFilter;
import io.swagger.client.model.ReportFilterCommonParameters;
import io.swagger.client.model.ReportIndicatorFilter;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ReportByChannelRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T19:24:57.307Z")
public class ReportByChannelRequest {
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

  @SerializedName("pageSize")
  private PageSize pageSize = null;

  @SerializedName("pageNumber")
  private PageNumber pageNumber = null;

  public ReportByChannelRequest channelId(BeezUPCommonChannelId channelId) {
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

  public ReportByChannelRequest beginPeriodUtcDate(DateTime beginPeriodUtcDate) {
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

  public ReportByChannelRequest endPeriodUtcDate(DateTime endPeriodUtcDate) {
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

  public ReportByChannelRequest categoryFilter(ReportCategoryFilter categoryFilter) {
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

  public ReportByChannelRequest indicatorFilters(List<ReportIndicatorFilter> indicatorFilters) {
    this.indicatorFilters = indicatorFilters;
    return this;
  }

  public ReportByChannelRequest addIndicatorFiltersItem(ReportIndicatorFilter indicatorFiltersItem) {
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

  public ReportByChannelRequest advancedFilters(ReportAdvancedFilters advancedFilters) {
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

  public ReportByChannelRequest pageSize(PageSize pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageSize getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSize pageSize) {
    this.pageSize = pageSize;
  }

  public ReportByChannelRequest pageNumber(PageNumber pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageNumber getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(PageNumber pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByChannelRequest reportByChannelRequest = (ReportByChannelRequest) o;
    return Objects.equals(this.channelId, reportByChannelRequest.channelId) &&
        Objects.equals(this.beginPeriodUtcDate, reportByChannelRequest.beginPeriodUtcDate) &&
        Objects.equals(this.endPeriodUtcDate, reportByChannelRequest.endPeriodUtcDate) &&
        Objects.equals(this.categoryFilter, reportByChannelRequest.categoryFilter) &&
        Objects.equals(this.indicatorFilters, reportByChannelRequest.indicatorFilters) &&
        Objects.equals(this.advancedFilters, reportByChannelRequest.advancedFilters) &&
        Objects.equals(this.pageSize, reportByChannelRequest.pageSize) &&
        Objects.equals(this.pageNumber, reportByChannelRequest.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, beginPeriodUtcDate, endPeriodUtcDate, categoryFilter, indicatorFilters, advancedFilters, pageSize, pageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByChannelRequest {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    beginPeriodUtcDate: ").append(toIndentedString(beginPeriodUtcDate)).append("\n");
    sb.append("    endPeriodUtcDate: ").append(toIndentedString(endPeriodUtcDate)).append("\n");
    sb.append("    categoryFilter: ").append(toIndentedString(categoryFilter)).append("\n");
    sb.append("    indicatorFilters: ").append(toIndentedString(indicatorFilters)).append("\n");
    sb.append("    advancedFilters: ").append(toIndentedString(advancedFilters)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

