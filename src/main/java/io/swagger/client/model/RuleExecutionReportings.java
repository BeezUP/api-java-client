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
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.RuleExecutionReporting;
import java.util.ArrayList;
import java.util.List;

/**
 * RuleExecutionReportings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:51:26.209Z")
public class RuleExecutionReportings {
  @SerializedName("executions")
  private List<RuleExecutionReporting> executions = new ArrayList<RuleExecutionReporting>();

  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  public RuleExecutionReportings executions(List<RuleExecutionReporting> executions) {
    this.executions = executions;
    return this;
  }

  public RuleExecutionReportings addExecutionsItem(RuleExecutionReporting executionsItem) {
    this.executions.add(executionsItem);
    return this;
  }

   /**
   * The rules executions history
   * @return executions
  **/
  @ApiModelProperty(example = "null", value = "The rules executions history")
  public List<RuleExecutionReporting> getExecutions() {
    return executions;
  }

  public void setExecutions(List<RuleExecutionReporting> executions) {
    this.executions = executions;
  }

  public RuleExecutionReportings paginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
    return this;
  }

   /**
   * Get paginationResult
   * @return paginationResult
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonPaginationResult getPaginationResult() {
    return paginationResult;
  }

  public void setPaginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleExecutionReportings ruleExecutionReportings = (RuleExecutionReportings) o;
    return Objects.equals(this.executions, ruleExecutionReportings.executions) &&
        Objects.equals(this.paginationResult, ruleExecutionReportings.paginationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executions, paginationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleExecutionReportings {\n");
    
    sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
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

