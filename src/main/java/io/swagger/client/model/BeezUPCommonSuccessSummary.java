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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BeezUPCommonSuccessSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:26:52.821Z")
public class BeezUPCommonSuccessSummary {
  @SerializedName("successCode")
  private String successCode = null;

  @SerializedName("successMessage")
  private String successMessage = null;

  @SerializedName("successArguments")
  private Map<String, String> successArguments = new HashMap<String, String>();

  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyValue")
  private String propertyValue = null;

  @SerializedName("objectName")
  private String objectName = null;

  public BeezUPCommonSuccessSummary successCode(String successCode) {
    this.successCode = successCode;
    return this;
  }

   /**
   * Get successCode
   * @return successCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuccessCode() {
    return successCode;
  }

  public void setSuccessCode(String successCode) {
    this.successCode = successCode;
  }

  public BeezUPCommonSuccessSummary successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

   /**
   * Get successMessage
   * @return successMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  public BeezUPCommonSuccessSummary successArguments(Map<String, String> successArguments) {
    this.successArguments = successArguments;
    return this;
  }

  public BeezUPCommonSuccessSummary putSuccessArgumentsItem(String key, String successArgumentsItem) {
    this.successArguments.put(key, successArgumentsItem);
    return this;
  }

   /**
   * Get successArguments
   * @return successArguments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getSuccessArguments() {
    return successArguments;
  }

  public void setSuccessArguments(Map<String, String> successArguments) {
    this.successArguments = successArguments;
  }

  public BeezUPCommonSuccessSummary propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public BeezUPCommonSuccessSummary propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

   /**
   * Get propertyValue
   * @return propertyValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public BeezUPCommonSuccessSummary objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonSuccessSummary beezUPCommonSuccessSummary = (BeezUPCommonSuccessSummary) o;
    return Objects.equals(this.successCode, beezUPCommonSuccessSummary.successCode) &&
        Objects.equals(this.successMessage, beezUPCommonSuccessSummary.successMessage) &&
        Objects.equals(this.successArguments, beezUPCommonSuccessSummary.successArguments) &&
        Objects.equals(this.propertyName, beezUPCommonSuccessSummary.propertyName) &&
        Objects.equals(this.propertyValue, beezUPCommonSuccessSummary.propertyValue) &&
        Objects.equals(this.objectName, beezUPCommonSuccessSummary.objectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCode, successMessage, successArguments, propertyName, propertyValue, objectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonSuccessSummary {\n");
    
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    successArguments: ").append(toIndentedString(successArguments)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
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

