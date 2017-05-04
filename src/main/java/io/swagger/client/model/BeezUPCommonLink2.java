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
import io.swagger.client.model.BeezUPCommonHref;
import io.swagger.client.model.BeezUPCommonHttpMethod;
import io.swagger.client.model.BeezUPCommonInfoSummaries;
import io.swagger.client.model.BeezUPCommonLinkParameter2;
import io.swagger.client.model.BeezUPCommonOperationId;
import java.util.ArrayList;
import java.util.List;

/**
 * BeezUPCommonLink2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T10:49:46.695Z")
public class BeezUPCommonLink2 {
  @SerializedName("rel")
  private String rel = null;

  @SerializedName("href")
  private BeezUPCommonHref href = null;

  @SerializedName("operationId")
  private BeezUPCommonOperationId operationId = null;

  @SerializedName("method")
  private BeezUPCommonHttpMethod method = null;

  @SerializedName("parameters")
  private List<BeezUPCommonLinkParameter2> parameters = new ArrayList<BeezUPCommonLinkParameter2>();

  @SerializedName("info")
  private BeezUPCommonInfoSummaries info = null;

  public BeezUPCommonLink2 rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Indicate the relation name related to the link
   * @return rel
  **/
  @ApiModelProperty(example = "self", required = true, value = "Indicate the relation name related to the link")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public BeezUPCommonLink2 href(BeezUPCommonHref href) {
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

  public BeezUPCommonLink2 operationId(BeezUPCommonOperationId operationId) {
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

  public BeezUPCommonLink2 method(BeezUPCommonHttpMethod method) {
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

  public BeezUPCommonLink2 parameters(List<BeezUPCommonLinkParameter2> parameters) {
    this.parameters = parameters;
    return this;
  }

  public BeezUPCommonLink2 addParametersItem(BeezUPCommonLinkParameter2 parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonLinkParameter2> getParameters() {
    return parameters;
  }

  public void setParameters(List<BeezUPCommonLinkParameter2> parameters) {
    this.parameters = parameters;
  }

  public BeezUPCommonLink2 info(BeezUPCommonInfoSummaries info) {
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
    BeezUPCommonLink2 beezUPCommonLink2 = (BeezUPCommonLink2) o;
    return Objects.equals(this.rel, beezUPCommonLink2.rel) &&
        Objects.equals(this.href, beezUPCommonLink2.href) &&
        Objects.equals(this.operationId, beezUPCommonLink2.operationId) &&
        Objects.equals(this.method, beezUPCommonLink2.method) &&
        Objects.equals(this.parameters, beezUPCommonLink2.parameters) &&
        Objects.equals(this.info, beezUPCommonLink2.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href, operationId, method, parameters, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonLink2 {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

