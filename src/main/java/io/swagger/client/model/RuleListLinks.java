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
import io.swagger.client.model.DefinitionslinksCreateRuleLink;
import io.swagger.client.model.DefinitionslinksGetRulesExecutionsLink;
import io.swagger.client.model.DefinitionslinksGetRulesLink;
import io.swagger.client.model.DefinitionslinksRunRulesLink;

/**
 * Links to know if the user can create a rule or run all rules
 */
@ApiModel(description = "Links to know if the user can create a rule or run all rules")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class RuleListLinks {
  @SerializedName("self")
  private DefinitionslinksGetRulesLink self = null;

  @SerializedName("create")
  private DefinitionslinksCreateRuleLink create = null;

  @SerializedName("history")
  private DefinitionslinksGetRulesExecutionsLink history = null;

  @SerializedName("run")
  private DefinitionslinksRunRulesLink run = null;

  public RuleListLinks self(DefinitionslinksGetRulesLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefinitionslinksGetRulesLink getSelf() {
    return self;
  }

  public void setSelf(DefinitionslinksGetRulesLink self) {
    this.self = self;
  }

  public RuleListLinks create(DefinitionslinksCreateRuleLink create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefinitionslinksCreateRuleLink getCreate() {
    return create;
  }

  public void setCreate(DefinitionslinksCreateRuleLink create) {
    this.create = create;
  }

  public RuleListLinks history(DefinitionslinksGetRulesExecutionsLink history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefinitionslinksGetRulesExecutionsLink getHistory() {
    return history;
  }

  public void setHistory(DefinitionslinksGetRulesExecutionsLink history) {
    this.history = history;
  }

  public RuleListLinks run(DefinitionslinksRunRulesLink run) {
    this.run = run;
    return this;
  }

   /**
   * Get run
   * @return run
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefinitionslinksRunRulesLink getRun() {
    return run;
  }

  public void setRun(DefinitionslinksRunRulesLink run) {
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

