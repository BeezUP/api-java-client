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
import io.swagger.client.model.BeezUPCommonDocUrl;
import io.swagger.client.model.BeezUPCommonHref;
import io.swagger.client.model.BeezUPCommonHttpMethod;
import io.swagger.client.model.BeezUPCommonInfoSummaries;
import io.swagger.client.model.BeezUPCommonLink3;
import io.swagger.client.model.BeezUPCommonLinkParameter3;
import io.swagger.client.model.BeezUPCommonOperationId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LinksDisableRuleLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T09:06:41.520Z")
public class LinksDisableRuleLink {
  @SerializedName("docUrl")
  private BeezUPCommonDocUrl docUrl = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("href")
  private BeezUPCommonHref href = null;

  @SerializedName("operationId")
  private BeezUPCommonOperationId operationId = null;

  @SerializedName("method")
  private BeezUPCommonHttpMethod method = null;

  @SerializedName("parameters")
  private Map<String, BeezUPCommonLinkParameter3> parameters = new HashMap<String, BeezUPCommonLinkParameter3>();

  @SerializedName("templated")
  private Boolean templated = null;

  @SerializedName("info")
  private BeezUPCommonInfoSummaries info = null;

  public LinksDisableRuleLink docUrl(BeezUPCommonDocUrl docUrl) {
    this.docUrl = docUrl;
    return this;
  }

   /**
   * Get docUrl
   * @return docUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonDocUrl getDocUrl() {
    return docUrl;
  }

  public void setDocUrl(BeezUPCommonDocUrl docUrl) {
    this.docUrl = docUrl;
  }

  public LinksDisableRuleLink description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the link
   * @return description
  **/
  @ApiModelProperty(example = "This is a description link", value = "The description of the link")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LinksDisableRuleLink href(BeezUPCommonHref href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonHref getHref() {
    return href;
  }

  public void setHref(BeezUPCommonHref href) {
    this.href = href;
  }

  public LinksDisableRuleLink operationId(BeezUPCommonOperationId operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Get operationId
   * @return operationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonOperationId getOperationId() {
    return operationId;
  }

  public void setOperationId(BeezUPCommonOperationId operationId) {
    this.operationId = operationId;
  }

  public LinksDisableRuleLink method(BeezUPCommonHttpMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonHttpMethod getMethod() {
    return method;
  }

  public void setMethod(BeezUPCommonHttpMethod method) {
    this.method = method;
  }

  public LinksDisableRuleLink parameters(Map<String, BeezUPCommonLinkParameter3> parameters) {
    this.parameters = parameters;
    return this;
  }

  public LinksDisableRuleLink putParametersItem(String key, BeezUPCommonLinkParameter3 parametersItem) {
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, BeezUPCommonLinkParameter3> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, BeezUPCommonLinkParameter3> parameters) {
    this.parameters = parameters;
  }

  public LinksDisableRuleLink templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

   /**
   * indicates whether the href is templated or not
   * @return templated
  **/
  @ApiModelProperty(example = "null", value = "indicates whether the href is templated or not")
  public Boolean getTemplated() {
    return templated;
  }

  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }

  public LinksDisableRuleLink info(BeezUPCommonInfoSummaries info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonInfoSummaries getInfo() {
    return info;
  }

  public void setInfo(BeezUPCommonInfoSummaries info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksDisableRuleLink linksDisableRuleLink = (LinksDisableRuleLink) o;
    return Objects.equals(this.docUrl, linksDisableRuleLink.docUrl) &&
        Objects.equals(this.description, linksDisableRuleLink.description) &&
        Objects.equals(this.href, linksDisableRuleLink.href) &&
        Objects.equals(this.operationId, linksDisableRuleLink.operationId) &&
        Objects.equals(this.method, linksDisableRuleLink.method) &&
        Objects.equals(this.parameters, linksDisableRuleLink.parameters) &&
        Objects.equals(this.templated, linksDisableRuleLink.templated) &&
        Objects.equals(this.info, linksDisableRuleLink.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUrl, description, href, operationId, method, parameters, templated, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksDisableRuleLink {\n");
    
    sb.append("    docUrl: ").append(toIndentedString(docUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
