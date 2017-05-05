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
import io.swagger.client.model.BeezUPCommonCatalogCategoryId;
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonProductId;
import io.swagger.client.model.ReportAdvancedFilters;
import org.joda.time.DateTime;

/**
 * ReportByDayRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class ReportByDayRequest {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("productId")
  private BeezUPCommonProductId productId = null;

  @SerializedName("catalogCategoryId")
  private BeezUPCommonCatalogCategoryId catalogCategoryId = null;

  @SerializedName("beginPeriodUtcDate")
  private DateTime beginPeriodUtcDate = null;

  @SerializedName("endPeriodUtcDate")
  private DateTime endPeriodUtcDate = null;

  @SerializedName("advancedFilters")
  private ReportAdvancedFilters advancedFilters = null;

  public ReportByDayRequest channelId(BeezUPCommonChannelId channelId) {
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

  public ReportByDayRequest productId(BeezUPCommonProductId productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonProductId getProductId() {
    return productId;
  }

  public void setProductId(BeezUPCommonProductId productId) {
    this.productId = productId;
  }

  public ReportByDayRequest catalogCategoryId(BeezUPCommonCatalogCategoryId catalogCategoryId) {
    this.catalogCategoryId = catalogCategoryId;
    return this;
  }

   /**
   * Get catalogCategoryId
   * @return catalogCategoryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCatalogCategoryId getCatalogCategoryId() {
    return catalogCategoryId;
  }

  public void setCatalogCategoryId(BeezUPCommonCatalogCategoryId catalogCategoryId) {
    this.catalogCategoryId = catalogCategoryId;
  }

  public ReportByDayRequest beginPeriodUtcDate(DateTime beginPeriodUtcDate) {
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

  public ReportByDayRequest endPeriodUtcDate(DateTime endPeriodUtcDate) {
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

  public ReportByDayRequest advancedFilters(ReportAdvancedFilters advancedFilters) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByDayRequest reportByDayRequest = (ReportByDayRequest) o;
    return Objects.equals(this.channelId, reportByDayRequest.channelId) &&
        Objects.equals(this.productId, reportByDayRequest.productId) &&
        Objects.equals(this.catalogCategoryId, reportByDayRequest.catalogCategoryId) &&
        Objects.equals(this.beginPeriodUtcDate, reportByDayRequest.beginPeriodUtcDate) &&
        Objects.equals(this.endPeriodUtcDate, reportByDayRequest.endPeriodUtcDate) &&
        Objects.equals(this.advancedFilters, reportByDayRequest.advancedFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, productId, catalogCategoryId, beginPeriodUtcDate, endPeriodUtcDate, advancedFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByDayRequest {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    catalogCategoryId: ").append(toIndentedString(catalogCategoryId)).append("\n");
    sb.append("    beginPeriodUtcDate: ").append(toIndentedString(beginPeriodUtcDate)).append("\n");
    sb.append("    endPeriodUtcDate: ").append(toIndentedString(endPeriodUtcDate)).append("\n");
    sb.append("    advancedFilters: ").append(toIndentedString(advancedFilters)).append("\n");
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

