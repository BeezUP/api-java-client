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

/**
 * BeezUPCommonExceptionDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:18:37.107Z")
public class BeezUPCommonExceptionDetail {
  @SerializedName("helpLink")
  private String helpLink = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("stackTrace")
  private String stackTrace = null;

  @SerializedName("type")
  private String type = null;

  public BeezUPCommonExceptionDetail helpLink(String helpLink) {
    this.helpLink = helpLink;
    return this;
  }

   /**
   * Get helpLink
   * @return helpLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHelpLink() {
    return helpLink;
  }

  public void setHelpLink(String helpLink) {
    this.helpLink = helpLink;
  }

  public BeezUPCommonExceptionDetail message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BeezUPCommonExceptionDetail stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public BeezUPCommonExceptionDetail type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonExceptionDetail beezUPCommonExceptionDetail = (BeezUPCommonExceptionDetail) o;
    return Objects.equals(this.helpLink, beezUPCommonExceptionDetail.helpLink) &&
        Objects.equals(this.message, beezUPCommonExceptionDetail.message) &&
        Objects.equals(this.stackTrace, beezUPCommonExceptionDetail.stackTrace) &&
        Objects.equals(this.type, beezUPCommonExceptionDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helpLink, message, stackTrace, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonExceptionDetail {\n");
    
    sb.append("    helpLink: ").append(toIndentedString(helpLink)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

