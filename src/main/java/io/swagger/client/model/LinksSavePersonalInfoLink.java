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
 * LinksSavePersonalInfoLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class LinksSavePersonalInfoLink {
  @SerializedName("label")
  private String label = null;

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

  @SerializedName("urlTemplated")
  private Boolean urlTemplated = null;

  @SerializedName("allRequiredParamsProvided")
  private Boolean allRequiredParamsProvided = null;

  @SerializedName("allOptionalParamsProvided")
  private Boolean allOptionalParamsProvided = null;

  @SerializedName("info")
  private BeezUPCommonInfoSummaries info = null;

  public LinksSavePersonalInfoLink label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label corresponding to the link. This label is automatically translated based on the Accept-Language http header.
   * @return label
  **/
  @ApiModelProperty(example = "The translated label", value = "The label corresponding to the link. This label is automatically translated based on the Accept-Language http header.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LinksSavePersonalInfoLink docUrl(BeezUPCommonDocUrl docUrl) {
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

  public LinksSavePersonalInfoLink description(String description) {
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

  public LinksSavePersonalInfoLink href(BeezUPCommonHref href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonHref getHref() {
    return href;
  }

  public void setHref(BeezUPCommonHref href) {
    this.href = href;
  }

  public LinksSavePersonalInfoLink operationId(BeezUPCommonOperationId operationId) {
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

  public LinksSavePersonalInfoLink method(BeezUPCommonHttpMethod method) {
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

  public LinksSavePersonalInfoLink parameters(Map<String, BeezUPCommonLinkParameter3> parameters) {
    this.parameters = parameters;
    return this;
  }

  public LinksSavePersonalInfoLink putParametersItem(String key, BeezUPCommonLinkParameter3 parametersItem) {
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

  public LinksSavePersonalInfoLink urlTemplated(Boolean urlTemplated) {
    this.urlTemplated = urlTemplated;
    return this;
  }

   /**
   * indicates whether the href is templated or not
   * @return urlTemplated
  **/
  @ApiModelProperty(example = "null", value = "indicates whether the href is templated or not")
  public Boolean getUrlTemplated() {
    return urlTemplated;
  }

  public void setUrlTemplated(Boolean urlTemplated) {
    this.urlTemplated = urlTemplated;
  }

  public LinksSavePersonalInfoLink allRequiredParamsProvided(Boolean allRequiredParamsProvided) {
    this.allRequiredParamsProvided = allRequiredParamsProvided;
    return this;
  }

   /**
   * indicates whether all required params have been provided
   * @return allRequiredParamsProvided
  **/
  @ApiModelProperty(example = "null", value = "indicates whether all required params have been provided")
  public Boolean getAllRequiredParamsProvided() {
    return allRequiredParamsProvided;
  }

  public void setAllRequiredParamsProvided(Boolean allRequiredParamsProvided) {
    this.allRequiredParamsProvided = allRequiredParamsProvided;
  }

  public LinksSavePersonalInfoLink allOptionalParamsProvided(Boolean allOptionalParamsProvided) {
    this.allOptionalParamsProvided = allOptionalParamsProvided;
    return this;
  }

   /**
   * indicates whether all optionals params have been provided
   * @return allOptionalParamsProvided
  **/
  @ApiModelProperty(example = "null", value = "indicates whether all optionals params have been provided")
  public Boolean getAllOptionalParamsProvided() {
    return allOptionalParamsProvided;
  }

  public void setAllOptionalParamsProvided(Boolean allOptionalParamsProvided) {
    this.allOptionalParamsProvided = allOptionalParamsProvided;
  }

  public LinksSavePersonalInfoLink info(BeezUPCommonInfoSummaries info) {
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
    LinksSavePersonalInfoLink linksSavePersonalInfoLink = (LinksSavePersonalInfoLink) o;
    return Objects.equals(this.label, linksSavePersonalInfoLink.label) &&
        Objects.equals(this.docUrl, linksSavePersonalInfoLink.docUrl) &&
        Objects.equals(this.description, linksSavePersonalInfoLink.description) &&
        Objects.equals(this.href, linksSavePersonalInfoLink.href) &&
        Objects.equals(this.operationId, linksSavePersonalInfoLink.operationId) &&
        Objects.equals(this.method, linksSavePersonalInfoLink.method) &&
        Objects.equals(this.parameters, linksSavePersonalInfoLink.parameters) &&
        Objects.equals(this.urlTemplated, linksSavePersonalInfoLink.urlTemplated) &&
        Objects.equals(this.allRequiredParamsProvided, linksSavePersonalInfoLink.allRequiredParamsProvided) &&
        Objects.equals(this.allOptionalParamsProvided, linksSavePersonalInfoLink.allOptionalParamsProvided) &&
        Objects.equals(this.info, linksSavePersonalInfoLink.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, docUrl, description, href, operationId, method, parameters, urlTemplated, allRequiredParamsProvided, allOptionalParamsProvided, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksSavePersonalInfoLink {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    docUrl: ").append(toIndentedString(docUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    urlTemplated: ").append(toIndentedString(urlTemplated)).append("\n");
    sb.append("    allRequiredParamsProvided: ").append(toIndentedString(allRequiredParamsProvided)).append("\n");
    sb.append("    allOptionalParamsProvided: ").append(toIndentedString(allOptionalParamsProvided)).append("\n");
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

