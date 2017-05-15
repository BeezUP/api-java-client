/*
 * BeezUP API
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.OptimisationActionName;
import io.swagger.client.model.RuleLastExecutionStatus;
import io.swagger.client.model.RuleLinks;
import org.joda.time.DateTime;

/**
 * Rule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:48:39.678Z")
public class Rule {
  @SerializedName("ruleId")
  private String ruleId = null;

  @SerializedName("ruleName")
  private String ruleName = null;

  @SerializedName("lastExecutionStatus")
  private RuleLastExecutionStatus lastExecutionStatus = null;

  @SerializedName("lastExecutionUtcDate")
  private DateTime lastExecutionUtcDate = null;

  @SerializedName("actionName")
  private OptimisationActionName actionName = null;

  @SerializedName("reportFilterId")
  private String reportFilterId = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("validityStartUtcDate")
  private DateTime validityStartUtcDate = null;

  @SerializedName("validityEndUtcDate")
  private DateTime validityEndUtcDate = null;

  @SerializedName("links")
  private RuleLinks links = null;

  public Rule ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The identifier of the rule
   * @return ruleId
  **/
  @ApiModelProperty(example = "c38006b4-29d0-4b8a-978b-701a0b12d5a8", required = true, value = "The identifier of the rule")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public Rule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule
   * @return ruleName
  **/
  @ApiModelProperty(example = "My Rule", required = true, value = "The name of the rule")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public Rule lastExecutionStatus(RuleLastExecutionStatus lastExecutionStatus) {
    this.lastExecutionStatus = lastExecutionStatus;
    return this;
  }

   /**
   * Get lastExecutionStatus
   * @return lastExecutionStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuleLastExecutionStatus getLastExecutionStatus() {
    return lastExecutionStatus;
  }

  public void setLastExecutionStatus(RuleLastExecutionStatus lastExecutionStatus) {
    this.lastExecutionStatus = lastExecutionStatus;
  }

  public Rule lastExecutionUtcDate(DateTime lastExecutionUtcDate) {
    this.lastExecutionUtcDate = lastExecutionUtcDate;
    return this;
  }

   /**
   * The utc date of the last execution
   * @return lastExecutionUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The utc date of the last execution")
  public DateTime getLastExecutionUtcDate() {
    return lastExecutionUtcDate;
  }

  public void setLastExecutionUtcDate(DateTime lastExecutionUtcDate) {
    this.lastExecutionUtcDate = lastExecutionUtcDate;
  }

  public Rule actionName(OptimisationActionName actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OptimisationActionName getActionName() {
    return actionName;
  }

  public void setActionName(OptimisationActionName actionName) {
    this.actionName = actionName;
  }

  public Rule reportFilterId(String reportFilterId) {
    this.reportFilterId = reportFilterId;
    return this;
  }

   /**
   * Report filter identifier linked to the rule
   * @return reportFilterId
  **/
  @ApiModelProperty(example = "fb19c53c-2f63-4262-9d94-2d7faa500acd", required = true, value = "Report filter identifier linked to the rule")
  public String getReportFilterId() {
    return reportFilterId;
  }

  public void setReportFilterId(String reportFilterId) {
    this.reportFilterId = reportFilterId;
  }

  public Rule position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Rule execution position
   * @return position
  **/
  @ApiModelProperty(example = "1", required = true, value = "Rule execution position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Rule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Is the rule enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Is the rule enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Rule validityStartUtcDate(DateTime validityStartUtcDate) {
    this.validityStartUtcDate = validityStartUtcDate;
    return this;
  }

   /**
   * Rule validity start utc date
   * @return validityStartUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "Rule validity start utc date")
  public DateTime getValidityStartUtcDate() {
    return validityStartUtcDate;
  }

  public void setValidityStartUtcDate(DateTime validityStartUtcDate) {
    this.validityStartUtcDate = validityStartUtcDate;
  }

  public Rule validityEndUtcDate(DateTime validityEndUtcDate) {
    this.validityEndUtcDate = validityEndUtcDate;
    return this;
  }

   /**
   * Rule validity end utc date
   * @return validityEndUtcDate
  **/
  @ApiModelProperty(example = "3016-08-29T09:12:33.001Z", value = "Rule validity end utc date")
  public DateTime getValidityEndUtcDate() {
    return validityEndUtcDate;
  }

  public void setValidityEndUtcDate(DateTime validityEndUtcDate) {
    this.validityEndUtcDate = validityEndUtcDate;
  }

  public Rule links(RuleLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public RuleLinks getLinks() {
    return links;
  }

  public void setLinks(RuleLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.ruleId, rule.ruleId) &&
        Objects.equals(this.ruleName, rule.ruleName) &&
        Objects.equals(this.lastExecutionStatus, rule.lastExecutionStatus) &&
        Objects.equals(this.lastExecutionUtcDate, rule.lastExecutionUtcDate) &&
        Objects.equals(this.actionName, rule.actionName) &&
        Objects.equals(this.reportFilterId, rule.reportFilterId) &&
        Objects.equals(this.position, rule.position) &&
        Objects.equals(this.enabled, rule.enabled) &&
        Objects.equals(this.validityStartUtcDate, rule.validityStartUtcDate) &&
        Objects.equals(this.validityEndUtcDate, rule.validityEndUtcDate) &&
        Objects.equals(this.links, rule.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, lastExecutionStatus, lastExecutionUtcDate, actionName, reportFilterId, position, enabled, validityStartUtcDate, validityEndUtcDate, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    lastExecutionStatus: ").append(toIndentedString(lastExecutionStatus)).append("\n");
    sb.append("    lastExecutionUtcDate: ").append(toIndentedString(lastExecutionUtcDate)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    reportFilterId: ").append(toIndentedString(reportFilterId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    validityStartUtcDate: ").append(toIndentedString(validityStartUtcDate)).append("\n");
    sb.append("    validityEndUtcDate: ").append(toIndentedString(validityEndUtcDate)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

