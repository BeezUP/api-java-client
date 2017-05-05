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
import io.swagger.client.model.OptimisationActionName;
import org.joda.time.DateTime;

/**
 * CreateRuleRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class CreateRuleRequest {
  @SerializedName("optimisationActionName")
  private OptimisationActionName optimisationActionName = null;

  @SerializedName("ruleName")
  private String ruleName = null;

  @SerializedName("reportFilterId")
  private String reportFilterId = null;

  @SerializedName("startUtcDate")
  private DateTime startUtcDate = null;

  @SerializedName("endUtcDate")
  private DateTime endUtcDate = null;

  public CreateRuleRequest optimisationActionName(OptimisationActionName optimisationActionName) {
    this.optimisationActionName = optimisationActionName;
    return this;
  }

   /**
   * Get optimisationActionName
   * @return optimisationActionName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OptimisationActionName getOptimisationActionName() {
    return optimisationActionName;
  }

  public void setOptimisationActionName(OptimisationActionName optimisationActionName) {
    this.optimisationActionName = optimisationActionName;
  }

  public CreateRuleRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule
   * @return ruleName
  **/
  @ApiModelProperty(example = "My rule", required = true, value = "The name of the rule")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public CreateRuleRequest reportFilterId(String reportFilterId) {
    this.reportFilterId = reportFilterId;
    return this;
  }

   /**
   * The report filter to use for the rule
   * @return reportFilterId
  **/
  @ApiModelProperty(example = "fb19c53c-2f63-4262-9d94-2d7faa500acd", required = true, value = "The report filter to use for the rule")
  public String getReportFilterId() {
    return reportFilterId;
  }

  public void setReportFilterId(String reportFilterId) {
    this.reportFilterId = reportFilterId;
  }

  public CreateRuleRequest startUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
    return this;
  }

   /**
   * The start validity utc date of the rule
   * @return startUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The start validity utc date of the rule")
  public DateTime getStartUtcDate() {
    return startUtcDate;
  }

  public void setStartUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
  }

  public CreateRuleRequest endUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
    return this;
  }

   /**
   * The end validity utc date of the rule
   * @return endUtcDate
  **/
  @ApiModelProperty(example = "2017-09-30T10:42:40.001Z", value = "The end validity utc date of the rule")
  public DateTime getEndUtcDate() {
    return endUtcDate;
  }

  public void setEndUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRuleRequest createRuleRequest = (CreateRuleRequest) o;
    return Objects.equals(this.optimisationActionName, createRuleRequest.optimisationActionName) &&
        Objects.equals(this.ruleName, createRuleRequest.ruleName) &&
        Objects.equals(this.reportFilterId, createRuleRequest.reportFilterId) &&
        Objects.equals(this.startUtcDate, createRuleRequest.startUtcDate) &&
        Objects.equals(this.endUtcDate, createRuleRequest.endUtcDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimisationActionName, ruleName, reportFilterId, startUtcDate, endUtcDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRuleRequest {\n");
    
    sb.append("    optimisationActionName: ").append(toIndentedString(optimisationActionName)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    reportFilterId: ").append(toIndentedString(reportFilterId)).append("\n");
    sb.append("    startUtcDate: ").append(toIndentedString(startUtcDate)).append("\n");
    sb.append("    endUtcDate: ").append(toIndentedString(endUtcDate)).append("\n");
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
