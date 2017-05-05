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
import io.swagger.client.model.BeezUPCommonCatalogColumnId;
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.PageNumber;
import io.swagger.client.model.PageSize;
import io.swagger.client.model.PaginationRequestParameters;
import io.swagger.client.model.ProductFilters;
import io.swagger.client.model.ProductStateFilter;
import io.swagger.client.model.ReportAdvancedFilters;
import io.swagger.client.model.ReportCategoryFilter;
import io.swagger.client.model.ReportFilterCommonParameters;
import io.swagger.client.model.ReportIndicatorFilter;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ReportByProductRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:50:41.747Z")
public class ReportByProductRequest {
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

  @SerializedName("productColumnsToDisplay")
  private List<BeezUPCommonCatalogColumnId> productColumnsToDisplay = new ArrayList<BeezUPCommonCatalogColumnId>();

  @SerializedName("productState")
  private ProductStateFilter productState = null;

  @SerializedName("productFilters")
  private ProductFilters productFilters = null;

  public ReportByProductRequest channelId(BeezUPCommonChannelId channelId) {
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

  public ReportByProductRequest beginPeriodUtcDate(DateTime beginPeriodUtcDate) {
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

  public ReportByProductRequest endPeriodUtcDate(DateTime endPeriodUtcDate) {
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

  public ReportByProductRequest categoryFilter(ReportCategoryFilter categoryFilter) {
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

  public ReportByProductRequest indicatorFilters(List<ReportIndicatorFilter> indicatorFilters) {
    this.indicatorFilters = indicatorFilters;
    return this;
  }

  public ReportByProductRequest addIndicatorFiltersItem(ReportIndicatorFilter indicatorFiltersItem) {
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

  public ReportByProductRequest advancedFilters(ReportAdvancedFilters advancedFilters) {
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

  public ReportByProductRequest pageSize(PageSize pageSize) {
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

  public ReportByProductRequest pageNumber(PageNumber pageNumber) {
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

  public ReportByProductRequest productColumnsToDisplay(List<BeezUPCommonCatalogColumnId> productColumnsToDisplay) {
    this.productColumnsToDisplay = productColumnsToDisplay;
    return this;
  }

  public ReportByProductRequest addProductColumnsToDisplayItem(BeezUPCommonCatalogColumnId productColumnsToDisplayItem) {
    this.productColumnsToDisplay.add(productColumnsToDisplayItem);
    return this;
  }

   /**
   * Get productColumnsToDisplay
   * @return productColumnsToDisplay
  **/
  @ApiModelProperty(example = "[&quot;4b460e31-3d1f-4117-922d-b159a64ec1d2&quot;]", value = "")
  public List<BeezUPCommonCatalogColumnId> getProductColumnsToDisplay() {
    return productColumnsToDisplay;
  }

  public void setProductColumnsToDisplay(List<BeezUPCommonCatalogColumnId> productColumnsToDisplay) {
    this.productColumnsToDisplay = productColumnsToDisplay;
  }

  public ReportByProductRequest productState(ProductStateFilter productState) {
    this.productState = productState;
    return this;
  }

   /**
   * Get productState
   * @return productState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProductStateFilter getProductState() {
    return productState;
  }

  public void setProductState(ProductStateFilter productState) {
    this.productState = productState;
  }

  public ReportByProductRequest productFilters(ProductFilters productFilters) {
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
    ReportByProductRequest reportByProductRequest = (ReportByProductRequest) o;
    return Objects.equals(this.channelId, reportByProductRequest.channelId) &&
        Objects.equals(this.beginPeriodUtcDate, reportByProductRequest.beginPeriodUtcDate) &&
        Objects.equals(this.endPeriodUtcDate, reportByProductRequest.endPeriodUtcDate) &&
        Objects.equals(this.categoryFilter, reportByProductRequest.categoryFilter) &&
        Objects.equals(this.indicatorFilters, reportByProductRequest.indicatorFilters) &&
        Objects.equals(this.advancedFilters, reportByProductRequest.advancedFilters) &&
        Objects.equals(this.pageSize, reportByProductRequest.pageSize) &&
        Objects.equals(this.pageNumber, reportByProductRequest.pageNumber) &&
        Objects.equals(this.productColumnsToDisplay, reportByProductRequest.productColumnsToDisplay) &&
        Objects.equals(this.productState, reportByProductRequest.productState) &&
        Objects.equals(this.productFilters, reportByProductRequest.productFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, beginPeriodUtcDate, endPeriodUtcDate, categoryFilter, indicatorFilters, advancedFilters, pageSize, pageNumber, productColumnsToDisplay, productState, productFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByProductRequest {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    beginPeriodUtcDate: ").append(toIndentedString(beginPeriodUtcDate)).append("\n");
    sb.append("    endPeriodUtcDate: ").append(toIndentedString(endPeriodUtcDate)).append("\n");
    sb.append("    categoryFilter: ").append(toIndentedString(categoryFilter)).append("\n");
    sb.append("    indicatorFilters: ").append(toIndentedString(indicatorFilters)).append("\n");
    sb.append("    advancedFilters: ").append(toIndentedString(advancedFilters)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    productColumnsToDisplay: ").append(toIndentedString(productColumnsToDisplay)).append("\n");
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

