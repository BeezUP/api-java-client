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
 * LinksSetChannelCatalogMarketplaceSettingsLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:50:41.747Z")
public class LinksSetChannelCatalogMarketplaceSettingsLink {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink docUrl(BeezUPCommonDocUrl docUrl) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink description(String description) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink href(BeezUPCommonHref href) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink operationId(BeezUPCommonOperationId operationId) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink method(BeezUPCommonHttpMethod method) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink parameters(Map<String, BeezUPCommonLinkParameter3> parameters) {
    this.parameters = parameters;
    return this;
  }

  public LinksSetChannelCatalogMarketplaceSettingsLink putParametersItem(String key, BeezUPCommonLinkParameter3 parametersItem) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink templated(Boolean templated) {
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

  public LinksSetChannelCatalogMarketplaceSettingsLink info(BeezUPCommonInfoSummaries info) {
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
    LinksSetChannelCatalogMarketplaceSettingsLink linksSetChannelCatalogMarketplaceSettingsLink = (LinksSetChannelCatalogMarketplaceSettingsLink) o;
    return Objects.equals(this.docUrl, linksSetChannelCatalogMarketplaceSettingsLink.docUrl) &&
        Objects.equals(this.description, linksSetChannelCatalogMarketplaceSettingsLink.description) &&
        Objects.equals(this.href, linksSetChannelCatalogMarketplaceSettingsLink.href) &&
        Objects.equals(this.operationId, linksSetChannelCatalogMarketplaceSettingsLink.operationId) &&
        Objects.equals(this.method, linksSetChannelCatalogMarketplaceSettingsLink.method) &&
        Objects.equals(this.parameters, linksSetChannelCatalogMarketplaceSettingsLink.parameters) &&
        Objects.equals(this.templated, linksSetChannelCatalogMarketplaceSettingsLink.templated) &&
        Objects.equals(this.info, linksSetChannelCatalogMarketplaceSettingsLink.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUrl, description, href, operationId, method, parameters, templated, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksSetChannelCatalogMarketplaceSettingsLink {\n");
    
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

