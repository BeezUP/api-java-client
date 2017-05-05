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
import io.swagger.client.model.LinksCreateRuleLink;
import io.swagger.client.model.LinksGetRulesExecutionsLink;
import io.swagger.client.model.LinksGetRulesLink;
import io.swagger.client.model.LinksRunRulesLink;

/**
 * Links to know if the user can create a rule or run all rules
 */
@ApiModel(description = "Links to know if the user can create a rule or run all rules")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:51:26.209Z")
public class RuleListLinks {
  @SerializedName("self")
  private LinksGetRulesLink self = null;

  @SerializedName("create")
  private LinksCreateRuleLink create = null;

  @SerializedName("history")
  private LinksGetRulesExecutionsLink history = null;

  @SerializedName("run")
  private LinksRunRulesLink run = null;

  public RuleListLinks self(LinksGetRulesLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetRulesLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetRulesLink self) {
    this.self = self;
  }

  public RuleListLinks create(LinksCreateRuleLink create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksCreateRuleLink getCreate() {
    return create;
  }

  public void setCreate(LinksCreateRuleLink create) {
    this.create = create;
  }

  public RuleListLinks history(LinksGetRulesExecutionsLink history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetRulesExecutionsLink getHistory() {
    return history;
  }

  public void setHistory(LinksGetRulesExecutionsLink history) {
    this.history = history;
  }

  public RuleListLinks run(LinksRunRulesLink run) {
    this.run = run;
    return this;
  }

   /**
   * Get run
   * @return run
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksRunRulesLink getRun() {
    return run;
  }

  public void setRun(LinksRunRulesLink run) {
    this.run = run;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleListLinks ruleListLinks = (RuleListLinks) o;
    return Objects.equals(this.self, ruleListLinks.self) &&
        Objects.equals(this.create, ruleListLinks.create) &&
        Objects.equals(this.history, ruleListLinks.history) &&
        Objects.equals(this.run, ruleListLinks.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, create, history, run);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleListLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
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

