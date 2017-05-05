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
import org.joda.time.DateTime;

/**
 * This update will replace the following values.
 */
@ApiModel(description = "This update will replace the following values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:47:15.399Z")
public class UpdateRuleRequest {
  @SerializedName("ruleName")
  private String ruleName = null;

  @SerializedName("startUtcDate")
  private DateTime startUtcDate = null;

  @SerializedName("endUtcDate")
  private DateTime endUtcDate = null;

  public UpdateRuleRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * The name of the rule
   * @return ruleName
  **/
  @ApiModelProperty(example = "My Rule Renamed", required = true, value = "The name of the rule")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public UpdateRuleRequest startUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
    return this;
  }

   /**
   * Not required. The start validity utc date of the rule.
   * @return startUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "Not required. The start validity utc date of the rule.")
  public DateTime getStartUtcDate() {
    return startUtcDate;
  }

  public void setStartUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
  }

  public UpdateRuleRequest endUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
    return this;
  }

   /**
   * Not required. The end validity utc date of the rule
   * @return endUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "Not required. The end validity utc date of the rule")
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
    UpdateRuleRequest updateRuleRequest = (UpdateRuleRequest) o;
    return Objects.equals(this.ruleName, updateRuleRequest.ruleName) &&
        Objects.equals(this.startUtcDate, updateRuleRequest.startUtcDate) &&
        Objects.equals(this.endUtcDate, updateRuleRequest.endUtcDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleName, startUtcDate, endUtcDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRuleRequest {\n");
    
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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

