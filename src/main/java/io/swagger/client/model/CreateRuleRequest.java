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
import org.joda.time.DateTime;

/**
 * CreateRuleRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T11:46:19.000Z")
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

