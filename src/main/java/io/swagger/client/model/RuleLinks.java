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
import io.swagger.client.model.LinksDeleteRuleLink;
import io.swagger.client.model.LinksDisableRuleLink;
import io.swagger.client.model.LinksEnableRuleLink;
import io.swagger.client.model.LinksGetReportFilterLink;
import io.swagger.client.model.LinksGetRuleLink;
import io.swagger.client.model.LinksMoveDownRuleLink;
import io.swagger.client.model.LinksMoveUpRuleLink;
import io.swagger.client.model.LinksRunRuleLink;
import io.swagger.client.model.LinksUpdateRuleLink;

/**
 * Links to retrieve/action on other entities
 */
@ApiModel(description = "Links to retrieve/action on other entities")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:10:34.021Z")
public class RuleLinks {
  @SerializedName("self")
  private LinksGetRuleLink self = null;

  @SerializedName("run")
  private LinksRunRuleLink run = null;

  @SerializedName("delete")
  private LinksDeleteRuleLink delete = null;

  @SerializedName("moveup")
  private LinksMoveUpRuleLink moveup = null;

  @SerializedName("movedown")
  private LinksMoveDownRuleLink movedown = null;

  @SerializedName("enable")
  private LinksEnableRuleLink enable = null;

  @SerializedName("disable")
  private LinksDisableRuleLink disable = null;

  @SerializedName("update")
  private LinksUpdateRuleLink update = null;

  @SerializedName("reportFilter")
  private LinksGetReportFilterLink reportFilter = null;

  public RuleLinks self(LinksGetRuleLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetRuleLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetRuleLink self) {
    this.self = self;
  }

  public RuleLinks run(LinksRunRuleLink run) {
    this.run = run;
    return this;
  }

   /**
   * Get run
   * @return run
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksRunRuleLink getRun() {
    return run;
  }

  public void setRun(LinksRunRuleLink run) {
    this.run = run;
  }

  public RuleLinks delete(LinksDeleteRuleLink delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDeleteRuleLink getDelete() {
    return delete;
  }

  public void setDelete(LinksDeleteRuleLink delete) {
    this.delete = delete;
  }

  public RuleLinks moveup(LinksMoveUpRuleLink moveup) {
    this.moveup = moveup;
    return this;
  }

   /**
   * Get moveup
   * @return moveup
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksMoveUpRuleLink getMoveup() {
    return moveup;
  }

  public void setMoveup(LinksMoveUpRuleLink moveup) {
    this.moveup = moveup;
  }

  public RuleLinks movedown(LinksMoveDownRuleLink movedown) {
    this.movedown = movedown;
    return this;
  }

   /**
   * Get movedown
   * @return movedown
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksMoveDownRuleLink getMovedown() {
    return movedown;
  }

  public void setMovedown(LinksMoveDownRuleLink movedown) {
    this.movedown = movedown;
  }

  public RuleLinks enable(LinksEnableRuleLink enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksEnableRuleLink getEnable() {
    return enable;
  }

  public void setEnable(LinksEnableRuleLink enable) {
    this.enable = enable;
  }

  public RuleLinks disable(LinksDisableRuleLink disable) {
    this.disable = disable;
    return this;
  }

   /**
   * Get disable
   * @return disable
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDisableRuleLink getDisable() {
    return disable;
  }

  public void setDisable(LinksDisableRuleLink disable) {
    this.disable = disable;
  }

  public RuleLinks update(LinksUpdateRuleLink update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksUpdateRuleLink getUpdate() {
    return update;
  }

  public void setUpdate(LinksUpdateRuleLink update) {
    this.update = update;
  }

  public RuleLinks reportFilter(LinksGetReportFilterLink reportFilter) {
    this.reportFilter = reportFilter;
    return this;
  }

   /**
   * Get reportFilter
   * @return reportFilter
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetReportFilterLink getReportFilter() {
    return reportFilter;
  }

  public void setReportFilter(LinksGetReportFilterLink reportFilter) {
    this.reportFilter = reportFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleLinks ruleLinks = (RuleLinks) o;
    return Objects.equals(this.self, ruleLinks.self) &&
        Objects.equals(this.run, ruleLinks.run) &&
        Objects.equals(this.delete, ruleLinks.delete) &&
        Objects.equals(this.moveup, ruleLinks.moveup) &&
        Objects.equals(this.movedown, ruleLinks.movedown) &&
        Objects.equals(this.enable, ruleLinks.enable) &&
        Objects.equals(this.disable, ruleLinks.disable) &&
        Objects.equals(this.update, ruleLinks.update) &&
        Objects.equals(this.reportFilter, ruleLinks.reportFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, run, delete, moveup, movedown, enable, disable, update, reportFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    moveup: ").append(toIndentedString(moveup)).append("\n");
    sb.append("    movedown: ").append(toIndentedString(movedown)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    reportFilter: ").append(toIndentedString(reportFilter)).append("\n");
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

