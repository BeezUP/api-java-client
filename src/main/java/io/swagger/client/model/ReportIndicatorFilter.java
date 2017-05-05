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
import io.swagger.client.model.PerformanceIndicatorType;
import io.swagger.client.model.ReportIndicatorFilterOperatorName;
import java.math.BigDecimal;

/**
 * ReportIndicatorFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class ReportIndicatorFilter {
  @SerializedName("indicator")
  private PerformanceIndicatorType indicator = null;

  @SerializedName("operatorName")
  private ReportIndicatorFilterOperatorName operatorName = null;

  @SerializedName("value")
  private BigDecimal value = null;

  public ReportIndicatorFilter indicator(PerformanceIndicatorType indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * Get indicator
   * @return indicator
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PerformanceIndicatorType getIndicator() {
    return indicator;
  }

  public void setIndicator(PerformanceIndicatorType indicator) {
    this.indicator = indicator;
  }

  public ReportIndicatorFilter operatorName(ReportIndicatorFilterOperatorName operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportIndicatorFilterOperatorName getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(ReportIndicatorFilterOperatorName operatorName) {
    this.operatorName = operatorName;
  }

  public ReportIndicatorFilter value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Indicates the filter value to apply on this indicator
   * @return value
  **/
  @ApiModelProperty(example = "10.42", required = true, value = "Indicates the filter value to apply on this indicator")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportIndicatorFilter reportIndicatorFilter = (ReportIndicatorFilter) o;
    return Objects.equals(this.indicator, reportIndicatorFilter.indicator) &&
        Objects.equals(this.operatorName, reportIndicatorFilter.operatorName) &&
        Objects.equals(this.value, reportIndicatorFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, operatorName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportIndicatorFilter {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

