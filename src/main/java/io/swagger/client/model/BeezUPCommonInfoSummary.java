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
 * BeezUPCommonInfoSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:45:35.731Z")
public class BeezUPCommonInfoSummary {
  @SerializedName("informationCode")
  private String informationCode = null;

  @SerializedName("informationMessage")
  private String informationMessage = null;

  @SerializedName("informationArguments")
  private Map<String, String> informationArguments = new HashMap<String, String>();

  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyValue")
  private String propertyValue = null;

  @SerializedName("objectName")
  private String objectName = null;

  public BeezUPCommonInfoSummary informationCode(String informationCode) {
    this.informationCode = informationCode;
    return this;
  }

   /**
   * Get informationCode
   * @return informationCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInformationCode() {
    return informationCode;
  }

  public void setInformationCode(String informationCode) {
    this.informationCode = informationCode;
  }

  public BeezUPCommonInfoSummary informationMessage(String informationMessage) {
    this.informationMessage = informationMessage;
    return this;
  }

   /**
   * Get informationMessage
   * @return informationMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInformationMessage() {
    return informationMessage;
  }

  public void setInformationMessage(String informationMessage) {
    this.informationMessage = informationMessage;
  }

  public BeezUPCommonInfoSummary informationArguments(Map<String, String> informationArguments) {
    this.informationArguments = informationArguments;
    return this;
  }

  public BeezUPCommonInfoSummary putInformationArgumentsItem(String key, String informationArgumentsItem) {
    this.informationArguments.put(key, informationArgumentsItem);
    return this;
  }

   /**
   * Get informationArguments
   * @return informationArguments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getInformationArguments() {
    return informationArguments;
  }

  public void setInformationArguments(Map<String, String> informationArguments) {
    this.informationArguments = informationArguments;
  }

  public BeezUPCommonInfoSummary propertyName(String propertyName) {
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

  public BeezUPCommonInfoSummary propertyValue(String propertyValue) {
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

  public BeezUPCommonInfoSummary objectName(String objectName) {
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
    BeezUPCommonInfoSummary beezUPCommonInfoSummary = (BeezUPCommonInfoSummary) o;
    return Objects.equals(this.informationCode, beezUPCommonInfoSummary.informationCode) &&
        Objects.equals(this.informationMessage, beezUPCommonInfoSummary.informationMessage) &&
        Objects.equals(this.informationArguments, beezUPCommonInfoSummary.informationArguments) &&
        Objects.equals(this.propertyName, beezUPCommonInfoSummary.propertyName) &&
        Objects.equals(this.propertyValue, beezUPCommonInfoSummary.propertyValue) &&
        Objects.equals(this.objectName, beezUPCommonInfoSummary.objectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationCode, informationMessage, informationArguments, propertyName, propertyValue, objectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonInfoSummary {\n");
    
    sb.append("    informationCode: ").append(toIndentedString(informationCode)).append("\n");
    sb.append("    informationMessage: ").append(toIndentedString(informationMessage)).append("\n");
    sb.append("    informationArguments: ").append(toIndentedString(informationArguments)).append("\n");
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

