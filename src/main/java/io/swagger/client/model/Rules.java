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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.Rule;
import java.util.ArrayList;
import java.util.List;

/**
 * Rules
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T13:44:04.202Z")
public class Rules {
  @SerializedName("rules")
  private List<Rule> rules = new ArrayList<Rule>();

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  public Rules rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public Rules addRulesItem(Rule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rule list
   * @return rules
  **/
  @ApiModelProperty(example = "null", required = true, value = "Rule list")
  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  public Rules links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public Rules addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Links to know if the user can create a rule or run all rules
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/rules&quot;,&quot;rel&quot;:&quot;self&quot;,&quot;operationId&quot;:&quot;GetRules&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;10af9486-e28e-47ab-b045-e13e4acd55c3&quot;}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/rules&quot;,&quot;rel&quot;:&quot;CreateRule&quot;,&quot;operationId&quot;:&quot;CreateRule&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;10af9486-e28e-47ab-b045-e13e4acd55c3&quot;}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/rules/executions&quot;,&quot;rel&quot;:&quot;GetRulesExecutions&quot;,&quot;operationId&quot;:&quot;GetRulesExecutions&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;10af9486-e28e-47ab-b045-e13e4acd55c3&quot;}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/rules/run&quot;,&quot;rel&quot;:&quot;RunRules&quot;,&quot;operationId&quot;:&quot;RunRules&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;10af9486-e28e-47ab-b045-e13e4acd55c3&quot;}]}]", required = true, value = "Links to know if the user can create a rule or run all rules")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
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
    Rules rules = (Rules) o;
    return Objects.equals(this.rules, rules.rules) &&
        Objects.equals(this.links, rules.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rules {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

