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
import io.swagger.client.model.Rule;
import io.swagger.client.model.RuleListLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * RuleList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class RuleList {
  @SerializedName("rules")
  private List<Rule> rules = new ArrayList<Rule>();

  @SerializedName("links")
  private RuleListLinks links = null;

  public RuleList rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public RuleList addRulesItem(Rule rulesItem) {
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

  public RuleList links(RuleListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public RuleListLinks getLinks() {
    return links;
  }

  public void setLinks(RuleListLinks links) {
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
    RuleList ruleList = (RuleList) o;
    return Objects.equals(this.rules, ruleList.rules) &&
        Objects.equals(this.links, ruleList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleList {\n");
    
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

