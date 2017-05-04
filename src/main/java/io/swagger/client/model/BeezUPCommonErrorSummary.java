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
import io.swagger.client.model.BeezUPCommonExceptionDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * BeezUPCommonErrorSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:44:01.940Z")
public class BeezUPCommonErrorSummary {
  @SerializedName("utcDate")
  private DateTime utcDate = null;

  @SerializedName("errorGuid")
  private UUID errorGuid = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("technicalErrorMessage")
  private String technicalErrorMessage = null;

  @SerializedName("exceptionDetail")
  private BeezUPCommonExceptionDetail exceptionDetail = null;

  @SerializedName("errorArguments")
  private Map<String, String> errorArguments = new HashMap<String, String>();

  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyValue")
  private String propertyValue = null;

  @SerializedName("objectName")
  private String objectName = null;

  @SerializedName("source")
  private String source = null;

  public BeezUPCommonErrorSummary utcDate(DateTime utcDate) {
    this.utcDate = utcDate;
    return this;
  }

   /**
   * Get utcDate
   * @return utcDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUtcDate() {
    return utcDate;
  }

  public void setUtcDate(DateTime utcDate) {
    this.utcDate = utcDate;
  }

  public BeezUPCommonErrorSummary errorGuid(UUID errorGuid) {
    this.errorGuid = errorGuid;
    return this;
  }

   /**
   * Get errorGuid
   * @return errorGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getErrorGuid() {
    return errorGuid;
  }

  public void setErrorGuid(UUID errorGuid) {
    this.errorGuid = errorGuid;
  }

  public BeezUPCommonErrorSummary errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public BeezUPCommonErrorSummary errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public BeezUPCommonErrorSummary technicalErrorMessage(String technicalErrorMessage) {
    this.technicalErrorMessage = technicalErrorMessage;
    return this;
  }

   /**
   * Get technicalErrorMessage
   * @return technicalErrorMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTechnicalErrorMessage() {
    return technicalErrorMessage;
  }

  public void setTechnicalErrorMessage(String technicalErrorMessage) {
    this.technicalErrorMessage = technicalErrorMessage;
  }

  public BeezUPCommonErrorSummary exceptionDetail(BeezUPCommonExceptionDetail exceptionDetail) {
    this.exceptionDetail = exceptionDetail;
    return this;
  }

   /**
   * Get exceptionDetail
   * @return exceptionDetail
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonExceptionDetail getExceptionDetail() {
    return exceptionDetail;
  }

  public void setExceptionDetail(BeezUPCommonExceptionDetail exceptionDetail) {
    this.exceptionDetail = exceptionDetail;
  }

  public BeezUPCommonErrorSummary errorArguments(Map<String, String> errorArguments) {
    this.errorArguments = errorArguments;
    return this;
  }

  public BeezUPCommonErrorSummary putErrorArgumentsItem(String key, String errorArgumentsItem) {
    this.errorArguments.put(key, errorArgumentsItem);
    return this;
  }

   /**
   * Get errorArguments
   * @return errorArguments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getErrorArguments() {
    return errorArguments;
  }

  public void setErrorArguments(Map<String, String> errorArguments) {
    this.errorArguments = errorArguments;
  }

  public BeezUPCommonErrorSummary propertyName(String propertyName) {
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

  public BeezUPCommonErrorSummary propertyValue(String propertyValue) {
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

  public BeezUPCommonErrorSummary objectName(String objectName) {
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

  public BeezUPCommonErrorSummary source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonErrorSummary beezUPCommonErrorSummary = (BeezUPCommonErrorSummary) o;
    return Objects.equals(this.utcDate, beezUPCommonErrorSummary.utcDate) &&
        Objects.equals(this.errorGuid, beezUPCommonErrorSummary.errorGuid) &&
        Objects.equals(this.errorCode, beezUPCommonErrorSummary.errorCode) &&
        Objects.equals(this.errorMessage, beezUPCommonErrorSummary.errorMessage) &&
        Objects.equals(this.technicalErrorMessage, beezUPCommonErrorSummary.technicalErrorMessage) &&
        Objects.equals(this.exceptionDetail, beezUPCommonErrorSummary.exceptionDetail) &&
        Objects.equals(this.errorArguments, beezUPCommonErrorSummary.errorArguments) &&
        Objects.equals(this.propertyName, beezUPCommonErrorSummary.propertyName) &&
        Objects.equals(this.propertyValue, beezUPCommonErrorSummary.propertyValue) &&
        Objects.equals(this.objectName, beezUPCommonErrorSummary.objectName) &&
        Objects.equals(this.source, beezUPCommonErrorSummary.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcDate, errorGuid, errorCode, errorMessage, technicalErrorMessage, exceptionDetail, errorArguments, propertyName, propertyValue, objectName, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonErrorSummary {\n");
    
    sb.append("    utcDate: ").append(toIndentedString(utcDate)).append("\n");
    sb.append("    errorGuid: ").append(toIndentedString(errorGuid)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    technicalErrorMessage: ").append(toIndentedString(technicalErrorMessage)).append("\n");
    sb.append("    exceptionDetail: ").append(toIndentedString(exceptionDetail)).append("\n");
    sb.append("    errorArguments: ").append(toIndentedString(errorArguments)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

