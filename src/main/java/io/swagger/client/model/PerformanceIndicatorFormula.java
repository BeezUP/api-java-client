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
import io.swagger.client.model.PerformanceIndicatorFormulaOperatorName;
import io.swagger.client.model.PerformanceIndicatorFormulaParameterType;

/**
 * The KPI formula
 */
@ApiModel(description = "The KPI formula")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:44:01.940Z")
public class PerformanceIndicatorFormula {
  @SerializedName("firstParameter")
  private PerformanceIndicatorFormulaParameterType firstParameter = null;

  @SerializedName("operatorName")
  private PerformanceIndicatorFormulaOperatorName operatorName = null;

  @SerializedName("secondParameter")
  private PerformanceIndicatorFormulaParameterType secondParameter = null;

  @SerializedName("thirdParameter")
  private Integer thirdParameter = null;

  public PerformanceIndicatorFormula firstParameter(PerformanceIndicatorFormulaParameterType firstParameter) {
    this.firstParameter = firstParameter;
    return this;
  }

   /**
   * Get firstParameter
   * @return firstParameter
  **/
  @ApiModelProperty(example = "null", value = "")
  public PerformanceIndicatorFormulaParameterType getFirstParameter() {
    return firstParameter;
  }

  public void setFirstParameter(PerformanceIndicatorFormulaParameterType firstParameter) {
    this.firstParameter = firstParameter;
  }

  public PerformanceIndicatorFormula operatorName(PerformanceIndicatorFormulaOperatorName operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @ApiModelProperty(example = "null", value = "")
  public PerformanceIndicatorFormulaOperatorName getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(PerformanceIndicatorFormulaOperatorName operatorName) {
    this.operatorName = operatorName;
  }

  public PerformanceIndicatorFormula secondParameter(PerformanceIndicatorFormulaParameterType secondParameter) {
    this.secondParameter = secondParameter;
    return this;
  }

   /**
   * Get secondParameter
   * @return secondParameter
  **/
  @ApiModelProperty(example = "null", value = "")
  public PerformanceIndicatorFormulaParameterType getSecondParameter() {
    return secondParameter;
  }

  public void setSecondParameter(PerformanceIndicatorFormulaParameterType secondParameter) {
    this.secondParameter = secondParameter;
  }

  public PerformanceIndicatorFormula thirdParameter(Integer thirdParameter) {
    this.thirdParameter = thirdParameter;
    return this;
  }

   /**
   * Indicate the value of the third parameter of your formula
   * @return thirdParameter
  **/
  @ApiModelProperty(example = "100", value = "Indicate the value of the third parameter of your formula")
  public Integer getThirdParameter() {
    return thirdParameter;
  }

  public void setThirdParameter(Integer thirdParameter) {
    this.thirdParameter = thirdParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceIndicatorFormula performanceIndicatorFormula = (PerformanceIndicatorFormula) o;
    return Objects.equals(this.firstParameter, performanceIndicatorFormula.firstParameter) &&
        Objects.equals(this.operatorName, performanceIndicatorFormula.operatorName) &&
        Objects.equals(this.secondParameter, performanceIndicatorFormula.secondParameter) &&
        Objects.equals(this.thirdParameter, performanceIndicatorFormula.thirdParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstParameter, operatorName, secondParameter, thirdParameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceIndicatorFormula {\n");
    
    sb.append("    firstParameter: ").append(toIndentedString(firstParameter)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    secondParameter: ").append(toIndentedString(secondParameter)).append("\n");
    sb.append("    thirdParameter: ").append(toIndentedString(thirdParameter)).append("\n");
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

