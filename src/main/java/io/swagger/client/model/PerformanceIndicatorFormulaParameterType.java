/*
 * Public - Security
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * Indicate on which indicator or value you want to make your formula
 */
public enum PerformanceIndicatorFormulaParameterType {
  
  @SerializedName("Cost")
  COST("Cost"),
  
  @SerializedName("Turnover")
  TURNOVER("Turnover"),
  
  @SerializedName("Margin")
  MARGIN("Margin"),
  
  @SerializedName("OrderCount")
  ORDERCOUNT("OrderCount"),
  
  @SerializedName("ClickCount")
  CLICKCOUNT("ClickCount"),
  
  @SerializedName("TotalSales")
  TOTALSALES("TotalSales"),
  
  @SerializedName("One")
  ONE("One");

  private String value;

  PerformanceIndicatorFormulaParameterType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

