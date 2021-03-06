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
import io.swagger.client.model.LinksGetRuleLink;

/**
 * Links to retrieve/action on this rule execution
 */
@ApiModel(description = "Links to retrieve/action on this rule execution")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class RuleExecutionReportingLinks {
  @SerializedName("rule")
  private LinksGetRuleLink rule = null;

  public RuleExecutionReportingLinks rule(LinksGetRuleLink rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetRuleLink getRule() {
    return rule;
  }

  public void setRule(LinksGetRuleLink rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleExecutionReportingLinks ruleExecutionReportingLinks = (RuleExecutionReportingLinks) o;
    return Objects.equals(this.rule, ruleExecutionReportingLinks.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleExecutionReportingLinks {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

