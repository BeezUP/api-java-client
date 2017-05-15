/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
import io.swagger.client.model.RuleExecutionReportingErrorType;
import io.swagger.client.model.RuleExecutionReportingExecutionSource;
import io.swagger.client.model.RuleExecutionReportingLinks;
import io.swagger.client.model.RuleExecutionReportingStatus;
import org.joda.time.DateTime;

/**
 * RuleExecutionReporting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T11:46:19.000Z")
public class RuleExecutionReporting {
  @SerializedName("ruleId")
  private String ruleId = null;

  @SerializedName("ruleName")
  private String ruleName = null;

  @SerializedName("startedUtcDate")
  private DateTime startedUtcDate = null;

  @SerializedName("completedUtcDate")
  private DateTime completedUtcDate = null;

  @SerializedName("status")
  private RuleExecutionReportingStatus status = null;

  @SerializedName("errorType")
  private RuleExecutionReportingErrorType errorType = null;

  @SerializedName("affectedProductCount")
  private Integer affectedProductCount = null;

  @SerializedName("activeAffectedProductCount")
  private Integer activeAffectedProductCount = null;

  @SerializedName("affectedChannelCount")
  private Integer affectedChannelCount = null;

  @SerializedName("optimisationActionName")
  private OptimisationActionName optimisationActionName = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("executionSource")
  private RuleExecutionReportingExecutionSource executionSource = null;

  @SerializedName("reportUrl")
  private String reportUrl = null;

  @SerializedName("links")
  private RuleExecutionReportingLinks links = null;

  public RuleExecutionReporting ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The rule identifier
   * @return ruleId
  **/
  @ApiModelProperty(example = "fd9a23a1-569b-40af-af91-f7275a57bf89", required = true, value = "The rule identifier")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public RuleExecutionReporting ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule
   * @return ruleName
  **/
  @ApiModelProperty(example = "toto", required = true, value = "The name of the rule")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public RuleExecutionReporting startedUtcDate(DateTime startedUtcDate) {
    this.startedUtcDate = startedUtcDate;
    return this;
  }

   /**
   * The start utc date of the execution of the rule
   * @return startedUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The start utc date of the execution of the rule")
  public DateTime getStartedUtcDate() {
    return startedUtcDate;
  }

  public void setStartedUtcDate(DateTime startedUtcDate) {
    this.startedUtcDate = startedUtcDate;
  }

  public RuleExecutionReporting completedUtcDate(DateTime completedUtcDate) {
    this.completedUtcDate = completedUtcDate;
    return this;
  }

   /**
   * The completed utc date of the execution of the rule
   * @return completedUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The completed utc date of the execution of the rule")
  public DateTime getCompletedUtcDate() {
    return completedUtcDate;
  }

  public void setCompletedUtcDate(DateTime completedUtcDate) {
    this.completedUtcDate = completedUtcDate;
  }

  public RuleExecutionReporting status(RuleExecutionReportingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public RuleExecutionReportingStatus getStatus() {
    return status;
  }

  public void setStatus(RuleExecutionReportingStatus status) {
    this.status = status;
  }

  public RuleExecutionReporting errorType(RuleExecutionReportingErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuleExecutionReportingErrorType getErrorType() {
    return errorType;
  }

  public void setErrorType(RuleExecutionReportingErrorType errorType) {
    this.errorType = errorType;
  }

  public RuleExecutionReporting affectedProductCount(Integer affectedProductCount) {
    this.affectedProductCount = affectedProductCount;
    return this;
  }

   /**
   * The count of affected products, active or not
   * @return affectedProductCount
  **/
  @ApiModelProperty(example = "1", value = "The count of affected products, active or not")
  public Integer getAffectedProductCount() {
    return affectedProductCount;
  }

  public void setAffectedProductCount(Integer affectedProductCount) {
    this.affectedProductCount = affectedProductCount;
  }

  public RuleExecutionReporting activeAffectedProductCount(Integer activeAffectedProductCount) {
    this.activeAffectedProductCount = activeAffectedProductCount;
    return this;
  }

   /**
   * The count of affected active products
   * @return activeAffectedProductCount
  **/
  @ApiModelProperty(example = "1", value = "The count of affected active products")
  public Integer getActiveAffectedProductCount() {
    return activeAffectedProductCount;
  }

  public void setActiveAffectedProductCount(Integer activeAffectedProductCount) {
    this.activeAffectedProductCount = activeAffectedProductCount;
  }

  public RuleExecutionReporting affectedChannelCount(Integer affectedChannelCount) {
    this.affectedChannelCount = affectedChannelCount;
    return this;
  }

   /**
   * The count of affected Channels across all products
   * @return affectedChannelCount
  **/
  @ApiModelProperty(example = "1", value = "The count of affected Channels across all products")
  public Integer getAffectedChannelCount() {
    return affectedChannelCount;
  }

  public void setAffectedChannelCount(Integer affectedChannelCount) {
    this.affectedChannelCount = affectedChannelCount;
  }

  public RuleExecutionReporting optimisationActionName(OptimisationActionName optimisationActionName) {
    this.optimisationActionName = optimisationActionName;
    return this;
  }

   /**
   * Get optimisationActionName
   * @return optimisationActionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public OptimisationActionName getOptimisationActionName() {
    return optimisationActionName;
  }

  public void setOptimisationActionName(OptimisationActionName optimisationActionName) {
    this.optimisationActionName = optimisationActionName;
  }

  public RuleExecutionReporting userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The userId that executed the rule if any
   * @return userId
  **/
  @ApiModelProperty(example = "e8289350-69f8-45a6-b0ca-b641c83e0422", value = "The userId that executed the rule if any")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public RuleExecutionReporting executionSource(RuleExecutionReportingExecutionSource executionSource) {
    this.executionSource = executionSource;
    return this;
  }

   /**
   * Get executionSource
   * @return executionSource
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public RuleExecutionReportingExecutionSource getExecutionSource() {
    return executionSource;
  }

  public void setExecutionSource(RuleExecutionReportingExecutionSource executionSource) {
    this.executionSource = executionSource;
  }

  public RuleExecutionReporting reportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
    return this;
  }

   /**
   * The url for the excel report for this execution
   * @return reportUrl
  **/
  @ApiModelProperty(example = "http://www.google.com", value = "The url for the excel report for this execution")
  public String getReportUrl() {
    return reportUrl;
  }

  public void setReportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
  }

  public RuleExecutionReporting links(RuleExecutionReportingLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuleExecutionReportingLinks getLinks() {
    return links;
  }

  public void setLinks(RuleExecutionReportingLinks links) {
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
    RuleExecutionReporting ruleExecutionReporting = (RuleExecutionReporting) o;
    return Objects.equals(this.ruleId, ruleExecutionReporting.ruleId) &&
        Objects.equals(this.ruleName, ruleExecutionReporting.ruleName) &&
        Objects.equals(this.startedUtcDate, ruleExecutionReporting.startedUtcDate) &&
        Objects.equals(this.completedUtcDate, ruleExecutionReporting.completedUtcDate) &&
        Objects.equals(this.status, ruleExecutionReporting.status) &&
        Objects.equals(this.errorType, ruleExecutionReporting.errorType) &&
        Objects.equals(this.affectedProductCount, ruleExecutionReporting.affectedProductCount) &&
        Objects.equals(this.activeAffectedProductCount, ruleExecutionReporting.activeAffectedProductCount) &&
        Objects.equals(this.affectedChannelCount, ruleExecutionReporting.affectedChannelCount) &&
        Objects.equals(this.optimisationActionName, ruleExecutionReporting.optimisationActionName) &&
        Objects.equals(this.userId, ruleExecutionReporting.userId) &&
        Objects.equals(this.executionSource, ruleExecutionReporting.executionSource) &&
        Objects.equals(this.reportUrl, ruleExecutionReporting.reportUrl) &&
        Objects.equals(this.links, ruleExecutionReporting.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, startedUtcDate, completedUtcDate, status, errorType, affectedProductCount, activeAffectedProductCount, affectedChannelCount, optimisationActionName, userId, executionSource, reportUrl, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleExecutionReporting {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    startedUtcDate: ").append(toIndentedString(startedUtcDate)).append("\n");
    sb.append("    completedUtcDate: ").append(toIndentedString(completedUtcDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    affectedProductCount: ").append(toIndentedString(affectedProductCount)).append("\n");
    sb.append("    activeAffectedProductCount: ").append(toIndentedString(activeAffectedProductCount)).append("\n");
    sb.append("    affectedChannelCount: ").append(toIndentedString(affectedChannelCount)).append("\n");
    sb.append("    optimisationActionName: ").append(toIndentedString(optimisationActionName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    executionSource: ").append(toIndentedString(executionSource)).append("\n");
    sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
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

