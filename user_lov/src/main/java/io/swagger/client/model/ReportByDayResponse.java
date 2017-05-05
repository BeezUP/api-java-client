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
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.GlobalPerformanceIndicatorByChannel;
import io.swagger.client.model.ReportByDay;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByDayResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:12:33.618Z")
public class ReportByDayResponse {
  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("globalPerformanceIndicators")
  private List<GlobalPerformanceIndicatorByChannel> globalPerformanceIndicators = new ArrayList<GlobalPerformanceIndicatorByChannel>();

  @SerializedName("days")
  private List<ReportByDay> days = new ArrayList<ReportByDay>();

  public ReportByDayResponse currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportByDayResponse globalPerformanceIndicators(List<GlobalPerformanceIndicatorByChannel> globalPerformanceIndicators) {
    this.globalPerformanceIndicators = globalPerformanceIndicators;
    return this;
  }

  public ReportByDayResponse addGlobalPerformanceIndicatorsItem(GlobalPerformanceIndicatorByChannel globalPerformanceIndicatorsItem) {
    this.globalPerformanceIndicators.add(globalPerformanceIndicatorsItem);
    return this;
  }

   /**
   * Get globalPerformanceIndicators
   * @return globalPerformanceIndicators
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<GlobalPerformanceIndicatorByChannel> getGlobalPerformanceIndicators() {
    return globalPerformanceIndicators;
  }

  public void setGlobalPerformanceIndicators(List<GlobalPerformanceIndicatorByChannel> globalPerformanceIndicators) {
    this.globalPerformanceIndicators = globalPerformanceIndicators;
  }

  public ReportByDayResponse days(List<ReportByDay> days) {
    this.days = days;
    return this;
  }

  public ReportByDayResponse addDaysItem(ReportByDay daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ReportByDay> getDays() {
    return days;
  }

  public void setDays(List<ReportByDay> days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByDayResponse reportByDayResponse = (ReportByDayResponse) o;
    return Objects.equals(this.currencyCode, reportByDayResponse.currencyCode) &&
        Objects.equals(this.globalPerformanceIndicators, reportByDayResponse.globalPerformanceIndicators) &&
        Objects.equals(this.days, reportByDayResponse.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, globalPerformanceIndicators, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByDayResponse {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    globalPerformanceIndicators: ").append(toIndentedString(globalPerformanceIndicators)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
